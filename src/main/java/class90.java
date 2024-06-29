import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class90 extends class253 {

    @OriginalMember(owner = "client!eda", name = "N", descriptor = "I")
    public int field1371 = 99;

    @OriginalMember(owner = "client!eda", name = "I", descriptor = "[I")
    public static int[] field1366 = new int[13];

    @OriginalMember(owner = "client!eda", name = "H", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!eda", name = "J", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!eda", name = "K", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!eda", name = "L", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!eda", name = "M", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!eda", name = "O", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!eda", name = "P", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!eda", name = "Q", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!eda", name = "R", descriptor = "I")
    public static int field1375;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eda", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field1376;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILed;BLoa;IIIIIII)V")
    public final void method711(int arg0, class661 arg1, byte arg2, class651 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 19 % ((arg2 - -31) / 33);
        ++field1374;
        if (class344.field4718.method1553(class571.field7587, -2058) || class37.method291(class669.field9491, arg0, arg7, -1, arg8)) {
            if (~arg6 > ~this.field1371) {
                this.field1371 = arg6;
            }
            class58 var13 = class470.field6288.method1258(arg10, (byte) -87);
            if (!arg3.method428() || !class344.field4718.field5459 || !var13.field854) {
                int var14;
                int var15;
                if (arg9 != 1 && arg9 != 3) {
                    var14 = var13.field838;
                    var15 = var13.field885;
                } else {
                    var15 = var13.field838;
                    var14 = var13.field885;
                }
                int var16;
                int var17;
                if (~super.field3481 > ~(arg7 - -var14)) {
                    var16 = arg7;
                    var17 = arg7 + 1;
                } else {
                    var16 = (var14 >> 1) + arg7;
                    var17 = (var14 + 1 >> 1) + arg7;
                }
                int var18;
                int var19;
                if (~(arg0 + var15) < ~super.field3501) {
                    var18 = arg0;
                    var19 = arg0 + 1;
                } else {
                    var19 = (var15 - -1 >> 1) + arg0;
                    var18 = (var15 >> 1) + arg0;
                }
                class139 var20 = class218.field3099[arg8];
                int var21 = var20.method195(var16, var18) + var20.method195(var17, var18) - (-var20.method195(var16, var19) + -var20.method195(var17, var19)) >> 2;
                int var22 = (arg7 << 9) + (var14 << 8);
                int var23 = (arg0 << 9) - -(var15 << 8);
                boolean var24 = class93.field1411 && !super.field3479 && var13.field819;
                if (var13.method479(31460)) {
                    class372.method2192(var13, arg6, -601998647, arg9, (class403) null, (class287) null, arg0, arg7);
                }
                boolean var25 = ~arg5 == 0 && var13.field896 == -1 && var13.field874 == null && var13.field888 == null && !var13.field860;
                if (!class692.field9737 || (!class676.method3778(true, arg4) || ~var13.field892 == -2) && (!class585.method3216(-18, arg4) || ~var13.field892 != -1)) {
                    if (~arg4 == -23) {
                        if (class344.field4718.field5446 || ~var13.field816 != -1 || ~var13.field826 == -2 || var13.field890) {
                            class618 var27;
                            if (var25) {
                                class408 var26 = new class408(arg3, var13, arg8, var22, var21, var23, super.field3479, arg9, var24);
                                var27 = var26;
                                if (var26.method150((byte) -70)) {
                                    var26.method148(arg3, (byte) 70);
                                }
                            } else {
                                var27 = new class396(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg9, arg5);
                            }
                            class618 var28 = class34.method269(arg6, arg7, arg0);
                            if (var28 instanceof class13) {
                                ((class13) var28).field216 = var27;
                            } else {
                                class66.method530(arg6, arg7, arg0, var27);
                            }
                            if (~var13.field826 == -2 && arg1 != null) {
                                arg1.method3717(262144, arg7, arg0);
                            }
                        }
                    } else if (arg4 != 10 && arg4 != 11) {
                        if (arg4 >= 12 && arg4 <= 17 || ~arg4 <= -19 && arg4 <= 21) {
                            class641 var29;
                            if (!var25) {
                                var29 = new class479(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg7, var14 + -1 + arg7, arg0, var15 + -1 + arg0, arg4, arg9, arg5);
                            } else {
                                class268 var30 = new class268(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg7, arg7 + var14 + -1, arg0, var15 - 1 + arg0, arg4, arg9, var24);
                                var29 = var30;
                                if (var30.method150((byte) -72)) {
                                    var30.method148(arg3, (byte) 70);
                                }
                            }
                            class641 var31 = class503.method2793(arg6, arg7, arg0, field1376 != null ? field1376 : (field1376 = method720("qi")));
                            if (var31 instanceof class92 && var31.field8611 == arg7 && var31.field8618 == arg0) {
                                ((class92) var31).field1389 = var29;
                            } else {
                                class618.method3385(var29, false);
                            }
                            if (class93.field1411 && !super.field3479 && arg4 >= 12 && ~arg4 >= -18 && ~arg4 != -14 && arg6 > 0 && ~var13.field892 != -1) {
                                super.field3497[arg6][arg7][arg0] = (byte) class220.method1393(super.field3497[arg6][arg7][arg0], 4);
                            }
                            if (var13.field826 != 0 && arg1 != null) {
                                arg1.method3701(var14, !var13.field901, var15, arg7, -118, var13.field867, arg0);
                            }
                        } else if (arg4 == 0) {
                            int var32 = var13.field892;
                            if (class616.field8170 && ~var13.field892 == 0) {
                                var32 = 1;
                            }
                            class477 var34;
                            if (var25) {
                                class363 var33 = new class363(arg3, var13, arg8, var22, var21, var23, super.field3479, arg4, arg9, var24);
                                var34 = var33;
                                if (var33.method150((byte) -106)) {
                                    var33.method148(arg3, (byte) 70);
                                }
                            } else {
                                var34 = new class653(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg4, arg9, arg5);
                            }
                            class477 var35 = class219.method1390(arg6, arg7, arg0);
                            if (var35 instanceof class436) {
                                ((class436) var35).field5972 = var34;
                            } else {
                                class100.method764(arg6, arg7, arg0, var34, (class477) null);
                            }
                            if (class93.field1411) {
                                if (~arg9 == -1) {
                                    if (var13.field837) {
                                        var20.method209(arg7, arg0, 50);
                                        var20.method209(arg7, arg0 - -1, 50);
                                    }
                                    if (var32 == 1 && !super.field3479) {
                                        super.field3497[arg6][arg7][arg0] = (byte) class220.method1393(super.field3497[arg6][arg7][arg0], 1);
                                    }
                                } else if (~arg9 == -2) {
                                    if (var13.field837) {
                                        var20.method209(arg7, arg0 + 1, 50);
                                        var20.method209(arg7 + 1, arg0 + 1, 50);
                                    }
                                    if (var32 == 1 && !super.field3479) {
                                        super.field3497[arg6][arg7][arg0 + 1] = (byte) class220.method1393(super.field3497[arg6][arg7][arg0 + 1], 2);
                                    }
                                } else if (arg9 == 2) {
                                    if (var13.field837) {
                                        var20.method209(arg7 + 1, arg0, 50);
                                        var20.method209(arg7 + 1, arg0 + 1, 50);
                                    }
                                    if (~var32 == -2 && !super.field3479) {
                                        super.field3497[arg6][arg7 - -1][arg0] = (byte) class220.method1393(super.field3497[arg6][arg7 - -1][arg0], 1);
                                    }
                                } else if (~arg9 == -4) {
                                    if (var13.field837) {
                                        var20.method209(arg7, arg0, 50);
                                        var20.method209(arg7 + 1, arg0, 50);
                                    }
                                    if (var32 == 1 && !super.field3479) {
                                        super.field3497[arg6][arg7][arg0] = (byte) class220.method1393(super.field3497[arg6][arg7][arg0], 2);
                                    }
                                }
                            }
                            if (~var13.field826 != -1 && arg1 != null) {
                                arg1.method3710(var13.field867, !var13.field901, -84, arg7, arg0, arg4, arg9);
                            }
                            if (~var13.field878 != -65) {
                                class563.method3091(arg6, arg7, arg0, var13.field878);
                            }
                        } else if (~arg4 == -2) {
                            class477 var37;
                            if (var25) {
                                class363 var36 = new class363(arg3, var13, arg8, var22, var21, var23, super.field3479, arg4, arg9, var24);
                                var37 = var36;
                                if (var36.method150((byte) -68)) {
                                    var36.method148(arg3, (byte) 70);
                                }
                            } else {
                                var37 = new class653(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg4, arg9, arg5);
                            }
                            class477 var38 = class219.method1390(arg6, arg7, arg0);
                            if (!(var38 instanceof class436)) {
                                class100.method764(arg6, arg7, arg0, var37, (class477) null);
                            } else {
                                ((class436) var38).field5972 = var37;
                            }
                            if (var13.field837 && class93.field1411) {
                                if (~arg9 == -1) {
                                    var20.method209(arg7, arg0 + 1, 50);
                                } else if (~arg9 != -2) {
                                    if (~arg9 != -3) {
                                        if (~arg9 == -4) {
                                            var20.method209(arg7, arg0, 50);
                                        }
                                    } else {
                                        var20.method209(arg7 + 1, arg0, 50);
                                    }
                                } else {
                                    var20.method209(arg7 - -1, arg0 - -1, 50);
                                }
                            }
                            if (~var13.field826 != -1 && arg1 != null) {
                                arg1.method3710(var13.field867, !var13.field901, -94, arg7, arg0, arg4, arg9);
                            }
                        } else if (~arg4 == -3) {
                            int var39 = arg9 + 1 & 3;
                            class477 var42;
                            class477 var43;
                            if (var25) {
                                class363 var40 = new class363(arg3, var13, arg8, var22, var21, var23, super.field3479, arg4, arg9 - -4, var24);
                                class363 var41 = new class363(arg3, var13, arg8, var22, var21, var23, super.field3479, arg4, var39, var24);
                                if (var40.method150((byte) -57)) {
                                    var40.method148(arg3, (byte) 70);
                                }
                                if (var41.method150((byte) -51)) {
                                    var41.method148(arg3, (byte) 70);
                                }
                                var42 = var41;
                                var43 = var40;
                            } else {
                                var43 = new class653(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg4, arg9 + 4, arg5);
                                var42 = new class653(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg4, var39, arg5);
                            }
                            class100.method764(arg6, arg7, arg0, var43, var42);
                            if (var13.field892 == 1 && class93.field1411 && !super.field3479) {
                                if (arg9 != 0) {
                                    if (~arg9 == -2) {
                                        super.field3497[arg6][arg7][arg0 - -1] = (byte) class220.method1393(super.field3497[arg6][arg7][arg0 - -1], 2);
                                        super.field3497[arg6][arg7 - -1][arg0] = (byte) class220.method1393(super.field3497[arg6][arg7 - -1][arg0], 1);
                                    } else if (~arg9 == -3) {
                                        super.field3497[arg6][arg7 + 1][arg0] = (byte) class220.method1393(super.field3497[arg6][arg7 + 1][arg0], 1);
                                        super.field3497[arg6][arg7][arg0] = (byte) class220.method1393(super.field3497[arg6][arg7][arg0], 2);
                                    } else if (~arg9 == -4) {
                                        super.field3497[arg6][arg7][arg0] = (byte) class220.method1393(super.field3497[arg6][arg7][arg0], 2);
                                        super.field3497[arg6][arg7][arg0] = (byte) class220.method1393(super.field3497[arg6][arg7][arg0], 1);
                                    }
                                } else {
                                    super.field3497[arg6][arg7][arg0] = (byte) class220.method1393(super.field3497[arg6][arg7][arg0], 1);
                                    super.field3497[arg6][arg7][arg0 + 1] = (byte) class220.method1393(super.field3497[arg6][arg7][arg0 + 1], 2);
                                }
                            }
                            if (~var13.field826 != -1 && arg1 != null) {
                                arg1.method3710(var13.field867, !var13.field901, -100, arg7, arg0, arg4, arg9);
                            }
                            if (var13.field878 != 64) {
                                class563.method3091(arg6, arg7, arg0, var13.field878);
                            }
                        } else if (arg4 == 3) {
                            class477 var44;
                            if (!var25) {
                                var44 = new class653(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg4, arg9, arg5);
                            } else {
                                class363 var45 = new class363(arg3, var13, arg8, var22, var21, var23, super.field3479, arg4, arg9, var24);
                                var44 = var45;
                                if (var45.method150((byte) -85)) {
                                    var45.method148(arg3, (byte) 70);
                                }
                            }
                            class477 var46 = class219.method1390(arg6, arg7, arg0);
                            if (var46 instanceof class436) {
                                ((class436) var46).field5972 = var44;
                            } else {
                                class100.method764(arg6, arg7, arg0, var44, (class477) null);
                            }
                            if (var13.field837 && class93.field1411) {
                                if (arg9 != 0) {
                                    if (arg9 == 1) {
                                        var20.method209(arg7 + 1, arg0 + 1, 50);
                                    } else if (arg9 == 2) {
                                        var20.method209(arg7 - -1, arg0, 50);
                                    } else if (~arg9 == -4) {
                                        var20.method209(arg7, arg0, 50);
                                    }
                                } else {
                                    var20.method209(arg7, arg0 + 1, 50);
                                }
                            }
                            if (var13.field826 != 0 && arg1 != null) {
                                arg1.method3710(var13.field867, !var13.field901, -108, arg7, arg0, arg4, arg9);
                            }
                        } else if (~arg4 == -10) {
                            class641 var48;
                            if (var25) {
                                class268 var47 = new class268(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg7, arg7, arg0, arg0, arg4, arg9, var24);
                                if (var47.method150((byte) -89)) {
                                    var47.method148(arg3, (byte) 70);
                                }
                                var48 = var47;
                            } else {
                                var48 = new class479(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg7, arg7 + var14 + -1, arg0, arg0 + var15 + -1, arg4, arg9, arg5);
                            }
                            class641 var49 = class503.method2793(arg6, arg7, arg0, field1376 != null ? field1376 : (field1376 = method720("qi")));
                            if (var49 instanceof class92 && var49.field8611 == arg7 && ~var49.field8618 == ~arg0) {
                                ((class92) var49).field1389 = var48;
                            } else {
                                class618.method3385(var48, false);
                            }
                            if (~var13.field826 != -1 && arg1 != null) {
                                arg1.method3701(var14, !var13.field901, var15, arg7, -125, var13.field867, arg0);
                            }
                            if (~var13.field878 != -65) {
                                class563.method3091(arg6, arg7, arg0, var13.field878);
                            }
                        } else if (~arg4 == -5) {
                            class18 var51;
                            if (var25) {
                                class654 var50 = new class654(arg3, var13, arg8, var22, var21, var23, super.field3479, 0, 0, 0, arg4, arg9);
                                var51 = var50;
                                if (var50.method150((byte) -90)) {
                                    var50.method148(arg3, (byte) 70);
                                }
                            } else {
                                var51 = new class558(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, 0, 0, 0, arg4, arg9, arg5);
                            }
                            class18 var52 = class74.method581(arg6, arg7, arg0);
                            if (var52 instanceof class562) {
                                ((class562) var52).field7454 = var51;
                            } else {
                                class425.method2433(arg6, arg7, arg0, var51, (class18) null);
                            }
                        } else if (arg4 == 5) {
                            int var53 = 65;
                            class532 var54 = (class532) class219.method1390(arg6, arg7, arg0);
                            if (var54 != null) {
                                var53 = class470.field6288.method1258(var54.method146(false), (byte) -62).field878 + 1;
                            }
                            class18 var56;
                            if (var25) {
                                class654 var55 = new class654(arg3, var13, arg8, var22, var21, var23, super.field3479, 0, class471.field6298[arg9] * var53, class28.field452[arg9] * var53, arg4, arg9);
                                if (var55.method150((byte) -111)) {
                                    var55.method148(arg3, (byte) 70);
                                }
                                var56 = var55;
                            } else {
                                var56 = new class558(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, 0, class471.field6298[arg9] * var53, class28.field452[arg9] * var53, arg4, arg9, arg5);
                            }
                            class18 var57 = class74.method581(arg6, arg7, arg0);
                            if (var57 instanceof class562) {
                                ((class562) var57).field7454 = var56;
                            } else {
                                class425.method2433(arg6, arg7, arg0, var56, (class18) null);
                            }
                        } else if (~arg4 == -7) {
                            int var58 = 33;
                            class532 var59 = (class532) class219.method1390(arg6, arg7, arg0);
                            if (var59 != null) {
                                var58 = class470.field6288.method1258(var59.method146(false), (byte) -30).field878 / 2 + 1;
                            }
                            class18 var61;
                            if (var25) {
                                class654 var60 = new class654(arg3, var13, arg8, var22, var21, var23, super.field3479, arg9, class471.field6298[arg9] * var58, class28.field452[arg9] * var58, arg4, arg9 + 4);
                                var61 = var60;
                                if (var60.method150((byte) -58)) {
                                    var60.method148(arg3, (byte) 70);
                                }
                            } else {
                                var61 = new class558(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg9, class69.field1038[arg9] * var58, class658.field9139[arg9] * var58, arg4, arg9 + 4, arg5);
                            }
                            class18 var62 = class74.method581(arg6, arg7, arg0);
                            if (!(var62 instanceof class562)) {
                                class425.method2433(arg6, arg7, arg0, var61, (class18) null);
                            } else {
                                ((class562) var62).field7454 = var61;
                            }
                        } else if (arg4 == 7) {
                            int var63 = arg9 + 2 & 3;
                            class18 var64;
                            if (!var25) {
                                var64 = new class558(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, var63, 0, 0, arg4, var63 + 4, arg5);
                            } else {
                                class654 var65 = new class654(arg3, var13, arg8, var22, var21, var23, super.field3479, var63, 0, 0, arg4, var63 - -4);
                                if (var65.method150((byte) -40)) {
                                    var65.method148(arg3, (byte) 70);
                                }
                                var64 = var65;
                            }
                            class18 var66 = class74.method581(arg6, arg7, arg0);
                            if (var66 instanceof class562) {
                                ((class562) var66).field7454 = var64;
                            } else {
                                class425.method2433(arg6, arg7, arg0, var64, (class18) null);
                            }
                        } else if (arg4 == 8) {
                            int var67 = 3 & arg9 + 2;
                            int var68 = 33;
                            class532 var69 = (class532) class219.method1390(arg6, arg7, arg0);
                            if (var69 != null) {
                                var68 = 1 + class470.field6288.method1258(var69.method146(false), (byte) -127).field878 / 2;
                            }
                            class18 var71;
                            class18 var73;
                            if (!var25) {
                                class558 var70 = new class558(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg9, class69.field1038[arg9] * var68, class658.field9139[arg9] * var68, arg4, arg9 + 4, arg5);
                                var71 = var70;
                                class558 var72 = new class558(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg9, 0, 0, arg4, var67 + 4, arg5);
                                var73 = var72;
                            } else {
                                class654 var74 = new class654(arg3, var13, arg8, var22, var21, var23, super.field3479, arg9, class69.field1038[arg9] * var68, class658.field9139[arg9] * var68, arg4, arg9 + 4);
                                class654 var75 = new class654(arg3, var13, arg8, var22, var21, var23, super.field3479, arg9, 0, 0, arg4, var67 + 4);
                                if (var74.method150((byte) -93)) {
                                    var74.method148(arg3, (byte) 70);
                                }
                                var71 = var74;
                                var73 = var75;
                                if (var75.method150((byte) -96)) {
                                    var75.method148(arg3, (byte) 70);
                                }
                            }
                            class425.method2433(arg6, arg7, arg0, var71, var73);
                        }
                    } else {
                        class268 var76 = null;
                        int var78;
                        class641 var79;
                        if (var25) {
                            class268 var77 = new class268(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg7, arg7 - 1 + var14, arg0, var15 - 1 + arg0, arg4, arg9, var24);
                            var78 = var77.method1633(65);
                            var79 = var77;
                            var76 = var77;
                        } else {
                            var79 = new class479(arg3, var13, arg6, arg8, var22, var21, var23, super.field3479, arg7, arg7 + var14 + -1, arg0, arg0 - 1 + var15, arg4, arg9, arg5);
                            var78 = 15;
                        }
                        class641 var80 = class503.method2793(arg6, arg7, arg0, field1376 != null ? field1376 : (field1376 = method720("qi")));
                        boolean var81 = false;
                        if (var80 instanceof class92 && ~var80.field8611 == ~arg7 && var80.field8618 == arg0) {
                            var81 = true;
                            ((class92) var80).field1389 = var79;
                        }
                        if (var81 || class618.method3385(var79, false)) {
                            if (var76 != null && var76.method150((byte) -79)) {
                                var76.method148(arg3, (byte) 70);
                            }
                            if (var13.field837 && class93.field1411) {
                                if (var78 > 30) {
                                    var78 = 30;
                                }
                                for (int var82 = 0; ~var14 <= ~var82; ++var82) {
                                    for (int var83 = 0; ~var15 <= ~var83; ++var83) {
                                        var20.method209(arg7 + var82, arg0 + var83, var78);
                                    }
                                }
                            }
                        }
                        if (var13.field826 != 0 && arg1 != null) {
                            arg1.method3701(var14, !var13.field901, var15, arg7, 112, var13.field867, arg0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILed;IILoa;II)V")
    public final void method712(int arg0, class661 arg1, int arg2, int arg3, class651 arg4, int arg5, int arg6) {
        ++field1368;
        class532 var8 = null;
        if (arg5 == arg6) {
            var8 = (class532) class219.method1390(arg3, arg2, arg0);
        }
        if (~arg5 == -2) {
            var8 = (class532) class74.method581(arg3, arg2, arg0);
        }
        if (~arg5 == -3) {
            var8 = (class532) class503.method2793(arg3, arg2, arg0, field1376 != null ? field1376 : (field1376 = method720("qi")));
        }
        if (arg5 == 3) {
            var8 = (class532) class34.method269(arg3, arg2, arg0);
        }
        if (var8 != null) {
            class58 var9 = class470.field6288.method1258(var8.method146(false), (byte) -85);
            int var10 = var8.method151((byte) 78);
            int var11 = var8.method152(true);
            if (var9.method479(31460)) {
                class283.method1756(arg3, true, arg2, var9, arg0);
            }
            if (var8.method150((byte) -45)) {
                var8.method138(arg4, 2215);
            }
            if (~arg5 == -1) {
                class477 var12 = class219.method1390(arg3, arg2, arg0);
                if (!(var12 instanceof class436)) {
                    class286.method1767(arg3, arg2, arg0);
                } else {
                    ((class436) var12).field5972 = null;
                }
                if (~var9.field826 != -1) {
                    arg1.method3711(var10, !var9.field901, false, var11, var9.field867, arg2, arg0);
                    return;
                }
                return;
            }
            if (~arg5 == -2) {
                class18 var13 = class74.method581(arg3, arg2, arg0);
                if (!(var13 instanceof class562)) {
                    class157.method1097(arg3, arg2, arg0);
                    return;
                }
                ((class562) var13).field7454 = null;
                return;
            }
            if (~arg5 == -3) {
                class641 var14 = class503.method2793(arg3, arg2, arg0, field1376 != null ? field1376 : (field1376 = method720("qi")));
                if (var14 instanceof class92 && var14.field8611 == arg2 && ~var14.field8618 == ~arg0) {
                    ((class92) var14).field1389 = null;
                } else {
                    class692.method3841(arg3, arg2, arg0, field1376 != null ? field1376 : (field1376 = method720("qi")));
                }
                if (~var9.field826 != -1 && var9.field838 + arg2 < super.field3481 && ~super.field3501 < ~(var9.field838 + arg0) && ~(var9.field885 + arg2) > ~super.field3481 && ~(var9.field885 + arg0) > ~super.field3501) {
                    arg1.method3709(var9.field838, arg0, var9.field885, !var9.field901, -55, arg2, var9.field867, var11);
                    return;
                }
                return;
            }
            if (arg5 == 3) {
                class618 var15 = class34.method269(arg3, arg2, arg0);
                if (!(var15 instanceof class13)) {
                    class446.method2517(arg3, arg2, arg0);
                } else {
                    ((class13) var15).field216 = null;
                }
                if (~var9.field826 == -2) {
                    arg1.method3702(false, arg2, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Leh;I[ILoa;BI)V")
    public final void method713(class335 arg0, int arg1, int[] arg2, class651 arg3, byte arg4, int arg5) {
        ++field1372;
        if (!super.field3479) {
            if (arg4 == -15) {
                boolean var7 = false;
                class170 var8 = null;
                if (arg2 != null) {
                    arg2[0] = -1;
                }
                while (true) {
                    int var19;
                    label312: do {
                        while (true) {
                            while (~arg0.field4619 > ~arg0.field4600.length) {
                                int var18 = arg0.method2034(arg4 + 270);
                                if (var18 != 0) {
                                    if (~var18 == -2) {
                                        var19 = arg0.method2034(255);
                                        continue label312;
                                    }
                                    if (~var18 == -3) {
                                        if (var8 == null) {
                                            var8 = new class170();
                                        }
                                        var8.method1159(arg4 + -97, arg0);
                                    } else if (var18 == 128) {
                                        if (arg2 != null) {
                                            arg2[0] = arg0.method2001((byte) -83);
                                            arg2[1] = arg0.method2022(-29089);
                                            arg2[2] = arg0.method2022(-29089);
                                            arg2[3] = arg0.method2022(-29089);
                                            arg2[4] = arg0.method2001((byte) -83);
                                        } else {
                                            arg0.field4619 += 10;
                                        }
                                    } else {
                                        if (var18 != 129) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field3475 == null) {
                                            super.field3475 = new byte[4][][];
                                        }
                                        var7 = true;
                                        for (int var28 = 0; var28 < 4; ++var28) {
                                            byte var29 = arg0.method2040(-128);
                                            if (~var29 == -1 && super.field3475[var28] != null) {
                                                int var30 = arg1;
                                                int var31 = arg1 + 64;
                                                int var32 = arg5;
                                                if (~arg1 <= -1) {
                                                    if (super.field3481 <= arg1) {
                                                        var30 = super.field3481;
                                                    }
                                                } else {
                                                    var30 = 0;
                                                }
                                                if (~var31 > -1) {
                                                    var31 = 0;
                                                } else if (super.field3481 <= var31) {
                                                    var31 = super.field3481;
                                                }
                                                int var33 = arg5 + 64;
                                                if (~arg5 <= -1) {
                                                    if (arg5 >= super.field3501) {
                                                        var32 = super.field3501;
                                                    }
                                                } else {
                                                    var32 = 0;
                                                }
                                                if (var33 >= 0) {
                                                    if (~super.field3501 >= ~var33) {
                                                        var33 = super.field3501;
                                                    }
                                                } else {
                                                    var33 = 0;
                                                }
                                                while (~var30 > ~var31) {
                                                    while (~var33 < ~var32) {
                                                        super.field3475[var28][var30][var32] = 0;
                                                        ++var32;
                                                    }
                                                    ++var30;
                                                }
                                            } else if (var29 != 1) {
                                                if (~var29 == -3) {
                                                    if (super.field3475[var28] == null) {
                                                        super.field3475[var28] = new byte[super.field3481 + 1][super.field3501 + 1];
                                                    }
                                                    if (~var28 < -1) {
                                                        int var34 = arg1;
                                                        int var35 = arg1 + 64;
                                                        int var36 = arg5;
                                                        int var37 = arg5 + 64;
                                                        if (var35 >= 0) {
                                                            if (var35 >= super.field3481) {
                                                                var35 = super.field3481;
                                                            }
                                                        } else {
                                                            var35 = 0;
                                                        }
                                                        if (~arg5 > -1) {
                                                            var36 = 0;
                                                        } else if (~arg5 <= ~super.field3501) {
                                                            var36 = super.field3501;
                                                        }
                                                        if (~arg1 > -1) {
                                                            var34 = 0;
                                                        } else if (~super.field3481 >= ~arg1) {
                                                            var34 = super.field3481;
                                                        }
                                                        if (~var37 > -1) {
                                                            var37 = 0;
                                                        } else if (super.field3501 <= var37) {
                                                            var37 = super.field3501;
                                                        }
                                                        while (var34 < var35) {
                                                            while (var36 < var37) {
                                                                super.field3475[var28][var34][var36] = super.field3475[var28 + -1][var34][var36];
                                                                ++var36;
                                                            }
                                                            ++var34;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (super.field3475[var28] == null) {
                                                    super.field3475[var28] = new byte[super.field3481 + 1][super.field3501 + 1];
                                                }
                                                for (int var38 = 0; var38 < 64; var38 += 4) {
                                                    for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                                        byte var40 = arg0.method2040(arg4 ^ 101);
                                                        for (int var41 = arg1 + var38; ~var41 > ~(arg1 + var38 + 4); ++var41) {
                                                            for (int var42 = arg5 + var39; ~(arg5 + var39 + 4) < ~var42; ++var42) {
                                                                if (~var41 <= -1 && ~super.field3481 < ~var41 && ~var42 <= -1 && ~super.field3501 < ~var42) {
                                                                    super.field3475[var28][var41][var42] = var40;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var8 = new class170(arg0);
                                }
                            }
                            if (var8 != null) {
                                for (int var9 = 0; ~var9 > -9; ++var9) {
                                    for (int var10 = 0; var10 < 8; ++var10) {
                                        int var11 = (arg1 >> 3) - -var9;
                                        int var12 = (arg5 >> 3) + var10;
                                        if (~var11 <= -1 && super.field3481 >> 3 > var11 && ~var12 <= -1 && super.field3501 >> 3 > var12) {
                                            class266.method1627(var12, false, var11, var8);
                                        }
                                    }
                                }
                            }
                            if (!var7 && super.field3475 != null) {
                                for (int var13 = 0; var13 < 4; ++var13) {
                                    if (super.field3475[var13] != null) {
                                        for (int var14 = 0; var14 < 16; ++var14) {
                                            for (int var15 = 0; var15 < 16; ++var15) {
                                                int var16 = (arg1 >> 2) + var14;
                                                int var17 = (arg5 >> 2) + var15;
                                                if (~var16 <= -1 && ~var16 > -27 && var17 >= 0 && var17 < 26) {
                                                    super.field3475[var13][var16][var17] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    } while (~var19 >= -1);
                    for (int var20 = 0; ~var19 < ~var20; ++var20) {
                        class225 var21 = new class225(arg3, arg0, 2);
                        if (var21.field3167 == 31) {
                            class281 var22 = class428.field5877.method2602(arg0.method2001((byte) -83), 31);
                            var21.method1413(var22.field3996, arg4 + -3155, var22.field3993, var22.field3994, var22.field3992);
                        }
                        if (~arg3.method454() < -1) {
                            class65 var23 = var21.field3173;
                            int var24 = (arg1 << 9) + var23.method515((byte) 105);
                            int var25 = var23.method518((byte) 27) - -(arg5 << 9);
                            int var26 = var24 >> 9;
                            int var27 = var25 >> 9;
                            if (var26 >= 0 && ~var27 <= -1 && ~var26 > ~super.field3481 && ~var27 > ~super.field3501) {
                                var23.method524((byte) -116, var25, var24, super.field3489[var21.field3170][var26][var27] - var23.method516(arg4 + -18721));
                                class696.method3852(var21);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "([BIIIII[Led;IIILoa;)V")
    public final void method714(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class661[] arg6, int arg7, int arg8, int arg9, class651 arg10) {
        ++field1365;
        class335 var12 = new class335(arg0);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1995((byte) 126);
            if (var14 == 0) {
                if (arg5 != 7) {
                    field1366 = null;
                    return;
                }
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1997(-129);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2034(255);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg7 == var19 && arg8 <= var18 && ~var18 > ~(arg8 - -8) && ~var17 <= ~arg3 && var17 < arg3 + 8) {
                    class58 var23 = class470.field6288.method1258(var13, (byte) -65);
                    int var24 = arg2 + class6.method115(var17 & 7, var22, (byte) -94, var23.field885, 7 & var18, arg9, var23.field838);
                    int var25 = class465.method2631((byte) -2, 7 & var17, arg9, var23.field838, var18 & 7, var23.field885, var22) + arg1;
                    if (~var24 < -1 && ~var25 < -1 && ~(super.field3481 + -1) < ~var24 && var25 < super.field3501 + -1) {
                        class661 var26 = null;
                        if (!super.field3479) {
                            int var27 = arg4;
                            if ((2 & class477.field6362[1][var24][var25]) == 2) {
                                var27 = arg4 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg6[var27];
                            }
                        }
                        this.method711(var25, var26, (byte) 120, arg10, var21, -1, arg4, var24, arg4, 3 & var22 - -arg9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BLoa;)V")
    public final void method715(byte arg0, class651 arg1) {
        class656.method3593(arg1);
        int var3 = 40 % ((arg0 - 37) / 50);
        ++field1367;
        if (~super.field3490 < -2) {
            for (int var4 = 0; var4 < super.field3481; ++var4) {
                for (int var5 = 0; ~super.field3501 < ~var5; ++var5) {
                    if ((class477.field6362[1][var4][var5] & 2) == 2) {
                        class184.method1219(var4, var5);
                    }
                }
            }
        }
        for (int var6 = 0; super.field3490 > var6; ++var6) {
            for (int var7 = 0; super.field3501 >= var7; ++var7) {
                for (int var8 = 0; ~var8 >= ~super.field3481; ++var8) {
                    if (~(super.field3497[var6][var8][var7] & 1) != -1) {
                        int var9 = var7;
                        int var10 = var7;
                        int var11 = var6;
                        while (~super.field3501 < ~var10 && ~(super.field3497[var6][var8][var10 + 1] & 1) != -1) {
                            ++var10;
                        }
                        int var12 = var6;
                        while (~var9 < -1 && (super.field3497[var6][var8][var9 + -1] & 1) != 0) {
                            --var9;
                        }
                        label167: while (var11 > 0) {
                            for (int var13 = var9; ~var10 <= ~var13; ++var13) {
                                if ((1 & super.field3497[var11 - 1][var8][var13]) == 0) {
                                    break label167;
                                }
                            }
                            --var11;
                        }
                        label156: while (var12 < 3) {
                            for (int var14 = var9; ~var14 >= ~var10; ++var14) {
                                if ((1 & super.field3497[var12 - -1][var8][var14]) == 0) {
                                    break label156;
                                }
                            }
                            ++var12;
                        }
                        int var15 = (-var11 + 1 + var12) * (var10 + 1 + -var9);
                        if (~var15 <= -3) {
                            short var16 = 960;
                            int var17 = super.field3489[var12][var8][var9] + -var16;
                            int var18 = super.field3489[var11][var8][var9];
                            class351.method2093(1, var8 << 9, var8 << 9, var9 << 9, (var10 << 9) + 512, var17, var18);
                            for (int var19 = var11; var19 <= var12; ++var19) {
                                for (int var20 = var9; ~var20 >= ~var10; ++var20) {
                                    super.field3497[var19][var8][var20] = (byte) class571.method3139(super.field3497[var19][var8][var20], -2);
                                }
                            }
                        }
                    }
                    if ((2 & super.field3497[var6][var8][var7]) != 0) {
                        int var21 = var8;
                        int var22 = var8;
                        int var23 = var6;
                        while (~var22 > ~super.field3481 && (2 & super.field3497[var6][var22 + 1][var7]) != 0) {
                            ++var22;
                        }
                        while (var21 > 0 && (super.field3497[var6][var21 - 1][var7] & 2) != 0) {
                            --var21;
                        }
                        int var24 = var6;
                        label221: while (var23 > 0) {
                            for (int var25 = var21; var22 >= var25; ++var25) {
                                if ((2 & super.field3497[var23 - 1][var25][var7]) == 0) {
                                    break label221;
                                }
                            }
                            --var23;
                        }
                        label210: while (var24 < 3) {
                            for (int var26 = var21; var22 >= var26; ++var26) {
                                if (~(super.field3497[var24 + 1][var26][var7] & 2) == -1) {
                                    break label210;
                                }
                            }
                            ++var24;
                        }
                        int var27 = (var24 + 1 - var23) * (var22 - var21 + 1);
                        if (~var27 <= -3) {
                            short var28 = 960;
                            int var29 = super.field3489[var24][var21][var7] + -var28;
                            int var30 = super.field3489[var23][var21][var7];
                            class351.method2093(2, var21 << 9, (var22 << 9) - -512, var7 << 9, var7 << 9, var29, var30);
                            for (int var31 = var23; ~var24 <= ~var31; ++var31) {
                                for (int var32 = var21; var32 <= var22; ++var32) {
                                    super.field3497[var31][var32][var7] = (byte) class571.method3139(super.field3497[var31][var32][var7], -3);
                                }
                            }
                        }
                    }
                    if ((super.field3497[var6][var8][var7] & 4) != 0) {
                        int var33 = var8;
                        int var34 = var8;
                        int var35 = var7;
                        int var36 = var7;
                        while (var35 > 0 && ~(4 & super.field3497[var6][var8][var35 - 1]) != -1) {
                            --var35;
                        }
                        while (~super.field3501 < ~var36 && ~(super.field3497[var6][var8][var36 - -1] & 4) != -1) {
                            ++var36;
                        }
                        label275: while (~var33 < -1) {
                            for (int var37 = var35; ~var37 >= ~var36; ++var37) {
                                if ((super.field3497[var6][var33 + -1][var37] & 4) == 0) {
                                    break label275;
                                }
                            }
                            --var33;
                        }
                        label264: while (var34 < super.field3481) {
                            for (int var38 = var35; ~var38 >= ~var36; ++var38) {
                                if ((4 & super.field3497[var6][var34 + 1][var38]) == 0) {
                                    break label264;
                                }
                            }
                            ++var34;
                        }
                        if ((var36 - (var35 - 1)) * (-var33 + var34 + 1) >= 4) {
                            int var39 = super.field3489[var6][var33][var35];
                            class351.method2093(4, var33 << 9, (var34 << 9) + 512, var35 << 9, (var36 << 9) - -512, var39, var39);
                            for (int var40 = var33; var34 >= var40; ++var40) {
                                for (int var41 = var35; var36 >= var41; ++var41) {
                                    super.field3497[var6][var40][var41] = (byte) class571.method3139(super.field3497[var6][var40][var41], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field3497 = null;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(IIIIII)Z")
    public static final boolean method716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class572.method3142(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << class348.field4782;
                int var7 = arg3 << class348.field4782;
                return class312.method1861(var6 + 1, class218.field3099[arg0].method195(arg1, arg3) + arg5, var7 + 1) && class312.method1861(class587.field7787 + var6 - 1, class218.field3099[arg0].method195(arg1 + 1, arg3) + arg5, var7 + 1) && class312.method1861(class587.field7787 + var6 - 1, class218.field3099[arg0].method195(arg1 + 1, arg3 + 1) + arg5, class587.field7787 + var7 - 1) && class312.method1861(var6 + 1, class218.field3099[arg0].method195(arg1, arg3 + 1) + arg5, class587.field7787 + var7 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class137.field2226[arg0][var8][var14] == -class109.field1593) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class348.field4782) + 1;
            int var10 = (arg3 << class348.field4782) + 2;
            int var11 = class218.field3099[arg0].method195(arg1, arg3) + arg5;
            if (!class312.method1861(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << class348.field4782) - 1;
                if (!class312.method1861(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << class348.field4782) - 1;
                    if (!class312.method1861(var9, var11, var13)) {
                        return false;
                    } else if (!class312.method1861(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
    public static void method717(byte arg0) {
        if (arg0 != 100) {
            field1375 = 64;
        }
        field1366 = null;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "([B[Led;Loa;III)V")
    public final void method718(byte[] arg0, class661[] arg1, class651 arg2, int arg3, int arg4, int arg5) {
        ++field1373;
        class335 var7 = new class335(arg0);
        if (arg3 != 1) {
            this.field1371 = -1;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method1995((byte) 121);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1997(-129);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 63;
                int var13 = (4067 & var10) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method2034(255);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg4 + var13;
                int var19 = arg5 + var12;
                if (var18 > 0 && var19 > 0 && ~var18 > ~(super.field3481 + -1) && super.field3501 + -1 > var19) {
                    class661 var20 = null;
                    if (!super.field3479) {
                        int var21 = var14;
                        if ((class477.field6362[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg1[var21];
                        }
                    }
                    this.method711(var19, var20, (byte) -126, arg2, var16, -1, var14, var18, var14, var17, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(IIIZ)V")
    public class90(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class98.field1479, class139.field2246);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILoa;IIIILeh;B[III)V")
    public final void method719(int arg0, class651 arg1, int arg2, int arg3, int arg4, int arg5, class335 arg6, byte arg7, int[] arg8, int arg9, int arg10) {
        ++field1370;
        if (arg7 == -93) {
            if (!super.field3479) {
                boolean var12 = false;
                if (arg8 != null) {
                    arg8[0] = -1;
                }
                class170 var13 = null;
                int var14 = (arg2 & 7) * 8;
                int var15 = (arg4 & 7) * 8;
                while (true) {
                    while (~arg6.field4619 > ~arg6.field4600.length) {
                        int var20 = arg6.method2034(255);
                        if (~var20 == -1) {
                            var13 = new class170(arg6);
                        } else if (var20 == 1) {
                            int var21 = arg6.method2034(255);
                            if (~var21 < -1) {
                                for (int var22 = 0; var21 > var22; ++var22) {
                                    class225 var23 = new class225(arg1, arg6, 2);
                                    if (var23.field3167 == 31) {
                                        class281 var24 = class428.field5877.method2602(arg6.method2001((byte) -83), 31);
                                        var23.method1413(var24.field3996, arg7 ^ 3133, var24.field3993, var24.field3994, var24.field3992);
                                    }
                                    if (arg1.method454() > 0) {
                                        class65 var25 = var23.field3173;
                                        int var26 = var25.method515((byte) 125) >> 9;
                                        int var27 = var25.method518((byte) 120) >> 9;
                                        if (var23.field3170 == arg10 && ~var14 >= ~var26 && var14 + 8 > var26 && var15 <= var27 && ~(var15 + 8) < ~var27) {
                                            int var28 = (arg9 << 9) - -class8.method120(arg5, true, 4095 & var25.method518((byte) 126), var25.method515((byte) 106) & 4095);
                                            int var29 = var28 >> 9;
                                            int var30 = (arg3 << 9) - -class491.method2744((byte) -116, 4095 & var25.method518((byte) -108), arg5, var25.method515((byte) 120) & 4095);
                                            int var31 = var30 >> 9;
                                            if (~var29 <= -1 && var31 >= 0 && ~var29 > ~super.field3481 && ~var31 > ~super.field3501) {
                                                var25.method524((byte) -116, var30, var28, super.field3489[arg10][var29][var31] + -var25.method516(-18736));
                                                class696.method3852(var23);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (var20 == 2) {
                            if (var13 == null) {
                                var13 = new class170();
                            }
                            var13.method1159(-108, arg6);
                        } else if (var20 == 128) {
                            if (arg8 == null) {
                                arg6.field4619 += 10;
                            } else {
                                arg8[0] = arg6.method2001((byte) -83);
                                arg8[1] = arg6.method2022(-29089);
                                arg8[2] = arg6.method2022(-29089);
                                arg8[3] = arg6.method2022(-29089);
                                arg8[4] = arg6.method2001((byte) -83);
                            }
                        } else {
                            if (var20 != 129) {
                                throw new IllegalStateException("");
                            }
                            if (super.field3475 == null) {
                                super.field3475 = new byte[4][][];
                            }
                            for (int var32 = 0; ~var32 > -5; ++var32) {
                                byte var33 = arg6.method2040(-47);
                                if (~var33 == -1 && super.field3475[arg0] != null) {
                                    if (~arg10 <= ~var32) {
                                        int var34 = arg9;
                                        int var35 = arg9 + 7;
                                        int var36 = arg3;
                                        if (~var35 > -1) {
                                            var35 = 0;
                                        } else if (~super.field3481 >= ~var35) {
                                            var35 = super.field3481;
                                        }
                                        if (arg3 >= 0) {
                                            if (arg3 >= super.field3501) {
                                                var36 = super.field3501;
                                            }
                                        } else {
                                            var36 = 0;
                                        }
                                        if (~arg9 > -1) {
                                            var34 = 0;
                                        } else if (arg9 >= super.field3481) {
                                            var34 = super.field3481;
                                        }
                                        int var37 = arg3 + 7;
                                        if (var37 < 0) {
                                            var37 = 0;
                                        } else if (super.field3501 <= var37) {
                                            var37 = super.field3501;
                                        }
                                        while (var34 < var35) {
                                            while (~var37 < ~var36) {
                                                super.field3475[arg0][var34][var36] = 0;
                                                ++var36;
                                            }
                                            ++var34;
                                        }
                                    }
                                } else if (~var33 == -2) {
                                    if (super.field3475[arg0] == null) {
                                        super.field3475[arg0] = new byte[super.field3481 + 1][super.field3501 + 1];
                                    }
                                    for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                        for (int var39 = 0; ~var39 > -65; var39 += 4) {
                                            byte var40 = arg6.method2040(arg7 ^ 12);
                                            if (~arg10 <= ~var32) {
                                                for (int var41 = var38; ~(var38 + 4) < ~var41; ++var41) {
                                                    for (int var42 = var39; ~(var39 + 4) < ~var42; ++var42) {
                                                        if (~var41 <= ~var14 && ~var41 > ~(var14 + 8) && var42 >= var15 && ~var15 > ~(var15 + 8)) {
                                                            int var43 = class393.method2258(var41 & 7, arg5, var42 & 7, (byte) 57) + arg9;
                                                            int var44 = arg3 + class529.method2953(7 & var42, arg5, (byte) -40, var41 & 7);
                                                            if (var43 >= 0 && ~super.field3481 < ~var43 && var44 >= 0 && var44 < super.field3501) {
                                                                super.field3475[arg0][var43][var44] = var40;
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
                        class266.method1627(arg3 >> 3, false, arg9 >> 3, var13);
                    }
                    if (!var12 && super.field3475 != null && super.field3475[arg0] != null) {
                        int var16 = arg9 - -7;
                        int var17 = arg3 - -7;
                        for (int var18 = arg9; ~var16 < ~var18; ++var18) {
                            for (int var19 = arg3; var17 > var19; ++var19) {
                                super.field3475[arg0][var18][var19] = 0;
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
    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method720(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
