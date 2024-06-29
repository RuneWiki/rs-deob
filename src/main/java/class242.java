import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class242 extends class452 {

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public int field3925 = 99;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "Lbi;")
    public static class104 field3923 = new class104(1, 6);

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "Lbi;")
    public static class104 field3930 = new class104(24, 2);

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field3931 = 0;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "Lof;")
    public static class328 field3933 = new class328(64);

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field3934;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field3935;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lsj;IIIIIBIIILza;)V")
    public final void method1682(class284 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, class497 arg10) {
        ++field3934;
        if (class141.field1911.method1635(class452.field7013, -1) || class402.method2585((byte) 107, arg7, class254.field4119, arg4, arg2)) {
            if (~this.field3925 < ~arg3) {
                this.field3925 = arg3;
            }
            class156 var12 = class454.field7029.method3002(-1, arg8);
            if (!arg10.method1233() || !class141.field1911.field6099 || !var12.field2099) {
                int var13;
                int var14;
                if (arg9 != 1 && arg9 != 3) {
                    var13 = var12.field2139;
                    var14 = var12.field2123;
                } else {
                    var13 = var12.field2123;
                    var14 = var12.field2139;
                }
                int var15;
                int var16;
                if (~super.field7000 > ~(arg2 + var13)) {
                    var15 = arg2 + 1;
                    var16 = arg2;
                } else {
                    var16 = (var13 >> 1) + arg2;
                    var15 = (var13 - -1 >> 1) + arg2;
                }
                int var17;
                int var18;
                if (~(arg4 + var14) >= ~super.field7004) {
                    var17 = (var14 + 1 >> 1) + arg4;
                    var18 = (var14 >> 1) + arg4;
                } else {
                    var18 = arg4;
                    var17 = arg4 + 1;
                }
                if (arg6 == -57) {
                    class223 var19 = class53.field732[arg7];
                    int var20 = var19.method688(var16, var18) - (-var19.method688(var15, var18) - var19.method688(var16, var17)) + var19.method688(var15, var17) >> 2;
                    int var21 = (arg2 << 7) + (var13 << 6);
                    int var22 = (arg4 << 7) + (var14 << 6);
                    boolean var23 = class171.field2494 && !super.field6992 && var12.field2089;
                    if (var12.method948(-1)) {
                        class31.method198(arg3, var12, arg9, arg4, arg2, (class378) null, 1, (class350) null);
                    }
                    boolean var24 = ~arg5 == 0 && var12.field2071 == -1 && var12.field2075 == null && var12.field2134 == null && !var12.field2100;
                    if (!class471.field7211 || (!class167.method1056(arg1, (byte) -92) || ~var12.field2103 == -2) && (!class299.method2013(arg1, 116) || ~var12.field2103 != -1)) {
                        if (~arg1 == -23) {
                            if (class141.field1911.field6108 || var12.field2079 != 0 || var12.field2125 == 1 || var12.field2143) {
                                class12 var26;
                                if (var24) {
                                    class252 var25 = new class252(arg10, var12, arg7, var21, var20, var22, super.field6992, arg9, var23);
                                    if (var25.method103(arg6 ^ 90)) {
                                        var25.method97(-6682, arg10);
                                    }
                                    var26 = var25;
                                } else {
                                    var26 = new class471(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg9, arg5);
                                }
                                class12 var27 = class76.method548(arg3, arg2, arg4);
                                if (var27 instanceof class406) {
                                    ((class406) var27).field6130 = var26;
                                } else {
                                    class214.method1585(arg3, arg2, arg4, var26);
                                }
                                if (~var12.field2125 == -2 && arg0 != null) {
                                    arg0.method1909(arg2, arg4, -1);
                                }
                            }
                        } else if (~arg1 != -11 && arg1 != 11) {
                            if (arg1 >= 12 && ~arg1 >= -18 || ~arg1 <= -19 && arg1 <= 21) {
                                class423 var28;
                                if (!var24) {
                                    var28 = new class217(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg2, arg2 - (-var13 - -1), arg4, arg4 - -var14 - 1, arg1, arg9, arg5);
                                } else {
                                    class376 var29 = new class376(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg2, arg2 - -var13 + -1, arg4, var14 + -1 + arg4, arg1, arg9, var23);
                                    var28 = var29;
                                    if (var29.method103(arg6 + -46)) {
                                        var29.method97(-6682, arg10);
                                    }
                                }
                                class423 var30 = class49.method352(arg3, arg2, arg4, field3935 != null ? field3935 : (field3935 = method1691("jq")));
                                if (var30 instanceof class232 && var30.field6423 == arg2 && var30.field6424 == arg4) {
                                    ((class232) var30).field3830 = var28;
                                } else {
                                    class186.method1160(var28, false);
                                }
                                if (class171.field2494 && !super.field6992 && ~arg1 <= -13 && ~arg1 >= -18 && arg1 != 13 && arg3 > 0 && ~var12.field2103 != -1) {
                                    super.field6989[arg3][arg2][arg4] = (byte) class410.method2621(super.field6989[arg3][arg2][arg4], 4);
                                }
                                if (~var12.field2125 != -1 && arg0 != null) {
                                    arg0.method1917(var13, 0, var12.field2137, arg2, var14, !var12.field2067, arg4);
                                }
                            } else if (arg1 == 0) {
                                int var31 = var12.field2103;
                                if (class471.field7200 && var12.field2103 == -1) {
                                    var31 = 1;
                                }
                                class477 var33;
                                if (var24) {
                                    class153 var32 = new class153(arg10, var12, arg7, var21, var20, var22, super.field6992, arg1, arg9, var23);
                                    if (var32.method103(-114)) {
                                        var32.method97(-6682, arg10);
                                    }
                                    var33 = var32;
                                } else {
                                    var33 = new class542(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg1, arg9, arg5);
                                }
                                class477 var34 = class409.method2611(arg3, arg2, arg4);
                                if (var34 instanceof class516) {
                                    ((class516) var34).field7662 = var33;
                                } else {
                                    class113.method730(arg3, arg2, arg4, var33, (class477) null);
                                }
                                if (class171.field2494) {
                                    if (~arg9 == -1) {
                                        if (var12.field2077) {
                                            var19.method684(arg2, arg4, 50);
                                            var19.method684(arg2, arg4 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field6992) {
                                            super.field6989[arg3][arg2][arg4] = (byte) class410.method2621(super.field6989[arg3][arg2][arg4], 1);
                                        }
                                    } else if (arg9 == 1) {
                                        if (var12.field2077) {
                                            var19.method684(arg2, arg4 - -1, 50);
                                            var19.method684(arg2 + 1, arg4 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field6992) {
                                            super.field6989[arg3][arg2][arg4 + 1] = (byte) class410.method2621(super.field6989[arg3][arg2][arg4 + 1], 2);
                                        }
                                    } else if (arg9 == 2) {
                                        if (var12.field2077) {
                                            var19.method684(arg2 + 1, arg4, 50);
                                            var19.method684(arg2 + 1, arg4 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field6992) {
                                            super.field6989[arg3][arg2 - -1][arg4] = (byte) class410.method2621(super.field6989[arg3][arg2 - -1][arg4], 1);
                                        }
                                    } else if (arg9 == 3) {
                                        if (var12.field2077) {
                                            var19.method684(arg2, arg4, 50);
                                            var19.method684(arg2 + 1, arg4, 50);
                                        }
                                        if (~var31 == -2 && !super.field6992) {
                                            super.field6989[arg3][arg2][arg4] = (byte) class410.method2621(super.field6989[arg3][arg2][arg4], 2);
                                        }
                                    }
                                }
                                if (~var12.field2125 != -1 && arg0 != null) {
                                    arg0.method1920(arg1, (byte) 73, arg2, !var12.field2067, arg4, var12.field2137, arg9);
                                }
                                if (var12.field2111 != 16) {
                                    class136.method832(arg3, arg2, arg4, var12.field2111);
                                }
                            } else if (arg1 == 1) {
                                class477 var35;
                                if (!var24) {
                                    var35 = new class542(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg1, arg9, arg5);
                                } else {
                                    class153 var36 = new class153(arg10, var12, arg7, var21, var20, var22, super.field6992, arg1, arg9, var23);
                                    if (var36.method103(-104)) {
                                        var36.method97(-6682, arg10);
                                    }
                                    var35 = var36;
                                }
                                class477 var37 = class409.method2611(arg3, arg2, arg4);
                                if (var37 instanceof class516) {
                                    ((class516) var37).field7662 = var35;
                                } else {
                                    class113.method730(arg3, arg2, arg4, var35, (class477) null);
                                }
                                if (var12.field2077 && class171.field2494) {
                                    if (~arg9 != -1) {
                                        if (arg9 == 1) {
                                            var19.method684(arg2 + 1, arg4 + 1, 50);
                                        } else if (arg9 != 2) {
                                            if (~arg9 == -4) {
                                                var19.method684(arg2, arg4, 50);
                                            }
                                        } else {
                                            var19.method684(arg2 - -1, arg4, 50);
                                        }
                                    } else {
                                        var19.method684(arg2, arg4 + 1, 50);
                                    }
                                }
                                if (~var12.field2125 != -1 && arg0 != null) {
                                    arg0.method1920(arg1, (byte) 73, arg2, !var12.field2067, arg4, var12.field2137, arg9);
                                }
                            } else if (arg1 == 2) {
                                int var38 = 3 & arg9 + 1;
                                class477 var39;
                                class477 var40;
                                if (!var24) {
                                    var39 = new class542(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg1, arg9 + 4, arg5);
                                    var40 = new class542(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg1, var38, arg5);
                                } else {
                                    class153 var41 = new class153(arg10, var12, arg7, var21, var20, var22, super.field6992, arg1, arg9 - -4, var23);
                                    class153 var42 = new class153(arg10, var12, arg7, var21, var20, var22, super.field6992, arg1, var38, var23);
                                    if (var41.method103(-110)) {
                                        var41.method97(-6682, arg10);
                                    }
                                    var39 = var41;
                                    if (var42.method103(-127)) {
                                        var42.method97(-6682, arg10);
                                    }
                                    var40 = var42;
                                }
                                class113.method730(arg3, arg2, arg4, var39, var40);
                                if (~var12.field2103 == -2 && class171.field2494 && !super.field6992) {
                                    if (arg9 == 0) {
                                        super.field6989[arg3][arg2][arg4] = (byte) class410.method2621(super.field6989[arg3][arg2][arg4], 1);
                                        super.field6989[arg3][arg2][arg4 + 1] = (byte) class410.method2621(super.field6989[arg3][arg2][arg4 + 1], 2);
                                    } else if (~arg9 == -2) {
                                        super.field6989[arg3][arg2][arg4 + 1] = (byte) class410.method2621(super.field6989[arg3][arg2][arg4 + 1], 2);
                                        super.field6989[arg3][arg2 + 1][arg4] = (byte) class410.method2621(super.field6989[arg3][arg2 + 1][arg4], 1);
                                    } else if (arg9 == 2) {
                                        super.field6989[arg3][arg2 + 1][arg4] = (byte) class410.method2621(super.field6989[arg3][arg2 + 1][arg4], 1);
                                        super.field6989[arg3][arg2][arg4] = (byte) class410.method2621(super.field6989[arg3][arg2][arg4], 2);
                                    } else if (~arg9 == -4) {
                                        super.field6989[arg3][arg2][arg4] = (byte) class410.method2621(super.field6989[arg3][arg2][arg4], 2);
                                        super.field6989[arg3][arg2][arg4] = (byte) class410.method2621(super.field6989[arg3][arg2][arg4], 1);
                                    }
                                }
                                if (var12.field2125 != 0 && arg0 != null) {
                                    arg0.method1920(arg1, (byte) 73, arg2, !var12.field2067, arg4, var12.field2137, arg9);
                                }
                                if (~var12.field2111 != -17) {
                                    class136.method832(arg3, arg2, arg4, var12.field2111);
                                }
                            } else if (~arg1 == -4) {
                                class477 var44;
                                if (var24) {
                                    class153 var43 = new class153(arg10, var12, arg7, var21, var20, var22, super.field6992, arg1, arg9, var23);
                                    if (var43.method103(-122)) {
                                        var43.method97(-6682, arg10);
                                    }
                                    var44 = var43;
                                } else {
                                    var44 = new class542(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg1, arg9, arg5);
                                }
                                class477 var45 = class409.method2611(arg3, arg2, arg4);
                                if (!(var45 instanceof class516)) {
                                    class113.method730(arg3, arg2, arg4, var44, (class477) null);
                                } else {
                                    ((class516) var45).field7662 = var44;
                                }
                                if (var12.field2077 && class171.field2494) {
                                    if (arg9 == 0) {
                                        var19.method684(arg2, arg4 + 1, 50);
                                    } else if (~arg9 != -2) {
                                        if (~arg9 == -3) {
                                            var19.method684(arg2 + 1, arg4, 50);
                                        } else if (~arg9 == -4) {
                                            var19.method684(arg2, arg4, 50);
                                        }
                                    } else {
                                        var19.method684(arg2 + 1, arg4 + 1, 50);
                                    }
                                }
                                if (~var12.field2125 != -1 && arg0 != null) {
                                    arg0.method1920(arg1, (byte) 73, arg2, !var12.field2067, arg4, var12.field2137, arg9);
                                }
                            } else if (arg1 == 9) {
                                class423 var46;
                                if (!var24) {
                                    var46 = new class217(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg2, arg2 + var13 + -1, arg4, arg4 + -1 + var14, arg1, arg9, arg5);
                                } else {
                                    class376 var47 = new class376(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg2, arg2, arg4, arg4, arg1, arg9, var23);
                                    if (var47.method103(-98)) {
                                        var47.method97(-6682, arg10);
                                    }
                                    var46 = var47;
                                }
                                class423 var48 = class49.method352(arg3, arg2, arg4, field3935 != null ? field3935 : (field3935 = method1691("jq")));
                                if (var48 instanceof class232 && var48.field6423 == arg2 && var48.field6424 == arg4) {
                                    ((class232) var48).field3830 = var46;
                                } else {
                                    class186.method1160(var46, false);
                                }
                                if (~var12.field2125 != -1 && arg0 != null) {
                                    arg0.method1917(var13, 0, var12.field2137, arg2, var14, !var12.field2067, arg4);
                                }
                                if (var12.field2111 != 16) {
                                    class136.method832(arg3, arg2, arg4, var12.field2111);
                                }
                            } else if (arg1 == 4) {
                                class304 var50;
                                if (var24) {
                                    class447 var49 = new class447(arg10, var12, arg7, var21, var20, var22, super.field6992, 0, 0, 0, arg1, arg9);
                                    if (var49.method103(arg6 + -43)) {
                                        var49.method97(-6682, arg10);
                                    }
                                    var50 = var49;
                                } else {
                                    var50 = new class345(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, 0, 0, 0, arg1, arg9, arg5);
                                }
                                class304 var51 = class75.method544(arg3, arg2, arg4);
                                if (var51 instanceof class19) {
                                    ((class19) var51).field214 = var50;
                                } else {
                                    class188.method1175(arg3, arg2, arg4, var50, (class304) null);
                                }
                            } else if (~arg1 == -6) {
                                int var52 = 17;
                                class267 var53 = (class267) class409.method2611(arg3, arg2, arg4);
                                if (var53 != null) {
                                    var52 = class454.field7029.method3002(arg6 ^ 56, var53.method96((byte) 114)).field2111 + 1;
                                }
                                class304 var54;
                                if (!var24) {
                                    var54 = new class345(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, 0, class181.field2638[arg9] * var52, class162.field2356[arg9] * var52, arg1, arg9, arg5);
                                } else {
                                    class447 var55 = new class447(arg10, var12, arg7, var21, var20, var22, super.field6992, 0, class181.field2638[arg9] * var52, class162.field2356[arg9] * var52, arg1, arg9);
                                    var54 = var55;
                                    if (var55.method103(arg6 ^ 74)) {
                                        var55.method97(-6682, arg10);
                                    }
                                }
                                class304 var56 = class75.method544(arg3, arg2, arg4);
                                if (var56 instanceof class19) {
                                    ((class19) var56).field214 = var54;
                                } else {
                                    class188.method1175(arg3, arg2, arg4, var54, (class304) null);
                                }
                            } else if (~arg1 == -7) {
                                int var57 = 9;
                                class267 var58 = (class267) class409.method2611(arg3, arg2, arg4);
                                if (var58 != null) {
                                    var57 = 1 + class454.field7029.method3002(-1, var58.method96((byte) 97)).field2111 / 2;
                                }
                                class304 var60;
                                if (var24) {
                                    class447 var59 = new class447(arg10, var12, arg7, var21, var20, var22, super.field6992, arg9, class181.field2638[arg9] * var57, class162.field2356[arg9] * var57, arg1, arg9 + 4);
                                    if (var59.method103(-121)) {
                                        var59.method97(-6682, arg10);
                                    }
                                    var60 = var59;
                                } else {
                                    var60 = new class345(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg9, class217.field3691[arg9] * var57, class385.field5895[arg9] * var57, arg1, arg9 + 4, arg5);
                                }
                                class304 var61 = class75.method544(arg3, arg2, arg4);
                                if (!(var61 instanceof class19)) {
                                    class188.method1175(arg3, arg2, arg4, var60, (class304) null);
                                } else {
                                    ((class19) var61).field214 = var60;
                                }
                            } else if (~arg1 == -8) {
                                int var62 = 3 & arg9 + 2;
                                class304 var64;
                                if (var24) {
                                    class447 var63 = new class447(arg10, var12, arg7, var21, var20, var22, super.field6992, var62, 0, 0, arg1, var62 + 4);
                                    var64 = var63;
                                    if (var63.method103(arg6 ^ 64)) {
                                        var63.method97(-6682, arg10);
                                    }
                                } else {
                                    var64 = new class345(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, var62, 0, 0, arg1, var62 + 4, arg5);
                                }
                                class304 var65 = class75.method544(arg3, arg2, arg4);
                                if (!(var65 instanceof class19)) {
                                    class188.method1175(arg3, arg2, arg4, var64, (class304) null);
                                } else {
                                    ((class19) var65).field214 = var64;
                                }
                            } else if (~arg1 == -9) {
                                int var66 = 3 & arg9 + 2;
                                int var67 = 9;
                                class267 var68 = (class267) class409.method2611(arg3, arg2, arg4);
                                if (var68 != null) {
                                    var67 = class454.field7029.method3002(-1, var68.method96((byte) 89)).field2111 / 2 - -1;
                                }
                                class304 var71;
                                class304 var72;
                                if (var24) {
                                    class447 var69 = new class447(arg10, var12, arg7, var21, var20, var22, super.field6992, arg9, class217.field3691[arg9] * var67, class385.field5895[arg9] * var67, arg1, arg9 + 4);
                                    class447 var70 = new class447(arg10, var12, arg7, var21, var20, var22, super.field6992, arg9, 0, 0, arg1, var66 - -4);
                                    if (var69.method103(-117)) {
                                        var69.method97(-6682, arg10);
                                    }
                                    var71 = var69;
                                    var72 = var70;
                                    if (var70.method103(-106)) {
                                        var70.method97(arg6 + -6625, arg10);
                                    }
                                } else {
                                    class345 var73 = new class345(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg9, class217.field3691[arg9] * var67, class385.field5895[arg9] * var67, arg1, arg9 + 4, arg5);
                                    var71 = var73;
                                    class345 var74 = new class345(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg9, 0, 0, arg1, var66 + 4, arg5);
                                    var72 = var74;
                                }
                                class188.method1175(arg3, arg2, arg4, var71, var72);
                            }
                        } else {
                            class376 var75 = null;
                            class423 var77;
                            int var78;
                            if (var24) {
                                class376 var76 = new class376(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg2, arg2 + -1 + var13, arg4, var14 - 1 + arg4, arg1, arg9, var23);
                                var77 = var76;
                                var78 = var76.method2432((byte) -26);
                                var75 = var76;
                            } else {
                                var77 = new class217(arg10, var12, arg3, arg7, var21, var20, var22, super.field6992, arg2, arg2 + -1 + var13, arg4, arg4 + -1 - -var14, arg1, arg9, arg5);
                                var78 = 15;
                            }
                            class423 var79 = class49.method352(arg3, arg2, arg4, field3935 != null ? field3935 : (field3935 = method1691("jq")));
                            boolean var80 = false;
                            if (var79 instanceof class232 && ~var79.field6423 == ~arg2 && var79.field6424 == arg4) {
                                ((class232) var79).field3830 = var77;
                                var80 = true;
                            }
                            if (var80 || class186.method1160(var77, false)) {
                                if (var75 != null && var75.method103(arg6 ^ 86)) {
                                    var75.method97(-6682, arg10);
                                }
                                if (var12.field2077 && class171.field2494) {
                                    if (~var78 < -31) {
                                        var78 = 30;
                                    }
                                    for (int var81 = 0; var81 <= var13; ++var81) {
                                        for (int var82 = 0; ~var82 >= ~var14; ++var82) {
                                            var19.method684(arg2 - -var81, arg4 + var82, var78);
                                        }
                                    }
                                }
                            }
                            if (~var12.field2125 != -1 && arg0 != null) {
                                arg0.method1917(var13, 0, var12.field2137, arg2, var14, !var12.field2067, arg4);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public static void method1683(byte arg0) {
        int var1 = 97 / ((77 - arg0) / 47);
        field3923 = null;
        field3933 = null;
        field3930 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lza;B)V")
    public final void method1684(class497 arg0, byte arg1) {
        ++field3926;
        class425.method2692(arg0);
        if (super.field6995 > 1) {
            for (int var3 = 0; super.field7000 > var3; ++var3) {
                for (int var4 = 0; ~var4 > ~super.field7004; ++var4) {
                    if ((class416.field6309[1][var3][var4] & 2) == 2) {
                        class274.method1847(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; super.field6995 > var5; ++var5) {
            for (int var6 = 0; ~var6 >= ~super.field7004; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field7000; ++var7) {
                    if (~(1 & super.field6989[var5][var7][var6]) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var9 < super.field7004 && (1 & super.field6989[var5][var7][var9 + 1]) != 0) {
                            ++var9;
                        }
                        int var11 = var5;
                        while (var8 > 0 && (super.field6989[var5][var7][var8 + -1] & 1) != 0) {
                            --var8;
                        }
                        label171: while (var10 > 0) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if (~(1 & super.field6989[var10 + -1][var7][var12]) == -1) {
                                    break label171;
                                }
                            }
                            --var10;
                        }
                        label160: while (~var11 > -4) {
                            for (int var13 = var8; ~var13 >= ~var9; ++var13) {
                                if ((super.field6989[var11 + 1][var7][var13] & 1) == 0) {
                                    break label160;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var9 + 1 + -var8) * (var11 + 1 + -var10);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = super.field6988[var11][var7][var8] + -var15;
                            int var17 = super.field6988[var10][var7][var8];
                            class164.method1035(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; var9 >= var19; ++var19) {
                                    super.field6989[var18][var7][var19] = (byte) class272.method1842(super.field6989[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & super.field6989[var5][var7][var6]) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (var20 > 0 && ~(2 & super.field6989[var5][var20 + -1][var6]) != -1) {
                            --var20;
                        }
                        while (~var21 > ~super.field7000 && (2 & super.field6989[var5][var21 + 1][var6]) != 0) {
                            ++var21;
                        }
                        label225: while (~var22 < -1) {
                            for (int var24 = var20; var24 <= var21; ++var24) {
                                if (~(super.field6989[var22 - 1][var24][var6] & 2) == -1) {
                                    break label225;
                                }
                            }
                            --var22;
                        }
                        label214: while (var23 < 3) {
                            for (int var25 = var20; ~var21 <= ~var25; ++var25) {
                                if ((2 & super.field6989[var23 + 1][var25][var6]) == 0) {
                                    break label214;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (-var20 + var21 + 1) * (-var22 + 1 + var23);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = super.field6988[var23][var20][var6] - var27;
                            int var29 = super.field6988[var22][var20][var6];
                            class164.method1035(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; ~var23 <= ~var30; ++var30) {
                                for (int var31 = var20; var21 >= var31; ++var31) {
                                    super.field6989[var30][var31][var6] = (byte) class272.method1842(super.field6989[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((super.field6989[var5][var7][var6] & 4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; var34 > 0 && (4 & super.field6989[var5][var7][var34 + -1]) != 0; --var34) {
                        }
                        int var35;
                        for (var35 = var6; ~var35 > ~super.field7004 && (super.field6989[var5][var7][var35 + 1] & 4) != 0; ++var35) {
                        }
                        label278: while (~var32 < -1) {
                            for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                if ((super.field6989[var5][var32 - 1][var36] & 4) == 0) {
                                    break label278;
                                }
                            }
                            --var32;
                        }
                        label267: while (~super.field7000 < ~var33) {
                            for (int var37 = var34; var35 >= var37; ++var37) {
                                if (~(4 & super.field6989[var5][var33 - -1][var37]) == -1) {
                                    break label267;
                                }
                            }
                            ++var33;
                        }
                        if (~((var33 - var32 - -1) * (-var34 + 1 + var35)) <= -5) {
                            int var38 = super.field6988[var5][var32][var34];
                            class164.method1035(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                            for (int var39 = var32; var39 <= var33; ++var39) {
                                for (int var40 = var34; var40 <= var35; ++var40) {
                                    super.field6989[var5][var39][var40] = (byte) class272.method1842(super.field6989[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field6989 = null;
        if (arg1 > -11) {
            this.method1689(true, (class284[]) null, 36, -23, (class497) null, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lhw;II[ILza;I)V")
    public final void method1685(class208 arg0, int arg1, int arg2, int[] arg3, class497 arg4, int arg5) {
        ++field3922;
        if (!super.field6992) {
            boolean var7 = false;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            class341 var8 = null;
            int var9 = 120 % ((52 - arg2) / 37);
            while (true) {
                while (true) {
                    while (true) {
                        while (arg0.field3193.length > arg0.field3162) {
                            int var19 = arg0.method1445(127);
                            if (~var19 != -1) {
                                if (var19 != 1) {
                                    if (~var19 == -3) {
                                        if (var8 == null) {
                                            var8 = new class341();
                                        }
                                        var8.method2261(684, arg0);
                                    } else if (var19 == 128) {
                                        if (arg3 != null) {
                                            arg3[0] = arg0.method1455(-3387);
                                            arg3[1] = arg0.method1456(13329);
                                            arg3[2] = arg0.method1456(13329);
                                            arg3[3] = arg0.method1456(13329);
                                            arg3[4] = arg0.method1455(-3387);
                                        } else {
                                            arg0.field3162 += 10;
                                        }
                                    } else {
                                        if (~var19 != -130) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field7003 == null) {
                                            super.field7003 = new byte[4][][];
                                        }
                                        var7 = true;
                                        for (int var20 = 0; ~var20 > -5; ++var20) {
                                            byte var21 = arg0.method1427(false);
                                            if (~var21 == -1 && super.field7003[var20] != null) {
                                                int var22 = arg1;
                                                int var23 = arg1 + 64;
                                                int var24 = arg5;
                                                if (~arg1 <= -1) {
                                                    if (super.field7000 <= arg1) {
                                                        var22 = super.field7000;
                                                    }
                                                } else {
                                                    var22 = 0;
                                                }
                                                int var25 = arg5 - -64;
                                                if (~arg5 <= -1) {
                                                    if (arg5 >= super.field7004) {
                                                        var24 = super.field7004;
                                                    }
                                                } else {
                                                    var24 = 0;
                                                }
                                                if (~var23 > -1) {
                                                    var23 = 0;
                                                } else if (var23 >= super.field7000) {
                                                    var23 = super.field7000;
                                                }
                                                if (var25 >= 0) {
                                                    if (~super.field7004 >= ~var25) {
                                                        var25 = super.field7004;
                                                    }
                                                } else {
                                                    var25 = 0;
                                                }
                                                while (~var23 < ~var22) {
                                                    while (var24 < var25) {
                                                        super.field7003[var20][var22][var24] = 0;
                                                        ++var24;
                                                    }
                                                    ++var22;
                                                }
                                            } else if (~var21 != -2) {
                                                if (var21 == 2) {
                                                    if (super.field7003[var20] == null) {
                                                        super.field7003[var20] = new byte[super.field7000 + 1][super.field7004 + 1];
                                                    }
                                                    if (~var20 < -1) {
                                                        int var26 = arg1;
                                                        int var27 = arg1 + 64;
                                                        int var28 = arg5;
                                                        if (arg5 < 0) {
                                                            var28 = 0;
                                                        } else if (~arg5 <= ~super.field7004) {
                                                            var28 = super.field7004;
                                                        }
                                                        int var29 = arg5 - -64;
                                                        if (var27 >= 0) {
                                                            if (~var27 <= ~super.field7000) {
                                                                var27 = super.field7000;
                                                            }
                                                        } else {
                                                            var27 = 0;
                                                        }
                                                        if (arg1 >= 0) {
                                                            if (arg1 >= super.field7000) {
                                                                var26 = super.field7000;
                                                            }
                                                        } else {
                                                            var26 = 0;
                                                        }
                                                        if (~var29 > -1) {
                                                            var29 = 0;
                                                        } else if (~var29 <= ~super.field7004) {
                                                            var29 = super.field7004;
                                                        }
                                                        while (var26 < var27) {
                                                            while (~var29 < ~var28) {
                                                                super.field7003[var20][var26][var28] = super.field7003[var20 - 1][var26][var28];
                                                                ++var28;
                                                            }
                                                            ++var26;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (super.field7003[var20] == null) {
                                                    super.field7003[var20] = new byte[super.field7000 + 1][super.field7004 + 1];
                                                }
                                                for (int var30 = 0; var30 < 64; var30 += 4) {
                                                    for (int var31 = 0; var31 < 64; var31 += 4) {
                                                        byte var32 = arg0.method1427(false);
                                                        for (int var33 = arg1 + var30; ~(arg1 + var30 + 4) < ~var33; ++var33) {
                                                            for (int var34 = arg5 + var31; var34 < arg5 + var31 + 4; ++var34) {
                                                                if (~var33 <= -1 && ~super.field7000 < ~var33 && ~var34 <= -1 && ~var34 > ~super.field7004) {
                                                                    super.field7003[var20][var33][var34] = var32;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    int var35 = arg0.method1445(73);
                                    if (var35 > 0) {
                                        for (int var36 = 0; ~var35 < ~var36; ++var36) {
                                            class169 var37 = new class169(arg4, arg0, 0);
                                            if (~var37.field2467 == -32) {
                                                class101 var38 = class525.field7743.method554(12275, arg0.method1455(-3387));
                                                var37.method1066(var38.field1447, var38.field1450, var38.field1443, -4309, var38.field1445);
                                            }
                                            if (arg4.method1324() > 0) {
                                                class415 var39 = var37.field2461;
                                                int var40 = var39.method2650(118) + (arg1 << 7);
                                                int var41 = (arg5 << 7) + var39.method2654(0);
                                                int var42 = var40 >> 7;
                                                int var43 = var41 >> 7;
                                                if (var42 >= 0 && ~var43 <= -1 && super.field7000 > var42 && super.field7004 > var43) {
                                                    var39.method213(-14174, super.field6988[var37.field2473][var42][var43] + -var39.method2645(127), var41, var40);
                                                    class128.method795(var37);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class341(arg0);
                            }
                        }
                        if (var8 != null) {
                            for (int var10 = 0; var10 < 8; ++var10) {
                                for (int var11 = 0; var11 < 8; ++var11) {
                                    int var12 = (arg1 >> 3) - -var10;
                                    int var13 = (arg5 >> 3) + var11;
                                    if (~var12 <= -1 && var12 < super.field7000 >> 3 && ~var13 <= -1 && ~var13 > ~(super.field7004 >> 3)) {
                                        class341.method2266(false, var13, var8, var12);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field7003 != null) {
                            for (int var14 = 0; ~var14 > -5; ++var14) {
                                if (super.field7003[var14] != null) {
                                    for (int var15 = 0; var15 < 16; ++var15) {
                                        for (int var16 = 0; var16 < 16; ++var16) {
                                            int var17 = (arg1 >> 2) + var15;
                                            int var18 = (arg5 >> 2) + var16;
                                            if (var17 >= 0 && var17 < 26 && var18 >= 0 && var18 < 26) {
                                                super.field7003[var14][var17][var18] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILza;I[BI[Lsj;BIII)V")
    public final void method1686(int arg0, int arg1, class497 arg2, int arg3, byte[] arg4, int arg5, class284[] arg6, byte arg7, int arg8, int arg9, int arg10) {
        ++field3927;
        class208 var12 = new class208(arg4);
        int var13 = -1;
        if (arg7 != -125) {
            this.field3925 = 48;
        }
        while (true) {
            int var14 = var12.method1423((byte) -120);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1481(false);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4065 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method1445(38);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg10 == ~var19 && ~arg5 >= ~var18 && var18 < arg5 - -8 && ~var17 <= ~arg3 && var17 < arg3 - -8) {
                    class156 var23 = class454.field7029.method3002(-1, var13);
                    int var24 = class222.method1616(arg8, 7 & var17, var23.field2123, var22, (byte) 47, var23.field2139, var18 & 7) + arg9;
                    int var25 = arg1 - -class512.method3089(var23.field2139, arg8, var23.field2123, var22, -2, 7 & var18, var17 & 7);
                    if (~var24 < -1 && ~var25 < -1 && ~var24 > ~(super.field7000 + -1) && ~(super.field7004 + -1) < ~var25) {
                        class284 var26 = null;
                        if (!super.field6992) {
                            int var27 = arg0;
                            if ((class416.field6309[1][var24][var25] & 2) == 2) {
                                var27 = arg0 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg6[var27];
                            }
                        }
                        this.method1682(var26, var21, var24, arg0, var25, -1, (byte) -57, arg0, var13, arg8 + var22 & 3, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIILza;ILsj;Z)V")
    public final void method1687(int arg0, int arg1, int arg2, class497 arg3, int arg4, class284 arg5, boolean arg6) {
        ++field3920;
        class267 var8 = null;
        if (arg4 == 0) {
            var8 = (class267) class409.method2611(arg1, arg2, arg0);
        }
        if (~arg4 == -2) {
            var8 = (class267) class75.method544(arg1, arg2, arg0);
        }
        if (arg6) {
            this.method1685((class208) null, -34, 24, (int[]) null, (class497) null, -71);
        }
        if (~arg4 == -3) {
            var8 = (class267) class49.method352(arg1, arg2, arg0, field3935 != null ? field3935 : (field3935 = method1691("jq")));
        }
        if (~arg4 == -4) {
            var8 = (class267) class76.method548(arg1, arg2, arg0);
        }
        if (var8 != null) {
            class156 var9 = class454.field7029.method3002(-1, var8.method96((byte) 89));
            int var10 = var8.method99((byte) 88);
            int var11 = var8.method106((byte) 18);
            if (var9.method948(-1)) {
                class143.method864(-469715737, var9, arg1, arg2, arg0);
            }
            if (var8.method103(-98)) {
                var8.method104(arg3, 26768);
            }
            if (arg4 != 0) {
                if (~arg4 == -2) {
                    class304 var12 = class75.method544(arg1, arg2, arg0);
                    if (var12 instanceof class19) {
                        ((class19) var12).field214 = null;
                        return;
                    }
                    class53.method371(arg1, arg2, arg0);
                    return;
                }
                if (~arg4 != -3) {
                    if (arg4 == 3) {
                        class12 var13 = class76.method548(arg1, arg2, arg0);
                        if (!(var13 instanceof class406)) {
                            class152.method929(arg1, arg2, arg0);
                        } else {
                            ((class406) var13).field6130 = null;
                        }
                        if (~var9.field2125 == -2) {
                            arg5.method1910(arg0, true, arg2);
                            return;
                        }
                    }
                    return;
                }
                class423 var14 = class49.method352(arg1, arg2, arg0, field3935 != null ? field3935 : (field3935 = method1691("jq")));
                if (var14 instanceof class232 && ~var14.field6423 == ~arg2 && ~var14.field6424 == ~arg0) {
                    ((class232) var14).field3830 = null;
                } else {
                    class536.method3179(arg1, arg2, arg0, field3935 != null ? field3935 : (field3935 = method1691("jq")));
                }
                if (~var9.field2125 != -1 && ~super.field7000 < ~(var9.field2139 + arg2) && ~(var9.field2139 + arg0) > ~super.field7004 && ~(arg2 - -var9.field2123) > ~super.field7000 && var9.field2123 + arg0 < super.field7004) {
                    arg5.method1913(var11, 115, var9.field2123, var9.field2139, !var9.field2067, arg2, arg0, var9.field2137);
                    return;
                }
                return;
            }
            class477 var15 = class409.method2611(arg1, arg2, arg0);
            if (var15 instanceof class516) {
                ((class516) var15).field7662 = null;
            } else {
                class438.method2779(arg1, arg2, arg0);
            }
            if (~var9.field2125 != -1) {
                arg5.method1914(var9.field2137, var10, !var9.field2067, arg2, var11, -2, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method1688(byte[] arg0, boolean arg1) {
        if (arg1) {
            method1683((byte) -51);
        }
        ++field3921;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class324.method2166(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z[Lsj;IILza;[B)V")
    public final void method1689(boolean arg0, class284[] arg1, int arg2, int arg3, class497 arg4, byte[] arg5) {
        ++field3929;
        class208 var7 = new class208(arg5);
        int var8 = -1;
        if (arg0) {
            this.method1682((class284) null, -53, 49, 70, -3, 6, (byte) -22, -16, 74, -7, (class497) null);
        }
        while (true) {
            int var9 = var7.method1423((byte) -127);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1481(false);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = 63 & var10 >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method1445(99);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg2 + var13;
                int var19 = arg3 + var12;
                if (~var18 < -1 && ~var19 < -1 && var18 < super.field7000 + -1 && var19 < super.field7004 + -1) {
                    class284 var20 = null;
                    if (!super.field6992) {
                        int var21 = var14;
                        if (~(class416.field6309[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg1[var21];
                        }
                    }
                    this.method1682(var20, var16, var18, var14, var19, -1, (byte) -57, var14, var8, var17, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIZ)V")
    public class242(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class310.field4844, class32.field333);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII[ILhw;IIZLza;I)V")
    public final void method1690(int arg0, int arg1, int arg2, int arg3, int[] arg4, class208 arg5, int arg6, int arg7, boolean arg8, class497 arg9, int arg10) {
        ++field3928;
        if (!super.field6992) {
            boolean var12 = false;
            if (arg8) {
                if (arg4 != null) {
                    arg4[0] = -1;
                }
                class341 var13 = null;
                int var14 = (arg3 & 7) * 8;
                int var15 = (arg6 & 7) * 8;
                while (true) {
                    while (arg5.field3193.length > arg5.field3162) {
                        int var20 = arg5.method1445(52);
                        if (var20 == 0) {
                            var13 = new class341(arg5);
                        } else if (var20 == 1) {
                            int var21 = arg5.method1445(70);
                            if (var21 > 0) {
                                for (int var22 = 0; var21 > var22; ++var22) {
                                    class169 var23 = new class169(arg9, arg5, 0);
                                    if (var23.field2467 == 31) {
                                        class101 var24 = class525.field7743.method554(12275, arg5.method1455(-3387));
                                        var23.method1066(var24.field1447, var24.field1450, var24.field1443, -4309, var24.field1445);
                                    }
                                    if (arg9.method1324() > 0) {
                                        class415 var25 = var23.field2461;
                                        int var26 = var25.method2650(127) >> 7;
                                        int var27 = var25.method2654(0) >> 7;
                                        if (~var23.field2473 == ~arg1 && ~var26 <= ~var14 && ~var26 > ~(var14 + 8) && ~var15 >= ~var27 && var15 + 8 > var27) {
                                            int var28 = class38.method230((byte) -122, arg10, 1023 & var25.method2650(127), var25.method2654(0) & 1023) + (arg2 << 7);
                                            int var29 = (arg0 << 7) - -class519.method3113(1023 & var25.method2650(120), var25.method2654(0) & 1023, arg10, (byte) -73);
                                            int var30 = var28 >> 7;
                                            int var31 = var29 >> 7;
                                            if (~var30 <= -1 && var31 >= 0 && ~super.field7000 < ~var30 && super.field7004 > var31) {
                                                var25.method213(-14174, super.field6988[arg1][var30][var31] + -var25.method2645(121), var29, var28);
                                                class128.method795(var23);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (~var20 == -3) {
                            if (var13 == null) {
                                var13 = new class341();
                            }
                            var13.method2261(684, arg5);
                        } else if (~var20 == -129) {
                            if (arg4 != null) {
                                arg4[0] = arg5.method1455(-3387);
                                arg4[1] = arg5.method1456(13329);
                                arg4[2] = arg5.method1456(13329);
                                arg4[3] = arg5.method1456(13329);
                                arg4[4] = arg5.method1455(-3387);
                            } else {
                                arg5.field3162 += 10;
                            }
                        } else {
                            if (~var20 != -130) {
                                throw new IllegalStateException("");
                            }
                            if (super.field7003 == null) {
                                super.field7003 = new byte[4][][];
                            }
                            for (int var32 = 0; var32 < 4; ++var32) {
                                byte var33 = arg5.method1427(false);
                                if (var33 == 0 && super.field7003[arg7] != null) {
                                    if (~arg1 <= ~var32) {
                                        int var34 = arg2;
                                        int var35 = arg2 - -7;
                                        int var36 = arg0;
                                        int var37 = arg0 - -7;
                                        if (arg0 < 0) {
                                            var36 = 0;
                                        } else if (~arg0 <= ~super.field7004) {
                                            var36 = super.field7004;
                                        }
                                        if (~var35 > -1) {
                                            var35 = 0;
                                        } else if (~super.field7000 >= ~var35) {
                                            var35 = super.field7000;
                                        }
                                        if (~arg2 <= -1) {
                                            if (arg2 >= super.field7000) {
                                                var34 = super.field7000;
                                            }
                                        } else {
                                            var34 = 0;
                                        }
                                        if (~var37 <= -1) {
                                            if (super.field7004 <= var37) {
                                                var37 = super.field7004;
                                            }
                                        } else {
                                            var37 = 0;
                                        }
                                        while (var34 < var35) {
                                            while (~var37 < ~var36) {
                                                super.field7003[arg7][var34][var36] = 0;
                                                ++var36;
                                            }
                                            ++var34;
                                        }
                                    }
                                } else if (var33 == 1) {
                                    if (super.field7003[arg7] == null) {
                                        super.field7003[arg7] = new byte[super.field7000 + 1][super.field7004 - -1];
                                    }
                                    for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                        for (int var39 = 0; var39 < 64; var39 += 4) {
                                            byte var40 = arg5.method1427(false);
                                            if (arg1 >= var32) {
                                                for (int var41 = var38; ~var41 > ~(var38 - -4); ++var41) {
                                                    for (int var42 = var39; var42 < var39 - -4; ++var42) {
                                                        if (var41 >= var14 && ~var41 > ~(var14 + 8) && var42 >= var15 && ~var15 > ~(var15 + 8)) {
                                                            int var43 = class73.method536(arg10, 7 & var41, (byte) 66, var42 & 7) + arg2;
                                                            int var44 = arg0 - -class165.method1040(arg10, (byte) 120, var41 & 7, var42 & 7);
                                                            if (~var43 <= -1 && ~super.field7000 < ~var43 && var44 >= 0 && ~var44 > ~super.field7004) {
                                                                super.field7003[arg7][var43][var44] = var40;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var13 != null) {
                        class341.method2266(false, arg0 >> 3, var13, arg2 >> 3);
                    }
                    if (!var12 && super.field7003 != null && super.field7003[arg7] != null) {
                        int var16 = arg2 + 7;
                        int var17 = arg0 - -7;
                        for (int var18 = arg2; ~var18 > ~var16; ++var18) {
                            for (int var19 = arg0; ~var19 > ~var17; ++var19) {
                                super.field7003[arg7][var18][var19] = 0;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1691(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
