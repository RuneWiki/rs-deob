import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class386 {

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public int field5823 = -1;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    private int field5824;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "J")
    private long field5818;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "J")
    private long field5836;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Z")
    public boolean field5821;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "[I")
    public int[] field5828;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "[I")
    private int[] field5835;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILhp;II)V")
    public final void method2480(int arg0, class329 arg1, int arg2, int arg3) {
        field5830++;
        if (arg3 != 17322) {
            return;
        }
        if (arg2 == -1) {
            this.field5835[arg0] = 0;
        } else if (arg1.method2079(arg2, (byte) 92) != null) {
            this.field5835[arg0] = class625.method3600(1073741824, arg2);
            this.method2491(arg3 ^ 0x43A6);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lao;[Lgea;Lha;Ldaa;IILwg;ILbg;IIIILhp;Lao;[ILul;IZILvi;)Lka;")
    public final class473 method2481(class288 arg0, class75[] arg1, class60 arg2, class11 arg3, int arg4, int arg5, class427 arg6, int arg7, class466 arg8, int arg9, int arg10, int arg11, int arg12, class329 arg13, class288 arg14, int[] arg15, class574 arg16, int arg17, boolean arg18, int arg19, class541 arg20) {
        field5837++;
        if (this.field5823 != -1) {
            return arg16.method3327(this.field5823, false).method2201(arg11, arg2, null, arg10, arg14, arg20, arg7, arg1, arg5, arg4, arg17, arg8, arg9, arg0, (byte) 127, arg19, arg15, arg6);
        }
        int var22 = arg17;
        long var23 = this.field5836;
        int[] var25 = this.field5835;
        if (arg14 != null && (arg14.field4110 >= 0 || arg14.field4084 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field5835[var26];
            }
            if (arg14.field4110 >= 0) {
                if (arg14.field4110 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class625.method3600(arg14.field4110, 1073741824);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg14.field4084 >= 0) {
                if (arg14.field4084 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class625.method3600(1073741824, arg14.field4084);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg14 != null || arg0 != null;
        int var31 = arg1 == null ? 0 : arg1.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class339.field4932[var32] = null;
            if (arg1[var32] != null) {
                class288 var33 = arg6.method2663(0, arg1[var32].field1046);
                if (var33.field4081 != null) {
                    var30 = true;
                    class332.field4767[var32] = var33;
                    int var34 = arg1[var32].field1043;
                    int var35 = arg1[var32].field1047;
                    int var36 = var33.field4081[var34];
                    class339.field4932[var32] = arg6.method2666(true, var36 >>> 16);
                    int var37 = var36 & 0xFFFF;
                    class718.field10088[var32] = var37;
                    if (class339.field4932[var32] != null) {
                        var28 |= class339.field4932[var32].method1668(var37, 21665);
                        var27 |= class339.field4932[var32].method1666(var37, 10963);
                        var29 |= class339.field4932[var32].method1667(var37, false);
                    }
                    if ((var33.field4109 || class358.field5202) && var35 != -1 && var33.field4081.length > var35) {
                        class335.field4824[var32] = var33.field4087[var34];
                        class373.field5541[var32] = arg1[var32].field1045;
                        int var38 = var33.field4081[var35];
                        class245.field3566[var32] = arg6.method2666(true, var38 >>> 16);
                        int var39 = var38 & 0xFFFF;
                        class476.field6915[var32] = var39;
                        if (class245.field3566[var32] != null) {
                            var28 |= class245.field3566[var32].method1668(var39, 21665);
                            var27 |= class245.field3566[var32].method1666(var39, 10963);
                            var29 |= class245.field3566[var32].method1667(var39, false);
                        }
                    } else {
                        class335.field4824[var32] = 0;
                        class373.field5541[var32] = 0;
                        class245.field3566[var32] = null;
                        class476.field6915[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        if (arg12 <= 116) {
            this.method2487(-84, 73, null, 100);
        }
        class253 var43 = null;
        class253 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class253 var48 = null;
        class253 var49 = null;
        if (var30) {
            if (arg14 != null) {
                int var50 = arg14.field4081[arg5];
                int var51 = var50 >>> 16;
                var43 = arg6.method2666(true, var51);
                var40 = var50 & 0xFFFF;
                if (var43 != null) {
                    var28 |= var43.method1668(var40, 21665);
                    var27 |= var43.method1666(var40, 10963);
                    var29 |= var43.method1667(var40, false);
                }
                if ((arg14.field4109 || class358.field5202) && arg19 != -1 && arg14.field4081.length > arg19) {
                    int var52 = arg14.field4081[arg19];
                    var42 = arg14.field4087[arg5];
                    int var53 = var52 >>> 16;
                    var41 = var52 & 0xFFFF;
                    var44 = var51 == var53 ? var43 : arg6.method2666(true, var53);
                    if (var44 != null) {
                        var28 |= var44.method1668(var41, 21665);
                        var27 |= var44.method1666(var41, 10963);
                        var29 |= var44.method1667(var41, false);
                    }
                }
            }
            var22 = arg17 | 0x20;
            if (arg0 != null) {
                int var54 = arg0.field4081[arg4];
                int var55 = var54 >>> 16;
                var48 = arg6.method2666(true, var55);
                var45 = var54 & 0xFFFF;
                if (var48 != null) {
                    var28 |= var48.method1668(var45, 21665);
                    var27 |= var48.method1666(var45, 10963);
                    var29 |= var48.method1667(var45, false);
                }
                if ((arg0.field4109 || class358.field5202) && arg10 != -1 && arg0.field4081.length > arg10) {
                    int var56 = arg0.field4081[arg10];
                    var47 = arg0.field4087[arg4];
                    int var57 = var56 >>> 16;
                    var49 = var55 == var57 ? var48 : arg6.method2666(true, var57);
                    var46 = var56 & 0xFFFF;
                    if (var49 != null) {
                        var28 |= var49.method1668(var46, 21665);
                        var27 |= var49.method1666(var46, 10963);
                        var29 |= var49.method1667(var46, false);
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
        class106 var58 = class671.field9364;
        class473 var59;
        synchronized (class671.field9364) {
            var59 = (class473) class671.field9364.method803(115, var23);
        }
        class264 var60 = null;
        if (this.field5824 != -1) {
            var60 = arg8.method2828(false, this.field5824);
        }
        if (var59 == null || arg2.method491(var59.method255(), var22) != 0) {
            if (var59 != null) {
                var22 = arg2.method490(var22, var59.method255());
            }
            boolean var62 = false;
            int var63 = 0;
            while (true) {
                if (var63 >= 12) {
                    if (var62) {
                        if (this.field5818 != -1L) {
                            class106 var65 = class671.field9364;
                            synchronized (class671.field9364) {
                                var59 = (class473) class671.field9364.method803(120, this.field5818);
                            }
                        }
                        if (var59 == null || arg2.method491(var59.method255(), var22) != 0) {
                            return null;
                        }
                    } else {
                        class322[] var66 = new class322[12];
                        for (int var67 = 0; var67 < 12; var67++) {
                            int var68 = var25[var67];
                            if ((var68 & 0x40000000) != 0) {
                                class322 var69 = arg13.method2079(var68 & 0x3FFFFFFF, (byte) 93).method3358(115, this.field5821);
                                if (var69 != null) {
                                    var66[var67] = var69;
                                }
                            } else if ((var68 & Integer.MIN_VALUE) != 0) {
                                class322 var70 = arg3.method74((byte) 45, var68 & 0x3FFFFFFF).method2707(19026);
                                if (var70 != null) {
                                    var66[var67] = var70;
                                }
                            }
                        }
                        if (var60 != null && var60.field3730 != null) {
                            for (int var71 = 0; var71 < var60.field3730.length; var71++) {
                                if (var66[var71] != null) {
                                    int var72 = 0;
                                    int var73 = 0;
                                    int var74 = 0;
                                    int var75 = 0;
                                    int var76 = 0;
                                    int var77 = 0;
                                    if (var60.field3730[var71] != null) {
                                        var72 = var60.field3730[var71][0];
                                        var77 = var60.field3730[var71][5] << 3;
                                        var73 = var60.field3730[var71][1];
                                        var75 = var60.field3730[var71][3] << 3;
                                        var74 = var60.field3730[var71][2];
                                        var76 = var60.field3730[var71][4] << 3;
                                    }
                                    if (var75 != 0 || var76 != 0 || var77 != 0) {
                                        var66[var71].method2050(var77, 0, var75, var76);
                                    }
                                    if (var72 != 0 || var73 != 0 || var74 != 0) {
                                        var66[var71].method2043(var73, (byte) 64, var72, var74);
                                    }
                                }
                            }
                        }
                        class322 var78 = new class322(var66, var66.length);
                        int var79 = var22 | 0x4000;
                        var59 = arg2.method418(var78, var79, class348.field5103, 64, 850);
                        for (int var80 = 0; var80 < 5; var80++) {
                            for (int var81 = 0; var81 < class244.field3560.length; var81++) {
                                if (this.field5828[var80] < class244.field3560[var81][var80].length) {
                                    var59.method259(class639.field8976[var81][var80], class244.field3560[var81][var80][this.field5828[var80]]);
                                }
                            }
                        }
                        if (arg18) {
                            var59.method271(var22);
                            class106 var82 = class671.field9364;
                            synchronized (class671.field9364) {
                                class671.field9364.method801(1, var59, var23);
                            }
                            this.field5818 = var23;
                        }
                    }
                    break;
                }
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var64) != 0 && !arg3.method74((byte) 45, var64 & 0x3FFFFFFF).method2713((byte) 0)) {
                        var62 = true;
                    }
                } else if (!arg13.method2079(var64 & 0x3FFFFFFF, (byte) 91).method3345(this.field5821, -128)) {
                    var62 = true;
                }
                var63++;
            }
        }
        class473 var83 = var59.method251((byte) 4, var22, true);
        boolean var84 = false;
        if (arg15 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg15[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class738[] var86 = null;
        if (var60 != null) {
            var86 = var60.method1701(125, arg2);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method276(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var88 < var31) {
            if (class339.field4932[var88] != null) {
                var83.method2853(class718.field10088[var88], class476.field6915[var88], false, class339.field4932[var88], null, class335.field4824[var88], class373.field5541[var88] - 1, -24446, var89, class245.field3566[var88], 0);
            }
            var89 <<= 0x1;
            var88++;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg15[var90] != -1) {
                    int var91 = arg15[var90] - arg11;
                    int var92 = var91 & 0x3FFF;
                    class738 var93 = arg2.method515();
                    var93.method764(var92);
                    var83.method276(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method276(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method2859(arg7 - 1, 0, arg9 - 1, false, var47, var42, var49, var40, var45, var44, var48, arg14.field4106, var43, var41, var46);
        } else if (var43 != null) {
            var83.method2854(var41, var44, var40, 0, var42, var43, false, arg7 - 1, 0);
        } else if (var48 != null) {
            var83.method2854(var46, var49, var45, 0, var47, var48, false, arg9 - 1, 0);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class339.field4932[var95] = null;
            class245.field3566[var95] = null;
            class332.field4767[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)V")
    public final void method2482(boolean arg0, int arg1) {
        field5820++;
        this.field5821 = arg0;
        this.method2491(36);
        if (arg1 < 42) {
            this.field5824 = -4;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZI)V")
    public final void method2483(int arg0, boolean arg1, int arg2) {
        this.field5828[arg2] = arg0;
        field5819++;
        this.method2491(-95);
        if (!arg1) {
            this.method2490(61, 57, 30, null, -57, null, null, null, null, null, null, 91);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBI[IZ[I)V")
    public final void method2484(int arg0, byte arg1, int arg2, int[] arg3, boolean arg4, int[] arg5) {
        this.field5821 = arg4;
        this.field5835 = arg3;
        if (arg1 > -89) {
            method2489(1, -23, -6, null, 103);
        }
        this.field5823 = arg2;
        this.field5828 = arg5;
        field5825++;
        if (this.field5824 != arg0) {
            this.field5824 = arg0;
        }
        this.method2491(-96);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static final void method2485(boolean arg0) {
        if (!arg0) {
            method2489(-35, -13, 75, null, 47);
        }
        field5822++;
        class400.method2542((long) class357.field5189, class736.field10316, -2682);
        if (class87.field1249 != -1) {
            class453.method2774(class87.field1249, 1024);
        }
        for (int var1 = 0; var1 < class196.field2983; var1++) {
            if (class228.field3352[var1]) {
                class50.field715[var1] = true;
            }
            class432.field6444[var1] = class228.field3352[var1];
            class228.field3352[var1] = false;
        }
        class2.field21 = class357.field5189;
        if (class87.field1249 != -1) {
            class196.field2983 = 0;
            class92.method728(true);
        }
        class736.field10316.method469();
        class2.method10(class736.field10316, 29085);
        int var2 = class268.method1715(-445);
        if (var2 == -1) {
            var2 = class389.field5865;
        }
        if (var2 == -1) {
            var2 = class734.field10270;
        }
        class462.method2819(-21356, var2);
        class12.field171 = 0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILdaa;Lao;IILha;ILwg;II)Lka;")
    public final class473 method2486(int arg0, int arg1, int arg2, class11 arg3, class288 arg4, int arg5, int arg6, class60 arg7, int arg8, class427 arg9, int arg10, int arg11) {
        field5831++;
        int var13 = arg2;
        if (arg4 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg4.field4081[arg5];
            Object var22 = null;
            var13 = arg2 | 0x20;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class253 var25 = arg9.method2666(true, var23);
            if (var25 != null) {
                var15 |= var25.method1668(var24, 21665);
                var14 |= var25.method1666(var24, 10963);
                var17 |= var25.method1667(var24, false);
                var16 |= arg4.field4101;
            }
            if ((arg4.field4109 || class358.field5202) && arg0 != -1 && arg0 < arg4.field4081.length) {
                int var26 = arg4.field4081[arg0];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class253 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg9.method2666(true, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method1668(var28, 21665);
                    var14 |= var29.method1666(var28, 10963);
                    var17 |= var29.method1667(var28, false);
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
        long var30 = (long) (arg8 << 16) | (long) arg1 << 32 | (long) arg11;
        class106 var32 = class391.field5893;
        class473 var33;
        synchronized (class391.field5893) {
            var33 = (class473) class391.field5893.method803(112, var30);
        }
        if (var33 == null || arg7.method491(var33.method255(), var13) != 0) {
            if (var33 != null) {
                var13 = arg7.method490(var13, var33.method255());
            }
            class322[] var35 = new class322[3];
            int var36 = 0;
            if (!arg3.method74((byte) 45, arg11).method2705(5) || !arg3.method74((byte) 45, arg8).method2705(5) || !arg3.method74((byte) 45, arg1).method2705(5)) {
                return null;
            }
            class322 var37 = arg3.method74((byte) 45, arg11).method2711(arg10 - 2);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class322 var38 = arg3.method74((byte) 45, arg8).method2711(arg10 ^ 0x2);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class322 var39 = arg3.method74((byte) 45, arg1).method2711(0);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class322 var41 = new class322(var35, var36);
            var33 = arg7.method418(var41, var40, class348.field5103, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class244.field3560.length; var43++) {
                    if (class244.field3560[var43][var42].length > this.field5828[var42]) {
                        var33.method259(class639.field8976[var43][var42], class244.field3560[var43][var42][this.field5828[var42]]);
                    }
                }
            }
            var33.method271(var13);
            class106 var44 = class391.field5893;
            synchronized (class391.field5893) {
                class391.field5893.method801(1, var33, var30);
            }
        }
        if (arg4 == null) {
            return var33;
        }
        if (arg10 != 2) {
            method2489(-43, -90, 26, null, 16);
        }
        class473 var45 = var33.method251((byte) 4, var13, true);
        return arg4.method1835(var45, arg6, arg0, arg2, (byte) 100, arg5);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILdaa;I)V")
    public final void method2487(int arg0, int arg1, class11 arg2, int arg3) {
        field5829++;
        int var5 = class728.field10161[arg3];
        if (arg1 != 0) {
            this.field5836 = -48L;
        }
        if (arg2.method74((byte) 45, arg0) != null) {
            this.field5835[var5] = class625.method3600(Integer.MIN_VALUE, arg0);
            this.method2491(arg1 ^ 0xFFFFFFB8);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLwe;Lwe;)V")
    public static final void method2488(boolean arg0, class408 arg1, class408 arg2) {
        field5827++;
        if (arg1.field6157 != null) {
            arg1.method2597(-89);
        }
        if (!arg0) {
            field5833 = 101;
        }
        arg1.field6157 = arg2;
        arg1.field6156 = arg2.field6156;
        arg1.field6157.field6156 = arg1;
        arg1.field6156.field6157 = arg1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILcq;I)V")
    public static final void method2489(int arg0, int arg1, int arg2, class468 arg3, int arg4) {
        field5834++;
        arg3.field6839.method3695(arg4, 255);
        if (arg0 != 0) {
            method2488(false, null, null);
        }
        arg3.field6839.method3702(arg2, (byte) -127);
        arg3.field6839.method3702(arg1, (byte) -111);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILao;ILul;Lha;Lhp;Ldaa;Lvi;Lwg;I)Lka;")
    public final class473 method2490(int arg0, int arg1, int arg2, class288 arg3, int arg4, class574 arg5, class60 arg6, class329 arg7, class11 arg8, class541 arg9, class427 arg10, int arg11) {
        field5832++;
        if (this.field5823 != -1) {
            return arg5.method3327(this.field5823, false).method2199(null, arg1, arg2, arg4, arg11, arg6, arg10, arg9, arg3, false);
        }
        int var13 = arg11;
        if (arg0 <= 87) {
            return null;
        }
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg3.field4081[arg2];
            var13 = arg11 | 0x20;
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class253 var25 = arg10.method2666(true, var23);
            if (var25 != null) {
                var15 |= var25.method1668(var24, 21665);
                var14 |= var25.method1666(var24, 10963);
                var17 |= var25.method1667(var24, false);
                var16 |= arg3.field4101;
            }
            if ((arg3.field4109 || class358.field5202) && arg4 != -1 && arg3.field4081.length > arg4) {
                int var26 = arg3.field4081[arg4];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class253 var29 = var23 == var27 ? var25 : arg10.method2666(true, var27);
                if (var29 != null) {
                    var15 |= var29.method1668(var28, 21665);
                    var14 |= var29.method1666(var28, 10963);
                    var17 |= var29.method1667(var28, false);
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
        class106 var30 = class391.field5893;
        class473 var31;
        synchronized (class391.field5893) {
            var31 = (class473) class391.field5893.method803(121, this.field5836);
        }
        if (var31 == null || arg6.method491(var31.method255(), var13) != 0) {
            if (var31 != null) {
                var13 = arg6.method490(var13, var31.method255());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field5835[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg8.method74((byte) 45, var35 & 0x3FFFFFFF).method2705(5)) {
                        var33 = true;
                    }
                } else if (!arg7.method2079(var35 & 0x3FFFFFFF, (byte) -74).method3355(this.field5821, 0)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class322[] var36 = new class322[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field5835[var38];
                if ((var39 & 0x40000000) != 0) {
                    class322 var40 = arg7.method2079(var39 & 0x3FFFFFFF, (byte) -126).method3350(this.field5821, (byte) 67);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class322 var41 = arg8.method74((byte) 45, var39 & 0x3FFFFFFF).method2711(0);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class322 var43 = new class322(var36, var37);
            var31 = arg6.method418(var43, var42, class348.field5103, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class244.field3560.length; var45++) {
                    if (this.field5828[var44] < class244.field3560[var45][var44].length) {
                        var31.method259(class639.field8976[var45][var44], class244.field3560[var45][var44][this.field5828[var44]]);
                    }
                }
            }
            var31.method271(var13);
            class106 var46 = class391.field5893;
            synchronized (class391.field5893) {
                class391.field5893.method801(1, var31, this.field5836);
            }
        }
        if (arg3 == null) {
            return var31;
        } else {
            var31.method251((byte) 4, var13, true);
            return arg3.method1835(var31, arg1, arg4, arg11, (byte) 100, arg2);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    private final void method2491(int arg0) {
        field5826++;
        long[] var2 = class118.field1615;
        this.field5836 = -1L;
        this.field5836 = var2[(int) (((long) (this.field5824 >> 8) ^ this.field5836) & 0xFFL)] ^ this.field5836 >>> 8;
        this.field5836 = var2[(int) ((this.field5836 ^ (long) this.field5824) & 0xFFL)] ^ this.field5836 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field5836 = this.field5836 >>> 8 ^ var2[(int) ((this.field5836 ^ (long) (this.field5835[var3] >> 24)) & 0xFFL)];
            this.field5836 = this.field5836 >>> 8 ^ var2[(int) (((long) (this.field5835[var3] >> 16) ^ this.field5836) & 0xFFL)];
            this.field5836 = var2[(int) ((this.field5836 ^ (long) (this.field5835[var3] >> 8)) & 0xFFL)] ^ this.field5836 >>> 8;
            this.field5836 = var2[(int) ((this.field5836 ^ (long) this.field5835[var3]) & 0xFFL)] ^ this.field5836 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field5836 = var2[(int) (((long) this.field5828[var4] ^ this.field5836) & 0xFFL)] ^ this.field5836 >>> 8;
        }
        this.field5836 = var2[(int) (((long) (this.field5821 ? 1 : 0) ^ this.field5836) & 0xFFL)] ^ this.field5836 >>> 8;
        int var5 = -99 % ((arg0 + 30) / 42);
    }
}
