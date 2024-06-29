import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class621 {

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public int field8644 = -1;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field8643 = -1;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "F")
    public static float field8656;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field8642;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    private int field8646;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field8648;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field8652;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "J")
    private long field8645;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "J")
    private long field8655;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Z")
    public boolean field8661;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "[I")
    private int[] field8654;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "[I")
    public int[] field8657;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "[I")
    public static int[] field8660;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lle;Lmga;Ljk;IILso;Lte;IILha;Llj;I)Lka;", line = 4)
    public final class471 method3483(class307 arg0, class709 arg1, class633 arg2, int arg3, int arg4, class469 arg5, class613 arg6, int arg7, int arg8, class58 arg9, class607 arg10, int arg11) {
        if (arg3 != -4414) {
            this.method3488(null, 108, 7, -108);
        }
        field8647++;
        if (this.field8644 != -1) {
            return arg5.method2797(this.field8644, false).method2280(arg8, arg1, arg11, arg9, arg6, arg2, arg4, arg7, (byte) -89);
        }
        int var13 = arg8;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg8 | 0x20;
            int var21 = arg1.field9826[arg7];
            Object var22 = null;
            int var23 = var21 >>> 16;
            class494 var24 = arg2.method3521(arg3 ^ 0x114C, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2958(false, var25);
                var14 |= var24.method2957(arg3 + 4527, var25);
                var17 |= var24.method2953(var25, arg3 ^ 0xFFFFEEC3);
                var16 |= arg1.field9852;
            }
            if ((arg1.field9830 || class411.field5804) && arg11 != -1 && arg11 < arg1.field9826.length) {
                int var26 = arg1.field9826[arg11];
                int var27 = var26 >>> 16;
                class494 var28 = var23 == var27 ? var24 : arg2.method3521(68, var27);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method2958(false, var29);
                    var14 |= var28.method2957(123, var29);
                    var17 |= var28.method2953(var29, 1);
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
        class714 var30 = class90.field1079;
        class471 var31;
        synchronized (class90.field1079) {
            var31 = (class471) class90.field1079.method4022(this.field8655, (byte) 80);
        }
        if (var31 == null || arg9.method466(var31.method228(), var13) != 0) {
            if (var31 != null) {
                var13 = arg9.method479(var13, var31.method228());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field8654[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg0.method2002(var35 & 0x3FFFFFFF, (byte) -81).method3847(25)) {
                        var33 = true;
                    }
                } else if (!arg10.method3424(var35 & 0x3FFFFFFF, false).method3196(this.field8661, -29669)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class6[] var36 = new class6[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field8654[var38];
                if ((var39 & 0x40000000) != 0) {
                    class6 var41 = arg10.method3424(var39 & 0x3FFFFFFF, false).method3195((byte) 57, this.field8661);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class6 var40 = arg0.method2002(var39 & 0x3FFFFFFF, (byte) -50).method3856((byte) -20);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class6 var42 = new class6(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg9.method397(var42, var43, class612.field8586, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class485.field6815.length; var45++) {
                    if (class485.field6815[var45][var44].length > this.field8657[var44]) {
                        var31.method261(class465.field6591[var45][var44], class485.field6815[var45][var44][this.field8657[var44]]);
                    }
                }
            }
            var31.method242(var13);
            class714 var46 = class90.field1079;
            synchronized (class90.field1079) {
                class90.field1079.method4018((byte) 126, var31, this.field8655);
            }
        }
        if (arg1 == null) {
            return var31;
        } else {
            var31.method226((byte) 4, var13, true);
            return arg1.method3976(-1, var31, arg11, arg8, arg4, arg7);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILmga;IILlj;ILeb;Lha;ILmga;[IILle;Ljk;Z[Lkc;ILso;Lte;I)Lka;", line = 205)
    public final class471 method3484(int arg0, int arg1, class709 arg2, int arg3, int arg4, class607 arg5, int arg6, class625 arg7, class58 arg8, int arg9, class709 arg10, int[] arg11, int arg12, class307 arg13, class633 arg14, boolean arg15, class132[] arg16, int arg17, class469 arg18, class613 arg19, int arg20) {
        field8642++;
        if (this.field8644 != -1) {
            return arg18.method2797(this.field8644, false).method2279(arg0, arg14, arg4, arg19, arg3, arg12, arg16, arg8, arg9, arg6, arg10, true, arg1, arg2, arg7, arg11, arg17);
        }
        int var22 = arg1;
        long var23 = this.field8655;
        int[] var25 = this.field8654;
        if (arg10 != null && (arg10.field9847 >= 0 || arg10.field9835 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field8654[var26];
            }
            if (arg10.field9847 >= 0) {
                if (arg10.field9847 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class325.method2116(arg10.field9847, 1073741824);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg10.field9835 >= 0) {
                if (arg10.field9835 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class325.method2116(arg10.field9835, 1073741824);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg10 != null || arg2 != null;
        int var31 = arg16 == null ? 0 : arg16.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class236.field3169[var32] = null;
            if (arg16[var32] != null) {
                class709 var33 = arg14.method3525(arg16[var32].field1944, (byte) -36);
                if (var33.field9826 != null) {
                    class650.field8928[var32] = var33;
                    var30 = true;
                    int var34 = arg16[var32].field1942;
                    int var35 = arg16[var32].field1940;
                    int var36 = var33.field9826[var34];
                    class236.field3169[var32] = arg14.method3521(class286.method1875(arg20, -106), var36 >>> 16);
                    int var37 = var36 & 0xFFFF;
                    class440.field6275[var32] = var37;
                    if (class236.field3169[var32] != null) {
                        var28 |= class236.field3169[var32].method2958(false, var37);
                        var27 |= class236.field3169[var32].method2957(115, var37);
                        var29 |= class236.field3169[var32].method2953(var37, 1);
                    }
                    if ((var33.field9830 || class411.field5804) && var35 != -1 && var33.field9826.length > var35) {
                        class424.field5977[var32] = var33.field9849[var34];
                        class235.field3156[var32] = arg16[var32].field1947;
                        int var38 = var33.field9826[var35];
                        class533.field7510[var32] = arg14.method3521(-123, var38 >>> 16);
                        int var39 = var38 & 0xFFFF;
                        class440.field6271[var32] = var39;
                        if (class533.field7510[var32] != null) {
                            var28 |= class533.field7510[var32].method2958(false, var39);
                            var27 |= class533.field7510[var32].method2957(arg20 + 126, var39);
                            var29 |= class533.field7510[var32].method2953(var39, 1);
                        }
                    } else {
                        class424.field5977[var32] = 0;
                        class235.field3156[var32] = 0;
                        class533.field7510[var32] = null;
                        class440.field6271[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = arg20;
        class494 var43 = null;
        class494 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class494 var48 = null;
        class494 var49 = null;
        if (var30) {
            var22 = arg1 | 0x20;
            if (arg10 != null) {
                int var50 = arg10.field9826[arg17];
                int var51 = var50 >>> 16;
                var40 = var50 & 0xFFFF;
                var43 = arg14.method3521(43, var51);
                if (var43 != null) {
                    var28 |= var43.method2958(false, var40);
                    var27 |= var43.method2957(113, var40);
                    var29 |= var43.method2953(var40, 1);
                }
                if ((arg10.field9830 || class411.field5804) && arg12 != -1 && arg10.field9826.length > arg12) {
                    var42 = arg10.field9849[arg17];
                    int var52 = arg10.field9826[arg12];
                    int var53 = var52 >>> 16;
                    var41 = var52 & 0xFFFF;
                    var44 = var51 == var53 ? var43 : arg14.method3521(-111, var53);
                    if (var44 != null) {
                        var28 |= var44.method2958(false, var41);
                        var27 |= var44.method2957(arg20 ^ 0x7A, var41);
                        var29 |= var44.method2953(var41, 1);
                    }
                }
            }
            if (arg2 != null) {
                int var54 = arg2.field9826[arg4];
                int var55 = var54 >>> 16;
                var48 = arg14.method3521(-111, var55);
                var45 = var54 & 0xFFFF;
                if (var48 != null) {
                    var28 |= var48.method2958(false, var45);
                    var27 |= var48.method2957(118, var45);
                    var29 |= var48.method2953(var45, 1);
                }
                if ((arg2.field9830 || class411.field5804) && arg3 != -1 && arg2.field9826.length > arg3) {
                    int var56 = arg2.field9826[arg3];
                    var47 = arg2.field9849[arg4];
                    int var57 = var56 >>> 16;
                    var46 = var56 & 0xFFFF;
                    var49 = var55 == var57 ? var48 : arg14.method3521(-121, var57);
                    if (var49 != null) {
                        var28 |= var49.method2958(false, var46);
                        var27 |= var49.method2957(119, var46);
                        var29 |= var49.method2953(var46, arg20 ^ 0x1);
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
        class714 var58 = class668.field9073;
        class471 var59;
        synchronized (class668.field9073) {
            var59 = (class471) class668.field9073.method4022(var23, (byte) 76);
        }
        class224 var60 = null;
        if (this.field8646 != -1) {
            var60 = arg7.method3506(this.field8646, 64);
        }
        if (var59 == null || arg8.method466(var59.method228(), var22) != 0) {
            if (var59 != null) {
                var22 = arg8.method479(var22, var59.method228());
            }
            boolean var62 = false;
            int var63 = 0;
            while (true) {
                if (var63 >= 12) {
                    if (var62) {
                        if (this.field8645 != -1L) {
                            class714 var82 = class668.field9073;
                            synchronized (class668.field9073) {
                                var59 = (class471) class668.field9073.method4022(this.field8645, (byte) 103);
                            }
                        }
                        if (var59 == null || arg8.method466(var59.method228(), var22) != 0) {
                            return null;
                        }
                    } else {
                        class6[] var65 = new class6[12];
                        for (int var66 = 0; var66 < 12; var66++) {
                            int var67 = var25[var66];
                            if ((var67 & 0x40000000) != 0) {
                                class6 var68 = arg5.method3424(var67 & 0x3FFFFFFF, false).method3189(this.field8661, 4371);
                                if (var68 != null) {
                                    var65[var66] = var68;
                                }
                            } else if ((Integer.MIN_VALUE & var67) != 0) {
                                class6 var69 = arg13.method2002(var67 & 0x3FFFFFFF, (byte) -7).method3854((byte) 20);
                                if (var69 != null) {
                                    var65[var66] = var69;
                                }
                            }
                        }
                        if (var60 != null && var60.field3016 != null) {
                            for (int var70 = 0; var70 < var60.field3016.length; var70++) {
                                if (var65[var70] != null) {
                                    int var71 = 0;
                                    int var72 = 0;
                                    int var73 = 0;
                                    int var74 = 0;
                                    int var75 = 0;
                                    int var76 = 0;
                                    if (var60.field3016[var70] != null) {
                                        var71 = var60.field3016[var70][0];
                                        var75 = var60.field3016[var70][4] << 3;
                                        var76 = var60.field3016[var70][5] << 3;
                                        var72 = var60.field3016[var70][1];
                                        var74 = var60.field3016[var70][3] << 3;
                                        var73 = var60.field3016[var70][2];
                                    }
                                    if (var74 != 0 || var75 != 0 || var76 != 0) {
                                        var65[var70].method39(var74, var76, arg20, var75);
                                    }
                                    if (var71 != 0 || var72 != 0 || var73 != 0) {
                                        var65[var70].method30(var72, (byte) 115, var73, var71);
                                    }
                                }
                            }
                        }
                        class6 var77 = new class6(var65, var65.length);
                        int var78 = var22 | 0x4000;
                        var59 = arg8.method397(var77, var78, class612.field8586, 64, 850);
                        for (int var79 = 0; var79 < 5; var79++) {
                            for (int var80 = 0; var80 < class485.field6815.length; var80++) {
                                if (class485.field6815[var80][var79].length > this.field8657[var79]) {
                                    var59.method261(class465.field6591[var80][var79], class485.field6815[var80][var79][this.field8657[var79]]);
                                }
                            }
                        }
                        if (arg15) {
                            var59.method242(var22);
                            class714 var81 = class668.field9073;
                            synchronized (class668.field9073) {
                                class668.field9073.method4018((byte) 126, var59, var23);
                            }
                            this.field8645 = var23;
                        }
                    }
                    break;
                }
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var64) != 0 && !arg13.method2002(var64 & 0x3FFFFFFF, (byte) -21).method3852(10779)) {
                        var62 = true;
                    }
                } else if (!arg5.method3424(var64 & 0x3FFFFFFF, false).method3181(this.field8661, (byte) 65)) {
                    var62 = true;
                }
                var63++;
            }
        }
        class471 var83 = var59.method226((byte) 4, var22, true);
        boolean var84 = false;
        if (arg11 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg11[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class513[] var86 = null;
        if (var60 != null) {
            var86 = var60.method1406(arg8, arg20 + 107);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method264(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var31 > var88) {
            if (class236.field3169[var88] != null) {
                var83.method2820(class440.field6271[var88], false, class440.field6275[var88], var89, (byte) -103, class236.field3169[var88], 0, class424.field5977[var88], class235.field3156[var88] - 1, class533.field7510[var88], null);
            }
            var88++;
            var89 <<= 0x1;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg11[var90] != -1) {
                    int var91 = arg11[var90] - arg9;
                    int var92 = var91 & 0x3FFF;
                    class513 var93 = arg8.method427();
                    var93.method363(var92);
                    var83.method264(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method264(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method2814(arg6 - 1, arg0 - 1, var41, var45, var47, arg10.field9846, var44, arg20 ^ 0xFFFFFF89, var42, var40, var48, var46, false, var43, var49);
        } else if (var43 != null) {
            var83.method2810(var43, arg0 - 1, var40, var41, false, 0, var42, var44, arg20 ^ 0x3E8);
        } else if (var48 != null) {
            var83.method2810(var48, arg6 - 1, var45, var46, false, 0, var47, var49, 1000);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class236.field3169[var95] = null;
            class533.field7510[var95] = null;
            class650.field8928[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILha;ILle;ILmga;IIILjk;)Lka;", line = 758)
    public final class471 method3485(int arg0, int arg1, int arg2, class58 arg3, int arg4, class307 arg5, int arg6, class709 arg7, int arg8, int arg9, int arg10, class633 arg11) {
        field8650++;
        int var13 = arg9;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg9 | 0x20;
            int var22 = arg7.field9826[arg10];
            int var23 = var22 >>> 16;
            class494 var24 = arg11.method3521(-106, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2958(false, var25);
                var14 |= var24.method2957(121, var25);
                var17 |= var24.method2953(var25, 1);
                var16 |= arg7.field9852;
            }
            if ((arg7.field9830 || class411.field5804) && arg2 != -1 && arg7.field9826.length > arg2) {
                int var26 = arg7.field9826[arg2];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class494 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg11.method3521(84, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method2958(false, var28);
                    var14 |= var29.method2957(114, var28);
                    var17 |= var29.method2953(var28, 1);
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
        long var30 = (long) arg8 << 32 | (long) (arg4 << 16) | (long) arg1;
        class714 var32 = class90.field1079;
        class471 var34;
        synchronized (class90.field1079) {
            int var33 = 121 / ((30 - arg6) / 60);
            var34 = (class471) class90.field1079.method4022(var30, (byte) 90);
        }
        if (var34 == null || arg3.method466(var34.method228(), var13) != 0) {
            if (var34 != null) {
                var13 = arg3.method479(var13, var34.method228());
            }
            class6[] var36 = new class6[3];
            int var37 = 0;
            if (!arg5.method2002(arg1, (byte) -34).method3847(-91) || !arg5.method2002(arg4, (byte) -124).method3847(-103) || !arg5.method2002(arg8, (byte) -6).method3847(-115)) {
                return null;
            }
            class6 var38 = arg5.method2002(arg1, (byte) -91).method3856((byte) -20);
            if (var38 != null) {
                var36[var37++] = var38;
            }
            class6 var39 = arg5.method2002(arg4, (byte) -4).method3856((byte) -61);
            if (var39 != null) {
                var36[var37++] = var39;
            }
            class6 var40 = arg5.method2002(arg8, (byte) -26).method3856((byte) -72);
            if (var40 != null) {
                var36[var37++] = var40;
            }
            class6 var41 = new class6(var36, var37);
            int var42 = var13 | 0x4000;
            var34 = arg3.method397(var41, var42, class612.field8586, 64, 768);
            for (int var43 = 0; var43 < 5; var43++) {
                for (int var44 = 0; var44 < class485.field6815.length; var44++) {
                    if (this.field8657[var43] < class485.field6815[var44][var43].length) {
                        var34.method261(class465.field6591[var44][var43], class485.field6815[var44][var43][this.field8657[var43]]);
                    }
                }
            }
            var34.method242(var13);
            class714 var45 = class90.field1079;
            synchronized (class90.field1079) {
                class90.field1079.method4018((byte) 124, var34, var30);
            }
        }
        if (arg7 == null) {
            return var34;
        } else {
            class471 var46 = var34.method226((byte) 4, var13, true);
            return arg7.method3976(-1, var46, arg2, arg9, arg0, arg10);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZZ)V", line = 912)
    public static final void method3486(int arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            class477.field6769++;
            class327.method2126(1);
        }
        field8659++;
        if (arg0 >= -12) {
            field8660 = null;
        }
        if (arg2) {
            class731.field10209++;
            class722.method4056((byte) 102);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 942)
    public static void method3487(byte arg0) {
        field8660 = null;
        if (arg0 <= 22) {
            method3487((byte) -55);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lle;III)V", line = 952)
    public final void method3488(class307 arg0, int arg1, int arg2, int arg3) {
        field8648++;
        int var5 = class244.field3257[arg1];
        if (arg0.method2002(arg3, (byte) -83) == null) {
            return;
        }
        this.field8654[var5] = class325.method2116(Integer.MIN_VALUE, arg3);
        if (arg2 <= 98) {
            method3487((byte) 104);
        }
        this.method3491(255);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V", line = 969)
    public final void method3489(int arg0, int arg1, int arg2) {
        if (arg0 == -27417) {
            this.field8657[arg1] = arg2;
            field8649++;
            this.method3491(255);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZB)V", line = 991)
    public final void method3490(boolean arg0, byte arg1) {
        field8653++;
        this.field8661 = arg0;
        this.method3491(255);
        if (arg1 != 122) {
            this.method3493(null, -99, 13, 97);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 1003)
    private final void method3491(int arg0) {
        field8652++;
        this.field8655 = -1L;
        long[] var2 = class344.field4828;
        this.field8655 = var2[(int) ((this.field8655 ^ (long) (this.field8646 >> 8)) & 0xFFL)] ^ this.field8655 >>> 8;
        this.field8655 = var2[(int) ((this.field8655 ^ (long) this.field8646) & (long) arg0)] ^ this.field8655 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field8655 = var2[(int) (((long) (this.field8654[var3] >> 24) ^ this.field8655) & 0xFFL)] ^ this.field8655 >>> 8;
            this.field8655 = var2[(int) ((this.field8655 ^ (long) (this.field8654[var3] >> 16)) & 0xFFL)] ^ this.field8655 >>> 8;
            this.field8655 = this.field8655 >>> 8 ^ var2[(int) (((long) (this.field8654[var3] >> 8) ^ this.field8655) & 0xFFL)];
            this.field8655 = this.field8655 >>> 8 ^ var2[(int) (((long) this.field8654[var3] ^ this.field8655) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field8655 = var2[(int) (((long) this.field8657[var4] ^ this.field8655) & 0xFFL)] ^ this.field8655 >>> 8;
        }
        this.field8655 = this.field8655 >>> 8 ^ var2[(int) ((this.field8655 ^ (long) (this.field8661 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([I[IIBIZ)V", line = 1037)
    public final void method3492(int[] arg0, int[] arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        if (this.field8646 != arg4) {
            this.field8646 = arg4;
        }
        int var7 = -89 % ((-arg3 - 64) / 35);
        this.field8654 = arg1;
        this.field8661 = arg5;
        this.field8657 = arg0;
        field8651++;
        this.field8644 = arg2;
        this.method3491(255);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Llj;III)V", line = 1060)
    public final void method3493(class607 arg0, int arg1, int arg2, int arg3) {
        field8658++;
        if (arg2 == -1) {
            this.field8654[arg1] = 0;
        } else if (arg0.method3424(arg2, false) == null) {
            return;
        } else {
            this.field8654[arg1] = class325.method2116(1073741824, arg2);
            this.method3491(255);
        }
        if (arg3 != 0) {
            this.field8645 = 116L;
        }
    }
}
