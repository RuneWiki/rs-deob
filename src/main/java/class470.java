import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class470 {

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public int field6310 = -1;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field6295 = 0;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Len;")
    public static class322 field6301 = new class322();

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "[I")
    public static int[] field6311 = new int[8];

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    private int field6309;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "J")
    private long field6298;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "J")
    private long field6300;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Z")
    public boolean field6299;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[I")
    public int[] field6297;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "[I")
    private int[] field6304;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "[I")
    public static int[] field6312;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z[I[IIII)V")
    public final void method2671(boolean arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5) {
        this.field6299 = arg0;
        field6305++;
        this.field6310 = arg5;
        this.field6304 = arg2;
        if (this.field6309 != arg3) {
            this.field6309 = arg3;
        }
        if (arg4 != 0) {
            this.method2674(43, 113, (byte) -88);
        }
        this.field6297 = arg1;
        this.method2679(false);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILjf;Z)V")
    public final void method2672(int arg0, int arg1, class218 arg2, boolean arg3) {
        field6313++;
        int var5 = class104.field1432[arg1];
        if (arg2.method1420(arg0, -5216) != null) {
            this.field6304[var5] = class683.method3840(arg0, Integer.MIN_VALUE);
            this.method2679(arg3);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILoba;B)V")
    public final void method2673(int arg0, int arg1, class264 arg2, byte arg3) {
        if (arg3 > -44) {
            return;
        }
        field6302++;
        if (arg1 == -1) {
            this.field6304[arg0] = 0;
        } else if (arg2.method1583(116, arg1) != null) {
            this.field6304[arg0] = class683.method3840(1073741824, arg1);
            this.method2679(false);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIB)V")
    public final void method2674(int arg0, int arg1, byte arg2) {
        if (arg2 != -93) {
            this.field6299 = true;
        }
        this.field6297[arg1] = arg0;
        field6294++;
        this.method2679(false);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V")
    public final void method2675(boolean arg0, int arg1) {
        this.field6299 = arg0;
        field6296++;
        this.method2679(false);
        if (arg1 != 12) {
            this.method2677(null, -96, -90, 124, null, -75, null, null, -24, null, null, -104, -70, null, null, 76, null, null, null, 68, true);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljf;ILvha;Lha;Leia;IILoba;ILmk;BLru;)Lka;")
    public final class474 method2676(class218 arg0, int arg1, class687 arg2, class60 arg3, class245 arg4, int arg5, int arg6, class264 arg7, int arg8, class56 arg9, byte arg10, class195 arg11) {
        field6308++;
        if (this.field6310 != -1) {
            return arg2.method3859(this.field6310, (byte) -68).method975(arg4, arg9, arg8, arg3, arg6, arg5, arg11, null, arg1, (byte) 54);
        }
        int var13 = arg8;
        if (arg10 != -54) {
            return null;
        }
        if (arg9 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg9.field771[arg1];
            var13 = arg8 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class701 var25 = arg11.method1298(var23, -70);
            if (var25 != null) {
                var15 |= var25.method3947(var24, (byte) 106);
                var14 |= var25.method3943(var24, (byte) -125);
                var17 |= var25.method3942(var24, (byte) 127);
                var16 |= arg9.field792;
            }
            if ((arg9.field777 || class130.field1838) && arg6 != -1 && arg9.field771.length > arg6) {
                int var26 = arg9.field771[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class701 var29 = var23 == var27 ? var25 : arg11.method1298(var27, -123);
                if (var29 != null) {
                    var15 |= var29.method3947(var28, (byte) 117);
                    var14 |= var29.method3943(var28, (byte) 27);
                    var17 |= var29.method3942(var28, (byte) 124);
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
        class534 var30 = class344.field4348;
        class474 var31;
        synchronized (class344.field4348) {
            var31 = (class474) class344.field4348.method3079(this.field6300, 0);
        }
        if (var31 == null || arg3.method542(var31.method272(), var13) != 0) {
            if (var31 != null) {
                var13 = arg3.method484(var13, var31.method272());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field6304[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg0.method1420(var35 & 0x3FFFFFFF, -5216).method1200(-1)) {
                        var33 = true;
                    }
                } else if (!arg7.method1583(arg10 + 180, var35 & 0x3FFFFFFF).method3582(this.field6299, arg10 ^ 0xFFFFFFC0)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class714[] var36 = new class714[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field6304[var38];
                if ((var39 & 0x40000000) != 0) {
                    class714 var41 = arg7.method1583(-120, var39 & 0x3FFFFFFF).method3591(this.field6299, (byte) 126);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class714 var40 = arg0.method1420(var39 & 0x3FFFFFFF, -5216).method1201(14514);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class714 var43 = new class714(var36, var37);
            var31 = arg3.method540(var43, var42, class583.field8161, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class453.field5994.length; var45++) {
                    if (class453.field5994[var45][var44].length > this.field6297[var44]) {
                        var31.method251(class404.field5109[var45][var44], class453.field5994[var45][var44][this.field6297[var44]]);
                    }
                }
            }
            var31.method266(var13);
            class534 var46 = class344.field4348;
            synchronized (class344.field4348) {
                class344.field4348.method3077((byte) 94, this.field6300, var31);
            }
        }
        if (arg9 == null) {
            return var31;
        } else {
            var31.method273((byte) 4, var13, true);
            return arg9.method412(arg6, arg8, arg1, (byte) -72, arg5, var31);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljf;IIILmk;I[Lhj;Lvha;ILhga;Lmk;IILru;[IILoba;Leia;Lha;IZ)Lka;")
    public final class474 method2677(class218 arg0, int arg1, int arg2, int arg3, class56 arg4, int arg5, class571[] arg6, class687 arg7, int arg8, class176 arg9, class56 arg10, int arg11, int arg12, class195 arg13, int[] arg14, int arg15, class264 arg16, class245 arg17, class60 arg18, int arg19, boolean arg20) {
        field6307++;
        if (this.field6310 != -1) {
            return arg7.method3859(this.field6310, (byte) 112).method976(null, (byte) -108, arg15, arg10, arg2, arg9, arg1, arg17, arg13, arg8, arg19, arg6, arg4, arg3, arg12, arg18, arg5, arg14);
        }
        int var22 = arg1;
        long var23 = this.field6300;
        int[] var25 = this.field6304;
        if (arg4 != null && (arg4.field784 >= 0 || arg4.field796 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field6304[var26];
            }
            if (arg4.field784 >= 0) {
                if (arg4.field784 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class683.method3840(1073741824, arg4.field784);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg4.field796 >= 0) {
                if (arg4.field796 == 65535) {
                    var23 ^= 0xFFFFFFFFL;
                    var25[3] = 0;
                } else {
                    var25[3] = class683.method3840(arg4.field796, 1073741824);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg4 != null || arg10 != null;
        int var31 = arg6 == null ? 0 : arg6.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class730.field10165[var32] = null;
            if (arg6[var32] != null) {
                class56 var33 = arg13.method1299((byte) -97, arg6[var32].field8035);
                if (var33.field771 != null) {
                    class101.field1393[var32] = var33;
                    var30 = true;
                    int var34 = arg6[var32].field8041;
                    int var35 = arg6[var32].field8034;
                    int var36 = var33.field771[var34];
                    class730.field10165[var32] = arg13.method1298(var36 >>> 16, -114);
                    int var37 = var36 & 0xFFFF;
                    class431.field5755[var32] = var37;
                    if (class730.field10165[var32] != null) {
                        var28 |= class730.field10165[var32].method3947(var37, (byte) 114);
                        var27 |= class730.field10165[var32].method3943(var37, (byte) -104);
                        var29 |= class730.field10165[var32].method3942(var37, (byte) -97);
                    }
                    if ((var33.field777 || class130.field1838) && var35 != -1 && var35 < var33.field771.length) {
                        class454.field6072[var32] = var33.field773[var34];
                        class589.field8259[var32] = arg6[var32].field8036;
                        int var38 = var33.field771[var35];
                        class695.field9674[var32] = arg13.method1298(var38 >>> 16, -80);
                        int var39 = var38 & 0xFFFF;
                        class97.field1358[var32] = var39;
                        if (class695.field9674[var32] != null) {
                            var28 |= class695.field9674[var32].method3947(var39, (byte) 85);
                            var27 |= class695.field9674[var32].method3943(var39, (byte) -122);
                            var29 |= class695.field9674[var32].method3942(var39, (byte) 123);
                        }
                    } else {
                        class454.field6072[var32] = 0;
                        class589.field8259[var32] = 0;
                        class695.field9674[var32] = null;
                        class97.field1358[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class701 var43 = null;
        class701 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class701 var48 = null;
        class701 var49 = null;
        if (var30) {
            if (arg4 != null) {
                int var50 = arg4.field771[arg5];
                int var51 = var50 >>> 16;
                var40 = var50 & 0xFFFF;
                var43 = arg13.method1298(var51, 117);
                if (var43 != null) {
                    var28 |= var43.method3947(var40, (byte) 87);
                    var27 |= var43.method3943(var40, (byte) -108);
                    var29 |= var43.method3942(var40, (byte) -83);
                }
                if ((arg4.field777 || class130.field1838) && arg3 != -1 && arg4.field771.length > arg3) {
                    var42 = arg4.field773[arg5];
                    int var52 = arg4.field771[arg3];
                    int var53 = var52 >>> 16;
                    var44 = var51 == var53 ? var43 : arg13.method1298(var53, 80);
                    var41 = var52 & 0xFFFF;
                    if (var44 != null) {
                        var28 |= var44.method3947(var41, (byte) 92);
                        var27 |= var44.method3943(var41, (byte) 24);
                        var29 |= var44.method3942(var41, (byte) 124);
                    }
                }
            }
            var22 = arg1 | 0x20;
            if (arg10 != null) {
                int var54 = arg10.field771[arg8];
                int var55 = var54 >>> 16;
                var48 = arg13.method1298(var55, arg11 - 83);
                var45 = var54 & 0xFFFF;
                if (var48 != null) {
                    var28 |= var48.method3947(var45, (byte) 100);
                    var27 |= var48.method3943(var45, (byte) -13);
                    var29 |= var48.method3942(var45, (byte) 123);
                }
                if ((arg10.field777 || class130.field1838) && arg12 != -1 && arg12 < arg10.field771.length) {
                    int var56 = arg10.field771[arg12];
                    var47 = arg10.field773[arg8];
                    int var57 = var56 >>> 16;
                    var46 = var56 & 0xFFFF;
                    var49 = var55 == var57 ? var48 : arg13.method1298(var57, arg11 ^ 0x68);
                    if (var49 != null) {
                        var28 |= var49.method3947(var46, (byte) 118);
                        var27 |= var49.method3943(var46, (byte) 67);
                        var29 |= var49.method3942(var46, (byte) -54);
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
        class534 var58 = class28.field500;
        class474 var59;
        synchronized (class28.field500) {
            var59 = (class474) class28.field500.method3079(var23, 0);
        }
        class738 var60 = null;
        if (this.field6309 != -1) {
            var60 = arg9.method1210(32, this.field6309);
        }
        if (var59 == null || arg18.method542(var59.method272(), var22) != 0) {
            if (var59 != null) {
                var22 = arg18.method484(var22, var59.method272());
            }
            boolean var62 = false;
            for (int var63 = 0; var63 < 12; var63++) {
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((var64 & Integer.MIN_VALUE) != 0 && !arg0.method1420(var64 & 0x3FFFFFFF, -5216).method1203(0)) {
                        var62 = true;
                    }
                } else if (!arg16.method1583(arg11 ^ 0xFFFFFFD9, var64 & 0x3FFFFFFF).method3597((byte) 124, this.field6299)) {
                    var62 = true;
                }
            }
            if (var62) {
                if (this.field6298 != -1L) {
                    class534 var65 = class28.field500;
                    synchronized (class28.field500) {
                        var59 = (class474) class28.field500.method3079(this.field6298, arg11 - 12);
                    }
                }
                if (var59 == null || arg18.method542(var59.method272(), var22) != 0) {
                    return null;
                }
            } else {
                class714[] var66 = new class714[12];
                for (int var67 = 0; var67 < 12; var67++) {
                    int var68 = var25[var67];
                    if ((var68 & 0x40000000) != 0) {
                        class714 var69 = arg16.method1583(-22, var68 & 0x3FFFFFFF).method3587(-5522, this.field6299);
                        if (var69 != null) {
                            var66[var67] = var69;
                        }
                    } else if ((var68 & Integer.MIN_VALUE) != 0) {
                        class714 var70 = arg0.method1420(var68 & 0x3FFFFFFF, -5216).method1199(107);
                        if (var70 != null) {
                            var66[var67] = var70;
                        }
                    }
                }
                if (var60 != null && var60.field10290 != null) {
                    for (int var71 = 0; var71 < var60.field10290.length; var71++) {
                        if (var66[var71] != null) {
                            int var72 = 0;
                            int var73 = 0;
                            int var74 = 0;
                            int var75 = 0;
                            int var76 = 0;
                            int var77 = 0;
                            if (var60.field10290[var71] != null) {
                                var76 = var60.field10290[var71][4] << 3;
                                var75 = var60.field10290[var71][3] << 3;
                                var77 = var60.field10290[var71][5] << 3;
                                var74 = var60.field10290[var71][2];
                                var73 = var60.field10290[var71][1];
                                var72 = var60.field10290[var71][0];
                            }
                            if (var75 != 0 || var76 != 0 || var77 != 0) {
                                var66[var71].method3985(51217582, var76, var77, var75);
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var66[var71].method3986(0, var74, var73, var72);
                            }
                        }
                    }
                }
                class714 var78 = new class714(var66, var66.length);
                int var79 = var22 | 0x4000;
                var59 = arg18.method540(var78, var79, class583.field8161, 64, 850);
                for (int var80 = 0; var80 < 5; var80++) {
                    for (int var81 = 0; var81 < class453.field5994.length; var81++) {
                        if (class453.field5994[var81][var80].length > this.field6297[var80]) {
                            var59.method251(class404.field5109[var81][var80], class453.field5994[var81][var80][this.field6297[var80]]);
                        }
                    }
                }
                if (arg20) {
                    var59.method266(var22);
                    class534 var82 = class28.field500;
                    synchronized (class28.field500) {
                        class28.field500.method3077((byte) 117, var23, var59);
                    }
                    this.field6298 = var23;
                }
            }
        }
        class474 var83 = var59.method273((byte) 4, var22, true);
        boolean var84 = false;
        if (arg14 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg14[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class631[] var86 = null;
        if (var60 != null) {
            var86 = var60.method4109(arg18, arg11 ^ 0x72B6);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method254(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var88 < var31) {
            if (class730.field10165[var88] != null) {
                var83.method2713(false, class97.field1358[var88], class431.field5755[var88], 0, null, var89, class454.field6072[var88], false, class730.field10165[var88], class589.field8259[var88] - 1, class695.field9674[var88]);
            }
            var88++;
            var89 <<= 0x1;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg14[var90] != -1) {
                    int var91 = arg14[var90] - arg15;
                    int var92 = var91 & 0x3FFF;
                    class631 var93 = arg18.method502();
                    var93.method598(var92);
                    var83.method254(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method254(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method2711(var49, var48, arg19 - 1, var43, arg2 - 1, var41, false, var46, arg4.field795, var45, var44, var40, 0, var47, var42);
        } else if (var43 != null) {
            var83.method2707(false, var44, 0, var40, var43, var41, arg11 + 92, var42, arg19 - 1);
        } else if (var48 != null) {
            var83.method2707(false, var49, 0, var45, var48, var46, arg11 ^ 0x6E, var47, arg2 - 1);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class730.field10165[var95] = null;
            class695.field9674[var95] = null;
            class101.field1393[var95] = null;
        }
        if (arg11 != 12) {
            this.method2676(null, 30, null, null, null, 16, -97, null, 102, null, (byte) -39, null);
        }
        return var83;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method2678(int arg0) {
        field6301 = null;
        field6312 = null;
        field6311 = null;
        if (arg0 != -2645) {
            method2678(-74);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    private final void method2679(boolean arg0) {
        if (arg0) {
            this.method2679(true);
        }
        field6306++;
        long[] var2 = class18.field329;
        this.field6300 = -1L;
        this.field6300 = var2[(int) (((long) (this.field6309 >> 8) ^ this.field6300) & 0xFFL)] ^ this.field6300 >>> 8;
        this.field6300 = this.field6300 >>> 8 ^ var2[(int) (((long) this.field6309 ^ this.field6300) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field6300 = var2[(int) ((this.field6300 ^ (long) (this.field6304[var3] >> 24)) & 0xFFL)] ^ this.field6300 >>> 8;
            this.field6300 = var2[(int) (((long) (this.field6304[var3] >> 16) ^ this.field6300) & 0xFFL)] ^ this.field6300 >>> 8;
            this.field6300 = var2[(int) (((long) (this.field6304[var3] >> 8) ^ this.field6300) & 0xFFL)] ^ this.field6300 >>> 8;
            this.field6300 = var2[(int) (((long) this.field6304[var3] ^ this.field6300) & 0xFFL)] ^ this.field6300 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field6300 = this.field6300 >>> 8 ^ var2[(int) (((long) this.field6297[var4] ^ this.field6300) & 0xFFL)];
        }
        this.field6300 = var2[(int) ((this.field6300 ^ (long) (this.field6299 ? 1 : 0)) & 0xFFL)] ^ this.field6300 >>> 8;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lha;IILru;Ljf;BLmk;IIIII)Lka;")
    public final class474 method2680(class60 arg0, int arg1, int arg2, class195 arg3, class218 arg4, byte arg5, class56 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg5 >= -110) {
            return null;
        }
        field6303++;
        int var13 = arg1;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg6.field771[arg9];
            Object var22 = null;
            var13 = arg1 | 0x20;
            int var23 = var21 >>> 16;
            class701 var24 = arg3.method1298(var23, 121);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3947(var25, (byte) 120);
                var14 |= var24.method3943(var25, (byte) 28);
                var17 |= var24.method3942(var25, (byte) 126);
                var16 |= arg6.field792;
            }
            if ((arg6.field777 || class130.field1838) && arg2 != -1 && arg2 < arg6.field771.length) {
                int var26 = arg6.field771[arg2];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class701 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg3.method1298(var28 >>> 16, -75);
                }
                if (var29 != null) {
                    var15 |= var29.method3947(var28, (byte) 92);
                    var14 |= var29.method3943(var28, (byte) 60);
                    var17 |= var29.method3942(var28, (byte) 126);
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
        long var30 = (long) (arg11 << 16) | (long) arg8 << 32 | (long) arg10;
        class534 var32 = class344.field4348;
        class474 var33;
        synchronized (class344.field4348) {
            var33 = (class474) class344.field4348.method3079(var30, 0);
        }
        if (var33 == null || arg0.method542(var33.method272(), var13) != 0) {
            if (var33 != null) {
                var13 = arg0.method484(var13, var33.method272());
            }
            class714[] var35 = new class714[3];
            int var36 = 0;
            if (!arg4.method1420(arg10, -5216).method1200(-1) || !arg4.method1420(arg11, -5216).method1200(-1) || !arg4.method1420(arg8, -5216).method1200(-1)) {
                return null;
            }
            class714 var37 = arg4.method1420(arg10, -5216).method1201(14514);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class714 var38 = arg4.method1420(arg11, -5216).method1201(14514);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class714 var39 = arg4.method1420(arg8, -5216).method1201(14514);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class714 var41 = new class714(var35, var36);
            var33 = arg0.method540(var41, var40, class583.field8161, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class453.field5994.length; var43++) {
                    if (this.field6297[var42] < class453.field5994[var43][var42].length) {
                        var33.method251(class404.field5109[var43][var42], class453.field5994[var43][var42][this.field6297[var42]]);
                    }
                }
            }
            var33.method266(var13);
            class534 var44 = class344.field4348;
            synchronized (class344.field4348) {
                class344.field4348.method3077((byte) -91, var30, var33);
            }
        }
        if (arg6 == null) {
            return var33;
        } else {
            class474 var45 = var33.method273((byte) 4, var13, true);
            return arg6.method412(arg2, arg1, arg9, (byte) -63, arg7, var45);
        }
    }
}
