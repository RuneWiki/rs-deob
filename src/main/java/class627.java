import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class627 {

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public int field8626 = -1;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field8634 = 0;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "[Lcea;")
    public static class215[] field8638 = new class215[2048];

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    private int field8636;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public static int field8639;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "J")
    private long field8627;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "J")
    private long field8635;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "Z")
    public boolean field8633;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "[I")
    private int[] field8625;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "[I")
    public int[] field8628;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ldd;Lhg;[Lqca;ZLub;ILhg;IZI[IILoha;ILha;Lvda;Llfa;IIILuga;)Lka;")
    public final class472 method3579(class703 arg0, class691 arg1, class117[] arg2, boolean arg3, class20 arg4, int arg5, class691 arg6, int arg7, boolean arg8, int arg9, int[] arg10, int arg11, class738 arg12, int arg13, class59 arg14, class183 arg15, class116 arg16, int arg17, int arg18, int arg19, class210 arg20) {
        field8630++;
        if (this.field8626 != -1) {
            return arg15.method1341(this.field8626, -1).method2116(arg5, arg2, arg16, !arg8, arg1, arg19, arg20, arg18, arg6, arg0, arg14, arg9, arg10, arg7, arg17, arg11, arg13);
        }
        int var22 = arg11;
        long var23 = this.field8635;
        int[] var25 = this.field8625;
        if (arg6 != null && (arg6.field9339 >= 0 || arg6.field9351 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field8625[var26];
            }
            if (arg6.field9339 >= 0) {
                if (arg6.field9339 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class418.method2577(arg6.field9339, 1073741824);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg6.field9351 >= 0) {
                if (arg6.field9351 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class418.method2577(arg6.field9351, 1073741824);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg6 != null || arg1 != null;
        int var31 = arg2 == null ? 0 : arg2.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class471.field6602[var32] = null;
            if (arg2[var32] != null) {
                class691 var33 = arg16.method1021(arg2[var32].field1997, 7);
                if (var33.field9327 != null) {
                    var30 = true;
                    class335.field4726[var32] = var33;
                    int var34 = arg2[var32].field1994;
                    int var35 = arg2[var32].field1998;
                    int var36 = var33.field9327[var34];
                    class471.field6602[var32] = arg16.method1025(var36 >>> 16, 3);
                    int var37 = var36 & 0xFFFF;
                    class129.field2174[var32] = var37;
                    if (class471.field6602[var32] != null) {
                        var28 |= class471.field6602[var32].method1292(var37, 0);
                        var27 |= class471.field6602[var32].method1291(var37, 14);
                        var29 |= class471.field6602[var32].method1287((byte) -109, var37);
                    }
                    if ((var33.field9331 || class133.field2243) && var35 != -1 && var33.field9327.length > var35) {
                        class431.field6167[var32] = var33.field9357[var34];
                        class142.field2341[var32] = arg2[var32].field1999;
                        int var38 = var33.field9327[var35];
                        class67.field1260[var32] = arg16.method1025(var38 >>> 16, 3);
                        int var39 = var38 & 0xFFFF;
                        class70.field1289[var32] = var39;
                        if (class67.field1260[var32] != null) {
                            var28 |= class67.field1260[var32].method1292(var39, 0);
                            var27 |= class67.field1260[var32].method1291(var39, 14);
                            var29 |= class67.field1260[var32].method1287((byte) -115, var39);
                        }
                    } else {
                        class431.field6167[var32] = 0;
                        class142.field2341[var32] = 0;
                        class67.field1260[var32] = null;
                        class70.field1289[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class172 var43 = null;
        class172 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class172 var48 = null;
        class172 var49 = null;
        if (var30) {
            if (arg6 != null) {
                int var50 = arg6.field9327[arg18];
                int var51 = var50 >>> 16;
                var43 = arg16.method1025(var51, 3);
                var40 = var50 & 0xFFFF;
                if (var43 != null) {
                    var28 |= var43.method1292(var40, 0);
                    var27 |= var43.method1291(var40, 14);
                    var29 |= var43.method1287((byte) -110, var40);
                }
                if ((arg6.field9331 || class133.field2243) && arg7 != -1 && arg6.field9327.length > arg7) {
                    int var52 = arg6.field9327[arg7];
                    var42 = arg6.field9357[arg18];
                    int var53 = var52 >>> 16;
                    var44 = var51 == var53 ? var43 : arg16.method1025(var53, 3);
                    var41 = var52 & 0xFFFF;
                    if (var44 != null) {
                        var28 |= var44.method1292(var41, 0);
                        var27 |= var44.method1291(var41, 14);
                        var29 |= var44.method1287((byte) -106, var41);
                    }
                }
            }
            var22 = arg11 | 0x20;
            if (arg1 != null) {
                int var54 = arg1.field9327[arg17];
                int var55 = var54 >>> 16;
                var45 = var54 & 0xFFFF;
                var48 = arg16.method1025(var55, 3);
                if (var48 != null) {
                    var28 |= var48.method1292(var45, 0);
                    var27 |= var48.method1291(var45, 14);
                    var29 |= var48.method1287((byte) -123, var45);
                }
                if ((arg1.field9331 || class133.field2243) && arg9 != -1 && arg1.field9327.length > arg9) {
                    int var56 = arg1.field9327[arg9];
                    var47 = arg1.field9357[arg17];
                    int var57 = var56 >>> 16;
                    var46 = var56 & 0xFFFF;
                    var49 = var55 == var57 ? var48 : arg16.method1025(var57, 3);
                    if (var49 != null) {
                        var28 |= var49.method1292(var46, 0);
                        var27 |= var49.method1291(var46, 14);
                        var29 |= var49.method1287((byte) -96, var46);
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
        class112 var58 = class477.field6656;
        class472 var59;
        synchronized (class477.field6656) {
            var59 = (class472) class477.field6656.method992(var23, -47);
        }
        class399 var60 = null;
        if (this.field8636 != -1) {
            var60 = arg20.method1443(this.field8636, 32);
        }
        if (var59 == null || arg14.method343(var59.method527(), var22) != 0) {
            if (var59 != null) {
                var22 = arg14.method219(var22, var59.method527());
            }
            boolean var62 = false;
            for (int var63 = 0; var63 < 12; var63++) {
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var64) != 0 && !arg12.method4056((byte) 33, var64 & 0x3FFFFFFF).method3909((byte) 34)) {
                        var62 = true;
                    }
                } else if (!arg4.method162(94, var64 & 0x3FFFFFFF).method2212(this.field8633, -1)) {
                    var62 = true;
                }
            }
            if (var62) {
                if (this.field8627 != -1L) {
                    class112 var82 = class477.field6656;
                    synchronized (class477.field6656) {
                        var59 = (class472) class477.field6656.method992(this.field8627, -92);
                    }
                }
                if (var59 == null || arg14.method343(var59.method527(), var22) != 0) {
                    return null;
                }
            } else {
                class37[] var65 = new class37[12];
                for (int var66 = 0; var66 < 12; var66++) {
                    int var67 = var25[var66];
                    if ((var67 & 0x40000000) != 0) {
                        class37 var69 = arg4.method162(104, var67 & 0x3FFFFFFF).method2205(this.field8633, !arg8);
                        if (var69 != null) {
                            var65[var66] = var69;
                        }
                    } else if ((Integer.MIN_VALUE & var67) != 0) {
                        class37 var68 = arg12.method4056((byte) 33, var67 & 0x3FFFFFFF).method3902(91);
                        if (var68 != null) {
                            var65[var66] = var68;
                        }
                    }
                }
                if (var60 != null && var60.field5883 != null) {
                    for (int var70 = 0; var70 < var60.field5883.length; var70++) {
                        if (var65[var70] != null) {
                            int var71 = 0;
                            int var72 = 0;
                            int var73 = 0;
                            int var74 = 0;
                            int var75 = 0;
                            int var76 = 0;
                            if (var60.field5883[var70] != null) {
                                var75 = var60.field5883[var70][4] << 3;
                                var72 = var60.field5883[var70][1];
                                var76 = var60.field5883[var70][5] << 3;
                                var71 = var60.field5883[var70][0];
                                var74 = var60.field5883[var70][3] << 3;
                                var73 = var60.field5883[var70][2];
                            }
                            if (var74 != 0 || var75 != 0 || var76 != 0) {
                                var65[var70].method473(6875, var75, var76, var74);
                            }
                            if (var71 != 0 || var72 != 0 || var73 != 0) {
                                var65[var70].method465((byte) -82, var73, var71, var72);
                            }
                        }
                    }
                }
                class37 var77 = new class37(var65, var65.length);
                int var78 = var22 | 0x4000;
                var59 = arg14.method174(var77, var78, class445.field6323, 64, 850);
                for (int var79 = 0; var79 < 5; var79++) {
                    for (int var80 = 0; var80 < class189.field2818.length; var80++) {
                        if (this.field8628[var79] < class189.field2818[var80][var79].length) {
                            var59.method517(class419.field6060[var80][var79], class189.field2818[var80][var79][this.field8628[var79]]);
                        }
                    }
                }
                if (arg3) {
                    var59.method484(var22);
                    class112 var81 = class477.field6656;
                    synchronized (class477.field6656) {
                        class477.field6656.method991(var59, var23, (byte) -98);
                    }
                    this.field8627 = var23;
                }
            }
        }
        class472 var83 = var59.method504((byte) 4, var22, arg8);
        boolean var84 = false;
        if (arg10 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg10[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class661[] var86 = null;
        if (var60 != null) {
            var86 = var60.method2495(arg14, 0);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method519(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var88 < var31) {
            if (class471.field6602[var88] != null) {
                var83.method2778((byte) -55, class142.field2341[var88] - 1, null, var89, class129.field2174[var88], class70.field1289[var88], class67.field1260[var88], 0, class471.field6602[var88], false, class431.field6167[var88]);
            }
            var89 <<= 0x1;
            var88++;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg10[var90] != -1) {
                    int var91 = arg10[var90] - arg5;
                    int var92 = var91 & 0x3FFF;
                    class661 var93 = arg14.method290();
                    var93.method748(var92);
                    var83.method519(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method519(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method2785(var44, var42, (byte) 121, var47, var48, var40, var45, arg13 - 1, var43, false, var41, var49, arg19 - 1, arg6.field9353, var46);
        } else if (var43 != null) {
            var83.method2784(var40, var42, var44, 0, var43, false, false, var41, arg13 - 1);
        } else if (var48 != null) {
            var83.method2784(var45, var47, var49, 0, var48, false, false, var46, arg19 - 1);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class471.field6602[var95] = null;
            class67.field1260[var95] = null;
            class335.field4726[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BIILub;)V")
    public final void method3580(byte arg0, int arg1, int arg2, class20 arg3) {
        if (arg0 != 42) {
            return;
        }
        field8632++;
        if (arg2 == -1) {
            this.field8625[arg1] = 0;
        } else if (arg3.method162(-125, arg2) != null) {
            this.field8625[arg1] = class418.method2577(1073741824, arg2);
            this.method3587(-100);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III[IZ[I)V")
    public final void method3581(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int[] arg5) {
        if (this.field8636 != arg2) {
            this.field8636 = arg2;
        }
        this.field8625 = arg3;
        if (arg1 <= 54) {
            this.field8625 = null;
        }
        this.field8628 = arg5;
        field8623++;
        this.field8626 = arg0;
        this.field8633 = arg4;
        this.method3587(-25);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BZ)V")
    public final void method3582(byte arg0, boolean arg1) {
        field8637++;
        this.field8633 = arg1;
        if (arg0 != -17) {
            this.field8633 = false;
        }
        this.method3587(-78);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lub;ILlfa;Loha;Ldd;Lvda;IIILhg;ILha;)Lka;")
    public final class472 method3583(class20 arg0, int arg1, class116 arg2, class738 arg3, class703 arg4, class183 arg5, int arg6, int arg7, int arg8, class691 arg9, int arg10, class59 arg11) {
        field8640++;
        if (this.field8626 != -1) {
            return arg5.method1341(this.field8626, -1).method2119(arg4, arg11, arg10, arg7, arg9, arg2, arg6, 121, arg8);
        }
        int var13 = arg8;
        if (arg9 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg8 | 0x20;
            Object var21 = null;
            int var22 = arg9.field9327[arg6];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class172 var25 = arg2.method1025(var23, 3);
            if (var25 != null) {
                var15 |= var25.method1292(var24, 0);
                var14 |= var25.method1291(var24, 14);
                var17 |= var25.method1287((byte) -125, var24);
                var16 |= arg9.field9332;
            }
            if ((arg9.field9331 || class133.field2243) && arg7 != -1 && arg7 < arg9.field9327.length) {
                int var26 = arg9.field9327[arg7];
                int var27 = var26 >>> 16;
                class172 var28 = var23 == var27 ? var25 : arg2.method1025(var27, arg1 ^ 0xE80914AB);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method1292(var29, 0);
                    var14 |= var28.method1291(var29, 14);
                    var17 |= var28.method1287((byte) -127, var29);
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
        if (arg1 != -402058072) {
            this.field8627 = -101L;
        }
        class112 var30 = class491.field6800;
        class472 var31;
        synchronized (class491.field6800) {
            var31 = (class472) class491.field6800.method992(this.field8635, arg1 ^ 0xE80914D6);
        }
        if (var31 == null || arg11.method343(var31.method527(), var13) != 0) {
            if (var31 != null) {
                var13 = arg11.method219(var13, var31.method527());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field8625[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg3.method4056((byte) 33, var35 & 0x3FFFFFFF).method3903((byte) 110)) {
                        var33 = true;
                    }
                } else if (!arg0.method162(arg1 ^ 0x17F6EB2C, var35 & 0x3FFFFFFF).method2202((byte) 97, this.field8633)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class37[] var36 = new class37[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field8625[var38];
                if ((var39 & 0x40000000) != 0) {
                    class37 var41 = arg0.method162(-107, var39 & 0x3FFFFFFF).method2201(this.field8633, -14);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class37 var40 = arg3.method4056((byte) 33, var39 & 0x3FFFFFFF).method3904((byte) -73);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class37 var43 = new class37(var36, var37);
            var31 = arg11.method174(var43, var42, class445.field6323, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class189.field2818.length; var45++) {
                    if (class189.field2818[var45][var44].length > this.field8628[var44]) {
                        var31.method517(class419.field6060[var45][var44], class189.field2818[var45][var44][this.field8628[var44]]);
                    }
                }
            }
            var31.method484(var13);
            class112 var46 = class491.field6800;
            synchronized (class491.field6800) {
                class491.field6800.method991(var31, this.field8635, (byte) -97);
            }
        }
        if (arg9 == null) {
            return var31;
        } else {
            var31.method504((byte) 4, var13, true);
            return arg9.method3866(123, var31, arg7, arg10, arg8, arg6);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)V")
    public final void method3584(int arg0, int arg1, int arg2) {
        this.field8628[arg0] = arg2;
        if (arg1 == 0) {
            field8624++;
            this.method3587(-48);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIILlfa;Loha;IIILha;ILhg;)Lka;")
    public final class472 method3585(int arg0, int arg1, int arg2, int arg3, class116 arg4, class738 arg5, int arg6, int arg7, int arg8, class59 arg9, int arg10, class691 arg11) {
        field8639++;
        int var13 = arg1;
        if (arg11 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg1 | 0x20;
            int var22 = arg11.field9327[arg10];
            int var23 = var22 >>> 16;
            class172 var24 = arg4.method1025(var23, 3);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method1292(var25, arg6 ^ 0xFFFFC41D);
                var14 |= var24.method1291(var25, 14);
                var17 |= var24.method1287((byte) -125, var25);
                var16 |= arg11.field9332;
            }
            if ((arg11.field9331 || class133.field2243) && arg0 != -1 && arg0 < arg11.field9327.length) {
                int var26 = arg11.field9327[arg0];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class172 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg4.method1025(var28 >>> 16, 3);
                }
                if (var29 != null) {
                    var15 |= var29.method1292(var28, 0);
                    var14 |= var29.method1291(var28, 14);
                    var17 |= var29.method1287((byte) -123, var28);
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
        long var30 = (long) arg7 | (long) (arg3 << 16) | (long) arg2 << 32;
        class112 var32 = class491.field6800;
        class472 var33;
        synchronized (class491.field6800) {
            var33 = (class472) class491.field6800.method992(var30, arg6 ^ 0xFFFFC42B);
        }
        if (var33 == null || arg9.method343(var33.method527(), var13) != 0) {
            if (var33 != null) {
                var13 = arg9.method219(var13, var33.method527());
            }
            class37[] var35 = new class37[3];
            int var36 = 0;
            if (!arg5.method4056((byte) 33, arg7).method3903((byte) 114) || !arg5.method4056((byte) 33, arg3).method3903((byte) 102) || !arg5.method4056((byte) 33, arg2).method3903((byte) 94)) {
                return null;
            }
            class37 var37 = arg5.method4056((byte) 33, arg7).method3904((byte) -50);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class37 var38 = arg5.method4056((byte) 33, arg3).method3904((byte) -105);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class37 var39 = arg5.method4056((byte) 33, arg2).method3904((byte) -30);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class37 var40 = new class37(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg9.method174(var40, var41, class445.field6323, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class189.field2818.length; var43++) {
                    if (class189.field2818[var43][var42].length > this.field8628[var42]) {
                        var33.method517(class419.field6060[var43][var42], class189.field2818[var43][var42][this.field8628[var42]]);
                    }
                }
            }
            var33.method484(var13);
            class112 var44 = class491.field6800;
            synchronized (class491.field6800) {
                class491.field6800.method991(var33, var30, (byte) -109);
            }
        }
        if (arg11 == null) {
            return var33;
        } else if (arg6 == -15331) {
            class472 var45 = var33.method504((byte) 4, var13, true);
            return arg11.method3866(-32, var45, arg0, arg8, arg1, arg10);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Loha;III)V")
    public final void method3586(class738 arg0, int arg1, int arg2, int arg3) {
        field8631++;
        int var5 = class361.field5195[arg3];
        if (arg0.method4056((byte) 33, arg1) == null) {
            return;
        }
        if (arg2 != -1) {
            this.field8627 = -53L;
        }
        this.field8625[var5] = class418.method2577(arg1, Integer.MIN_VALUE);
        this.method3587(-54);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    private final void method3587(int arg0) {
        field8629++;
        this.field8635 = -1L;
        long[] var2 = class438.field6253;
        this.field8635 = var2[(int) (((long) (this.field8636 >> 8) ^ this.field8635) & 0xFFL)] ^ this.field8635 >>> 8;
        if (arg0 > -6) {
            this.field8627 = 43L;
        }
        this.field8635 = this.field8635 >>> 8 ^ var2[(int) (((long) this.field8636 ^ this.field8635) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field8635 = this.field8635 >>> 8 ^ var2[(int) (((long) (this.field8625[var3] >> 24) ^ this.field8635) & 0xFFL)];
            this.field8635 = var2[(int) (((long) (this.field8625[var3] >> 16) ^ this.field8635) & 0xFFL)] ^ this.field8635 >>> 8;
            this.field8635 = this.field8635 >>> 8 ^ var2[(int) ((this.field8635 ^ (long) (this.field8625[var3] >> 8)) & 0xFFL)];
            this.field8635 = var2[(int) ((this.field8635 ^ (long) this.field8625[var3]) & 0xFFL)] ^ this.field8635 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field8635 = var2[(int) ((this.field8635 ^ (long) this.field8628[var4]) & 0xFFL)] ^ this.field8635 >>> 8;
        }
        this.field8635 = this.field8635 >>> 8 ^ var2[(int) ((this.field8635 ^ (long) (this.field8633 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
    public static void method3588(byte arg0) {
        if (arg0 != 7) {
            field8634 = -42;
        }
        field8638 = null;
    }
}
