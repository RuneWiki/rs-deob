import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class388 extends class6 {

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
    public int field5752 = 99;

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "Z")
    public static boolean field5760 = false;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
    public static int field5751 = 0;

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!uo", name = "R", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!uo", name = "S", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!uo", name = "T", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!uo", name = "U", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!uo", name = "V", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!uo", name = "W", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "Lkk;")
    public static class119 field5750;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uo", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field5767;

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field5759;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLhe;)V")
    public static final void method2326(byte arg0, class239 arg1) {
        class46.field695 = arg1.method1444("titlebg", (byte) 126);
        ++field5765;
        if (arg0 <= 30) {
            method2338((byte) -7);
        }
        class122.field1598 = arg1.method1444("logo", (byte) 62);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILeq;IIILqo;IIII)V")
    public final void method2327(int arg0, int arg1, class134 arg2, int arg3, int arg4, int arg5, class19 arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field5757;
        if (class118.field1533.method2961(class293.field4174, 29) || class195.method1222(class234.field3290, arg8, arg7, false, arg5)) {
            if (arg0 < this.field5752) {
                this.field5752 = arg0;
            }
            class486 var12 = class114.field1471.method2132((byte) 127, arg9);
            if (class293.field4174 != 1 || !var12.field7049) {
                int var13;
                int var14;
                if (~arg3 != -2 && ~arg3 != -4) {
                    var13 = var12.field7096;
                    var14 = var12.field7036;
                } else {
                    var13 = var12.field7036;
                    var14 = var12.field7096;
                }
                int var15;
                int var16;
                if (~super.field102 <= ~(arg8 - -var14)) {
                    var15 = (var14 - -1 >> 1) + arg8;
                    var16 = (var14 >> 1) + arg8;
                } else {
                    var15 = arg8 + 1;
                    var16 = arg8;
                }
                int var17;
                int var18;
                if (arg5 - -var13 > super.field105) {
                    var17 = arg5 + 1;
                    var18 = arg5;
                } else {
                    var18 = arg5 - -(var13 >> 1);
                    var17 = (var13 - -1 >> 1) + arg5;
                }
                class441 var19 = class311.field4527[arg7];
                if (arg4 != 3) {
                    method2333(27);
                }
                int var20 = var19.method848(var16, var18) + var19.method848(var15, var18) + var19.method848(var16, var17) + var19.method848(var15, var17) >> 2;
                int var21 = (arg8 << 7) + (var14 << 6);
                int var22 = (arg5 << 7) + (var13 << 6);
                boolean var23 = class65.field972 && !super.field94 && var12.field7104;
                if (var12.method2848(true)) {
                    class204.method1256(arg0, arg3, var12, (class139) null, true, arg8, (class313) null, arg5);
                }
                boolean var24 = arg1 == -1 && var12.field7029 == -1 && var12.field7072 == null && var12.field7043 == null && !var12.field7094;
                if (!class201.field2787 || (!class445.method2595(arg10, 12858) || ~var12.field7088 == -2) && (!class89.method554(arg10, -13) || var12.field7088 != 0)) {
                    if (~arg10 == -23) {
                        if (class118.field1533.field6892 || ~var12.field7041 != -1 || ~var12.field7074 == -2 || var12.field7108) {
                            class79 var25;
                            if (!var24) {
                                var25 = new class145(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg3, arg1);
                            } else {
                                class176 var26 = new class176(arg2, var12, arg7, var21, var20, var22, super.field94, arg3, var23);
                                var25 = var26;
                                if (var26.method371(false)) {
                                    var26.method372((byte) -77, arg2);
                                }
                            }
                            class79 var27 = class79.method515(arg0, arg8, arg5);
                            if (!(var27 instanceof class178)) {
                                class110.method655(arg0, arg8, arg5, var25);
                            } else {
                                ((class178) var27).field2548 = var25;
                            }
                            if (~var12.field7074 == -2 && arg6 != null) {
                                arg6.method142(arg5, arg8, 11677);
                            }
                        }
                    } else if (~arg10 != -11 && arg10 != 11) {
                        if (arg10 >= 12 && arg10 <= 17 || arg10 >= 18 && ~arg10 >= -22) {
                            class210 var28;
                            if (!var24) {
                                var28 = new class131(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg8, arg8 + var14 + -1, arg5, arg5 + var13 - 1, arg10, arg3, arg1);
                            } else {
                                class413 var29 = new class413(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg8, arg8 - (-var14 + 1), arg5, arg5 - -var13 + -1, arg10, arg3, var23);
                                var28 = var29;
                                if (var29.method371(false)) {
                                    var29.method372((byte) -117, arg2);
                                }
                            }
                            class210 var30 = class124.method701(arg0, arg8, arg5, field5767 != null ? field5767 : (field5767 = method2339("sq")));
                            if (var30 instanceof class387 && var30.field2972 == arg8 && ~var30.field2975 == ~arg5) {
                                ((class387) var30).field5742 = var28;
                            } else {
                                class76.method503(var28, false);
                            }
                            if (class65.field972 && !super.field94 && ~arg10 <= -13 && ~arg10 >= -18 && ~arg10 != -14 && ~arg0 < -1 && var12.field7088 != 0) {
                                super.field103[arg0][arg8][arg5] = (byte) class51.method379(super.field103[arg0][arg8][arg5], 4);
                            }
                            if (~var12.field7074 != -1 && arg6 != null) {
                                arg6.method138((byte) -125, var14, var13, var12.field7093, arg8, !var12.field7026, arg5);
                            }
                        } else if (arg10 == 0) {
                            int var31 = var12.field7088;
                            if (class464.field6727 && var12.field7088 == -1) {
                                var31 = 1;
                            }
                            class403 var33;
                            if (var24) {
                                class308 var32 = new class308(arg2, var12, arg7, var21, var20, var22, super.field94, arg10, arg3, var23);
                                var33 = var32;
                                if (var32.method371(false)) {
                                    var32.method372((byte) -119, arg2);
                                }
                            } else {
                                var33 = new class437(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg10, arg3, arg1);
                            }
                            class403 var34 = class478.method2795(arg0, arg8, arg5);
                            if (var34 instanceof class349) {
                                ((class349) var34).field5048 = var33;
                            } else {
                                class30.method249(arg0, arg8, arg5, var33, (class403) null);
                            }
                            if (class65.field972) {
                                if (arg3 == 0) {
                                    if (var12.field7032) {
                                        var19.method863(arg8, arg5, 50);
                                        var19.method863(arg8, arg5 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field94) {
                                        super.field103[arg0][arg8][arg5] = (byte) class51.method379(super.field103[arg0][arg8][arg5], 1);
                                    }
                                } else if (~arg3 != -2) {
                                    if (~arg3 != -3) {
                                        if (~arg3 == -4) {
                                            if (var12.field7032) {
                                                var19.method863(arg8, arg5, 50);
                                                var19.method863(arg8 + 1, arg5, 50);
                                            }
                                            if (~var31 == -2 && !super.field94) {
                                                super.field103[arg0][arg8][arg5] = (byte) class51.method379(super.field103[arg0][arg8][arg5], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field7032) {
                                            var19.method863(arg8 + 1, arg5, 50);
                                            var19.method863(arg8 + 1, arg5 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field94) {
                                            super.field103[arg0][arg8 + 1][arg5] = (byte) class51.method379(super.field103[arg0][arg8 + 1][arg5], 1);
                                        }
                                    }
                                } else {
                                    if (var12.field7032) {
                                        var19.method863(arg8, arg5 + 1, 50);
                                        var19.method863(arg8 + 1, arg5 - -1, 50);
                                    }
                                    if (~var31 == -2 && !super.field94) {
                                        super.field103[arg0][arg8][arg5 - -1] = (byte) class51.method379(super.field103[arg0][arg8][arg5 - -1], 2);
                                    }
                                }
                            }
                            if (var12.field7074 != 0 && arg6 != null) {
                                arg6.method141(arg10, arg3, arg8, !var12.field7026, arg5, arg4 + -7, var12.field7093);
                            }
                            if (~var12.field7030 != -17) {
                                class467.method2737(arg0, arg8, arg5, var12.field7030);
                            }
                        } else if (arg10 == 1) {
                            class403 var36;
                            if (var24) {
                                class308 var35 = new class308(arg2, var12, arg7, var21, var20, var22, super.field94, arg10, arg3, var23);
                                var36 = var35;
                                if (var35.method371(false)) {
                                    var35.method372((byte) -66, arg2);
                                }
                            } else {
                                var36 = new class437(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg10, arg3, arg1);
                            }
                            class403 var37 = class478.method2795(arg0, arg8, arg5);
                            if (var37 instanceof class349) {
                                ((class349) var37).field5048 = var36;
                            } else {
                                class30.method249(arg0, arg8, arg5, var36, (class403) null);
                            }
                            if (var12.field7032 && class65.field972) {
                                if (arg3 != 0) {
                                    if (arg3 != 1) {
                                        if (arg3 != 2) {
                                            if (~arg3 == -4) {
                                                var19.method863(arg8, arg5, 50);
                                            }
                                        } else {
                                            var19.method863(arg8 + 1, arg5, 50);
                                        }
                                    } else {
                                        var19.method863(arg8 - -1, arg5 + 1, 50);
                                    }
                                } else {
                                    var19.method863(arg8, arg5 - -1, 50);
                                }
                            }
                            if (var12.field7074 != 0 && arg6 != null) {
                                arg6.method141(arg10, arg3, arg8, !var12.field7026, arg5, arg4 + -7, var12.field7093);
                            }
                        } else if (arg10 == 2) {
                            int var38 = arg3 - -1 & 3;
                            class403 var41;
                            class403 var42;
                            if (var24) {
                                class308 var39 = new class308(arg2, var12, arg7, var21, var20, var22, super.field94, arg10, arg3 + 4, var23);
                                class308 var40 = new class308(arg2, var12, arg7, var21, var20, var22, super.field94, arg10, var38, var23);
                                if (var39.method371(false)) {
                                    var39.method372((byte) -109, arg2);
                                }
                                if (var40.method371(false)) {
                                    var40.method372((byte) -99, arg2);
                                }
                                var41 = var39;
                                var42 = var40;
                            } else {
                                var41 = new class437(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg10, arg3 + 4, arg1);
                                var42 = new class437(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg10, var38, arg1);
                            }
                            class30.method249(arg0, arg8, arg5, var41, var42);
                            if (~var12.field7088 == -2 && class65.field972 && !super.field94) {
                                if (~arg3 != -1) {
                                    if (~arg3 == -2) {
                                        super.field103[arg0][arg8][arg5 - -1] = (byte) class51.method379(super.field103[arg0][arg8][arg5 - -1], 2);
                                        super.field103[arg0][arg8 + 1][arg5] = (byte) class51.method379(super.field103[arg0][arg8 + 1][arg5], 1);
                                    } else if (arg3 != 2) {
                                        if (~arg3 == -4) {
                                            super.field103[arg0][arg8][arg5] = (byte) class51.method379(super.field103[arg0][arg8][arg5], 2);
                                            super.field103[arg0][arg8][arg5] = (byte) class51.method379(super.field103[arg0][arg8][arg5], 1);
                                        }
                                    } else {
                                        super.field103[arg0][arg8 + 1][arg5] = (byte) class51.method379(super.field103[arg0][arg8 + 1][arg5], 1);
                                        super.field103[arg0][arg8][arg5] = (byte) class51.method379(super.field103[arg0][arg8][arg5], 2);
                                    }
                                } else {
                                    super.field103[arg0][arg8][arg5] = (byte) class51.method379(super.field103[arg0][arg8][arg5], 1);
                                    super.field103[arg0][arg8][arg5 + 1] = (byte) class51.method379(super.field103[arg0][arg8][arg5 + 1], 2);
                                }
                            }
                            if (~var12.field7074 != -1 && arg6 != null) {
                                arg6.method141(arg10, arg3, arg8, !var12.field7026, arg5, ~arg4, var12.field7093);
                            }
                            if (var12.field7030 != 16) {
                                class467.method2737(arg0, arg8, arg5, var12.field7030);
                            }
                        } else if (arg10 == 3) {
                            class403 var44;
                            if (var24) {
                                class308 var43 = new class308(arg2, var12, arg7, var21, var20, var22, super.field94, arg10, arg3, var23);
                                if (var43.method371(false)) {
                                    var43.method372((byte) -111, arg2);
                                }
                                var44 = var43;
                            } else {
                                var44 = new class437(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg10, arg3, arg1);
                            }
                            class403 var45 = class478.method2795(arg0, arg8, arg5);
                            if (!(var45 instanceof class349)) {
                                class30.method249(arg0, arg8, arg5, var44, (class403) null);
                            } else {
                                ((class349) var45).field5048 = var44;
                            }
                            if (var12.field7032 && class65.field972) {
                                if (arg3 != 0) {
                                    if (arg3 == 1) {
                                        var19.method863(arg8 + 1, arg5 + 1, 50);
                                    } else if (arg3 == 2) {
                                        var19.method863(arg8 + 1, arg5, 50);
                                    } else if (arg3 == 3) {
                                        var19.method863(arg8, arg5, 50);
                                    }
                                } else {
                                    var19.method863(arg8, arg5 + 1, 50);
                                }
                            }
                            if (var12.field7074 != 0 && arg6 != null) {
                                arg6.method141(arg10, arg3, arg8, !var12.field7026, arg5, -4, var12.field7093);
                            }
                        } else if (arg10 == 9) {
                            class210 var46;
                            if (!var24) {
                                var46 = new class131(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg8, var14 + -1 + arg8, arg5, arg5 + var13 + -1, arg10, arg3, arg1);
                            } else {
                                class413 var47 = new class413(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg8, arg8, arg5, arg5, arg10, arg3, var23);
                                if (var47.method371(false)) {
                                    var47.method372((byte) -83, arg2);
                                }
                                var46 = var47;
                            }
                            class210 var48 = class124.method701(arg0, arg8, arg5, field5767 != null ? field5767 : (field5767 = method2339("sq")));
                            if (var48 instanceof class387 && var48.field2972 == arg8 && ~var48.field2975 == ~arg5) {
                                ((class387) var48).field5742 = var46;
                            } else {
                                class76.method503(var46, false);
                            }
                            if (var12.field7074 != 0 && arg6 != null) {
                                arg6.method138((byte) -127, var14, var13, var12.field7093, arg8, !var12.field7026, arg5);
                            }
                            if (~var12.field7030 != -17) {
                                class467.method2737(arg0, arg8, arg5, var12.field7030);
                            }
                        } else if (arg10 == 4) {
                            class455 var50;
                            if (var24) {
                                class48 var49 = new class48(arg2, var12, arg7, var21, var20, var22, super.field94, 0, 0, 0, arg10, arg3);
                                var50 = var49;
                                if (var49.method371(false)) {
                                    var49.method372((byte) -66, arg2);
                                }
                            } else {
                                var50 = new class62(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, 0, 0, 0, arg10, arg3, arg1);
                            }
                            class455 var51 = class305.method1832(arg0, arg8, arg5);
                            if (!(var51 instanceof class172)) {
                                class378.method2286(arg0, arg8, arg5, var50, (class455) null);
                            } else {
                                ((class172) var51).field2348 = var50;
                            }
                        } else if (arg10 == 5) {
                            int var52 = 17;
                            class113 var53 = (class113) class478.method2795(arg0, arg8, arg5);
                            if (var53 != null) {
                                var52 = class114.field1471.method2132((byte) 120, var53.method369((byte) 77)).field7030 + 1;
                            }
                            class455 var55;
                            if (var24) {
                                class48 var54 = new class48(arg2, var12, arg7, var21, var20, var22, super.field94, 0, class63.field932[arg3] * var52, class281.field4021[arg3] * var52, arg10, arg3);
                                var55 = var54;
                                if (var54.method371(false)) {
                                    var54.method372((byte) -124, arg2);
                                }
                            } else {
                                var55 = new class62(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, 0, class63.field932[arg3] * var52, class281.field4021[arg3] * var52, arg10, arg3, arg1);
                            }
                            class455 var56 = class305.method1832(arg0, arg8, arg5);
                            if (!(var56 instanceof class172)) {
                                class378.method2286(arg0, arg8, arg5, var55, (class455) null);
                            } else {
                                ((class172) var56).field2348 = var55;
                            }
                        } else if (~arg10 == -7) {
                            int var57 = 9;
                            class113 var58 = (class113) class478.method2795(arg0, arg8, arg5);
                            if (var58 != null) {
                                var57 = 1 + class114.field1471.method2132((byte) 120, var58.method369((byte) 84)).field7030 / 2;
                            }
                            class455 var59;
                            if (!var24) {
                                var59 = new class62(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg3, class55.field849[arg3] * var57, class1.field6[arg3] * var57, arg10, arg3 + 4, arg1);
                            } else {
                                class48 var60 = new class48(arg2, var12, arg7, var21, var20, var22, super.field94, arg3, class63.field932[arg3] * var57, class281.field4021[arg3] * var57, arg10, arg3 + 4);
                                var59 = var60;
                                if (var60.method371(false)) {
                                    var60.method372((byte) -87, arg2);
                                }
                            }
                            class455 var61 = class305.method1832(arg0, arg8, arg5);
                            if (var61 instanceof class172) {
                                ((class172) var61).field2348 = var59;
                            } else {
                                class378.method2286(arg0, arg8, arg5, var59, (class455) null);
                            }
                        } else if (arg10 == 7) {
                            int var62 = 3 & arg3 + 2;
                            class455 var63;
                            if (!var24) {
                                var63 = new class62(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, var62, 0, 0, arg10, var62 + 4, arg1);
                            } else {
                                class48 var64 = new class48(arg2, var12, arg7, var21, var20, var22, super.field94, var62, 0, 0, arg10, var62 + 4);
                                if (var64.method371(false)) {
                                    var64.method372((byte) -81, arg2);
                                }
                                var63 = var64;
                            }
                            class455 var65 = class305.method1832(arg0, arg8, arg5);
                            if (!(var65 instanceof class172)) {
                                class378.method2286(arg0, arg8, arg5, var63, (class455) null);
                            } else {
                                ((class172) var65).field2348 = var63;
                            }
                        } else if (arg10 == 8) {
                            int var66 = arg3 + 2 & 3;
                            int var67 = 9;
                            class113 var68 = (class113) class478.method2795(arg0, arg8, arg5);
                            if (var68 != null) {
                                var67 = class114.field1471.method2132((byte) 124, var68.method369((byte) 39)).field7030 / 2 - -1;
                            }
                            class455 var71;
                            class455 var72;
                            if (var24) {
                                class48 var69 = new class48(arg2, var12, arg7, var21, var20, var22, super.field94, arg3, class55.field849[arg3] * var67, class1.field6[arg3] * var67, arg10, arg3 + 4);
                                class48 var70 = new class48(arg2, var12, arg7, var21, var20, var22, super.field94, arg3, 0, 0, arg10, var66 + 4);
                                if (var69.method371(false)) {
                                    var69.method372((byte) -76, arg2);
                                }
                                var71 = var69;
                                var72 = var70;
                                if (var70.method371(false)) {
                                    var70.method372((byte) -126, arg2);
                                }
                            } else {
                                class62 var73 = new class62(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg3, class55.field849[arg3] * var67, class1.field6[arg3] * var67, arg10, arg3 - -4, arg1);
                                var71 = var73;
                                class62 var74 = new class62(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg3, 0, 0, arg10, var66 - -4, arg1);
                                var72 = var74;
                            }
                            class378.method2286(arg0, arg8, arg5, var71, var72);
                        }
                    } else {
                        class413 var75 = null;
                        class210 var76;
                        int var77;
                        if (!var24) {
                            var76 = new class131(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg8, arg8 + var14 + -1, arg5, var13 + -1 + arg5, arg10, arg3, arg1);
                            var77 = 15;
                        } else {
                            class413 var78 = new class413(arg2, var12, arg0, arg7, var21, var20, var22, super.field94, arg8, arg8 - 1 + var14, arg5, arg5 + var13 - 1, arg10, arg3, var23);
                            var76 = var78;
                            var75 = var78;
                            var77 = var78.method2460(15);
                        }
                        class210 var79 = class124.method701(arg0, arg8, arg5, field5767 != null ? field5767 : (field5767 = method2339("sq")));
                        boolean var80 = false;
                        if (var79 instanceof class387 && var79.field2972 == arg8 && var79.field2975 == arg5) {
                            ((class387) var79).field5742 = var76;
                            var80 = true;
                        }
                        if (var80 || class76.method503(var76, false)) {
                            if (var75 != null && var75.method371(false)) {
                                var75.method372((byte) -117, arg2);
                            }
                            if (var12.field7032 && class65.field972) {
                                if (~var77 < -31) {
                                    var77 = 30;
                                }
                                for (int var81 = 0; var81 <= var14; ++var81) {
                                    for (int var82 = 0; ~var82 >= ~var13; ++var82) {
                                        var19.method863(arg8 - -var81, arg5 - -var82, var77);
                                    }
                                }
                            }
                        }
                        if (var12.field7074 != 0 && arg6 != null) {
                            arg6.method138((byte) -125, var14, var13, var12.field7093, arg8, !var12.field7026, arg5);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIZ)V")
    public class388(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class129.field1649, class475.field6857);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Leq;II[Lqo;I[B)V")
    public final void method2328(class134 arg0, int arg1, int arg2, class19[] arg3, int arg4, byte[] arg5) {
        if (arg1 > 44) {
            ++field5756;
            class156 var7 = new class156(arg5);
            int var8 = -1;
            while (true) {
                int var9 = var7.method995(0);
                if (~var9 == -1) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method953((byte) -40);
                    if (var11 == 0) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = var10 & 63;
                    int var13 = (4084 & var10) >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method941((byte) 126);
                    int var16 = var15 >> 2;
                    int var17 = 3 & var15;
                    int var18 = arg2 + var13;
                    int var19 = arg4 + var12;
                    if (~var18 < -1 && ~var19 < -1 && ~(super.field102 + -1) < ~var18 && super.field105 + -1 > var19) {
                        class19 var20 = null;
                        if (!super.field94) {
                            int var21 = var14;
                            if (~(2 & class379.field5661[1][var18][var19]) == -3) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg3[var21];
                            }
                        }
                        this.method2327(var14, -1, arg0, var17, 3, var19, var20, var14, var18, var8, var16);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lae;ILeq;I[II)V")
    public final void method2329(class156 arg0, int arg1, class134 arg2, int arg3, int[] arg4, int arg5) {
        ++field5753;
        if (!super.field94) {
            boolean var7 = false;
            if (arg1 > 90) {
                class121 var8 = null;
                if (arg4 != null) {
                    arg4[0] = -1;
                }
                while (true) {
                    while (~arg0.field2041.length < ~arg0.field2018) {
                        int var18 = arg0.method941((byte) 124);
                        if (~var18 == -1) {
                            var8 = new class121(arg0);
                        } else if (var18 == 1) {
                            int var19 = arg0.method941((byte) 123);
                            if (var19 > 0) {
                                for (int var20 = 0; var19 > var20; ++var20) {
                                    class373 var21 = new class373(arg2, arg0, 0);
                                    if (var21.field5593 == 31) {
                                        class135 var22 = class481.field6941.method1327(119, arg0.method993((byte) -109));
                                        var21.method2268(var22.field1722, var22.field1715, 1536, var22.field1717, var22.field1720);
                                    }
                                    if (arg2.method778() > 0) {
                                        class472 var23 = var21.field5595;
                                        int var24 = var23.method2759(123) - -(arg5 << 7);
                                        int var25 = var23.method2761(0) + (arg3 << 7);
                                        int var26 = var24 >> 7;
                                        int var27 = var25 >> 7;
                                        if (var26 >= 0 && ~var27 <= -1 && ~var26 > ~super.field102 && ~super.field105 < ~var27) {
                                            var23.method1602(var25, 126, var24, super.field99[var21.field5590][var26][var27] + -var23.method2760(-123));
                                            if (arg2.method778() > 0) {
                                                class32.method261(var21);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (var18 == 2) {
                            if (var8 == null) {
                                var8 = new class121();
                            }
                            var8.method689(121, arg0);
                        } else if (var18 == 128) {
                            if (arg4 == null) {
                                arg0.field2018 += 10;
                            } else {
                                arg4[0] = arg0.method993((byte) -127);
                                arg4[1] = arg0.method936((byte) -96);
                                arg4[2] = arg0.method936((byte) -96);
                                arg4[3] = arg0.method936((byte) -96);
                                arg4[4] = arg0.method993((byte) -48);
                            }
                        } else {
                            if (~var18 != -130) {
                                throw new IllegalStateException("");
                            }
                            if (super.field110 == null) {
                                super.field110 = new byte[4][][];
                            }
                            for (int var28 = 0; ~var28 > -5; ++var28) {
                                byte var29 = arg0.method946(109);
                                if (~var29 == -1 && super.field110[var28] != null) {
                                    int var30 = arg5;
                                    int var31 = arg5 + 64;
                                    int var32 = arg3;
                                    int var33 = arg3 + 64;
                                    if (arg5 < 0) {
                                        var30 = 0;
                                    } else if (~arg5 <= ~super.field102) {
                                        var30 = super.field102;
                                    }
                                    if (var31 < 0) {
                                        var31 = 0;
                                    } else if (~var31 <= ~super.field102) {
                                        var31 = super.field102;
                                    }
                                    if (arg3 >= 0) {
                                        if (~arg3 <= ~super.field105) {
                                            var32 = super.field105;
                                        }
                                    } else {
                                        var32 = 0;
                                    }
                                    if (var33 < 0) {
                                        var33 = 0;
                                    } else if (var33 >= super.field105) {
                                        var33 = super.field105;
                                    }
                                    while (~var30 > ~var31) {
                                        while (var33 > var32) {
                                            super.field110[var28][var30][var32] = 0;
                                            ++var32;
                                        }
                                        ++var30;
                                    }
                                } else if (var29 != 1) {
                                    if (var29 == 2) {
                                        if (super.field110[var28] == null) {
                                            super.field110[var28] = new byte[super.field102 - -1][super.field105 - -1];
                                        }
                                        if (var28 > 0) {
                                            int var34 = arg5;
                                            int var35 = arg5 + 64;
                                            int var36 = arg3;
                                            if (~arg3 > -1) {
                                                var36 = 0;
                                            } else if (arg3 >= super.field105) {
                                                var36 = super.field105;
                                            }
                                            int var37 = arg3 + 64;
                                            if (var35 >= 0) {
                                                if (super.field102 <= var35) {
                                                    var35 = super.field102;
                                                }
                                            } else {
                                                var35 = 0;
                                            }
                                            if (arg5 < 0) {
                                                var34 = 0;
                                            } else if (~super.field102 >= ~arg5) {
                                                var34 = super.field102;
                                            }
                                            if (~var37 > -1) {
                                                var37 = 0;
                                            } else if (~var37 <= ~super.field105) {
                                                var37 = super.field105;
                                            }
                                            while (~var35 < ~var34) {
                                                while (~var36 > ~var37) {
                                                    super.field110[var28][var34][var36] = super.field110[var28 + -1][var34][var36];
                                                    ++var36;
                                                }
                                                ++var34;
                                            }
                                        }
                                    }
                                } else {
                                    if (super.field110[var28] == null) {
                                        super.field110[var28] = new byte[super.field102 + 1][super.field105 + 1];
                                    }
                                    for (int var38 = 0; var38 < 64; var38 += 4) {
                                        for (int var39 = 0; var39 < 64; var39 += 4) {
                                            byte var40 = arg0.method946(120);
                                            for (int var41 = arg5 + var38; ~(arg5 - -4 + var38) < ~var41; ++var41) {
                                                for (int var42 = arg3 + var39; var42 < arg3 + var39 - -4; ++var42) {
                                                    if (~var41 <= -1 && var41 < super.field102 && ~var42 <= -1 && var42 < super.field105) {
                                                        super.field110[var28][var41][var42] = var40;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            var7 = true;
                        }
                    }
                    if (var8 != null) {
                        for (int var9 = 0; var9 < 8; ++var9) {
                            for (int var10 = 0; ~var10 > -9; ++var10) {
                                int var11 = (arg5 >> 3) + var9;
                                int var12 = (arg3 >> 3) + var10;
                                if (~var11 <= -1 && ~(super.field102 >> 3) < ~var11 && ~var12 <= -1 && super.field105 >> 3 > var12) {
                                    class127.method710(var8, 83, var11, var12);
                                }
                            }
                        }
                    }
                    if (!var7 && super.field110 != null) {
                        for (int var13 = 0; ~var13 > -5; ++var13) {
                            if (super.field110[var13] != null) {
                                for (int var14 = 0; var14 < 16; ++var14) {
                                    for (int var15 = 0; ~var15 > -17; ++var15) {
                                        int var16 = (arg5 >> 2) + var14;
                                        int var17 = (arg3 >> 2) + var15;
                                        if (var16 >= 0 && var16 < 26 && ~var17 <= -1 && ~var17 > -27) {
                                            super.field110[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[Lqo;IIILeq;II[BII)V")
    public final void method2330(int arg0, class19[] arg1, int arg2, int arg3, int arg4, class134 arg5, int arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        ++field5766;
        if (arg9 == -17281) {
            class156 var12 = new class156(arg8);
            int var13 = -1;
            while (true) {
                int var14 = var12.method995(0);
                if (~var14 == -1) {
                    return;
                }
                var13 += var14;
                int var15 = 0;
                while (true) {
                    int var16 = var12.method953((byte) -40);
                    if (~var16 == -1) {
                        break;
                    }
                    var15 += var16 + -1;
                    int var17 = 63 & var15;
                    int var18 = 63 & var15 >> 6;
                    int var19 = var15 >> 12;
                    int var20 = var12.method941((byte) 127);
                    int var21 = var20 >> 2;
                    int var22 = var20 & 3;
                    if (~arg10 == ~var19 && arg6 <= var18 && var18 < arg6 + 8 && ~arg3 >= ~var17 && ~(arg3 + 8) < ~var17) {
                        class486 var23 = class114.field1471.method2132((byte) 119, var13);
                        int var24 = arg0 + class390.method2350(var18 & 7, var23.field7036, var23.field7096, arg7, 7 & var17, -1, var22);
                        int var25 = arg2 + class173.method1089(arg7, var22, var23.field7096, (byte) -127, 7 & var17, var18 & 7, var23.field7036);
                        if (~var24 < -1 && var25 > 0 && ~var24 > ~(super.field102 + -1) && ~(super.field105 + -1) < ~var25) {
                            class19 var26 = null;
                            if (!super.field94) {
                                int var27 = arg4;
                                if ((2 & class379.field5661[1][var24][var25]) == 2) {
                                    var27 = arg4 - 1;
                                }
                                if (var27 >= 0) {
                                    var26 = arg1[var27];
                                }
                            }
                            this.method2327(arg4, -1, arg5, var22 - -arg7 & 3, arg9 ^ -17284, var25, var26, arg4, var24, var13, var21);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static void method2331(int arg0) {
        field5759 = null;
        if (arg0 != -1) {
            field5759 = null;
        }
        field5750 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILtq;)V")
    public static final void method2332(int arg0, class426 arg1) {
        ++field5762;
        if (class248.field3548 == arg1) {
            int var2 = class234.field3288.method996(8);
            int var3 = (7 & var2 >> 4) + class116.field1497;
            int var4 = (var2 & 7) + class417.field6192;
            int var5 = class234.field3288.method941((byte) 124);
            int var6 = var5 >> 2;
            int var7 = var5 & 3;
            int var8 = class327.field4772[var6];
            if (class85.method532(10607, class247.field3542) || var3 >= 0 && ~var4 <= -1 && ~class362.field5442 < ~var3 && ~class203.field2813 < ~var4) {
                class7.method62(var4, var8, var6, var3, -1, -55, -1, 0, var7, class364.field5475);
            }
        } else if (class503.field7678 == arg1) {
            class234.field3288.method941((byte) 125);
            int var9 = class234.field3288.method941((byte) 126);
            int var10 = class116.field1497 - -((120 & var9) >> 4);
            int var11 = (var9 & 7) + class417.field6192;
            int var12 = class234.field3288.method993((byte) -34);
            int var13 = class234.field3288.method941((byte) 126);
            int var14 = class234.field3288.method943(1295851312);
            String var15 = class234.field3288.method981(false);
            class199.method1237(var13, var11, class364.field5475, -594006365, var10, var14, var15, var12);
        } else if (class423.field6255 == arg1) {
            int var16 = class234.field3288.method963(-113);
            int var17 = class234.field3288.method980(-19443);
            int var18 = class116.field1497 - -((var17 & 115) >> 4);
            int var19 = class417.field6192 - -(7 & var17);
            int var20 = class234.field3288.method985(arg0 ^ -79);
            if (var18 >= 0 && ~var19 <= -1 && class362.field5442 > var18 && ~var19 > ~class203.field2813) {
                class363.method2215(class364.field5475, var18, arg0 ^ 115, var19, new class231(var20, var16));
                class409.method2447(var18, (byte) 68, var19, class364.field5475);
            }
        } else if (class7.field119 == arg1) {
            int var21 = class234.field3288.method993((byte) -127);
            int var22 = class234.field3288.method941((byte) 126);
            class114.field1471.method2132((byte) 127, var21).method2840(-10216, var22);
        } else if (class355.field5124 == arg1) {
            int var23 = class234.field3288.method996(8);
            int var24 = (var23 >> 4 & 7) + class116.field1497;
            int var25 = (var23 & 7) + class417.field6192;
            int var26 = class234.field3288.method963(-122);
            if (var26 == 65535) {
                var26 = -1;
            }
            int var27 = class234.field3288.method980(arg0 + -19445);
            int var28 = var27 >> 2;
            int var29 = var27 & 3;
            int var30 = class327.field4772[var28];
            class9.method71(var24, var28, var26, var30, var25, var29, class364.field5475, false);
        } else if (class112.field1467 == arg1) {
            int var31 = class234.field3288.method941((byte) 125);
            boolean var32 = (var31 & 128) != 0;
            int var33 = (var31 >> 3 & 7) + class116.field1497;
            int var34 = (7 & var31) + class417.field6192;
            int var35 = var33 - -class234.field3288.method946(58);
            int var36 = class234.field3288.method946(95) + var34;
            int var37 = class234.field3288.method936((byte) -96);
            int var38 = class234.field3288.method993((byte) -124);
            int var39 = 4 * class234.field3288.method941((byte) 124);
            int var40 = 4 * class234.field3288.method941((byte) 123);
            int var41 = class234.field3288.method993((byte) -94);
            int var42 = class234.field3288.method993((byte) -109);
            int var43 = class234.field3288.method941((byte) 125);
            if (~var43 == -256) {
                var43 = -1;
            }
            int var44 = class234.field3288.method941((byte) 125);
            if (var33 >= 0 && var34 >= 0 && ~class362.field5442 < ~var33 && var34 < class203.field2813 && ~var35 <= -1 && var36 >= 0 && class362.field5442 > var35 && ~class203.field2813 < ~var36 && var38 != 65535) {
                int var45 = var40 << 0;
                int var46 = var35 * 128 + 64;
                int var47 = var34 * 128 + 64;
                int var48 = var33 * 128 - -64;
                int var49 = var39 << 0;
                int var50 = var36 * 128 + 64;
                class482 var51 = new class482(var38, class364.field5475, var48, var47, var49, class263.field3748 + var41, var42 - -class263.field3748, var43, var44, var37, var45, var32);
                var51.method2804(class263.field3748 + var41, false, class103.method620(class364.field5475, var50, (byte) 20, var46) - var45, var50, var46);
                class286.field4086.method2086((byte) -117, new class16(var51));
            }
        } else if (class126.field1624 == arg1) {
            int var52 = class234.field3288.method955((byte) -126);
            int var53 = class234.field3288.method939(49510128);
            int var54 = ((var53 & 121) >> 4) + class116.field1497;
            int var55 = (7 & var53) + class417.field6192;
            int var56 = class234.field3288.method985(83);
            int var57 = class234.field3288.method955((byte) -128);
            if (~var54 <= -1 && ~var55 <= -1 && ~var54 > ~class362.field5442 && ~var55 > ~class203.field2813 && class156.field2047 != var56) {
                class363.method2215(class364.field5475, var54, arg0 + 108, var55, new class231(var52, var57));
                class409.method2447(var54, (byte) 68, var55, class364.field5475);
            }
        } else if (class464.field6728 == arg1) {
            int var58 = class234.field3288.method996(8);
            int var59 = (7 & var58 >> 4) + class116.field1497;
            int var60 = (7 & var58) + class417.field6192;
            int var61 = class234.field3288.method955((byte) -124);
            if (var59 >= 0 && ~var60 <= -1 && ~var59 > ~class362.field5442 && var60 < class203.field2813) {
                class414 var62 = (class414) class473.field6838.method2310((byte) 64, (long) (class364.field5475 << 28 | var60 << 14 | var59));
                if (var62 != null) {
                    for (class231 var63 = (class231) var62.field6139.method2096(-21400); var63 != null; var63 = (class231) var62.field6139.method2084((byte) 19)) {
                        if ((32767 & var61) == var63.field3226) {
                            var63.method536(false);
                            break;
                        }
                    }
                    if (var62.field6139.method2090(0)) {
                        var62.method536(false);
                    }
                    class409.method2447(var59, (byte) 68, var60, class364.field5475);
                }
            }
        } else if (class201.field2788 == arg1) {
            int var64 = class234.field3288.method941((byte) 126);
            int var65 = (15 & var64 >> 4) + class116.field1497 * 2;
            int var66 = class417.field6192 * 2 - -(var64 & 15);
            boolean var67 = ~class234.field3288.method941((byte) 126) != -1;
            int var68 = class234.field3288.method946(124) + var65;
            int var69 = var66 - -class234.field3288.method946(80);
            int var70 = class234.field3288.method936((byte) -96);
            int var71 = class234.field3288.method936((byte) -96);
            int var72 = class234.field3288.method993((byte) -89);
            byte var73 = class234.field3288.method946(101);
            int var74 = class234.field3288.method941((byte) 124) * 4;
            int var75 = class234.field3288.method993((byte) -83);
            int var76 = class234.field3288.method993((byte) -44);
            int var77 = class234.field3288.method941((byte) 124);
            int var78 = class234.field3288.method941((byte) 127);
            if (var77 == 255) {
                var77 = -1;
            }
            if (var65 >= 0 && ~var66 <= -1 && ~(class362.field5442 * 2) < ~var65 && ~var66 > ~(class362.field5442 * 2) && ~var68 <= -1 && var69 >= 0 && ~var68 > ~(class203.field2813 * 2) && ~(class203.field2813 * 2) < ~var69 && ~var72 != -65536) {
                int var79 = var66 * 64;
                int var80 = var69 * 64;
                int var81 = var65 * 64;
                int var82 = var73 << 0;
                int var83 = var68 * 64;
                int var84 = var74 << 0;
                if (var70 != 0) {
                    int var86;
                    class294 var88;
                    if (~var70 > -1) {
                        int var85 = -var70 - 1;
                        var86 = (31064 & var85) >> 11;
                        int var87 = 2047 & var85;
                        if (class156.field2047 != var87) {
                            var88 = class262.field3742[var87];
                        } else {
                            var88 = class415.field6145;
                        }
                    } else {
                        int var89 = var70 - 1;
                        var86 = var89 >> 11 & 15;
                        int var90 = var89 & 2047;
                        var88 = class504.field7697[var90];
                    }
                    if (var88 != null) {
                        class171 var91 = var88.method1767(16643);
                        if (var91.field2313 != null && var91.field2313[var86] != null) {
                            int var92 = var91.field2313[var86][0];
                            int var93 = var91.field2313[var86][2];
                            int var94 = var88.field4200.method222(arg0 ^ 16381);
                            int var95 = class323.field4731[var94];
                            int var96 = class323.field4733[var94];
                            int var97 = var92 * var96 + var93 * var95 >> 15;
                            int var98 = var93 * var96 + -(var92 * var95) >> 15;
                            var82 -= var91.field2313[var86][1];
                            var79 += var98;
                            var81 += var97;
                        }
                    }
                }
                class482 var100 = new class482(var72, class364.field5475, var81, var79, var82, class263.field3748 + var75, var76 - -class263.field3748, var77, var78, var71, var84, var67);
                var100.method2804(class263.field3748 + var75, false, class103.method620(class364.field5475, var80, (byte) 20, var83) - var84, var80, var83);
                class286.field4086.method2086((byte) -111, new class16(var100));
            }
        } else if (class360.field5340 == arg1) {
            int var101 = class234.field3288.method996(8);
            int var102 = ((117 & var101) >> 4) + class116.field1497;
            int var103 = (7 & var101) + class417.field6192;
            byte var104 = class234.field3288.method946(108);
            int var105 = class234.field3288.method955((byte) -122);
            int var106 = class234.field3288.method954(-1);
            int var107 = class234.field3288.method939(49510128);
            int var108 = var107 >> 2;
            int var109 = var107 & 3;
            byte var110 = class234.field3288.method949(-12754);
            byte var111 = class234.field3288.method994(128);
            int var112 = class234.field3288.method955((byte) -123);
            byte var113 = class234.field3288.method976((byte) 26);
            int var114 = class234.field3288.method993((byte) -67);
            if (!class481.field6937.method831()) {
                class32.method263(var110, var112, var104, var113, var111, (byte) 98, var114, var103, var105, var102, var109, class364.field5475, var108, var106);
            }
        } else if (class342.field4971 == arg1) {
            int var115 = class234.field3288.method985(arg0 + -22);
            int var116 = class234.field3288.method939(49510128);
            int var117 = var116 >> 2;
            int var118 = 3 & var116;
            int var119 = class327.field4772[var117];
            int var120 = class234.field3288.method941((byte) 125);
            int var121 = ((117 & var120) >> 4) + class116.field1497;
            int var122 = (var120 & 7) + class417.field6192;
            if (class85.method532(arg0 ^ 10605, class247.field3542) || var121 >= 0 && var122 >= 0 && ~var121 > ~class362.field5442 && var122 < class203.field2813) {
                class7.method62(var122, var119, var117, var121, var115, arg0 + -42, -1, 0, var118, class364.field5475);
            }
        } else {
            if (arg0 != 2) {
                method2331(89);
            }
            if (class506.field7715 != arg1) {
                if (class361.field5399 == arg1) {
                    int var131 = class234.field3288.method941((byte) 124);
                    int var132 = (15 & var131 >> 4) + class116.field1497 * 2;
                    int var133 = (var131 & 15) + class417.field6192 * 2;
                    boolean var134 = class234.field3288.method941((byte) 124) != 0;
                    int var135 = class234.field3288.method946(arg0 ^ 46) + var132;
                    int var136 = class234.field3288.method946(106) + var133;
                    int var137 = class234.field3288.method936((byte) -96);
                    int var138 = class234.field3288.method993((byte) -75);
                    int var139 = 4 * class234.field3288.method941((byte) 124);
                    int var140 = 4 * class234.field3288.method941((byte) 123);
                    int var141 = class234.field3288.method993((byte) -86);
                    int var142 = class234.field3288.method993((byte) -37);
                    int var143 = class234.field3288.method941((byte) 126);
                    if (~var143 == -256) {
                        var143 = -1;
                    }
                    int var144 = class234.field3288.method941((byte) 126);
                    if (~var132 <= -1 && ~var133 <= -1 && ~var132 > ~(class362.field5442 * 2) && var133 < class362.field5442 * 2 && var135 >= 0 && ~var136 <= -1 && ~(class203.field2813 * 2) < ~var135 && var136 < class203.field2813 * 2 && ~var138 != -65536) {
                        int var145 = var133 * 64;
                        int var146 = var136 * 64;
                        int var147 = var140 << 0;
                        int var148 = var132 * 64;
                        int var149 = var139 << 0;
                        int var150 = var135 * 64;
                        class482 var151 = new class482(var138, class364.field5475, var148, var145, var149, var141 - -class263.field3748, class263.field3748 + var142, var143, var144, var137, var147, var134);
                        var151.method2804(class263.field3748 + var141, false, class103.method620(class364.field5475, var146, (byte) 20, var150) - var147, var146, var150);
                        class286.field4086.method2086((byte) -111, new class16(var151));
                    }
                } else if (class100.field1368 == arg1) {
                    int var152 = class234.field3288.method941((byte) 123);
                    int var153 = class116.field1497 - -((var152 & 112) >> 4);
                    int var154 = (var152 & 7) + class417.field6192;
                    int var155 = class234.field3288.method993((byte) -98);
                    int var156 = class234.field3288.method941((byte) 125);
                    int var157 = class234.field3288.method993((byte) -52);
                    int var158 = class234.field3288.method941((byte) 127);
                    if (~var153 <= -1 && ~var154 <= -1 && class362.field5442 > var153 && class203.field2813 > var154) {
                        int var159 = var153 * 128 + 64;
                        int var160 = var154 * 128 - -64;
                        int var161 = class364.field5475;
                        if (~var161 > -4 && class352.method2137(var154, 95, var153)) {
                            ++var161;
                        }
                        class163 var162 = new class163(var155, var157, class263.field3748, class364.field5475, var161, var159, -var156 + class103.method620(class364.field5475, var160, (byte) 20, var159), var160, var153, var153, var154, var154, var158);
                        class488.field7470.method2086((byte) -126, new class456(var162));
                    }
                } else if (class230.field3219 == arg1) {
                    int var163 = class234.field3288.method941((byte) 127);
                    int var164 = (var163 >> 4 & 7) + class116.field1497;
                    int var165 = (var163 & 7) + class417.field6192;
                    int var166 = class234.field3288.method993((byte) -127);
                    if (~var166 == -65536) {
                        var166 = -1;
                    }
                    int var167 = class234.field3288.method941((byte) 124);
                    int var168 = (247 & var167) >> 4;
                    int var169 = 7 & var167;
                    int var170 = class234.field3288.method941((byte) 125);
                    int var171 = class234.field3288.method941((byte) 123);
                    if (~var164 <= -1 && var165 >= 0 && class362.field5442 > var164 && class203.field2813 > var165) {
                        int var172 = var168 - -1;
                        if (~class415.field6145.field4279[0] <= ~(-var172 + var164) && class415.field6145.field4279[0] <= var164 - -var172 && ~class415.field6145.field4282[0] <= ~(var165 - var172) && ~(var165 - -var172) <= ~class415.field6145.field4282[0]) {
                            class434.method2563(var171, var166, (class364.field5475 << 24) + var168 + (var164 << 16) + (var165 << 8), (byte) -97, var169, var170);
                        }
                    }
                } else {
                    class356.method2169((Throwable) null, "T3 - " + arg1, (byte) 34);
                    class202.method1246((byte) -102);
                }
            } else {
                int var123 = class234.field3288.method941((byte) 124);
                int var124 = (var123 >> 4 & 7) + class116.field1497;
                int var125 = (7 & var123) + class417.field6192;
                int var126 = class234.field3288.method993((byte) -75);
                int var127 = class234.field3288.method993((byte) -112);
                int var128 = class234.field3288.method993((byte) -76);
                if (class473.field6838 != null && ~var124 <= -1 && var125 >= 0 && ~class362.field5442 < ~var124 && ~class203.field2813 < ~var125) {
                    class414 var129 = (class414) class473.field6838.method2310((byte) -123, (long) (var125 << 14 | class364.field5475 << 28 | var124));
                    if (var129 != null) {
                        for (class231 var130 = (class231) var129.field6139.method2096(-21400); var130 != null; var130 = (class231) var129.field6139.method2084((byte) 19)) {
                            if (~(var126 & 32767) == ~var130.field3226 && ~var130.field3228 == ~var127) {
                                var130.method536(false);
                                var130.field3228 = var128;
                                class363.method2215(class364.field5475, var124, 125, var125, var130);
                                break;
                            }
                        }
                        class409.method2447(var124, (byte) 68, var125, class364.field5475);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
    public static final void method2333(int arg0) {
        if (arg0 > -120) {
            method2331(40);
        }
        ++field5754;
        if (class481.field6937 != null) {
            class253.field3653.method247(-14987);
            class445.method2601();
            class428.method2552(18583);
            class77.method508((byte) 123);
            class162.method1025(77);
            class149.method918(108);
            if (class252.field3649 != null) {
                class252.field3649.method591((byte) -103);
            }
            class503.method3028(39);
            class110.method656(false);
            class201.method1241(92);
            class265.method1630(false, -114);
            class136.method861((byte) -105);
            for (int var1 = 0; var1 < 2048; ++var1) {
                class313 var5 = class262.field3742[var1];
                if (var5 != null) {
                    var5.field4283 = null;
                    for (int var6 = 0; ~var6 > ~var5.field4276.length; ++var6) {
                        var5.field4276[var6] = null;
                    }
                }
            }
            for (int var2 = 0; class504.field7697.length > var2; ++var2) {
                class139 var3 = class504.field7697[var2];
                if (var3 != null) {
                    for (int var4 = 0; ~var3.field4276.length < ~var4; ++var4) {
                        var3.field4276[var4] = null;
                    }
                }
            }
            class481.field6937.method835(1);
            class481.field6937 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([IIIIIIIILeq;Lae;I)V")
    public final void method2334(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class134 arg8, class156 arg9, int arg10) {
        ++field5755;
        if (!super.field94) {
            if (arg10 == 4188) {
                boolean var12 = false;
                if (arg0 != null) {
                    arg0[0] = -1;
                }
                class121 var13 = null;
                int var14 = (arg6 & 7) * 8;
                int var15 = (arg5 & 7) * 8;
                while (true) {
                    while (arg9.field2018 < arg9.field2041.length) {
                        int var20 = arg9.method941((byte) 126);
                        if (var20 == 0) {
                            var13 = new class121(arg9);
                        } else if (~var20 == -2) {
                            int var34 = arg9.method941((byte) 126);
                            if (~var34 < -1) {
                                for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                    class373 var36 = new class373(arg8, arg9, 0);
                                    if (~var36.field5593 == -32) {
                                        class135 var37 = class481.field6941.method1327(122, arg9.method993((byte) -76));
                                        var36.method2268(var37.field1722, var37.field1715, 1536, var37.field1717, var37.field1720);
                                    }
                                    if (arg8.method778() > 0) {
                                        class472 var38 = var36.field5595;
                                        int var39 = var38.method2759(121) >> 7;
                                        int var40 = var38.method2761(0) >> 7;
                                        if (~var36.field5590 == ~arg3 && var39 >= var14 && var14 + 8 > var39 && ~var40 <= ~var15 && var40 < var15 + 8) {
                                            int var41 = (arg7 << 7) + class443.method2590(var38.method2761(0) & 1023, (byte) -112, var38.method2759(arg10 + -4062) & 1023, arg2);
                                            int var42 = (arg1 << 7) + class440.method2574(arg2, 1023 & var38.method2759(125), arg10 ^ -10339, var38.method2761(arg10 ^ 4188) & 1023);
                                            int var43 = var41 >> 7;
                                            int var44 = var42 >> 7;
                                            if (~var43 <= -1 && ~var44 <= -1 && ~super.field102 < ~var43 && ~super.field105 < ~var44) {
                                                var38.method1602(var42, arg10 ^ 4130, var41, super.field99[arg3][var43][var44] + -var38.method2760(-86));
                                                if (arg8.method778() > 0) {
                                                    class32.method261(var36);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (var20 == 2) {
                            if (var13 == null) {
                                var13 = new class121();
                            }
                            var13.method689(126, arg9);
                        } else if (~var20 == -129) {
                            if (arg0 == null) {
                                arg9.field2018 += 10;
                            } else {
                                arg0[0] = arg9.method993((byte) -105);
                                arg0[1] = arg9.method936((byte) -96);
                                arg0[2] = arg9.method936((byte) -96);
                                arg0[3] = arg9.method936((byte) -96);
                                arg0[4] = arg9.method993((byte) -34);
                            }
                        } else {
                            if (var20 != 129) {
                                throw new IllegalStateException("");
                            }
                            if (super.field110 == null) {
                                super.field110 = new byte[4][][];
                            }
                            for (int var21 = 0; ~var21 > -5; ++var21) {
                                byte var22 = arg9.method946(arg10 ^ 4106);
                                if (var22 == 0 && super.field110[arg4] != null) {
                                    if (var21 <= arg3) {
                                        int var23 = arg7;
                                        int var24 = arg7 - -7;
                                        int var25 = arg1;
                                        if (~arg7 <= -1) {
                                            if (~arg7 <= ~super.field102) {
                                                var23 = super.field102;
                                            }
                                        } else {
                                            var23 = 0;
                                        }
                                        if (arg1 >= 0) {
                                            if (arg1 >= super.field105) {
                                                var25 = super.field105;
                                            }
                                        } else {
                                            var25 = 0;
                                        }
                                        if (~var24 <= -1) {
                                            if (~var24 <= ~super.field102) {
                                                var24 = super.field102;
                                            }
                                        } else {
                                            var24 = 0;
                                        }
                                        int var26 = arg1 + 7;
                                        if (var26 >= 0) {
                                            if (var26 >= super.field105) {
                                                var26 = super.field105;
                                            }
                                        } else {
                                            var26 = 0;
                                        }
                                        while (var24 > var23) {
                                            while (var26 > var25) {
                                                super.field110[arg4][var23][var25] = 0;
                                                ++var25;
                                            }
                                            ++var23;
                                        }
                                    }
                                } else if (~var22 == -2) {
                                    if (super.field110[arg4] == null) {
                                        super.field110[arg4] = new byte[super.field102 + 1][super.field105 + 1];
                                    }
                                    for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                        for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                            byte var29 = arg9.method946(arg10 ^ 4141);
                                            if (~arg3 <= ~var21) {
                                                for (int var30 = var27; ~(var27 + 4) < ~var30; ++var30) {
                                                    for (int var31 = var28; ~var31 > ~(var28 + 4); ++var31) {
                                                        if (var30 >= var14 && ~(var14 - -8) < ~var30 && var15 <= var31 && var15 + 8 > var15) {
                                                            int var32 = arg7 + class503.method3030(7 & var30, -64, arg2, var31 & 7);
                                                            int var33 = arg1 - -class227.method1398(arg2, (byte) 95, var30 & 7, 7 & var31);
                                                            if (~var32 <= -1 && var32 < super.field102 && var33 >= 0 && ~super.field105 < ~var33) {
                                                                super.field110[arg4][var32][var33] = var29;
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
                        class127.method710(var13, -119, arg7 >> 3, arg1 >> 3);
                    }
                    if (!var12 && super.field110 != null && super.field110[arg4] != null) {
                        int var16 = arg7 + 7;
                        int var17 = arg1 - -7;
                        for (int var18 = arg7; ~var16 < ~var18; ++var18) {
                            for (int var19 = arg1; ~var17 < ~var19; ++var19) {
                                super.field110[arg4][var18][var19] = 0;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[B[BIIIIII)V")
    public static final void method2335(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5761;
        int var9 = -(arg0 >> 2);
        int var10 = -(3 & arg0);
        if (arg7 != 2) {
            field5750 = null;
        }
        for (int var11 = -arg4; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg8++;
                arg2[var10001] += arg1[arg3++];
                int var14 = arg8++;
                arg2[var14] += arg1[arg3++];
                int var15 = arg8++;
                arg2[var15] += arg1[arg3++];
                int var16 = arg8++;
                arg2[var16] += arg1[arg3++];
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg8++;
                arg2[var10001] += arg1[arg3++];
            }
            arg3 += arg6;
            arg8 += arg5;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Leq;I)V")
    public final void method2336(class134 arg0, int arg1) {
        ++field5763;
        class148.method916(arg0);
        if (super.field115 > 1) {
            for (int var3 = 0; ~var3 > ~super.field102; ++var3) {
                for (int var4 = 0; super.field105 > var4; ++var4) {
                    if (~(class379.field5661[1][var3][var4] & 2) == -3) {
                        class296.method1800(var3, var4);
                    }
                }
            }
        }
        int var5 = -87 / ((-73 - arg1) / 48);
        for (int var6 = 0; super.field115 > var6; ++var6) {
            for (int var7 = 0; ~super.field105 <= ~var7; ++var7) {
                for (int var8 = 0; super.field102 >= var8; ++var8) {
                    if (~(1 & super.field103[var6][var8][var7]) != -1) {
                        int var9 = var7;
                        int var10 = var7;
                        int var11 = var6;
                        while (~var9 < -1 && ~(1 & super.field103[var6][var8][var9 + -1]) != -1) {
                            --var9;
                        }
                        int var12 = var6;
                        while (~super.field105 < ~var10 && ~(1 & super.field103[var6][var8][var10 + 1]) != -1) {
                            ++var10;
                        }
                        label166: while (~var11 < -1) {
                            for (int var13 = var9; ~var13 >= ~var10; ++var13) {
                                if (~(1 & super.field103[var11 + -1][var8][var13]) == -1) {
                                    break label166;
                                }
                            }
                            --var11;
                        }
                        label155: while (var12 < 3) {
                            for (int var14 = var9; ~var10 <= ~var14; ++var14) {
                                if (~(super.field103[var12 + 1][var8][var14] & 1) == -1) {
                                    break label155;
                                }
                            }
                            ++var12;
                        }
                        int var15 = (var12 - -1 + -var11) * (-var9 + var10 + 1);
                        if (var15 >= 2) {
                            short var16 = 240;
                            int var17 = super.field99[var12][var8][var9] + -var16;
                            int var18 = super.field99[var11][var8][var9];
                            class355.method2148(1, var8 << 7, var8 << 7, var9 << 7, (var10 << 7) + 128, var17, var18);
                            for (int var19 = var11; var19 <= var12; ++var19) {
                                for (int var20 = var9; var20 <= var10; ++var20) {
                                    super.field103[var19][var8][var20] = (byte) class500.method3013(super.field103[var19][var8][var20], -2);
                                }
                            }
                        }
                    }
                    if ((2 & super.field103[var6][var8][var7]) != 0) {
                        int var21 = var8;
                        int var22 = var8;
                        int var23 = var6;
                        int var24 = var6;
                        while (~var21 < -1 && ~(2 & super.field103[var6][var21 + -1][var7]) != -1) {
                            --var21;
                        }
                        while (var22 < super.field102 && ~(2 & super.field103[var6][var22 + 1][var7]) != -1) {
                            ++var22;
                        }
                        label220: while (~var23 < -1) {
                            for (int var25 = var21; var22 >= var25; ++var25) {
                                if (~(2 & super.field103[var23 + -1][var25][var7]) == -1) {
                                    break label220;
                                }
                            }
                            --var23;
                        }
                        label209: while (var24 < 3) {
                            for (int var26 = var21; var26 <= var22; ++var26) {
                                if ((super.field103[var24 + 1][var26][var7] & 2) == 0) {
                                    break label209;
                                }
                            }
                            ++var24;
                        }
                        int var27 = (var22 + 1 - var21) * (var24 + 1 + -var23);
                        if (~var27 <= -3) {
                            short var28 = 240;
                            int var29 = super.field99[var24][var21][var7] + -var28;
                            int var30 = super.field99[var23][var21][var7];
                            class355.method2148(2, var21 << 7, (var22 << 7) + 128, var7 << 7, var7 << 7, var29, var30);
                            for (int var31 = var23; var24 >= var31; ++var31) {
                                for (int var32 = var21; ~var32 >= ~var22; ++var32) {
                                    super.field103[var31][var32][var7] = (byte) class500.method3013(super.field103[var31][var32][var7], -3);
                                }
                            }
                        }
                    }
                    if (~(4 & super.field103[var6][var8][var7]) != -1) {
                        int var33 = var8;
                        int var34 = var8;
                        int var35 = var7;
                        int var36 = var7;
                        while (var35 > 0 && (super.field103[var6][var8][var35 + -1] & 4) != 0) {
                            --var35;
                        }
                        while (~var36 > ~super.field105 && ~(4 & super.field103[var6][var8][var36 + 1]) != -1) {
                            ++var36;
                        }
                        label273: while (~var33 < -1) {
                            for (int var37 = var35; var36 >= var37; ++var37) {
                                if (~(4 & super.field103[var6][var33 + -1][var37]) == -1) {
                                    break label273;
                                }
                            }
                            --var33;
                        }
                        label262: while (var34 < super.field102) {
                            for (int var38 = var35; var36 >= var38; ++var38) {
                                if (~(4 & super.field103[var6][var34 + 1][var38]) == -1) {
                                    break label262;
                                }
                            }
                            ++var34;
                        }
                        if ((var34 - var33 - -1) * (var36 + 1 - var35) >= 4) {
                            int var39 = super.field99[var6][var33][var35];
                            class355.method2148(4, var33 << 7, (var34 << 7) - -128, var35 << 7, (var36 << 7) - -128, var39, var39);
                            for (int var40 = var33; var40 <= var34; ++var40) {
                                for (int var41 = var35; var41 <= var36; ++var41) {
                                    super.field103[var6][var40][var41] = (byte) class500.method3013(super.field103[var6][var40][var41], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field103 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lqo;IIBLeq;II)V")
    public final void method2337(class19 arg0, int arg1, int arg2, byte arg3, class134 arg4, int arg5, int arg6) {
        ++field5758;
        class113 var8 = null;
        if (arg5 == 0) {
            var8 = (class113) class478.method2795(arg2, arg1, arg6);
        }
        if (~arg5 == -2) {
            var8 = (class113) class305.method1832(arg2, arg1, arg6);
        }
        if (arg3 < 54) {
            field5759 = null;
        }
        if (arg5 == 2) {
            var8 = (class113) class124.method701(arg2, arg1, arg6, field5767 != null ? field5767 : (field5767 = method2339("sq")));
        }
        if (~arg5 == -4) {
            var8 = (class113) class79.method515(arg2, arg1, arg6);
        }
        if (var8 != null) {
            class486 var9 = class114.field1471.method2132((byte) 126, var8.method369((byte) 96));
            int var10 = var8.method362((byte) -72);
            int var11 = var8.method359(13228);
            if (var9.method2848(true)) {
                class473.method2769(arg2, arg6, var9, (byte) -57, arg1);
            }
            if (var8.method371(false)) {
                var8.method360(arg4, true);
            }
            if (~arg5 == -1) {
                class403 var12 = class478.method2795(arg2, arg1, arg6);
                if (var12 instanceof class349) {
                    ((class349) var12).field5048 = null;
                } else {
                    class211.method1303(arg2, arg1, arg6);
                }
                if (var9.field7074 != 0) {
                    arg0.method135(-1, var11, !var9.field7026, var9.field7093, arg1, var10, arg6);
                    return;
                }
                return;
            }
            if (arg5 == 1) {
                class455 var13 = class305.method1832(arg2, arg1, arg6);
                if (var13 instanceof class172) {
                    ((class172) var13).field2348 = null;
                    return;
                }
                class364.method2228(arg2, arg1, arg6);
                return;
            }
            if (arg5 == 2) {
                class210 var14 = class124.method701(arg2, arg1, arg6, field5767 != null ? field5767 : (field5767 = method2339("sq")));
                if (var14 instanceof class387 && var14.field2972 == arg1 && var14.field2975 == arg6) {
                    ((class387) var14).field5742 = null;
                } else {
                    class434.method2564(arg2, arg1, arg6, field5767 != null ? field5767 : (field5767 = method2339("sq")));
                }
                if (var9.field7074 != 0 && var9.field7036 + arg1 < super.field102 && ~(var9.field7036 + arg6) > ~super.field105 && ~(var9.field7096 + arg1) > ~super.field102 && ~(var9.field7096 + arg6) > ~super.field105) {
                    arg0.method140(var9.field7036, 3, var11, !var9.field7026, var9.field7093, var9.field7096, arg1, arg6);
                    return;
                }
                return;
            }
            if (arg5 == 3) {
                class79 var15 = class79.method515(arg2, arg1, arg6);
                if (var15 instanceof class178) {
                    ((class178) var15).field2548 = null;
                } else {
                    class174.method1092(arg2, arg1, arg6);
                }
                if (~var9.field7074 == -2) {
                    arg0.method131(arg6, -116, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
    public static final void method2338(byte arg0) {
        ++field5764;
        if (~class70.field1029 < -1) {
            class202.method1246((byte) -102);
        } else {
            class452.field6576 = class22.field294;
            if (arg0 != -86) {
                method2326((byte) -13, (class239) null);
            }
            class22.field294 = null;
            class319.method1921(15508, 40);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2339(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
