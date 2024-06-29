import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class635 {

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public int field9040 = -1;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lqk;")
    public static class148 field9037 = new class148(33, 0);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    private int field9043;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "J")
    private long field9028;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "J")
    private long field9031;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Lwu;")
    public static class557 field9039;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Z")
    public boolean field9038;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "[I")
    private int[] field9036;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "[I")
    public int[] field9041;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method3688(byte arg0) {
        field9039 = null;
        if (arg0 < -74) {
            field9037 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZILmn;)V")
    public final void method3689(int arg0, boolean arg1, int arg2, class511 arg3) {
        field9042++;
        if (arg1) {
            this.field9043 = -103;
        }
        if (arg2 == -1) {
            this.field9036[arg0] = 0;
        } else if (arg3.method3054(arg2, (byte) -99) != null) {
            this.field9036[arg0] = class747.method4153(1073741824, arg2);
            this.method3694(117);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BII)V")
    public final void method3690(byte arg0, int arg1, int arg2) {
        field9032++;
        if (arg0 == 4) {
            this.field9041[arg1] = arg2;
            this.method3694(125);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Laca;Lec;I[IILqg;ILjn;Lbaa;II[Loi;Lha;Lmn;IIILec;ILffa;Z)Lka;")
    public final class283 method3691(class219 arg0, class103 arg1, int arg2, int[] arg3, int arg4, class267 arg5, int arg6, class322 arg7, class129 arg8, int arg9, int arg10, class696[] arg11, class545 arg12, class511 arg13, int arg14, int arg15, int arg16, class103 arg17, int arg18, class678 arg19, boolean arg20) {
        field9029++;
        if (this.field9040 != -1) {
            return arg19.method3887(this.field9040, false).method49(arg3, arg1, arg0, arg14, arg11, arg9, (byte) 26, arg16, arg2, arg18, arg7, arg17, arg4, arg6, arg15, arg12, arg5);
        }
        int var22 = arg15;
        long var23 = this.field9031;
        int[] var25 = this.field9036;
        if (arg1 != null && (arg1.field1473 >= 0 || arg1.field1496 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field9036[var26];
            }
            if (arg1.field1473 >= 0) {
                if (arg1.field1473 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class747.method4153(1073741824, arg1.field1473);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg1.field1496 >= 0) {
                if (arg1.field1496 == 65535) {
                    var23 ^= 0xFFFFFFFFL;
                    var25[3] = 0;
                } else {
                    var25[3] = class747.method4153(arg1.field1496, 1073741824);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg1 != null || arg17 != null;
        int var31 = arg11 == null ? 0 : arg11.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class192.field2794[var32] = null;
            if (arg11[var32] != null) {
                class103 var33 = arg7.method1881((byte) -80, arg11[var32].field9715);
                if (var33.field1472 != null) {
                    var30 = true;
                    class199.field2881[var32] = var33;
                    int var34 = arg11[var32].field9711;
                    int var35 = arg11[var32].field9716;
                    int var36 = var33.field1472[var34];
                    class192.field2794[var32] = arg7.method1883(-119, var36 >>> 16);
                    int var37 = var36 & 0xFFFF;
                    class347.field4407[var32] = var37;
                    if (class192.field2794[var32] != null) {
                        var28 |= class192.field2794[var32].method980((byte) -49, var37);
                        var27 |= class192.field2794[var32].method979(var37, 111);
                        var29 |= class192.field2794[var32].method977(var37, 1);
                    }
                    if ((var33.field1480 || class729.field10218) && var35 != -1 && var33.field1472.length > var35) {
                        class672.field9452[var32] = var33.field1493[var34];
                        class691.field9675[var32] = arg11[var32].field9713;
                        int var38 = var33.field1472[var35];
                        class223.field3138[var32] = arg7.method1883(46, var38 >>> 16);
                        int var39 = var38 & 0xFFFF;
                        class452.field6222[var32] = var39;
                        if (class223.field3138[var32] != null) {
                            var28 |= class223.field3138[var32].method980((byte) -49, var39);
                            var27 |= class223.field3138[var32].method979(var39, arg10 ^ 0x60);
                            var29 |= class223.field3138[var32].method977(var39, 1);
                        }
                    } else {
                        class672.field9452[var32] = 0;
                        class691.field9675[var32] = 0;
                        class223.field3138[var32] = null;
                        class452.field6222[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class154 var43 = null;
        class154 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class154 var48 = null;
        class154 var49 = null;
        if (var30) {
            if (arg1 != null) {
                int var50 = arg1.field1472[arg18];
                int var51 = var50 >>> 16;
                var43 = arg7.method1883(arg10 + 46, var51);
                var40 = var50 & 0xFFFF;
                if (var43 != null) {
                    var28 |= var43.method980((byte) -49, var40);
                    var27 |= var43.method979(var40, 107);
                    var29 |= var43.method977(var40, 1);
                }
                if ((arg1.field1480 || class729.field10218) && arg6 != -1 && arg6 < arg1.field1472.length) {
                    var42 = arg1.field1493[arg18];
                    int var52 = arg1.field1472[arg6];
                    int var53 = var52 >>> 16;
                    var44 = var51 == var53 ? var43 : arg7.method1883(-93, var53);
                    var41 = var52 & 0xFFFF;
                    if (var44 != null) {
                        var28 |= var44.method980((byte) -49, var41);
                        var27 |= var44.method979(var41, arg10 ^ 0x6F);
                        var29 |= var44.method977(var41, 1);
                    }
                }
            }
            var22 = arg15 | 0x20;
            if (arg17 != null) {
                int var54 = arg17.field1472[arg16];
                int var55 = var54 >>> 16;
                var48 = arg7.method1883(-119, var55);
                var45 = var54 & 0xFFFF;
                if (var48 != null) {
                    var28 |= var48.method980((byte) -49, var45);
                    var27 |= var48.method979(var45, 118);
                    var29 |= var48.method977(var45, 1);
                }
                if ((arg17.field1480 || class729.field10218) && arg2 != -1 && arg17.field1472.length > arg2) {
                    var47 = arg17.field1493[arg16];
                    int var56 = arg17.field1472[arg2];
                    int var57 = var56 >>> 16;
                    var49 = var55 == var57 ? var48 : arg7.method1883(-100, var57);
                    var46 = var56 & 0xFFFF;
                    if (var49 != null) {
                        var28 |= var49.method980((byte) -49, var46);
                        var27 |= var49.method979(var46, 104);
                        var29 |= var49.method977(var46, arg10 - 4);
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
        class538 var58 = class440.field6036;
        class283 var59;
        synchronized (class440.field6036) {
            var59 = (class283) class440.field6036.method3200(var23, arg10 - 19988);
        }
        class591 var60 = null;
        if (this.field9043 != -1) {
            var60 = arg5.method1644(this.field9043, (byte) 25);
        }
        if (var59 == null || arg12.method2105(var59.method1135(), var22) != 0) {
            if (var59 != null) {
                var22 = arg12.method2101(var22, var59.method1135());
            }
            boolean var62 = false;
            for (int var63 = 0; var63 < 12; var63++) {
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((var64 & Integer.MIN_VALUE) != 0 && !arg8.method825((byte) -103, var64 & 0x3FFFFFFF).method3499(-127)) {
                        var62 = true;
                    }
                } else if (!arg13.method3054(var64 & 0x3FFFFFFF, (byte) -99).method3250((byte) 105, this.field9038)) {
                    var62 = true;
                }
            }
            if (var62) {
                if (this.field9028 != -1L) {
                    class538 var65 = class440.field6036;
                    synchronized (class440.field6036) {
                        var59 = (class283) class440.field6036.method3200(this.field9028, -19983);
                    }
                }
                if (var59 == null || arg12.method2105(var59.method1135(), var22) != 0) {
                    return null;
                }
            } else {
                class64[] var66 = new class64[12];
                for (int var67 = 0; var67 < 12; var67++) {
                    int var68 = var25[var67];
                    if ((var68 & 0x40000000) != 0) {
                        class64 var69 = arg13.method3054(var68 & 0x3FFFFFFF, (byte) -99).method3233(this.field9038, 28887);
                        if (var69 != null) {
                            var66[var67] = var69;
                        }
                    } else if ((Integer.MIN_VALUE & var68) != 0) {
                        class64 var70 = arg8.method825((byte) -103, var68 & 0x3FFFFFFF).method3500(arg10 ^ 0xFFFFFF90);
                        if (var70 != null) {
                            var66[var67] = var70;
                        }
                    }
                }
                if (var60 != null && var60.field8502 != null) {
                    for (int var71 = 0; var71 < var60.field8502.length; var71++) {
                        if (var66[var71] != null) {
                            int var72 = 0;
                            int var73 = 0;
                            int var74 = 0;
                            int var75 = 0;
                            int var76 = 0;
                            int var77 = 0;
                            if (var60.field8502[var71] != null) {
                                var77 = var60.field8502[var71][5] << 3;
                                var74 = var60.field8502[var71][2];
                                var73 = var60.field8502[var71][1];
                                var76 = var60.field8502[var71][4] << 3;
                                var72 = var60.field8502[var71][0];
                                var75 = var60.field8502[var71][3] << 3;
                            }
                            if (var75 != 0 || var76 != 0 || var77 != 0) {
                                var66[var71].method422(-53, var77, var76, var75);
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var66[var71].method425(-125, var72, var74, var73);
                            }
                        }
                    }
                }
                int var78 = var22 | 0x4000;
                class64 var79 = new class64(var66, var66.length);
                var59 = arg12.method2222(var79, var78, class210.field2988, 64, 850);
                for (int var80 = 0; var80 < 5; var80++) {
                    for (int var81 = 0; var81 < class5.field44.length; var81++) {
                        if (class5.field44[var81][var80].length > this.field9041[var80]) {
                            var59.method1134(class672.field9453[var81][var80], class5.field44[var81][var80][this.field9041[var80]]);
                        }
                    }
                }
                if (arg20) {
                    var59.method1118(var22);
                    class538 var82 = class440.field6036;
                    synchronized (class440.field6036) {
                        class440.field6036.method3199((byte) 78, var59, var23);
                    }
                    this.field9028 = var23;
                }
            }
        }
        if (arg10 != 5) {
            return null;
        }
        class283 var83 = var59.method1147((byte) 4, var22, true);
        boolean var84 = false;
        if (arg3 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg3[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class723[] var86 = null;
        if (var60 != null) {
            var86 = var60.method3507(arg10 ^ 0xE2F565AD, arg12);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method1129(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var88 < var31) {
            if (class192.field2794[var88] != null) {
                var83.method1690(class672.field9452[var88], var89, 0, class452.field6222[var88], null, false, 13175, class223.field3138[var88], class192.field2794[var88], class691.field9675[var88] - 1, class347.field4407[var88]);
            }
            var89 <<= 0x1;
            var88++;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg3[var90] != -1) {
                    int var91 = arg3[var90] - arg14;
                    int var92 = var91 & 0x3FFF;
                    class723 var93 = arg12.method2141();
                    var93.method866(var92);
                    var83.method1129(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method1129(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method1693(var41, arg9 - 1, arg4 - 1, var44, var42, (byte) 116, var45, var43, var49, var40, false, var46, var47, arg1.field1469, var48);
        } else if (var43 != null) {
            var83.method1691(var43, arg9 - 1, var40, 0, var41, var44, 65535, false, var42);
        } else if (var48 != null) {
            var83.method1691(var48, arg4 - 1, var45, 0, var46, var49, arg10 ^ 0xFFFA, false, var47);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class192.field2794[var95] = null;
            class223.field3138[var95] = null;
            class199.field2881[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZZ)V")
    public final void method3692(boolean arg0, boolean arg1) {
        if (!arg0) {
            field9044++;
            this.field9038 = arg1;
            this.method3694(118);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljn;IIIIIILbaa;ILec;Lha;I)Lka;")
    public final class283 method3693(class322 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class129 arg7, int arg8, class103 arg9, class545 arg10, int arg11) {
        field9026++;
        int var13 = arg11;
        if (arg9 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg9.field1472[arg6];
            var13 = arg11 | 0x20;
            int var23 = var22 >>> 16;
            class154 var24 = arg0.method1883(102, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method980((byte) -49, var25);
                var14 |= var24.method979(var25, 104);
                var17 |= var24.method977(var25, arg5 ^ 0xFFFFD88E);
                var16 |= arg9.field1489;
            }
            if ((arg9.field1480 || class729.field10218) && arg4 != -1 && arg9.field1472.length > arg4) {
                int var26 = arg9.field1472[arg4];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class154 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg0.method1883(-107, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method980((byte) -49, var28);
                    var14 |= var29.method979(var28, 126);
                    var17 |= var29.method977(var28, arg5 ^ 0xFFFFD88E);
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
        long var30 = (long) arg3 | (long) (arg2 << 16) | (long) arg8 << 32;
        class538 var32 = class111.field1592;
        class283 var33;
        synchronized (class111.field1592) {
            var33 = (class283) class111.field1592.method3200(var30, arg5 ^ 0x697E);
            if (arg5 != -10097) {
                this.field9031 = -127L;
            }
        }
        if (var33 == null || arg10.method2105(var33.method1135(), var13) != 0) {
            if (var33 != null) {
                var13 = arg10.method2101(var13, var33.method1135());
            }
            class64[] var35 = new class64[3];
            int var36 = 0;
            if (!arg7.method825((byte) -103, arg3).method3494((byte) 126) || !arg7.method825((byte) -103, arg2).method3494((byte) 126) || !arg7.method825((byte) -103, arg8).method3494((byte) 126)) {
                return null;
            }
            class64 var37 = arg7.method825((byte) -103, arg3).method3501(-78);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class64 var38 = arg7.method825((byte) -103, arg2).method3501(-47);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class64 var39 = arg7.method825((byte) -103, arg8).method3501(-92);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class64 var40 = new class64(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg10.method2222(var40, var41, class210.field2988, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class5.field44.length; var43++) {
                    if (this.field9041[var42] < class5.field44[var43][var42].length) {
                        var33.method1134(class672.field9453[var43][var42], class5.field44[var43][var42][this.field9041[var42]]);
                    }
                }
            }
            var33.method1118(var13);
            class538 var44 = class111.field1592;
            synchronized (class111.field1592) {
                class111.field1592.method3199((byte) 78, var33, var30);
            }
        }
        if (arg9 == null) {
            return var33;
        } else {
            class283 var45 = var33.method1147((byte) 4, var13, true);
            return arg9.method692(var45, 31798, arg11, arg6, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    private final void method3694(int arg0) {
        field9027++;
        this.field9031 = -1L;
        if (arg0 < 116) {
            return;
        }
        long[] var2 = class696.field9710;
        this.field9031 = var2[(int) ((this.field9031 ^ (long) (this.field9043 >> 8)) & 0xFFL)] ^ this.field9031 >>> 8;
        this.field9031 = var2[(int) (((long) this.field9043 ^ this.field9031) & 0xFFL)] ^ this.field9031 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field9031 = this.field9031 >>> 8 ^ var2[(int) (((long) (this.field9036[var3] >> 24) ^ this.field9031) & 0xFFL)];
            this.field9031 = this.field9031 >>> 8 ^ var2[(int) (((long) (this.field9036[var3] >> 16) ^ this.field9031) & 0xFFL)];
            this.field9031 = var2[(int) ((this.field9031 ^ (long) (this.field9036[var3] >> 8)) & 0xFFL)] ^ this.field9031 >>> 8;
            this.field9031 = this.field9031 >>> 8 ^ var2[(int) (((long) this.field9036[var3] ^ this.field9031) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field9031 = this.field9031 >>> 8 ^ var2[(int) ((this.field9031 ^ (long) this.field9041[var4]) & 0xFFL)];
        }
        this.field9031 = var2[(int) (((long) (this.field9038 ? 1 : 0) ^ this.field9031) & 0xFFL)] ^ this.field9031 >>> 8;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILbaa;II)V")
    public final void method3695(int arg0, class129 arg1, int arg2, int arg3) {
        field9030++;
        int var5 = class528.field7376[arg3];
        if (arg1.method825((byte) -103, arg2) != null) {
            this.field9036[var5] = class747.method4153(arg2, arg0);
            this.method3694(120);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II[I[IIZ)V")
    public final void method3696(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, boolean arg5) {
        this.field9040 = arg4;
        this.field9041 = arg2;
        this.field9036 = arg3;
        this.field9038 = arg5;
        if (this.field9043 != arg1) {
            this.field9043 = arg1;
        }
        field9034++;
        if (arg0 != 528) {
            this.field9036 = null;
        }
        this.method3694(121);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lbaa;Lha;Lmn;ILaca;IBILec;ILjn;Lffa;)Lka;")
    public final class283 method3697(class129 arg0, class545 arg1, class511 arg2, int arg3, class219 arg4, int arg5, byte arg6, int arg7, class103 arg8, int arg9, class322 arg10, class678 arg11) {
        int var13 = 22 / ((arg6 + 18) / 58);
        field9033++;
        if (this.field9040 != -1) {
            return arg11.method3887(this.field9040, false).method58(arg1, arg4, 80, arg7, arg10, arg5, arg3, arg9, arg8);
        }
        int var14 = arg9;
        if (arg8 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            int var22 = arg8.field1472[arg5];
            var14 = arg9 | 0x20;
            Object var23 = null;
            int var24 = var22 >>> 16;
            class154 var25 = arg10.method1883(-128, var24);
            int var26 = var22 & 0xFFFF;
            if (var25 != null) {
                var16 |= var25.method980((byte) -49, var26);
                var15 |= var25.method979(var26, 120);
                var18 |= var25.method977(var26, 1);
                var17 |= arg8.field1489;
            }
            if ((arg8.field1480 || class729.field10218) && arg7 != -1 && arg8.field1472.length > arg7) {
                int var27 = arg8.field1472[arg7];
                int var28 = var27 >>> 16;
                class154 var29 = var24 == var28 ? var25 : arg10.method1883(115, var28);
                int var30 = var27 & 0xFFFF;
                if (var29 != null) {
                    var16 |= var29.method980((byte) -49, var30);
                    var15 |= var29.method979(var30, 107);
                    var18 |= var29.method977(var30, 1);
                }
            }
            if (var16) {
                var14 |= 0x80;
            }
            if (var15) {
                var14 |= 0x100;
            }
            if (var17) {
                var14 |= 0x200;
            }
            if (var18) {
                var14 |= 0x400;
            }
        }
        class538 var31 = class111.field1592;
        class283 var32;
        synchronized (class111.field1592) {
            var32 = (class283) class111.field1592.method3200(this.field9031, -19983);
        }
        if (var32 == null || arg1.method2105(var32.method1135(), var14) != 0) {
            if (var32 != null) {
                var14 = arg1.method2101(var14, var32.method1135());
            }
            boolean var34 = false;
            for (int var35 = 0; var35 < 12; var35++) {
                int var36 = this.field9036[var35];
                if ((var36 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var36) != 0 && !arg0.method825((byte) -103, var36 & 0x3FFFFFFF).method3494((byte) 126)) {
                        var34 = true;
                    }
                } else if (!arg2.method3054(var36 & 0x3FFFFFFF, (byte) -99).method3235((byte) 19, this.field9038)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class64[] var37 = new class64[12];
            int var38 = 0;
            for (int var39 = 0; var39 < 12; var39++) {
                int var40 = this.field9036[var39];
                if ((var40 & 0x40000000) != 0) {
                    class64 var42 = arg2.method3054(var40 & 0x3FFFFFFF, (byte) -99).method3232(15053, this.field9038);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((var40 & Integer.MIN_VALUE) != 0) {
                    class64 var41 = arg0.method825((byte) -103, var40 & 0x3FFFFFFF).method3501(-13);
                    if (var41 != null) {
                        var37[var38++] = var41;
                    }
                }
            }
            int var43 = var14 | 0x4000;
            class64 var44 = new class64(var37, var38);
            var32 = arg1.method2222(var44, var43, class210.field2988, 64, 768);
            for (int var45 = 0; var45 < 5; var45++) {
                for (int var46 = 0; var46 < class5.field44.length; var46++) {
                    if (class5.field44[var46][var45].length > this.field9041[var45]) {
                        var32.method1134(class672.field9453[var46][var45], class5.field44[var46][var45][this.field9041[var45]]);
                    }
                }
            }
            var32.method1118(var14);
            class538 var47 = class111.field1592;
            synchronized (class111.field1592) {
                class111.field1592.method3199((byte) 78, var32, this.field9031);
            }
        }
        if (arg8 == null) {
            return var32;
        } else {
            var32.method1147((byte) 4, var14, true);
            return arg8.method692(var32, 31798, arg9, arg5, arg7, arg3);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Leaa;Z)Z")
    public static final boolean method3698(class380 arg0, boolean arg1) {
        if (!arg1) {
            field9037 = null;
        }
        field9035++;
        return class477.field6507 == arg0 || class286.field3771 == arg0 || class363.field4650 == arg0 || class710.field9914 == arg0;
    }
}
