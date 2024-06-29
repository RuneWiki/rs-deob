import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class704 {

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public int field10216 = -1;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10231 = new String[] { method5149(method5148("(\u0010\u0011\u0006")), method5149(method5148("#\u0000S#\u0006")), method5149(method5148("=KSDS")), method5149(method5148("#\u0000S/\u0006")), method5149(method5148("#\u0000S-\u0006")), method5149(method5148("#\u0000S!\u0006")), method5149(method5148("#\u0000S&\u0006")), method5149(method5148("#\u0000S+\u0006")), method5149(method5148("#\u0000S,\u0006")), method5149(method5148("#\u0000S\"\u0006")), method5149(method5148("#\u0000S \u0006")), method5149(method5148("#\u0000S)\u0006")), method5149(method5148("#\u0000S.\u0006")), method5149(method5148("#\u0000S(\u0006")) };

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lqha;")
    public static class112 field10226 = new class112(512);

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field10210;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field10211;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field10212;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field10213;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field10214;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field10215;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field10217;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field10218;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field10221;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field10223;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field10227;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    private int field10230;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "J")
    private long field10222;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "J")
    private long field10224;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Z")
    public boolean field10220;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "[I")
    private int[] field10219;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "[I")
    public int[] field10225;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "[Lrja;")
    private class116[] field10228;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "[Lfs;")
    public static class581[] field10229;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V")
    public final void method5136(int arg0, boolean arg1) {
        try {
            field10221++;
            this.field10220 = arg1;
            if (arg0 != 1580938536) {
                method5138(null, 41, null, 119);
            }
            this.method5143(255);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10231[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static final void method5137(int arg0) {
        try {
            class383.field5800.method3879(arg0 + 6347);
            field10223++;
            class90.field1034 = 0;
            if (arg0 != -6224) {
                method5146(45);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10231[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lla;ILla;I)V")
    public static final void method5138(class476 arg0, int arg1, class476 arg2, int arg3) {
        try {
            field10215++;
            class595.field8725 = arg2;
            class277.field4170 = arg0;
            if (arg3 < 21) {
                method5146(-47);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10231[4] + (arg0 == null ? field10231[0] : field10231[2]) + ',' + arg1 + ',' + (arg2 == null ? field10231[0] : field10231[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
    public final void method5139(int arg0, int arg1, int arg2) {
        try {
            field10214++;
            if (arg0 != -9339) {
                this.method5136(-120, true);
            }
            this.field10225[arg2] = arg1;
            this.method5143(255);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10231[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLfj;II)V")
    public final void method5140(byte arg0, class682 arg1, int arg2, int arg3) {
        try {
            field10217++;
            if (arg0 < -8) {
                if (arg2 == -1) {
                    this.field10219[arg3] = 0;
                } else if (arg1.method5000(arg2, (byte) 39) != null) {
                    this.field10219[arg3] = class544.method4107(arg2, 1073741824);
                    this.method5143(255);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10231[3] + arg0 + ',' + (arg1 == null ? field10231[0] : field10231[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([Laga;Lmd;Lha;Lhs;Lsp;IILgm;Lhs;Lfj;IZLsn;[IIILsda;IIII)Lka;")
    public final class497 method5141(class694[] arg0, class569 arg1, class66 arg2, class344 arg3, class661 arg4, int arg5, int arg6, class135 arg7, class344 arg8, class682 arg9, int arg10, boolean arg11, class656 arg12, int[] arg13, int arg14, int arg15, class271 arg16, int arg17, int arg18, int arg19, int arg20) {
        try {
            field10213++;
            if (this.field10216 != -1) {
                return arg1.method4250(this.field10216, 2).method3744(arg14, null, arg17, arg8, arg10, arg4, arg20, arg15, arg16, arg18, arg19, arg3, (byte) 8, arg5, arg2, arg13, arg0, arg7);
            }
            int var22 = arg20;
            long var23 = this.field10224;
            int[] var25 = this.field10219;
            boolean var26 = false;
            boolean var27 = false;
            if (arg8 != null && (arg8.field5338 >= 0 || arg8.field5365 >= 0)) {
                var25 = new int[this.field10219.length];
                for (int var28 = 0; var28 < var25.length; var28++) {
                    var25[var28] = this.field10219[var28];
                }
                if (arg8.field5338 >= 0) {
                    if (arg8.field5338 == 65535) {
                        var26 = true;
                        var23 ^= 0xFFFFFFFF00000000L;
                        var25[5] = 0;
                    } else {
                        var25[5] = class544.method4107(arg8.field5338, 1073741824);
                        var23 ^= (long) var25[5] << 32;
                    }
                }
                if (arg8.field5365 >= 0) {
                    if (arg8.field5365 == 65535) {
                        var25[3] = 0;
                        var23 ^= 0xFFFFFFFFL;
                    } else {
                        var25[3] = class544.method4107(1073741824, arg8.field5365);
                        var23 ^= var25[3];
                    }
                    var27 = true;
                }
            }
            boolean var29 = false;
            boolean var30 = false;
            boolean var31 = false;
            boolean var32 = arg8 != null || arg3 != null;
            int var33 = arg0 == null ? 0 : arg0.length;
            for (int var34 = 0; var34 < var33; var34++) {
                class365.field5590[var34] = null;
                if (arg0[var34] != null) {
                    class344 var35 = arg16.method2242(arg0[var34].field10138, 100);
                    if (var35.field5366 != null) {
                        class263.field4039[var34] = var35;
                        var32 = true;
                        int var36 = arg0[var34].field10136;
                        int var37 = arg0[var34].field10134;
                        int var38 = var35.field5366[var36];
                        class365.field5590[var34] = arg16.method2243(var38 >>> 16, 64);
                        int var39 = var38 & 0xFFFF;
                        class547.field8160[var34] = var39;
                        if (class365.field5590[var34] != null) {
                            var30 |= class365.field5590[var34].method737(var39, -25695);
                            var29 |= class365.field5590[var34].method733(var39, (byte) 93);
                            var31 |= class365.field5590[var34].method731(true, var39);
                        }
                        if ((var35.field5342 || class341.field5310) && var37 != -1 && var35.field5366.length > var37) {
                            class369.field5635[var34] = var35.field5361[var36];
                            class553.field8240[var34] = arg0[var34].field10130;
                            int var40 = var35.field5366[var37];
                            class41.field495[var34] = arg16.method2243(var40 >>> 16, 64);
                            int var41 = var40 & 0xFFFF;
                            class241.field3646[var34] = var41;
                            if (class41.field495[var34] != null) {
                                var30 |= class41.field495[var34].method737(var41, -25695);
                                var29 |= class41.field495[var34].method733(var41, (byte) 93);
                                var31 |= class41.field495[var34].method731(true, var41);
                            }
                        } else {
                            class369.field5635[var34] = 0;
                            class553.field8240[var34] = 0;
                            class41.field495[var34] = null;
                            class241.field3646[var34] = -1;
                        }
                    }
                }
            }
            int var42 = -1;
            int var43 = -1;
            int var44 = 0;
            class87 var45 = null;
            class87 var46 = null;
            int var47 = -1;
            int var48 = -1;
            int var49 = 0;
            class87 var50 = null;
            class87 var51 = null;
            if (var32) {
                if (arg8 != null) {
                    int var52 = arg8.field5366[arg14];
                    int var53 = var52 >>> 16;
                    var42 = var52 & 0xFFFF;
                    var45 = arg16.method2243(var53, 64);
                    if (var45 != null) {
                        var30 |= var45.method737(var42, -25695);
                        var29 |= var45.method733(var42, (byte) 93);
                        var31 |= var45.method731(true, var42);
                    }
                    if ((arg8.field5342 || class341.field5310) && arg17 != -1 && arg8.field5366.length > arg17) {
                        var44 = arg8.field5361[arg14];
                        int var54 = arg8.field5366[arg17];
                        int var55 = var54 >>> 16;
                        var46 = var53 == var55 ? var45 : arg16.method2243(var55, 64);
                        var43 = var54 & 0xFFFF;
                        if (var46 != null) {
                            var30 |= var46.method737(var43, -25695);
                            var29 |= var46.method733(var43, (byte) 93);
                            var31 |= var46.method731(true, var43);
                        }
                    }
                }
                var22 = arg20 | 0x20;
                if (arg3 != null) {
                    int var56 = arg3.field5366[arg10];
                    int var57 = var56 >>> 16;
                    var50 = arg16.method2243(var57, 64);
                    var47 = var56 & 0xFFFF;
                    if (var50 != null) {
                        var30 |= var50.method737(var47, -25695);
                        var29 |= var50.method733(var47, (byte) 93);
                        var31 |= var50.method731(true, var47);
                    }
                    if ((arg3.field5342 || class341.field5310) && arg19 != -1 && arg3.field5366.length > arg19) {
                        int var58 = arg3.field5366[arg19];
                        var49 = arg3.field5361[arg10];
                        int var59 = var58 >>> 16;
                        var51 = var57 == var59 ? var50 : arg16.method2243(var59, 64);
                        var48 = var58 & 0xFFFF;
                        if (var51 != null) {
                            var30 |= var51.method737(var48, -25695);
                            var29 |= var51.method733(var48, (byte) 93);
                            var31 |= var51.method731(true, var48);
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
            class178 var60 = class514.field7406;
            class497 var61;
            synchronized (class514.field7406) {
                var61 = (class497) class514.field7406.method1558((byte) 96, var23);
            }
            class144 var62 = null;
            if (this.field10230 != -1) {
                var62 = arg4.method4847(this.field10230, 32259);
            }
            if (var61 == null || arg2.method509(var61.method330(), var22) != 0) {
                if (var61 != null) {
                    var22 = arg2.method499(var22, var61.method330());
                }
                boolean var64 = false;
                int var65 = 0;
                while (true) {
                    if (var65 >= var25.length) {
                        if (var64) {
                            if (this.field10222 != -1L) {
                                class178 var69 = class514.field7406;
                                synchronized (class514.field7406) {
                                    var61 = (class497) class514.field7406.method1558((byte) 96, this.field10222);
                                }
                            }
                            if (var61 != null && arg2.method509(var61.method330(), var22) == 0) {
                                break;
                            }
                            return null;
                        }
                        class137[] var70 = new class137[var25.length];
                        for (int var71 = 0; var71 < var25.length; var71++) {
                            int var72 = var25[var71];
                            class116 var73 = null;
                            boolean var74 = var71 == 5 && var26 || var71 == 3 && var27;
                            if ((var72 & 0x40000000) != 0) {
                                if (!var74 && this.field10228 != null && this.field10228[var71] != null) {
                                    var73 = this.field10228[var71];
                                }
                                class137 var76 = arg9.method5000(var72 & 0x3FFFFFFF, (byte) 103).method4011(var73, (byte) 113, this.field10220);
                                if (var76 != null) {
                                    var70[var71] = var76;
                                }
                            } else if ((var72 & Integer.MIN_VALUE) != 0) {
                                class137 var75 = arg12.method4810(3, var72 & 0x3FFFFFFF).method3166((byte) 43);
                                if (var75 != null) {
                                    var70[var71] = var75;
                                }
                            }
                        }
                        if (var62 != null && var62.field1769 != null) {
                            for (int var77 = 0; var77 < var62.field1769.length; var77++) {
                                if (var70[var77] != null) {
                                    int var78 = 0;
                                    int var79 = 0;
                                    int var80 = 0;
                                    int var81 = 0;
                                    int var82 = 0;
                                    int var83 = 0;
                                    if (var62.field1769[var77] != null) {
                                        var82 = var62.field1769[var77][4] << 3;
                                        var81 = var62.field1769[var77][3] << 3;
                                        var78 = var62.field1769[var77][0];
                                        var83 = var62.field1769[var77][5] << 3;
                                        var79 = var62.field1769[var77][1];
                                        var80 = var62.field1769[var77][2];
                                    }
                                    if (var81 != 0 || var82 != 0 || var83 != 0) {
                                        var70[var77].method1177(var83, var82, (byte) -92, var81);
                                    }
                                    if (var78 != 0 || var79 != 0 || var80 != 0) {
                                        var70[var77].method1176(0, var79, var80, var78);
                                    }
                                }
                            }
                        }
                        int var84 = var22 | 0x4000;
                        class137 var85 = new class137(var70, var70.length);
                        var61 = arg2.method552(var85, var84, class124.field1453, 64, 850);
                        for (int var86 = 0; var86 < 5; var86++) {
                            for (int var87 = 0; var87 < class58.field621.length; var87++) {
                                if (this.field10225[var86] < class58.field621[var87][var86].length) {
                                    var61.method311(class322.field5078[var87][var86], class58.field621[var87][var86][this.field10225[var86]]);
                                }
                            }
                        }
                        if (arg11) {
                            var61.method347(var22);
                            class178 var88 = class514.field7406;
                            synchronized (class514.field7406) {
                                class514.field7406.method1556(var23, var61, 1);
                            }
                            this.field10222 = var23;
                        }
                        break;
                    }
                    int var66 = var25[var65];
                    class116 var67 = null;
                    boolean var68 = var65 == 5 && var26 || var65 == 3 && var27;
                    if ((var66 & 0x40000000) != 0) {
                        if (!var68 && this.field10228 != null && this.field10228[var65] != null) {
                            var67 = this.field10228[var65];
                        }
                        if (!arg9.method5000(var66 & 0x3FFFFFFF, (byte) 70).method4002(var67, this.field10220, -79)) {
                            var64 = true;
                        }
                    } else if ((Integer.MIN_VALUE & var66) != 0 && !arg12.method4810(3, var66 & 0x3FFFFFFF).method3161(false)) {
                        var64 = true;
                    }
                    var65++;
                }
            }
            class497 var89 = var61.method332((byte) 4, var22, true);
            boolean var90 = false;
            if (arg13 != null) {
                for (int var91 = 0; var91 < arg13.length; var91++) {
                    if (arg13[var91] != -1) {
                        var90 = true;
                    }
                }
            }
            if (!var32 && !var90) {
                return var89;
            }
            class501[] var92 = null;
            if (var62 != null) {
                var92 = var62.method1223((byte) -113, arg2);
            }
            if (var90 && var92 != null) {
                for (int var93 = 0; var93 < arg13.length; var93++) {
                    if (var92[var93] != null) {
                        var89.method304(var92[var93], 0x1 << var93, true);
                    }
                }
            }
            int var94 = 0;
            int var95 = 1;
            while (var33 > var94) {
                if (class365.field5590[var94] != null) {
                    var89.method3760(-30113, class369.field5635[var94], null, class241.field3646[var94], var95, false, class547.field8160[var94], class41.field495[var94], class553.field8240[var94] - 1, class365.field5590[var94], 0);
                }
                var95 <<= 0x1;
                var94++;
            }
            if (arg6 < 38) {
                this.field10222 = 35L;
            }
            if (var90) {
                for (int var96 = 0; var96 < arg13.length; var96++) {
                    if (arg13[var96] != -1) {
                        int var97 = arg13[var96] - arg15;
                        int var98 = var97 & 0x3FFF;
                        class501 var99 = arg2.method517();
                        var99.method2391(var98);
                        var89.method304(var99, 0x1 << var96, false);
                    }
                }
            }
            if (var90 && var92 != null) {
                for (int var100 = 0; var100 < arg13.length; var100++) {
                    if (var92[var100] != null) {
                        var89.method304(var92[var100], 0x1 << var100, false);
                    }
                }
            }
            if (var45 != null && var50 != null) {
                var89.method3756(var46, false, var48, var49, var45, var50, arg5 - 1, arg8.field5349, var51, -11, var44, var43, arg18 - 1, var42, var47);
            } else if (var45 != null) {
                var89.method3764(var44, var46, var43, var45, false, var42, 2, arg18 - 1, 0);
            } else if (var50 != null) {
                var89.method3764(var49, var51, var48, var50, false, var47, 2, arg5 - 1, 0);
            }
            for (int var101 = 0; var101 < var33; var101++) {
                class365.field5590[var101] = null;
                class41.field495[var101] = null;
                class263.field4039[var101] = null;
            }
            return var89;
        } catch (RuntimeException var106) {
            throw class759.method5498(var106, field10231[1] + (arg0 == null ? field10231[0] : field10231[2]) + ',' + (arg1 == null ? field10231[0] : field10231[2]) + ',' + (arg2 == null ? field10231[0] : field10231[2]) + ',' + (arg3 == null ? field10231[0] : field10231[2]) + ',' + (arg4 == null ? field10231[0] : field10231[2]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field10231[0] : field10231[2]) + ',' + (arg8 == null ? field10231[0] : field10231[2]) + ',' + (arg9 == null ? field10231[0] : field10231[2]) + ',' + arg10 + ',' + arg11 + ',' + (arg12 == null ? field10231[0] : field10231[2]) + ',' + (arg13 == null ? field10231[0] : field10231[2]) + ',' + arg14 + ',' + arg15 + ',' + (arg16 == null ? field10231[0] : field10231[2]) + ',' + arg17 + ',' + arg18 + ',' + arg19 + ',' + arg20 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILha;BLgm;Lfj;Lsn;Lsda;ILhs;Lmd;II)Lka;")
    public final class497 method5142(int arg0, class66 arg1, byte arg2, class135 arg3, class682 arg4, class656 arg5, class271 arg6, int arg7, class344 arg8, class569 arg9, int arg10, int arg11) {
        try {
            field10210++;
            if (this.field10216 != -1) {
                return arg9.method4250(this.field10216, 2).method3752(arg1, arg11, arg10, arg3, arg8, -1, arg7, arg6, null, arg0);
            }
            int var13 = arg7;
            if (arg8 != null) {
                boolean var14 = false;
                boolean var15 = false;
                boolean var16 = false;
                boolean var17 = false;
                boolean var18 = true;
                boolean var19 = true;
                Object var20 = null;
                int var21 = arg8.field5366[arg0];
                Object var22 = null;
                var13 = arg7 | 0x20;
                int var23 = var21 >>> 16;
                int var24 = var21 & 0xFFFF;
                class87 var25 = arg6.method2243(var23, 64);
                if (var25 != null) {
                    var15 |= var25.method737(var24, -25695);
                    var14 |= var25.method733(var24, (byte) 93);
                    var17 |= var25.method731(true, var24);
                    var16 |= arg8.field5367;
                }
                if ((arg8.field5342 || class341.field5310) && arg11 != -1 && arg8.field5366.length > arg11) {
                    int var26 = arg8.field5366[arg11];
                    int var27 = var26 >>> 16;
                    class87 var28 = var23 == var27 ? var25 : arg6.method2243(var27, 64);
                    int var29 = var26 & 0xFFFF;
                    if (var28 != null) {
                        var15 |= var28.method737(var29, -25695);
                        var14 |= var28.method733(var29, (byte) 93);
                        var17 |= var28.method731(true, var29);
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
            class178 var30 = class548.field8184;
            class497 var31;
            synchronized (class548.field8184) {
                var31 = (class497) class548.field8184.method1558((byte) 96, this.field10224);
                int var32 = -120 / ((-arg2 - 81) / 35);
            }
            if (var31 == null || arg1.method509(var31.method330(), var13) != 0) {
                if (var31 != null) {
                    var13 = arg1.method499(var13, var31.method330());
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < this.field10219.length; var35++) {
                    int var36 = this.field10219[var35];
                    class116 var37 = null;
                    if ((var36 & 0x40000000) != 0) {
                        if (this.field10228 != null && this.field10228[var35] != null) {
                            var37 = this.field10228[var35];
                        }
                        if (!arg4.method5000(var36 & 0x3FFFFFFF, (byte) 99).method4013(112, this.field10220, var37)) {
                            var34 = true;
                        }
                    } else if ((var36 & Integer.MIN_VALUE) != 0 && !arg5.method4810(3, var36 & 0x3FFFFFFF).method3162(-113)) {
                        var34 = true;
                    }
                }
                if (var34) {
                    return null;
                }
                class137[] var38 = new class137[this.field10219.length];
                int var39 = 0;
                for (int var40 = 0; var40 < this.field10219.length; var40++) {
                    int var41 = this.field10219[var40];
                    class116 var42 = null;
                    if ((var41 & 0x40000000) != 0) {
                        if (this.field10228 != null && this.field10228[var40] != null) {
                            var42 = this.field10228[var40];
                        }
                        class137 var43 = arg4.method5000(var41 & 0x3FFFFFFF, (byte) 108).method4009(var42, this.field10220, -87);
                        if (var43 != null) {
                            var38[var39++] = var43;
                        }
                    } else if ((var41 & Integer.MIN_VALUE) != 0) {
                        class137 var44 = arg5.method4810(3, var41 & 0x3FFFFFFF).method3164(-105);
                        if (var44 != null) {
                            var38[var39++] = var44;
                        }
                    }
                }
                class137 var45 = new class137(var38, var39);
                int var46 = var13 | 0x4000;
                var31 = arg1.method552(var45, var46, class124.field1453, 64, 768);
                for (int var47 = 0; var47 < 5; var47++) {
                    for (int var48 = 0; var48 < class58.field621.length; var48++) {
                        if (class58.field621[var48][var47].length > this.field10225[var47]) {
                            var31.method311(class322.field5078[var48][var47], class58.field621[var48][var47][this.field10225[var47]]);
                        }
                    }
                }
                var31.method347(var13);
                class178 var49 = class548.field8184;
                synchronized (class548.field8184) {
                    class548.field8184.method1556(this.field10224, var31, 1);
                }
            }
            if (arg8 == null) {
                return var31;
            } else {
                var31.method332((byte) 4, var13, true);
                return arg8.method2851(arg11, var31, arg0, arg10, arg7, 65535);
            }
        } catch (RuntimeException var55) {
            throw class759.method5498(var55, field10231[13] + arg0 + ',' + (arg1 == null ? field10231[0] : field10231[2]) + ',' + arg2 + ',' + (arg3 == null ? field10231[0] : field10231[2]) + ',' + (arg4 == null ? field10231[0] : field10231[2]) + ',' + (arg5 == null ? field10231[0] : field10231[2]) + ',' + (arg6 == null ? field10231[0] : field10231[2]) + ',' + arg7 + ',' + (arg8 == null ? field10231[0] : field10231[2]) + ',' + (arg9 == null ? field10231[0] : field10231[2]) + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    private final void method5143(int arg0) {
        try {
            field10227++;
            long[] var2 = class143.field1722;
            this.field10224 = -1L;
            this.field10224 = this.field10224 >>> 8 ^ var2[(int) ((this.field10224 ^ (long) (this.field10230 >> 8)) & 0xFFL)];
            this.field10224 = this.field10224 >>> 8 ^ var2[(int) ((this.field10224 ^ (long) this.field10230) & (long) arg0)];
            for (int var3 = 0; var3 < this.field10219.length; var3++) {
                this.field10224 = this.field10224 >>> 8 ^ var2[(int) (((long) (this.field10219[var3] >> 24) ^ this.field10224) & 0xFFL)];
                this.field10224 = var2[(int) ((this.field10224 ^ (long) (this.field10219[var3] >> 16)) & 0xFFL)] ^ this.field10224 >>> 8;
                this.field10224 = this.field10224 >>> 8 ^ var2[(int) (((long) (this.field10219[var3] >> 8) ^ this.field10224) & 0xFFL)];
                this.field10224 = var2[(int) ((this.field10224 ^ (long) this.field10219[var3]) & 0xFFL)] ^ this.field10224 >>> 8;
            }
            if (this.field10228 != null) {
                for (int var4 = 0; var4 < this.field10228.length; var4++) {
                    if (this.field10228[var4] != null) {
                        int[] var5;
                        int[] var6;
                        if (this.field10220) {
                            var6 = this.field10228[var4].field1382;
                            var5 = this.field10228[var4].field1385;
                        } else {
                            var5 = this.field10228[var4].field1381;
                            var6 = this.field10228[var4].field1376;
                        }
                        if (var5 != null) {
                            for (int var7 = 0; var7 < var5.length; var7++) {
                                this.field10224 = var2[(int) ((this.field10224 ^ (long) (var5[var7] >> 8)) & 0xFFL)] ^ this.field10224 >>> 8;
                                this.field10224 = this.field10224 >>> 8 ^ var2[(int) (((long) var5[var7] ^ this.field10224) & 0xFFL)];
                            }
                        }
                        if (var6 != null) {
                            for (int var8 = 0; var8 < var6.length; var8++) {
                                this.field10224 = this.field10224 >>> 8 ^ var2[(int) (((long) (var6[var8] >> 8) ^ this.field10224) & 0xFFL)];
                                this.field10224 = var2[(int) (((long) var6[var8] ^ this.field10224) & 0xFFL)] ^ this.field10224 >>> 8;
                            }
                        }
                        if (this.field10228[var4].field1378 != null) {
                            for (int var9 = 0; var9 < this.field10228[var4].field1378.length; var9++) {
                                this.field10224 = var2[(int) ((this.field10224 ^ (long) (this.field10228[var4].field1378[var9] >> 8)) & 0xFFL)] ^ this.field10224 >>> 8;
                                this.field10224 = var2[(int) (((long) this.field10228[var4].field1378[var9] ^ this.field10224) & 0xFFL)] ^ this.field10224 >>> 8;
                            }
                        }
                        if (this.field10228[var4].field1374 != null) {
                            for (int var10 = 0; var10 < this.field10228[var4].field1374.length; var10++) {
                                this.field10224 = this.field10224 >>> 8 ^ var2[(int) (((long) (this.field10228[var4].field1374[var10] >> 8) ^ this.field10224) & 0xFFL)];
                                this.field10224 = this.field10224 >>> 8 ^ var2[(int) ((this.field10224 ^ (long) this.field10228[var4].field1374[var10]) & 0xFFL)];
                            }
                        }
                    }
                }
            }
            for (int var11 = 0; var11 < 5; var11++) {
                this.field10224 = var2[(int) ((this.field10224 ^ (long) this.field10225[var11]) & 0xFFL)] ^ this.field10224 >>> 8;
            }
            this.field10224 = var2[(int) ((this.field10224 ^ (long) (this.field10220 ? 1 : 0)) & 0xFFL)] ^ this.field10224 >>> 8;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field10231[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZ[II[II[Lrja;)V")
    public final void method5144(byte arg0, boolean arg1, int[] arg2, int arg3, int[] arg4, int arg5, class116[] arg6) {
        try {
            field10211++;
            this.field10220 = arg1;
            int var8 = 121 % ((arg0 + 6) / 32);
            this.field10225 = arg2;
            this.field10216 = arg5;
            this.field10228 = arg6;
            if (this.field10230 != arg3) {
                this.field10230 = arg3;
            }
            this.field10219 = arg4;
            this.method5143(255);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field10231[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10231[0] : field10231[2]) + ',' + arg3 + ',' + (arg4 == null ? field10231[0] : field10231[2]) + ',' + arg5 + ',' + (arg6 == null ? field10231[0] : field10231[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILsn;ILha;IILsda;Lhs;II)Lka;")
    public final class497 method5145(int arg0, int arg1, int arg2, class656 arg3, int arg4, class66 arg5, int arg6, int arg7, class271 arg8, class344 arg9, int arg10, int arg11) {
        try {
            field10212++;
            int var13 = arg0;
            if (arg9 != null) {
                boolean var14 = false;
                boolean var15 = false;
                boolean var16 = false;
                boolean var17 = false;
                boolean var18 = true;
                boolean var19 = true;
                Object var20 = null;
                int var21 = arg9.field5366[arg7];
                Object var22 = null;
                var13 = arg0 | 0x20;
                int var23 = var21 >>> 16;
                int var24 = var21 & 0xFFFF;
                class87 var25 = arg8.method2243(var23, 64);
                if (var25 != null) {
                    var15 |= var25.method737(var24, -25695);
                    var14 |= var25.method733(var24, (byte) 93);
                    var17 |= var25.method731(true, var24);
                    var16 |= arg9.field5367;
                }
                if ((arg9.field5342 || class341.field5310) && arg6 != -1 && arg9.field5366.length > arg6) {
                    int var26 = arg9.field5366[arg6];
                    int var27 = var26 >>> 16;
                    int var28 = var26 & 0xFFFF;
                    class87 var29;
                    if (var23 == var27) {
                        var29 = var25;
                    } else {
                        var29 = arg8.method2243(var28 >>> 16, 64);
                    }
                    if (var29 != null) {
                        var15 |= var29.method737(var28, -25695);
                        var14 |= var29.method733(var28, (byte) 93);
                        var17 |= var29.method731(true, var28);
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
            long var30 = (long) arg10 | (long) (arg1 << 16) | (long) arg2 << 32;
            class178 var32 = class548.field8184;
            class497 var33;
            synchronized (class548.field8184) {
                var33 = (class497) class548.field8184.method1558((byte) 96, var30);
            }
            if (var33 == null || arg5.method509(var33.method330(), var13) != 0) {
                if (var33 != null) {
                    var13 = arg5.method499(var13, var33.method330());
                }
                class137[] var35 = new class137[3];
                int var36 = 0;
                if (!arg3.method4810(3, arg10).method3162(-86) || !arg3.method4810(3, arg1).method3162(-110) || !arg3.method4810(3, arg2).method3162(-123)) {
                    return null;
                }
                class137 var37 = arg3.method4810(3, arg10).method3164(-113);
                if (var37 != null) {
                    var35[var36++] = var37;
                }
                class137 var38 = arg3.method4810(3, arg1).method3164(-102);
                if (var38 != null) {
                    var35[var36++] = var38;
                }
                class137 var39 = arg3.method4810(3, arg2).method3164(-109);
                if (var39 != null) {
                    var35[var36++] = var39;
                }
                int var40 = var13 | 0x4000;
                class137 var41 = new class137(var35, var36);
                var33 = arg5.method552(var41, var40, class124.field1453, 64, 768);
                for (int var42 = 0; var42 < 5; var42++) {
                    for (int var43 = 0; var43 < class58.field621.length; var43++) {
                        if (this.field10225[var42] < class58.field621[var43][var42].length) {
                            var33.method311(class322.field5078[var43][var42], class58.field621[var43][var42][this.field10225[var42]]);
                        }
                    }
                }
                var33.method347(var13);
                class178 var44 = class548.field8184;
                synchronized (class548.field8184) {
                    class548.field8184.method1556(var30, var33, 1);
                }
            }
            if (arg9 == null) {
                return var33;
            }
            if (arg11 > -125) {
                method5146(-63);
            }
            class497 var45 = var33.method332((byte) 4, var13, true);
            return arg9.method2851(arg6, var45, arg7, arg4, arg0, 65535);
        } catch (RuntimeException var50) {
            throw class759.method5498(var50, field10231[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10231[0] : field10231[2]) + ',' + arg4 + ',' + (arg5 == null ? field10231[0] : field10231[2]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field10231[0] : field10231[2]) + ',' + (arg9 == null ? field10231[0] : field10231[2]) + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public static void method5146(int arg0) {
        try {
            field10229 = null;
            field10226 = null;
            if (arg0 != 0) {
                field10229 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10231[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILsn;I)V")
    public final void method5147(int arg0, int arg1, class656 arg2, int arg3) {
        try {
            field10218++;
            int var5 = class423.field6231[arg3];
            if (arg1 != -19898) {
                this.field10220 = false;
            }
            if (arg2.method4810(3, arg0) != null) {
                this.field10219[var5] = class544.method4107(Integer.MIN_VALUE, arg0);
                this.method5143(arg1 ^ 0xFFFFB2B9);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10231[10] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10231[0] : field10231[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5148(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5149(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 101;
                    break;
                case 2:
                    var10005 = 125;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
