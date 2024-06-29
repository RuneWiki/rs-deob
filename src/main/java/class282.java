import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class282 extends class284 {

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public int field4270 = 99;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "Loe;")
    public static class127 field4264 = new class127(62, -2);

    @OriginalMember(owner = "client!q", name = "T", descriptor = "Lbg;")
    public static class310 field4275 = new class310(42, 4);

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field4276 = 1400;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    public static int field4278;

    // $FF: synthetic field
    @OriginalMember(owner = "client!q", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field4279;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILea;ILqq;IZIII)V")
    public final void method1714(int arg0, int arg1, int arg2, class367 arg3, int arg4, class318 arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        ++field4272;
        if (class463.field7116.method75(-1, class30.field395) || class29.method153(arg1, arg9, arg2, (byte) -118, class455.field6976)) {
            if (~this.field4270 < ~arg6) {
                this.field4270 = arg6;
            }
            class56 var12 = class128.field2070.method916((byte) -15, arg4);
            if (~class30.field395 != -2 || !var12.field891) {
                int var13;
                int var14;
                if (~arg10 != -2 && ~arg10 != -4) {
                    var13 = var12.field915;
                    var14 = var12.field967;
                } else {
                    var13 = var12.field967;
                    var14 = var12.field915;
                }
                int var15;
                int var16;
                if (super.field4291 >= arg1 + var13) {
                    var15 = (var13 + 1 >> 1) + arg1;
                    var16 = arg1 - -(var13 >> 1);
                } else {
                    var16 = arg1;
                    var15 = arg1 + 1;
                }
                int var17;
                int var18;
                if (super.field4293 < arg9 + var14) {
                    var17 = arg9;
                    var18 = arg9 + 1;
                } else {
                    var17 = (var14 >> 1) + arg9;
                    var18 = arg9 - -(var14 - -1 >> 1);
                }
                class343 var19 = class99.field1801[arg2];
                int var20 = var19.method318(var16, var17) + (var19.method318(var15, var17) - -var19.method318(var16, var18)) - -var19.method318(var15, var18) >> 2;
                if (arg7) {
                    this.method1716(-118, 88, -88, (class318) null, -108, 27, (byte[]) null, 49, -24, 75, (class367[]) null);
                }
                int var21 = (arg1 << 7) - -(var13 << 6);
                int var22 = (arg9 << 7) + (var14 << 6);
                boolean var23 = class187.field2965 && !super.field4301 && var12.field929;
                if (var12.method403(1884)) {
                    class72.method538((class47) null, arg1, (class249) null, arg10, arg6, arg9, true, var12);
                }
                boolean var24 = arg8 == -1 && var12.field887 == -1 && var12.field944 == null && var12.field892 == null && !var12.field883;
                if (!class376.field5482 || (!class108.method786(arg0, 77) || var12.field947 == 1) && (!class421.method2463(arg0, false) || var12.field947 != 0)) {
                    if (arg0 == 22) {
                        if (class463.field7116.field2944 || var12.field895 != 0 || ~var12.field885 == -2 || var12.field923) {
                            class376 var25;
                            if (!var24) {
                                var25 = new class221(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg10, arg8);
                            } else {
                                class164 var26 = new class164(arg5, var12, arg2, var21, var20, var22, super.field4301, arg10, var23);
                                var25 = var26;
                                if (var26.method161(15275)) {
                                    var26.method171(arg5, 1577);
                                }
                            }
                            class376 var27 = class368.method2232(arg6, arg1, arg9);
                            if (!(var27 instanceof class31)) {
                                class167.method1054(arg6, arg1, arg9, var25);
                            } else {
                                ((class31) var27).field413 = var25;
                            }
                            if (~var12.field885 == -2 && arg3 != null) {
                                arg3.method2220(1, arg9, arg1);
                            }
                        }
                    } else if (~arg0 != -11 && arg0 != 11) {
                        if (arg0 >= 12 && arg0 <= 17 || ~arg0 <= -19 && ~arg0 >= -22) {
                            class205 var28;
                            if (!var24) {
                                var28 = new class302(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg1, var13 + -1 + arg1, arg9, arg9 + -1 - -var14, arg0, arg10, arg8);
                            } else {
                                class75 var29 = new class75(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg1, arg1 + var13 + -1, arg9, arg9 + var14 + -1, arg0, arg10, var23);
                                var28 = var29;
                                if (var29.method161(15275)) {
                                    var29.method171(arg5, 1577);
                                }
                            }
                            class205 var30 = class86.method607(arg6, arg1, arg9, field4279 != null ? field4279 : (field4279 = method1723("tf")));
                            if (var30 instanceof class290 && var30.field3225 == arg1 && var30.field3219 == arg9) {
                                ((class290) var30).field4385 = var28;
                            } else {
                                class408.method2418(var28, false);
                            }
                            if (class187.field2965 && !super.field4301 && ~arg0 <= -13 && arg0 <= 17 && ~arg0 != -14 && ~arg6 < -1 && ~var12.field947 != -1) {
                                super.field4308[arg6][arg1][arg9] = (byte) class318.method1973(super.field4308[arg6][arg1][arg9], 4);
                            }
                            if (~var12.field885 != -1 && arg3 != null) {
                                arg3.method2218(var12.field928, var14, arg9, !var12.field966, var13, arg1, 264273471);
                            }
                        } else if (~arg0 == -1) {
                            int var31 = var12.field947;
                            if (class214.field3311 && var12.field947 == -1) {
                                var31 = 1;
                            }
                            class455 var33;
                            if (var24) {
                                class98 var32 = new class98(arg5, var12, arg2, var21, var20, var22, super.field4301, arg0, arg10, var23);
                                if (var32.method161(15275)) {
                                    var32.method171(arg5, 1577);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class143(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg0, arg10, arg8);
                            }
                            class455 var34 = class307.method1842(arg6, arg1, arg9);
                            if (var34 instanceof class220) {
                                ((class220) var34).field3378 = var33;
                            } else {
                                class398.method2362(arg6, arg1, arg9, var33, (class455) null);
                            }
                            if (class187.field2965) {
                                if (arg10 == 0) {
                                    if (var12.field932) {
                                        var19.method300(arg1, arg9, 50);
                                        var19.method300(arg1, arg9 - -1, 50);
                                    }
                                    if (var31 == 1 && !super.field4301) {
                                        super.field4308[arg6][arg1][arg9] = (byte) class318.method1973(super.field4308[arg6][arg1][arg9], 1);
                                    }
                                } else if (~arg10 != -2) {
                                    if (arg10 == 2) {
                                        if (var12.field932) {
                                            var19.method300(arg1 + 1, arg9, 50);
                                            var19.method300(arg1 - -1, arg9 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field4301) {
                                            super.field4308[arg6][arg1 + 1][arg9] = (byte) class318.method1973(super.field4308[arg6][arg1 + 1][arg9], 1);
                                        }
                                    } else if (arg10 == 3) {
                                        if (var12.field932) {
                                            var19.method300(arg1, arg9, 50);
                                            var19.method300(arg1 - -1, arg9, 50);
                                        }
                                        if (var31 == 1 && !super.field4301) {
                                            super.field4308[arg6][arg1][arg9] = (byte) class318.method1973(super.field4308[arg6][arg1][arg9], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field932) {
                                        var19.method300(arg1, arg9 + 1, 50);
                                        var19.method300(arg1 + 1, arg9 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field4301) {
                                        super.field4308[arg6][arg1][arg9 + 1] = (byte) class318.method1973(super.field4308[arg6][arg1][arg9 + 1], 2);
                                    }
                                }
                            }
                            if (~var12.field885 != -1 && arg3 != null) {
                                arg3.method2228(arg9, arg0, (byte) 116, !var12.field966, var12.field928, arg10, arg1);
                            }
                            if (~var12.field925 != -17) {
                                class147.method966(arg6, arg1, arg9, var12.field925);
                            }
                        } else if (arg0 == 1) {
                            class455 var36;
                            if (var24) {
                                class98 var35 = new class98(arg5, var12, arg2, var21, var20, var22, super.field4301, arg0, arg10, var23);
                                if (var35.method161(15275)) {
                                    var35.method171(arg5, 1577);
                                }
                                var36 = var35;
                            } else {
                                var36 = new class143(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg0, arg10, arg8);
                            }
                            class455 var37 = class307.method1842(arg6, arg1, arg9);
                            if (!(var37 instanceof class220)) {
                                class398.method2362(arg6, arg1, arg9, var36, (class455) null);
                            } else {
                                ((class220) var37).field3378 = var36;
                            }
                            if (var12.field932 && class187.field2965) {
                                if (arg10 == 0) {
                                    var19.method300(arg1, arg9 + 1, 50);
                                } else if (~arg10 != -2) {
                                    if (~arg10 == -3) {
                                        var19.method300(arg1 + 1, arg9, 50);
                                    } else if (~arg10 == -4) {
                                        var19.method300(arg1, arg9, 50);
                                    }
                                } else {
                                    var19.method300(arg1 + 1, arg9 + 1, 50);
                                }
                            }
                            if (var12.field885 != 0 && arg3 != null) {
                                arg3.method2228(arg9, arg0, (byte) 119, !var12.field966, var12.field928, arg10, arg1);
                            }
                        } else if (~arg0 == -3) {
                            int var38 = arg10 + 1 & 3;
                            class455 var39;
                            class455 var40;
                            if (!var24) {
                                var39 = new class143(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg0, arg10 + 4, arg8);
                                var40 = new class143(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg0, var38, arg8);
                            } else {
                                class98 var41 = new class98(arg5, var12, arg2, var21, var20, var22, super.field4301, arg0, arg10 + 4, var23);
                                class98 var42 = new class98(arg5, var12, arg2, var21, var20, var22, super.field4301, arg0, var38, var23);
                                if (var41.method161(15275)) {
                                    var41.method171(arg5, 1577);
                                }
                                var40 = var42;
                                if (var42.method161(15275)) {
                                    var42.method171(arg5, 1577);
                                }
                                var39 = var41;
                            }
                            class398.method2362(arg6, arg1, arg9, var39, var40);
                            if (var12.field947 == 1 && class187.field2965 && !super.field4301) {
                                if (arg10 != 0) {
                                    if (~arg10 == -2) {
                                        super.field4308[arg6][arg1][arg9 - -1] = (byte) class318.method1973(super.field4308[arg6][arg1][arg9 - -1], 2);
                                        super.field4308[arg6][arg1 - -1][arg9] = (byte) class318.method1973(super.field4308[arg6][arg1 - -1][arg9], 1);
                                    } else if (arg10 == 2) {
                                        super.field4308[arg6][arg1 - -1][arg9] = (byte) class318.method1973(super.field4308[arg6][arg1 - -1][arg9], 1);
                                        super.field4308[arg6][arg1][arg9] = (byte) class318.method1973(super.field4308[arg6][arg1][arg9], 2);
                                    } else if (arg10 == 3) {
                                        super.field4308[arg6][arg1][arg9] = (byte) class318.method1973(super.field4308[arg6][arg1][arg9], 2);
                                        super.field4308[arg6][arg1][arg9] = (byte) class318.method1973(super.field4308[arg6][arg1][arg9], 1);
                                    }
                                } else {
                                    super.field4308[arg6][arg1][arg9] = (byte) class318.method1973(super.field4308[arg6][arg1][arg9], 1);
                                    super.field4308[arg6][arg1][arg9 - -1] = (byte) class318.method1973(super.field4308[arg6][arg1][arg9 - -1], 2);
                                }
                            }
                            if (~var12.field885 != -1 && arg3 != null) {
                                arg3.method2228(arg9, arg0, (byte) 117, !var12.field966, var12.field928, arg10, arg1);
                            }
                            if (var12.field925 != 16) {
                                class147.method966(arg6, arg1, arg9, var12.field925);
                            }
                        } else if (~arg0 == -4) {
                            class455 var44;
                            if (var24) {
                                class98 var43 = new class98(arg5, var12, arg2, var21, var20, var22, super.field4301, arg0, arg10, var23);
                                var44 = var43;
                                if (var43.method161(15275)) {
                                    var43.method171(arg5, 1577);
                                }
                            } else {
                                var44 = new class143(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg0, arg10, arg8);
                            }
                            class455 var45 = class307.method1842(arg6, arg1, arg9);
                            if (var45 instanceof class220) {
                                ((class220) var45).field3378 = var44;
                            } else {
                                class398.method2362(arg6, arg1, arg9, var44, (class455) null);
                            }
                            if (var12.field932 && class187.field2965) {
                                if (arg10 == 0) {
                                    var19.method300(arg1, arg9 - -1, 50);
                                } else if (~arg10 == -2) {
                                    var19.method300(arg1 + 1, arg9 + 1, 50);
                                } else if (arg10 != 2) {
                                    if (~arg10 == -4) {
                                        var19.method300(arg1, arg9, 50);
                                    }
                                } else {
                                    var19.method300(arg1 + 1, arg9, 50);
                                }
                            }
                            if (var12.field885 != 0 && arg3 != null) {
                                arg3.method2228(arg9, arg0, (byte) 126, !var12.field966, var12.field928, arg10, arg1);
                            }
                        } else if (arg0 == 9) {
                            class205 var47;
                            if (var24) {
                                class75 var46 = new class75(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg1, arg1, arg9, arg9, arg0, arg10, var23);
                                if (var46.method161(15275)) {
                                    var46.method171(arg5, 1577);
                                }
                                var47 = var46;
                            } else {
                                var47 = new class302(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg1, arg1 + var13 - 1, arg9, arg9 - 1 + var14, arg0, arg10, arg8);
                            }
                            class205 var48 = class86.method607(arg6, arg1, arg9, field4279 != null ? field4279 : (field4279 = method1723("tf")));
                            if (var48 instanceof class290 && var48.field3225 == arg1 && var48.field3219 == arg9) {
                                ((class290) var48).field4385 = var47;
                            } else {
                                class408.method2418(var47, false);
                            }
                            if (var12.field885 != 0 && arg3 != null) {
                                arg3.method2218(var12.field928, var14, arg9, !var12.field966, var13, arg1, 264273471);
                            }
                            if (var12.field925 != 16) {
                                class147.method966(arg6, arg1, arg9, var12.field925);
                            }
                        } else if (~arg0 == -5) {
                            class431 var49;
                            if (!var24) {
                                var49 = new class435(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, 0, 0, 0, arg0, arg10, arg8);
                            } else {
                                class200 var50 = new class200(arg5, var12, arg2, var21, var20, var22, super.field4301, 0, 0, 0, arg0, arg10);
                                var49 = var50;
                                if (var50.method161(15275)) {
                                    var50.method171(arg5, 1577);
                                }
                            }
                            class431 var51 = class98.method741(arg6, arg1, arg9);
                            if (var51 instanceof class175) {
                                ((class175) var51).field2745 = var49;
                            } else {
                                class135.method901(arg6, arg1, arg9, var49, (class431) null);
                            }
                        } else if (~arg0 == -6) {
                            int var52 = 17;
                            class185 var53 = (class185) class307.method1842(arg6, arg1, arg9);
                            if (var53 != null) {
                                var52 = 1 + class128.field2070.method916((byte) -15, var53.method174((byte) 123)).field925;
                            }
                            class431 var55;
                            if (var24) {
                                class200 var54 = new class200(arg5, var12, arg2, var21, var20, var22, super.field4301, 0, class324.field4859[arg10] * var52, class52.field798[arg10] * var52, arg0, arg10);
                                var55 = var54;
                                if (var54.method161(15275)) {
                                    var54.method171(arg5, 1577);
                                }
                            } else {
                                var55 = new class435(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, 0, class324.field4859[arg10] * var52, class52.field798[arg10] * var52, arg0, arg10, arg8);
                            }
                            class431 var56 = class98.method741(arg6, arg1, arg9);
                            if (var56 instanceof class175) {
                                ((class175) var56).field2745 = var55;
                            } else {
                                class135.method901(arg6, arg1, arg9, var55, (class431) null);
                            }
                        } else if (arg0 == 6) {
                            int var57 = 9;
                            class185 var58 = (class185) class307.method1842(arg6, arg1, arg9);
                            if (var58 != null) {
                                var57 = 1 + class128.field2070.method916((byte) -15, var58.method174((byte) 120)).field925 / 2;
                            }
                            class431 var59;
                            if (!var24) {
                                var59 = new class435(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg10, class266.field4033[arg10] * var57, class174.field2719[arg10] * var57, arg0, arg10 + 4, arg8);
                            } else {
                                class200 var60 = new class200(arg5, var12, arg2, var21, var20, var22, super.field4301, arg10, class324.field4859[arg10] * var57, class52.field798[arg10] * var57, arg0, arg10 + 4);
                                var59 = var60;
                                if (var60.method161(15275)) {
                                    var60.method171(arg5, 1577);
                                }
                            }
                            class431 var61 = class98.method741(arg6, arg1, arg9);
                            if (!(var61 instanceof class175)) {
                                class135.method901(arg6, arg1, arg9, var59, (class431) null);
                            } else {
                                ((class175) var61).field2745 = var59;
                            }
                        } else if (arg0 == 7) {
                            int var62 = 3 & arg10 + 2;
                            class431 var64;
                            if (var24) {
                                class200 var63 = new class200(arg5, var12, arg2, var21, var20, var22, super.field4301, var62, 0, 0, arg0, var62 - -4);
                                var64 = var63;
                                if (var63.method161(15275)) {
                                    var63.method171(arg5, 1577);
                                }
                            } else {
                                var64 = new class435(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, var62, 0, 0, arg0, var62 + 4, arg8);
                            }
                            class431 var65 = class98.method741(arg6, arg1, arg9);
                            if (var65 instanceof class175) {
                                ((class175) var65).field2745 = var64;
                            } else {
                                class135.method901(arg6, arg1, arg9, var64, (class431) null);
                            }
                        } else if (arg0 == 8) {
                            int var66 = 3 & arg10 + 2;
                            int var67 = 9;
                            class185 var68 = (class185) class307.method1842(arg6, arg1, arg9);
                            if (var68 != null) {
                                var67 = class128.field2070.method916((byte) -15, var68.method174((byte) 117)).field925 / 2 - -1;
                            }
                            class431 var71;
                            class431 var72;
                            if (!var24) {
                                class435 var69 = new class435(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg10, class266.field4033[arg10] * var67, class174.field2719[arg10] * var67, arg0, arg10 + 4, arg8);
                                class435 var70 = new class435(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg10, 0, 0, arg0, var66 + 4, arg8);
                                var71 = var69;
                                var72 = var70;
                            } else {
                                class200 var73 = new class200(arg5, var12, arg2, var21, var20, var22, super.field4301, arg10, class266.field4033[arg10] * var67, class174.field2719[arg10] * var67, arg0, arg10 + 4);
                                class200 var74 = new class200(arg5, var12, arg2, var21, var20, var22, super.field4301, arg10, 0, 0, arg0, var66 + 4);
                                if (var73.method161(15275)) {
                                    var73.method171(arg5, 1577);
                                }
                                if (var74.method161(15275)) {
                                    var74.method171(arg5, 1577);
                                }
                                var72 = var74;
                                var71 = var73;
                            }
                            class135.method901(arg6, arg1, arg9, var71, var72);
                        }
                    } else {
                        class75 var75 = null;
                        int var76;
                        class205 var77;
                        if (!var24) {
                            var76 = 15;
                            var77 = new class302(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg1, arg1 + var13 + -1, arg9, var14 + -1 + arg9, arg0, arg10, arg8);
                        } else {
                            class75 var78 = new class75(arg5, var12, arg6, arg2, var21, var20, var22, super.field4301, arg1, arg1 - -var13 + -1, arg9, arg9 + var14 - 1, arg0, arg10, var23);
                            var75 = var78;
                            var77 = var78;
                            var76 = var78.method558(14583);
                        }
                        class205 var79 = class86.method607(arg6, arg1, arg9, field4279 != null ? field4279 : (field4279 = method1723("tf")));
                        boolean var80 = false;
                        if (var79 instanceof class290 && var79.field3225 == arg1 && var79.field3219 == arg9) {
                            ((class290) var79).field4385 = var77;
                            var80 = true;
                        }
                        if (var80 || class408.method2418(var77, false)) {
                            if (var75 != null && var75.method161(15275)) {
                                var75.method171(arg5, 1577);
                            }
                            if (var12.field932 && class187.field2965) {
                                if (var76 > 30) {
                                    var76 = 30;
                                }
                                for (int var81 = 0; var13 >= var81; ++var81) {
                                    for (int var82 = 0; ~var82 >= ~var14; ++var82) {
                                        var19.method300(arg1 - -var81, arg9 - -var82, var76);
                                    }
                                }
                            }
                        }
                        if (~var12.field885 != -1 && arg3 != null) {
                            arg3.method2218(var12.field928, var14, arg9, !var12.field966, var13, arg1, 264273471);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIZ)V")
    public class282(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class399.field5816, class359.field5323);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lqq;I)V")
    public final void method1715(class318 arg0, int arg1) {
        if (arg1 == 7115) {
            class508.method3037(arg0);
            ++field4269;
            if (super.field4299 > 1) {
                for (int var3 = 0; var3 < super.field4291; ++var3) {
                    for (int var4 = 0; var4 < super.field4293; ++var4) {
                        if (~(2 & class146.field2369[1][var3][var4]) == -3) {
                            class138.method926(var3, var4);
                        }
                    }
                }
            }
            for (int var5 = 0; ~super.field4299 < ~var5; ++var5) {
                for (int var6 = 0; var6 <= super.field4293; ++var6) {
                    for (int var7 = 0; ~super.field4291 <= ~var7; ++var7) {
                        if (~(super.field4308[var5][var7][var6] & 1) != -1) {
                            int var8 = var6;
                            int var9 = var6;
                            int var10 = var5;
                            int var11 = var5;
                            while (~var8 < -1 && (super.field4308[var5][var7][var8 + -1] & 1) != 0) {
                                --var8;
                            }
                            while (super.field4293 > var9 && (1 & super.field4308[var5][var7][var9 + 1]) != 0) {
                                ++var9;
                            }
                            label170: while (~var10 < -1) {
                                for (int var12 = var8; ~var9 <= ~var12; ++var12) {
                                    if ((super.field4308[var10 + -1][var7][var12] & 1) == 0) {
                                        break label170;
                                    }
                                }
                                --var10;
                            }
                            label159: while (~var11 > -4) {
                                for (int var13 = var8; var13 <= var9; ++var13) {
                                    if ((super.field4308[var11 + 1][var7][var13] & 1) == 0) {
                                        break label159;
                                    }
                                }
                                ++var11;
                            }
                            int var14 = (-var8 + var9 - -1) * (var11 - var10 + 1);
                            if (var14 >= 2) {
                                short var15 = 240;
                                int var16 = super.field4286[var11][var7][var8] - var15;
                                int var17 = super.field4286[var10][var7][var8];
                                class399.method2371(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                                for (int var18 = var10; var11 >= var18; ++var18) {
                                    for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                        super.field4308[var18][var7][var19] = (byte) class330.method2050(super.field4308[var18][var7][var19], -2);
                                    }
                                }
                            }
                        }
                        if ((super.field4308[var5][var7][var6] & 2) != 0) {
                            int var20 = var7;
                            int var21 = var7;
                            int var22 = var5;
                            while (~var21 > ~super.field4291 && ~(2 & super.field4308[var5][var21 + 1][var6]) != -1) {
                                ++var21;
                            }
                            int var23 = var5;
                            while (~var20 < -1 && (super.field4308[var5][var20 + -1][var6] & 2) != 0) {
                                --var20;
                            }
                            label223: while (~var22 < -1) {
                                for (int var24 = var20; ~var21 <= ~var24; ++var24) {
                                    if (~(super.field4308[var22 + -1][var24][var6] & 2) == -1) {
                                        break label223;
                                    }
                                }
                                --var22;
                            }
                            label212: while (~var23 > -4) {
                                for (int var25 = var20; var21 >= var25; ++var25) {
                                    if ((super.field4308[var23 + 1][var25][var6] & 2) == 0) {
                                        break label212;
                                    }
                                }
                                ++var23;
                            }
                            int var26 = (-var20 + var21 - -1) * (var23 - var22 + 1);
                            if (var26 >= 2) {
                                short var27 = 240;
                                int var28 = super.field4286[var23][var20][var6] - var27;
                                int var29 = super.field4286[var22][var20][var6];
                                class399.method2371(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                                for (int var30 = var22; ~var23 <= ~var30; ++var30) {
                                    for (int var31 = var20; ~var21 <= ~var31; ++var31) {
                                        super.field4308[var30][var31][var6] = (byte) class330.method2050(super.field4308[var30][var31][var6], -3);
                                    }
                                }
                            }
                        }
                        if (~(4 & super.field4308[var5][var7][var6]) != -1) {
                            int var32 = var7;
                            int var33 = var7;
                            int var34;
                            for (var34 = var6; var34 > 0 && ~(super.field4308[var5][var7][var34 - 1] & 4) != -1; --var34) {
                            }
                            int var35;
                            for (var35 = var6; var35 < super.field4293 && ~(4 & super.field4308[var5][var7][var35 - -1]) != -1; ++var35) {
                            }
                            label277: while (~var32 < -1) {
                                for (int var36 = var34; var35 >= var36; ++var36) {
                                    if ((super.field4308[var5][var32 + -1][var36] & 4) == 0) {
                                        break label277;
                                    }
                                }
                                --var32;
                            }
                            label266: while (~super.field4291 < ~var33) {
                                for (int var37 = var34; ~var35 <= ~var37; ++var37) {
                                    if ((4 & super.field4308[var5][var33 + 1][var37]) == 0) {
                                        break label266;
                                    }
                                }
                                ++var33;
                            }
                            if (~((-var32 + var33 - -1) * (-var34 + var35 - -1)) <= -5) {
                                int var38 = super.field4286[var5][var32][var34];
                                class399.method2371(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) - -128, var38, var38);
                                for (int var39 = var32; var39 <= var33; ++var39) {
                                    for (int var40 = var34; ~var35 <= ~var40; ++var40) {
                                        super.field4308[var5][var39][var40] = (byte) class330.method2050(super.field4308[var5][var39][var40], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            super.field4308 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILqq;II[BIII[Lea;)V")
    public final void method1716(int arg0, int arg1, int arg2, class318 arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, class367[] arg10) {
        ++field4268;
        class40 var12 = new class40(arg6);
        int var13 = -1;
        if (arg9 != 4) {
            field4275 = null;
        }
        while (true) {
            int var14 = var12.method229(arg9 ^ -5);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method236(true);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method257((byte) 24);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg8 == ~var19 && ~arg0 >= ~var18 && var18 < arg0 + 8 && var17 >= arg7 && var17 < arg7 + 8) {
                    class56 var23 = class128.field2070.method916((byte) -15, var13);
                    int var24 = arg1 + class153.method985(arg9 ^ -21288, var23.field915, var22, 7 & var18, 7 & var17, var23.field967, arg2);
                    int var25 = arg5 + class382.method2294(var22, (byte) 106, arg2, var23.field967, var23.field915, 7 & var18, var17 & 7);
                    if (var24 > 0 && ~var25 < -1 && ~var24 > ~(super.field4291 + -1) && ~var25 > ~(super.field4293 + -1)) {
                        class367 var26 = null;
                        if (!super.field4301) {
                            int var27 = arg4;
                            if (~(2 & class146.field2369[1][var24][var25]) == -3) {
                                var27 = arg4 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg10[var27];
                            }
                        }
                        this.method1714(var21, var24, arg4, var26, var13, arg3, arg4, false, -1, var25, 3 & arg2 + var22);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
    public static void method1717(byte arg0) {
        field4264 = null;
        field4275 = null;
        if (arg0 != -111) {
            field4264 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILha;ILqq;[IIIIIII)V")
    public final void method1718(int arg0, class40 arg1, int arg2, class318 arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg5 < 68) {
            this.method1715((class318) null, -95);
        }
        ++field4267;
        if (!super.field4301) {
            boolean var12 = false;
            class174 var13 = null;
            if (arg4 != null) {
                arg4[0] = -1;
            }
            int var14 = (7 & arg0) * 8;
            int var15 = (7 & arg6) * 8;
            while (true) {
                while (arg1.field585 < arg1.field536.length) {
                    int var20 = arg1.method257((byte) 84);
                    if (var20 == 0) {
                        var13 = new class174(arg1);
                    } else if (var20 == 1) {
                        int var21 = arg1.method257((byte) 37);
                        if (~var21 < -1) {
                            for (int var22 = 0; var21 > var22; ++var22) {
                                class233 var23 = new class233(arg3, arg1, 0);
                                if (var23.field3546 == 31) {
                                    class121 var24 = class193.field3050.method1500(31, arg1.method254((byte) -60));
                                    var23.method1395(var24.field2006, -4, var24.field2005, var24.field2011, var24.field2003);
                                }
                                if (arg3.method1986() > 0) {
                                    class480 var25 = var23.field3534;
                                    int var26 = var25.method2895(0) >> 7;
                                    int var27 = var25.method2900((byte) -31) >> 7;
                                    if (var23.field3541 == arg10 && var14 <= var26 && ~var26 > ~(var14 + 8) && ~var27 <= ~var15 && ~var27 > ~(var15 + 8)) {
                                        int var28 = (arg8 << 7) + class405.method2403(var25.method2900((byte) -31) & 1023, var25.method2895(0) & 1023, (byte) 119, arg7);
                                        int var29 = var28 >> 7;
                                        int var30 = (arg2 << 7) + class108.method783(arg7, 1023 & var25.method2900((byte) -31), var25.method2895(0) & 1023, (byte) -113);
                                        int var31 = var30 >> 7;
                                        if (~var29 <= -1 && ~var31 <= -1 && super.field4291 > var29 && ~super.field4293 < ~var31) {
                                            var25.method930(-100, var30, var28, super.field4286[arg10][var29][var31] + -var25.method2901(-24962));
                                            if (arg3.method1986() > 0) {
                                                class4.method15(var23);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class174();
                        }
                        var13.method1091(arg1, (byte) 127);
                    } else if (var20 == 128) {
                        if (arg4 != null) {
                            arg4[0] = arg1.method254((byte) -83);
                            arg4[1] = arg1.method249(false);
                            arg4[2] = arg1.method249(false);
                            arg4[3] = arg1.method249(false);
                            arg4[4] = arg1.method254((byte) -46);
                        } else {
                            arg1.field585 += 10;
                        }
                    } else {
                        if (var20 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field4290 == null) {
                            super.field4290 = new byte[4][][];
                        }
                        for (int var32 = 0; ~var32 > -5; ++var32) {
                            byte var33 = arg1.method262(-2);
                            if (var33 == 0 && super.field4290[arg9] != null) {
                                if (~arg10 <= ~var32) {
                                    int var34 = arg8;
                                    int var35 = arg8 + 7;
                                    int var36 = arg2;
                                    if (~arg2 > -1) {
                                        var36 = 0;
                                    } else if (super.field4293 <= arg2) {
                                        var36 = super.field4293;
                                    }
                                    if (arg8 >= 0) {
                                        if (~arg8 <= ~super.field4291) {
                                            var34 = super.field4291;
                                        }
                                    } else {
                                        var34 = 0;
                                    }
                                    if (var35 >= 0) {
                                        if (var35 >= super.field4291) {
                                            var35 = super.field4291;
                                        }
                                    } else {
                                        var35 = 0;
                                    }
                                    int var37 = arg2 + 7;
                                    if (~var37 > -1) {
                                        var37 = 0;
                                    } else if (~var37 <= ~super.field4293) {
                                        var37 = super.field4293;
                                    }
                                    while (var35 > var34) {
                                        while (~var36 > ~var37) {
                                            super.field4290[arg9][var34][var36] = 0;
                                            ++var36;
                                        }
                                        ++var34;
                                    }
                                }
                            } else if (var33 == 1) {
                                if (super.field4290[arg9] == null) {
                                    super.field4290[arg9] = new byte[super.field4291 + 1][super.field4293 + 1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; var39 < 64; var39 += 4) {
                                        byte var40 = arg1.method262(-2);
                                        if (arg10 >= var32) {
                                            for (int var41 = var38; ~var41 > ~(var38 + 4); ++var41) {
                                                for (int var42 = var39; var39 + 4 > var42; ++var42) {
                                                    if (~var14 >= ~var41 && var14 + 8 > var41 && ~var15 >= ~var42 && var15 < var15 + 8) {
                                                        int var43 = arg8 + class261.method1588((byte) -119, 7 & var42, arg7, var41 & 7);
                                                        int var44 = class198.method1229(var41 & 7, 7 & var42, -2, arg7) + arg2;
                                                        if (~var43 <= -1 && super.field4291 > var43 && ~var44 <= -1 && ~super.field4293 < ~var44) {
                                                            super.field4290[arg9][var43][var44] = var40;
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
                    class74.method551(arg8 >> 3, arg2 >> 3, (byte) -43, var13);
                }
                if (!var12 && super.field4290 != null && super.field4290[arg9] != null) {
                    int var16 = arg8 + 7;
                    int var17 = arg2 + 7;
                    for (int var18 = arg8; ~var16 < ~var18; ++var18) {
                        for (int var19 = arg2; var17 > var19; ++var19) {
                            super.field4290[arg9][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLqq;[BII[Lea;)V")
    public final void method1719(byte arg0, class318 arg1, byte[] arg2, int arg3, int arg4, class367[] arg5) {
        ++field4273;
        class40 var7 = new class40(arg2);
        if (arg0 < 90) {
            this.field4270 = -128;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method229(-1);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method236(true);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = 63 & var10 >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method257((byte) 66);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = var13 - -arg4;
                int var19 = var12 - -arg3;
                if (~var18 < -1 && ~var19 < -1 && var18 < super.field4291 + -1 && ~var19 > ~(super.field4293 + -1)) {
                    class367 var20 = null;
                    if (!super.field4301) {
                        int var21 = var14;
                        if (~(2 & class146.field2369[1][var18][var19]) == -3) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg5[var21];
                        }
                    }
                    this.method1714(var16, var18, var14, var20, var8, arg1, var14, false, -1, var19, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lqq;Lha;[IIII)V")
    public final void method1720(class318 arg0, class40 arg1, int[] arg2, int arg3, int arg4, int arg5) {
        int var7 = 21 / ((-48 - arg4) / 57);
        ++field4277;
        if (!super.field4301) {
            boolean var8 = false;
            class174 var9 = null;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            while (true) {
                while (~arg1.field536.length < ~arg1.field585) {
                    int var19 = arg1.method257((byte) 101);
                    if (var19 == 0) {
                        var9 = new class174(arg1);
                    } else if (~var19 == -2) {
                        int var35 = arg1.method257((byte) 56);
                        if (~var35 < -1) {
                            for (int var36 = 0; var35 > var36; ++var36) {
                                class233 var37 = new class233(arg0, arg1, 0);
                                if (var37.field3546 == 31) {
                                    class121 var38 = class193.field3050.method1500(31, arg1.method254((byte) -51));
                                    var37.method1395(var38.field2006, -4, var38.field2005, var38.field2011, var38.field2003);
                                }
                                if (arg0.method1986() > 0) {
                                    class480 var39 = var37.field3534;
                                    int var40 = var39.method2895(0) - -(arg5 << 7);
                                    int var41 = var39.method2900((byte) -31) - -(arg3 << 7);
                                    int var42 = var40 >> 7;
                                    int var43 = var41 >> 7;
                                    if (var42 >= 0 && var43 >= 0 && ~super.field4291 < ~var42 && ~var43 > ~super.field4293) {
                                        var39.method930(-98, var41, var40, super.field4286[var37.field3541][var42][var43] - var39.method2901(-24962));
                                        if (arg0.method1986() > 0) {
                                            class4.method15(var37);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var19 == 2) {
                        if (var9 == null) {
                            var9 = new class174();
                        }
                        var9.method1091(arg1, (byte) 96);
                    } else if (~var19 == -129) {
                        if (arg2 != null) {
                            arg2[0] = arg1.method254((byte) -127);
                            arg2[1] = arg1.method249(false);
                            arg2[2] = arg1.method249(false);
                            arg2[3] = arg1.method249(false);
                            arg2[4] = arg1.method254((byte) -96);
                        } else {
                            arg1.field585 += 10;
                        }
                    } else {
                        if (~var19 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field4290 == null) {
                            super.field4290 = new byte[4][][];
                        }
                        var8 = true;
                        for (int var20 = 0; ~var20 > -5; ++var20) {
                            byte var21 = arg1.method262(-2);
                            if (~var21 == -1 && super.field4290[var20] != null) {
                                int var22 = arg5;
                                int var23 = arg5 + 64;
                                int var24 = arg3;
                                if (~var23 > -1) {
                                    var23 = 0;
                                } else if (~var23 <= ~super.field4291) {
                                    var23 = super.field4291;
                                }
                                if (~arg5 > -1) {
                                    var22 = 0;
                                } else if (arg5 >= super.field4291) {
                                    var22 = super.field4291;
                                }
                                if (arg3 < 0) {
                                    var24 = 0;
                                } else if (arg3 >= super.field4293) {
                                    var24 = super.field4293;
                                }
                                int var25 = arg3 + 64;
                                if (~var25 > -1) {
                                    var25 = 0;
                                } else if (~var25 <= ~super.field4293) {
                                    var25 = super.field4293;
                                }
                                while (~var22 > ~var23) {
                                    while (var25 > var24) {
                                        super.field4290[var20][var22][var24] = 0;
                                        ++var24;
                                    }
                                    ++var22;
                                }
                            } else if (~var21 != -2) {
                                if (~var21 == -3) {
                                    if (super.field4290[var20] == null) {
                                        super.field4290[var20] = new byte[super.field4291 + 1][super.field4293 + 1];
                                    }
                                    if (~var20 < -1) {
                                        int var26 = arg5;
                                        int var27 = arg5 + 64;
                                        int var28 = arg3;
                                        if (~arg5 > -1) {
                                            var26 = 0;
                                        } else if (~arg5 <= ~super.field4291) {
                                            var26 = super.field4291;
                                        }
                                        if (arg3 >= 0) {
                                            if (~super.field4293 >= ~arg3) {
                                                var28 = super.field4293;
                                            }
                                        } else {
                                            var28 = 0;
                                        }
                                        if (var27 < 0) {
                                            var27 = 0;
                                        } else if (~var27 <= ~super.field4291) {
                                            var27 = super.field4291;
                                        }
                                        int var29 = arg3 + 64;
                                        if (var29 < 0) {
                                            var29 = 0;
                                        } else if (~super.field4293 >= ~var29) {
                                            var29 = super.field4293;
                                        }
                                        while (var26 < var27) {
                                            while (var29 > var28) {
                                                super.field4290[var20][var26][var28] = super.field4290[var20 - 1][var26][var28];
                                                ++var28;
                                            }
                                            ++var26;
                                        }
                                    }
                                }
                            } else {
                                if (super.field4290[var20] == null) {
                                    super.field4290[var20] = new byte[super.field4291 + 1][super.field4293 + 1];
                                }
                                for (int var30 = 0; var30 < 64; var30 += 4) {
                                    for (int var31 = 0; var31 < 64; var31 += 4) {
                                        byte var32 = arg1.method262(-2);
                                        for (int var33 = var30 - -arg5; ~var33 > ~(var30 + 4 + arg5); ++var33) {
                                            for (int var34 = arg3 + var31; ~(var31 - -4 + arg3) < ~var34; ++var34) {
                                                if (~var33 <= -1 && super.field4291 > var33 && ~var34 <= -1 && ~super.field4293 < ~var34) {
                                                    super.field4290[var20][var33][var34] = var32;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (var9 != null) {
                    for (int var10 = 0; ~var10 > -9; ++var10) {
                        for (int var11 = 0; ~var11 > -9; ++var11) {
                            int var12 = (arg5 >> 3) + var10;
                            int var13 = (arg3 >> 3) + var11;
                            if (~var12 <= -1 && super.field4291 >> 3 > var12 && var13 >= 0 && var13 < super.field4293 >> 3) {
                                class74.method551(var12, var13, (byte) -87, var9);
                            }
                        }
                    }
                }
                if (!var8 && super.field4290 != null) {
                    for (int var14 = 0; var14 < 4; ++var14) {
                        if (super.field4290[var14] != null) {
                            for (int var15 = 0; ~var15 > -17; ++var15) {
                                for (int var16 = 0; ~var16 > -17; ++var16) {
                                    int var17 = (arg5 >> 2) + var15;
                                    int var18 = (arg3 >> 2) + var16;
                                    if (var17 >= 0 && ~var17 > -27 && var18 >= 0 && ~var18 > -27) {
                                        super.field4290[var14][var17][var18] = 0;
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

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILia;IILqh;)V")
    public static final void method1721(int arg0, class399 arg1, int arg2, int arg3, class47 arg4) {
        ++field4265;
        if ((arg0 & 1) != 0) {
            class86.field1498[arg3] = arg1.method250(true);
        }
        byte var5 = -1;
        if (~(4096 & arg0) != -1) {
            arg4.field688 = ~arg1.method256(true) == -2;
        }
        if (~(arg0 & 4) != -1) {
            int var6 = arg1.method236(true);
            int var7 = arg1.method256(true);
            arg4.method890((byte) -84, var7, class369.field5424, var6);
            arg4.field2217 = class369.field5424 + 300;
            arg4.field2175 = arg1.method257((byte) 101);
        }
        if ((arg0 & 32768) != 0) {
            int var8 = class369.field5424;
            int var9 = arg1.method236(true);
            int var10 = arg1.method232((byte) 100);
            arg4.method890((byte) 102, var10, var8, var9);
        }
        int var11 = -67 % ((arg2 - -47) / 43);
        if (~(arg0 & 2048) != -1) {
            var5 = arg1.method250(true);
        }
        if ((arg0 & 16384) != 0) {
            arg4.field2203 = arg1.method239(true);
            if (~arg4.field2203.charAt(0) == -127) {
                arg4.field2203 = arg4.field2203.substring(1);
                class150.method976(arg4.field2203, 2, arg4.method335(false, -128), 0, arg4.method327(115, true), (byte) -113);
            } else if (class286.field4329 == arg4) {
                class150.method976(arg4.field2203, 2, arg4.method335(false, -124), 0, arg4.method327(115, true), (byte) -113);
            }
            arg4.field2161 = 0;
            arg4.field2223 = 0;
            arg4.field2184 = 150;
        }
        if (~(32 & arg0) != -1) {
            int var12 = arg1.method272(-40);
            if (var12 == 65535) {
                var12 = -1;
            }
            arg4.field2148 = var12;
        }
        if ((arg0 & 64) != 0) {
            int var13 = arg1.method254((byte) -102);
            int var14 = arg1.method257((byte) 48);
            int var15 = arg1.method256(true);
            int var16 = arg1.field585;
            boolean var17 = ~(32768 & var13) != -1;
            if (arg4.field685 != null && arg4.field696 != null) {
                boolean var18 = false;
                if (var14 <= 1) {
                    if (var17 || (!class396.field5784 || class32.field419) && !class75.field1352) {
                        if (class237.method1423(arg4.field685, 0)) {
                            var18 = true;
                        }
                    } else {
                        var18 = true;
                    }
                }
                if (!var18 && ~class455.field6977 == -1) {
                    class76.field1370.field585 = 0;
                    arg1.method273(0, 49152, class76.field1370.field536, var15);
                    class76.field1370.field585 = 0;
                    int var19 = -1;
                    String var21;
                    if (var17) {
                        var13 &= 32767;
                        class508 var20 = class291.method1777((byte) 126, class76.field1370);
                        var19 = var20.field7682;
                        var21 = var20.field7680.method2840(class76.field1370, -1);
                    } else {
                        var21 = class435.method2540(class174.method1093((byte) -109, class76.field1370), 0);
                    }
                    arg4.field2203 = var21.trim();
                    arg4.field2161 = var13 >> 8;
                    arg4.field2223 = 255 & var13;
                    arg4.field2184 = 150;
                    int var22;
                    if (~var14 != -2 && ~var14 != -3) {
                        var22 = var17 ? 17 : 2;
                    } else {
                        var22 = var17 ? 17 : 1;
                    }
                    if (var14 == 2) {
                        class96.method733(var21, (byte) -4, var19, (String) null, "<img=1>" + arg4.method335(false, 68), 0, var22, "<img=1>" + arg4.method327(115, true));
                    } else if (var14 != 1) {
                        class96.method733(var21, (byte) -4, var19, (String) null, arg4.method335(false, -31), 0, var22, arg4.method327(115, true));
                    } else {
                        class96.method733(var21, (byte) -4, var19, (String) null, "<img=0>" + arg4.method335(false, -126), 0, var22, "<img=0>" + arg4.method327(115, true));
                    }
                }
            }
            arg1.field585 = var15 + var16;
        }
        if (~(512 & arg0) != -1) {
            int var23 = arg1.method247((byte) 0);
            if (var23 == 65535) {
                var23 = -1;
            }
            int var24 = arg1.method270((byte) -54);
            int var25 = arg1.method257((byte) 97);
            arg4.method903(var25, var24, false, var23, true);
        }
        if (~(arg0 & 16) != -1) {
            int var26 = arg1.method272(124);
            if (~var26 == -65536) {
                var26 = -1;
            }
            int var27 = arg1.method232((byte) 111);
            class137.method920(123, arg4, var26, var27);
        }
        if (~(256 & arg0) != -1) {
            int var28 = arg1.method272(-53);
            arg4.field2140 = arg1.method257((byte) 34);
            arg4.field2183 = arg1.method257((byte) 53);
            arg4.field2171 = 32767 & var28;
            arg4.field2209 = ~(var28 & 32768) != -1;
            arg4.field2147 = class369.field5424 + arg4.field2140 + arg4.field2171;
        }
        if ((arg0 & 2) != 0) {
            arg4.field705 = arg1.method243(-72);
            if (~arg4.field2231 == -1) {
                arg4.method896((byte) 13, arg4.field705);
                arg4.field705 = -1;
            }
        }
        if ((arg0 & 131072) != 0) {
            int var29 = arg1.method272(-35);
            if (~var29 == -65536) {
                var29 = -1;
            }
            int var30 = arg1.method275((byte) -124);
            int var31 = arg1.method277(true);
            arg4.method903(var31, var30, true, var29, true);
        }
        if ((arg0 & 65536) != 0) {
            int var32 = arg1.method257((byte) 106);
            int[] var33 = new int[var32];
            int[] var34 = new int[var32];
            int[] var35 = new int[var32];
            for (int var36 = 0; ~var32 < ~var36; ++var36) {
                int var37 = arg1.method247((byte) 0);
                if (var37 == 65535) {
                    var37 = -1;
                }
                var33[var36] = var37;
                var34[var36] = arg1.method257((byte) 91);
                var35[var36] = arg1.method243(126);
            }
            class88.method629(var33, var34, var35, arg4, (byte) 84);
        }
        if (~(arg0 & 1024) != -1) {
            arg4.field2182 = arg1.method223((byte) -79);
            arg4.field2200 = arg1.method245(-87);
            arg4.field2224 = arg1.method223((byte) -76);
            arg4.field2221 = arg1.method223((byte) -56);
            arg4.field2144 = arg1.method254((byte) -107) + class369.field5424;
            arg4.field2160 = arg1.method243(15) - -class369.field5424;
            arg4.field2181 = arg1.method256(true);
            arg4.field2230 = 0;
            if (arg4.field691) {
                arg4.field2221 += arg4.field706;
                arg4.field2182 += arg4.field694;
                arg4.field2224 += arg4.field694;
                arg4.field2200 += arg4.field706;
                arg4.field2231 = 0;
            } else {
                arg4.field2221 += arg4.field2239[0];
                arg4.field2182 += arg4.field2232[0];
                arg4.field2200 += arg4.field2239[0];
                arg4.field2224 += arg4.field2232[0];
                arg4.field2231 = 1;
            }
        }
        if ((262144 & arg0) != 0) {
            arg4.field2138 = arg1.method250(true);
            arg4.field2220 = arg1.method250(true);
            arg4.field2219 = arg1.method250(true);
            arg4.field2214 = (byte) arg1.method257((byte) 101);
            arg4.field2198 = class369.field5424 + arg1.method254((byte) -106);
            arg4.field2213 = class369.field5424 - -arg1.method272(-58);
        }
        if (~(8 & arg0) != -1) {
            int var38 = arg1.method257((byte) 123);
            byte[] var39 = new byte[var38];
            class40 var40 = new class40(var39);
            arg1.method273(0, 49152, var39, var38);
            class58.field997[arg3] = var40;
            arg4.method340((byte) 97, var40);
        }
        if (arg4.field691) {
            if (var5 == 127) {
                arg4.method336(arg4.field706, -22509, arg4.field694);
            } else {
                byte var41;
                if (var5 != -1) {
                    var41 = var5;
                } else {
                    var41 = class86.field1498[arg3];
                }
                arg4.method328(arg4.field706, (byte) -55, arg4.field694, var41);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIILea;Lqq;I)V")
    public final void method1722(int arg0, byte arg1, int arg2, int arg3, class367 arg4, class318 arg5, int arg6) {
        ++field4266;
        class185 var8 = null;
        if (arg3 == 0) {
            var8 = (class185) class307.method1842(arg6, arg2, arg0);
        }
        if (arg3 == 1) {
            var8 = (class185) class98.method741(arg6, arg2, arg0);
        }
        if (~arg3 == -3) {
            var8 = (class185) class86.method607(arg6, arg2, arg0, field4279 != null ? field4279 : (field4279 = method1723("tf")));
        }
        if (arg1 > 17) {
            if (~arg3 == -4) {
                var8 = (class185) class368.method2232(arg6, arg2, arg0);
            }
            if (var8 != null) {
                class56 var9 = class128.field2070.method916((byte) -15, var8.method174((byte) 118));
                int var10 = var8.method170(true);
                int var11 = var8.method173(1438);
                if (var9.method403(1884)) {
                    class352.method2147(arg6, arg0, arg2, var9, false);
                }
                if (var8.method161(15275)) {
                    var8.method176(true, arg5);
                }
                if (arg3 != 0) {
                    if (arg3 != 1) {
                        if (~arg3 != -3) {
                            if (~arg3 == -4) {
                                class376 var12 = class368.method2232(arg6, arg2, arg0);
                                if (!(var12 instanceof class31)) {
                                    class158.method1010(arg6, arg2, arg0);
                                } else {
                                    ((class31) var12).field413 = null;
                                }
                                if (~var9.field885 == -2) {
                                    arg4.method2221(arg0, 2, arg2);
                                    return;
                                }
                            }
                            return;
                        }
                        class205 var13 = class86.method607(arg6, arg2, arg0, field4279 != null ? field4279 : (field4279 = method1723("tf")));
                        if (var13 instanceof class290 && var13.field3225 == arg2 && ~var13.field3219 == ~arg0) {
                            ((class290) var13).field4385 = null;
                        } else {
                            class273.method1657(arg6, arg2, arg0, field4279 != null ? field4279 : (field4279 = method1723("tf")));
                        }
                        if (var9.field885 != 0 && ~super.field4291 < ~(var9.field915 + arg2) && super.field4293 > var9.field915 + arg0 && ~super.field4291 < ~(var9.field967 + arg2) && ~super.field4293 < ~(var9.field967 + arg0)) {
                            arg4.method2225(var9.field928, var9.field967, !var9.field966, arg0, (byte) 81, arg2, var11, var9.field915);
                            return;
                        }
                    } else {
                        class431 var14 = class98.method741(arg6, arg2, arg0);
                        if (var14 instanceof class175) {
                            ((class175) var14).field2745 = null;
                            return;
                        }
                        class420.method2460(arg6, arg2, arg0);
                    }
                    return;
                }
                class455 var15 = class307.method1842(arg6, arg2, arg0);
                if (!(var15 instanceof class220)) {
                    class447.method2674(arg6, arg2, arg0);
                } else {
                    ((class220) var15).field3378 = null;
                }
                if (~var9.field885 != -1) {
                    arg4.method2230(var10, 1, arg2, var11, var9.field928, arg0, !var9.field966);
                    return;
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1723(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
