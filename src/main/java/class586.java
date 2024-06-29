import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class586 extends class188 {

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    public int field7869 = 99;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "Ldr;")
    public static class675 field7867 = new class675(6, 2);

    @OriginalMember(owner = "client!go", name = "N", descriptor = "I")
    public static int field7873 = 2;

    @OriginalMember(owner = "client!go", name = "E", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!go", name = "G", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    public static int field7874;

    // $FF: synthetic field
    @OriginalMember(owner = "client!go", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field7875;

    // $FF: synthetic method
    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3257(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IZIIIIILoa;IILld;)V", line = 3)
    public final void method3248(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class650 arg7, int arg8, int arg9, class158 arg10) {
        ++field7871;
        if (class611.field8310.method2744(class628.field8526, 4) || class28.method174(arg9, -17783, arg3, class518.field6552, arg8)) {
            if (this.field7869 > arg6) {
                this.field7869 = arg6;
            }
            class687 var12 = class232.field3017.method2358(0, arg5);
            if (!arg7.method434() || !class611.field8310.field8685 || !var12.field9465) {
                int var13;
                int var14;
                if (arg0 != 1 && arg0 != 3) {
                    var13 = var12.field9395;
                    var14 = var12.field9459;
                } else {
                    var14 = var12.field9395;
                    var13 = var12.field9459;
                }
                if (arg1) {
                    method3256(29);
                }
                int var15;
                int var16;
                if (super.field2233 >= arg3 + var14) {
                    var15 = arg3 - -(var14 >> 1);
                    var16 = (var14 + 1 >> 1) + arg3;
                } else {
                    var15 = arg3;
                    var16 = arg3 + 1;
                }
                int var17;
                int var18;
                if (~(arg9 - -var13) < ~super.field2236) {
                    var17 = arg9 + 1;
                    var18 = arg9;
                } else {
                    var18 = (var13 >> 1) + arg9;
                    var17 = arg9 - -(var13 + 1 >> 1);
                }
                class140 var19 = class299.field3801[arg8];
                int var20 = var19.method201(var15, var18) - -var19.method201(var16, var18) + var19.method201(var15, var17) + var19.method201(var16, var17) >> 2;
                int var21 = (arg3 << 9) - -(var14 << 8);
                int var22 = (arg9 << 9) - -(var13 << 8);
                boolean var23 = class560.field6992 && !super.field2240 && var12.field9399;
                if (var12.method3796(arg1)) {
                    class132.method859(var12, arg3, (class506) null, arg6, (class365) null, arg9, arg0, 3);
                }
                boolean var24 = ~arg2 == 0 && var12.field9444 == -1 && var12.field9406 == null && var12.field9421 == null && !var12.field9414;
                if (!class78.field1020 || (!class363.method2106(arg4, 64) || ~var12.field9398 == -2) && (!class187.method1110(arg4, -90) || var12.field9398 != 0)) {
                    if (~arg4 == -23) {
                        if (class611.field8310.field8679 || var12.field9382 != 0 || var12.field9426 == 1 || var12.field9461) {
                            class445 var26;
                            if (var24) {
                                class669 var25 = new class669(arg7, var12, arg8, var21, var20, var22, super.field2240, arg0, var23);
                                var26 = var25;
                                if (var25.method133(arg1)) {
                                    var25.method130(arg7, (byte) -110);
                                }
                            } else {
                                var26 = new class710(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg0, arg2);
                            }
                            class445 var27 = class618.method3444(arg6, arg3, arg9);
                            if (var27 instanceof class471) {
                                ((class471) var27).field5820 = var26;
                            } else {
                                class331.method1898(arg6, arg3, arg9, var26);
                            }
                            if (~var12.field9426 == -2 && arg10 != null) {
                                arg10.method973(arg3, 11, arg9);
                            }
                        }
                    } else if (arg4 != 10 && ~arg4 != -12) {
                        if (~arg4 <= -13 && ~arg4 >= -18 || ~arg4 <= -19 && arg4 <= 21) {
                            class597 var28;
                            if (!var24) {
                                var28 = new class623(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg3, arg3 + -1 + var14, arg9, arg9 + var13 + -1, arg4, arg0, arg2);
                            } else {
                                class522 var29 = new class522(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg3, arg3 + -1 + var14, arg9, arg9 + -1 + var13, arg4, arg0, var23);
                                var28 = var29;
                                if (var29.method133(arg1)) {
                                    var29.method130(arg7, (byte) -78);
                                }
                            }
                            class597 var30 = class513.method2796(arg6, arg3, arg9, field7875 != null ? field7875 : (field7875 = method3257("pba")));
                            if (var30 instanceof class484 && var30.field8017 == arg3 && ~var30.field8014 == ~arg9) {
                                ((class484) var30).field6007 = var28;
                            } else {
                                class223.method1332(var28, false);
                            }
                            if (class560.field6992 && !super.field2240 && ~arg4 <= -13 && arg4 <= 17 && ~arg4 != -14 && arg6 > 0 && ~var12.field9398 != -1) {
                                super.field2222[arg6][arg3][arg9] = (byte) class364.method2113(super.field2222[arg6][arg3][arg9], 4);
                            }
                            if (~var12.field9426 != -1 && arg10 != null) {
                                arg10.method977(arg3, true, var13, arg9, var12.field9378, !var12.field9448, var14);
                            }
                        } else if (arg4 == 0) {
                            int var31 = var12.field9398;
                            if (class136.field1660 && var12.field9398 == -1) {
                                var31 = 1;
                            }
                            class567 var33;
                            if (var24) {
                                class569 var32 = new class569(arg7, var12, arg8, var21, var20, var22, super.field2240, arg4, arg0, var23);
                                var33 = var32;
                                if (var32.method133(false)) {
                                    var32.method130(arg7, (byte) -104);
                                }
                            } else {
                                var33 = new class509(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg4, arg0, arg2);
                            }
                            class567 var34 = class593.method3281(arg6, arg3, arg9);
                            if (var34 instanceof class21) {
                                ((class21) var34).field226 = var33;
                            } else {
                                class437.method2405(arg6, arg3, arg9, var33, (class567) null);
                            }
                            if (class560.field6992) {
                                if (~arg0 == -1) {
                                    if (var12.field9458) {
                                        var19.method202(arg3, arg9, 50);
                                        var19.method202(arg3, arg9 + 1, 50);
                                    }
                                    if (~var31 == -2 && !super.field2240) {
                                        super.field2222[arg6][arg3][arg9] = (byte) class364.method2113(super.field2222[arg6][arg3][arg9], 1);
                                    }
                                } else if (arg0 != 1) {
                                    if (~arg0 == -3) {
                                        if (var12.field9458) {
                                            var19.method202(arg3 - -1, arg9, 50);
                                            var19.method202(arg3 - -1, arg9 + 1, 50);
                                        }
                                        if (~var31 == -2 && !super.field2240) {
                                            super.field2222[arg6][arg3 + 1][arg9] = (byte) class364.method2113(super.field2222[arg6][arg3 + 1][arg9], 1);
                                        }
                                    } else if (arg0 == 3) {
                                        if (var12.field9458) {
                                            var19.method202(arg3, arg9, 50);
                                            var19.method202(arg3 + 1, arg9, 50);
                                        }
                                        if (~var31 == -2 && !super.field2240) {
                                            super.field2222[arg6][arg3][arg9] = (byte) class364.method2113(super.field2222[arg6][arg3][arg9], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field9458) {
                                        var19.method202(arg3, arg9 + 1, 50);
                                        var19.method202(arg3 - -1, arg9 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field2240) {
                                        super.field2222[arg6][arg3][arg9 + 1] = (byte) class364.method2113(super.field2222[arg6][arg3][arg9 + 1], 2);
                                    }
                                }
                            }
                            if (var12.field9426 != 0 && arg10 != null) {
                                arg10.method981(arg3, var12.field9378, arg9, !var12.field9448, 1, arg0, arg4);
                            }
                            if (~var12.field9436 != -65) {
                                class333.method1915(arg6, arg3, arg9, var12.field9436);
                            }
                        } else if (~arg4 == -2) {
                            class567 var36;
                            if (var24) {
                                class569 var35 = new class569(arg7, var12, arg8, var21, var20, var22, super.field2240, arg4, arg0, var23);
                                if (var35.method133(false)) {
                                    var35.method130(arg7, (byte) -30);
                                }
                                var36 = var35;
                            } else {
                                var36 = new class509(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg4, arg0, arg2);
                            }
                            class567 var37 = class593.method3281(arg6, arg3, arg9);
                            if (!(var37 instanceof class21)) {
                                class437.method2405(arg6, arg3, arg9, var36, (class567) null);
                            } else {
                                ((class21) var37).field226 = var36;
                            }
                            if (var12.field9458 && class560.field6992) {
                                if (~arg0 == -1) {
                                    var19.method202(arg3, arg9 + 1, 50);
                                } else if (arg0 != 1) {
                                    if (arg0 != 2) {
                                        if (arg0 == 3) {
                                            var19.method202(arg3, arg9, 50);
                                        }
                                    } else {
                                        var19.method202(arg3 + 1, arg9, 50);
                                    }
                                } else {
                                    var19.method202(arg3 - -1, arg9 + 1, 50);
                                }
                            }
                            if (var12.field9426 != 0 && arg10 != null) {
                                arg10.method981(arg3, var12.field9378, arg9, !var12.field9448, 1, arg0, arg4);
                            }
                        } else if (arg4 == 2) {
                            int var38 = arg0 + 1 & 3;
                            class567 var41;
                            class567 var42;
                            if (var24) {
                                class569 var39 = new class569(arg7, var12, arg8, var21, var20, var22, super.field2240, arg4, arg0 + 4, var23);
                                class569 var40 = new class569(arg7, var12, arg8, var21, var20, var22, super.field2240, arg4, var38, var23);
                                if (var39.method133(false)) {
                                    var39.method130(arg7, (byte) -105);
                                }
                                var41 = var39;
                                if (var40.method133(false)) {
                                    var40.method130(arg7, (byte) -74);
                                }
                                var42 = var40;
                            } else {
                                var41 = new class509(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg4, arg0 + 4, arg2);
                                var42 = new class509(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg4, var38, arg2);
                            }
                            class437.method2405(arg6, arg3, arg9, var41, var42);
                            if (var12.field9398 == 1 && class560.field6992 && !super.field2240) {
                                if (~arg0 == -1) {
                                    super.field2222[arg6][arg3][arg9] = (byte) class364.method2113(super.field2222[arg6][arg3][arg9], 1);
                                    super.field2222[arg6][arg3][arg9 + 1] = (byte) class364.method2113(super.field2222[arg6][arg3][arg9 + 1], 2);
                                } else if (arg0 == 1) {
                                    super.field2222[arg6][arg3][arg9 + 1] = (byte) class364.method2113(super.field2222[arg6][arg3][arg9 + 1], 2);
                                    super.field2222[arg6][arg3 + 1][arg9] = (byte) class364.method2113(super.field2222[arg6][arg3 + 1][arg9], 1);
                                } else if (~arg0 != -3) {
                                    if (~arg0 == -4) {
                                        super.field2222[arg6][arg3][arg9] = (byte) class364.method2113(super.field2222[arg6][arg3][arg9], 2);
                                        super.field2222[arg6][arg3][arg9] = (byte) class364.method2113(super.field2222[arg6][arg3][arg9], 1);
                                    }
                                } else {
                                    super.field2222[arg6][arg3 - -1][arg9] = (byte) class364.method2113(super.field2222[arg6][arg3 - -1][arg9], 1);
                                    super.field2222[arg6][arg3][arg9] = (byte) class364.method2113(super.field2222[arg6][arg3][arg9], 2);
                                }
                            }
                            if (var12.field9426 != 0 && arg10 != null) {
                                arg10.method981(arg3, var12.field9378, arg9, !var12.field9448, 1, arg0, arg4);
                            }
                            if (var12.field9436 != 64) {
                                class333.method1915(arg6, arg3, arg9, var12.field9436);
                            }
                        } else if (~arg4 == -4) {
                            class567 var43;
                            if (!var24) {
                                var43 = new class509(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg4, arg0, arg2);
                            } else {
                                class569 var44 = new class569(arg7, var12, arg8, var21, var20, var22, super.field2240, arg4, arg0, var23);
                                if (var44.method133(arg1)) {
                                    var44.method130(arg7, (byte) -122);
                                }
                                var43 = var44;
                            }
                            class567 var45 = class593.method3281(arg6, arg3, arg9);
                            if (var45 instanceof class21) {
                                ((class21) var45).field226 = var43;
                            } else {
                                class437.method2405(arg6, arg3, arg9, var43, (class567) null);
                            }
                            if (var12.field9458 && class560.field6992) {
                                if (arg0 != 0) {
                                    if (~arg0 == -2) {
                                        var19.method202(arg3 + 1, arg9 - -1, 50);
                                    } else if (~arg0 == -3) {
                                        var19.method202(arg3 + 1, arg9, 50);
                                    } else if (arg0 == 3) {
                                        var19.method202(arg3, arg9, 50);
                                    }
                                } else {
                                    var19.method202(arg3, arg9 + 1, 50);
                                }
                            }
                            if (var12.field9426 != 0 && arg10 != null) {
                                arg10.method981(arg3, var12.field9378, arg9, !var12.field9448, 1, arg0, arg4);
                            }
                        } else if (~arg4 == -10) {
                            class597 var46;
                            if (!var24) {
                                var46 = new class623(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg3, arg3 - -var14 + -1, arg9, arg9 - 1 + var13, arg4, arg0, arg2);
                            } else {
                                class522 var47 = new class522(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg3, arg3, arg9, arg9, arg4, arg0, var23);
                                if (var47.method133(arg1)) {
                                    var47.method130(arg7, (byte) -123);
                                }
                                var46 = var47;
                            }
                            class597 var48 = class513.method2796(arg6, arg3, arg9, field7875 != null ? field7875 : (field7875 = method3257("pba")));
                            if (var48 instanceof class484 && ~var48.field8017 == ~arg3 && ~var48.field8014 == ~arg9) {
                                ((class484) var48).field6007 = var46;
                            } else {
                                class223.method1332(var46, false);
                            }
                            if (var12.field9426 != 0 && arg10 != null) {
                                arg10.method977(arg3, true, var13, arg9, var12.field9378, !var12.field9448, var14);
                            }
                            if (var12.field9436 != 64) {
                                class333.method1915(arg6, arg3, arg9, var12.field9436);
                            }
                        } else if (arg4 == 4) {
                            class539 var49;
                            if (!var24) {
                                var49 = new class591(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, 0, 0, 0, arg4, arg0, arg2);
                            } else {
                                class511 var50 = new class511(arg7, var12, arg8, var21, var20, var22, super.field2240, 0, 0, 0, arg4, arg0);
                                var49 = var50;
                                if (var50.method133(false)) {
                                    var50.method130(arg7, (byte) -32);
                                }
                            }
                            class539 var51 = class546.method2924(arg6, arg3, arg9);
                            if (var51 instanceof class322) {
                                ((class322) var51).field4004 = var49;
                            } else {
                                class8.method32(arg6, arg3, arg9, var49, (class539) null);
                            }
                        } else if (~arg4 == -6) {
                            int var52 = 65;
                            class310 var53 = (class310) class593.method3281(arg6, arg3, arg9);
                            if (var53 != null) {
                                var52 = class232.field3017.method2358(0, var53.method131((byte) -97)).field9436 + 1;
                            }
                            class539 var55;
                            if (var24) {
                                class511 var54 = new class511(arg7, var12, arg8, var21, var20, var22, super.field2240, 0, class400.field5076[arg0] * var52, class655.field8921[arg0] * var52, arg4, arg0);
                                var55 = var54;
                                if (var54.method133(false)) {
                                    var54.method130(arg7, (byte) -56);
                                }
                            } else {
                                var55 = new class591(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, 0, class400.field5076[arg0] * var52, class655.field8921[arg0] * var52, arg4, arg0, arg2);
                            }
                            class539 var56 = class546.method2924(arg6, arg3, arg9);
                            if (var56 instanceof class322) {
                                ((class322) var56).field4004 = var55;
                            } else {
                                class8.method32(arg6, arg3, arg9, var55, (class539) null);
                            }
                        } else if (~arg4 == -7) {
                            int var57 = 33;
                            class310 var58 = (class310) class593.method3281(arg6, arg3, arg9);
                            if (var58 != null) {
                                var57 = 1 + class232.field3017.method2358(0, var58.method131((byte) -97)).field9436 / 2;
                            }
                            class539 var60;
                            if (var24) {
                                class511 var59 = new class511(arg7, var12, arg8, var21, var20, var22, super.field2240, arg0, class400.field5076[arg0] * var57, class655.field8921[arg0] * var57, arg4, arg0 + 4);
                                var60 = var59;
                                if (var59.method133(false)) {
                                    var59.method130(arg7, (byte) -67);
                                }
                            } else {
                                var60 = new class591(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg0, class665.field9026[arg0] * var57, class657.field8937[arg0] * var57, arg4, arg0 + 4, arg2);
                            }
                            class539 var61 = class546.method2924(arg6, arg3, arg9);
                            if (!(var61 instanceof class322)) {
                                class8.method32(arg6, arg3, arg9, var60, (class539) null);
                            } else {
                                ((class322) var61).field4004 = var60;
                            }
                        } else if (~arg4 == -8) {
                            int var62 = arg0 + 2 & 3;
                            class539 var63;
                            if (!var24) {
                                var63 = new class591(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, var62, 0, 0, arg4, var62 + 4, arg2);
                            } else {
                                class511 var64 = new class511(arg7, var12, arg8, var21, var20, var22, super.field2240, var62, 0, 0, arg4, var62 + 4);
                                var63 = var64;
                                if (var64.method133(false)) {
                                    var64.method130(arg7, (byte) -87);
                                }
                            }
                            class539 var65 = class546.method2924(arg6, arg3, arg9);
                            if (var65 instanceof class322) {
                                ((class322) var65).field4004 = var63;
                            } else {
                                class8.method32(arg6, arg3, arg9, var63, (class539) null);
                            }
                        } else if (arg4 == 8) {
                            int var66 = 3 & arg0 - -2;
                            int var67 = 33;
                            class310 var68 = (class310) class593.method3281(arg6, arg3, arg9);
                            if (var68 != null) {
                                var67 = class232.field3017.method2358(0, var68.method131((byte) -97)).field9436 / 2 - -1;
                            }
                            class539 var70;
                            class539 var72;
                            if (!var24) {
                                class591 var69 = new class591(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg0, class665.field9026[arg0] * var67, class657.field8937[arg0] * var67, arg4, arg0 + 4, arg2);
                                var70 = var69;
                                class591 var71 = new class591(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg0, 0, 0, arg4, var66 - -4, arg2);
                                var72 = var71;
                            } else {
                                class511 var73 = new class511(arg7, var12, arg8, var21, var20, var22, super.field2240, arg0, class665.field9026[arg0] * var67, class657.field8937[arg0] * var67, arg4, arg0 + 4);
                                class511 var74 = new class511(arg7, var12, arg8, var21, var20, var22, super.field2240, arg0, 0, 0, arg4, var66 + 4);
                                if (var73.method133(false)) {
                                    var73.method130(arg7, (byte) -108);
                                }
                                var70 = var73;
                                if (var74.method133(false)) {
                                    var74.method130(arg7, (byte) -108);
                                }
                                var72 = var74;
                            }
                            class8.method32(arg6, arg3, arg9, var70, var72);
                        }
                    } else {
                        class522 var75 = null;
                        int var76;
                        class597 var77;
                        if (!var24) {
                            var76 = 15;
                            var77 = new class623(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg3, arg3 + -1 + var14, arg9, arg9 - -var13 + -1, arg4, arg0, arg2);
                        } else {
                            class522 var78 = new class522(arg7, var12, arg6, arg8, var21, var20, var22, super.field2240, arg3, arg3 - 1 + var14, arg9, var13 + -1 + arg9, arg4, arg0, var23);
                            var75 = var78;
                            var76 = var78.method2820(4);
                            var77 = var78;
                        }
                        class597 var79 = class513.method2796(arg6, arg3, arg9, field7875 != null ? field7875 : (field7875 = method3257("pba")));
                        boolean var80 = false;
                        if (var79 instanceof class484 && var79.field8017 == arg3 && var79.field8014 == arg9) {
                            var80 = true;
                            ((class484) var79).field6007 = var77;
                        }
                        if (var80 || class223.method1332(var77, false)) {
                            if (var75 != null && var75.method133(arg1)) {
                                var75.method130(arg7, (byte) -102);
                            }
                            if (var12.field9458 && class560.field6992) {
                                if (~var76 < -31) {
                                    var76 = 30;
                                }
                                for (int var81 = 0; ~var14 <= ~var81; ++var81) {
                                    for (int var82 = 0; ~var13 <= ~var82; ++var82) {
                                        var19.method202(arg3 + var81, arg9 - -var82, var76);
                                    }
                                }
                            }
                        }
                        if (~var12.field9426 != -1 && arg10 != null) {
                            arg10.method977(arg3, true, var13, arg9, var12.field9378, !var12.field9448, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([BII[Lld;Loa;IIIIII)V", line = 713)
    public final void method3249(byte[] arg0, int arg1, int arg2, class158[] arg3, class650 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg1 != 4) {
            field7867 = null;
        }
        ++field7870;
        class572 var12 = new class572(arg0);
        int var13 = -1;
        while (true) {
            int var14 = var12.method3069((byte) 115);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method3033((byte) 91);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = var15 >> 6 & 63;
                int var19 = var15 >> 12;
                int var20 = var12.method3097((byte) 12);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg7 == var19 && var18 >= arg8 && var18 < arg8 - -8 && ~var17 <= ~arg2 && ~(arg2 - -8) < ~var17) {
                    class687 var23 = class232.field3017.method2358(0, var13);
                    int var24 = arg5 + class278.method1677(var22, var23.field9395, var23.field9459, var18 & 7, 121, arg10, 7 & var17);
                    int var25 = class3.method5(-11603, var17 & 7, var23.field9395, var23.field9459, var18 & 7, arg10, var22) + arg6;
                    if (~var24 < -1 && var25 > 0 && ~(super.field2233 + -1) < ~var24 && ~var25 > ~(super.field2236 + -1)) {
                        class158 var26 = null;
                        if (!super.field2240) {
                            int var27 = arg9;
                            if ((2 & class234.field3033[1][var24][var25]) == 2) {
                                var27 = arg9 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg3[var27];
                            }
                        }
                        this.method3248(3 & var22 - -arg10, false, -1, var24, var21, var13, arg9, arg4, arg9, var25, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lld;ILoa;IIBI)V", line = 803)
    public final void method3250(class158 arg0, int arg1, class650 arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field7864;
        class310 var8 = null;
        int var9 = 65 / ((arg5 - -48) / 56);
        if (arg6 == 0) {
            var8 = (class310) class593.method3281(arg3, arg1, arg4);
        }
        if (~arg6 == -2) {
            var8 = (class310) class546.method2924(arg3, arg1, arg4);
        }
        if (arg6 == 2) {
            var8 = (class310) class513.method2796(arg3, arg1, arg4, field7875 != null ? field7875 : (field7875 = method3257("pba")));
        }
        if (arg6 == 3) {
            var8 = (class310) class618.method3444(arg3, arg1, arg4);
        }
        if (var8 != null) {
            class687 var10 = class232.field3017.method2358(0, var8.method131((byte) -97));
            int var11 = var8.method138(8470);
            int var12 = var8.method139((byte) 57);
            if (var10.method3796(false)) {
                class477.method2609(var10, arg3, -128, arg1, arg4);
            }
            if (var8.method133(false)) {
                var8.method136(arg2, 27);
            }
            if (arg6 == 0) {
                class567 var13 = class593.method3281(arg3, arg1, arg4);
                if (!(var13 instanceof class21)) {
                    class82.method628(arg3, arg1, arg4);
                } else {
                    ((class21) var13).field226 = null;
                }
                if (var10.field9426 != 0) {
                    arg0.method978(!var10.field9448, var11, var10.field9378, arg1, 16384, var12, arg4);
                    return;
                }
            } else if (arg6 != 1) {
                if (~arg6 != -3) {
                    if (~arg6 == -4) {
                        class445 var14 = class618.method3444(arg3, arg1, arg4);
                        if (!(var14 instanceof class471)) {
                            class167.method1014(arg3, arg1, arg4);
                        } else {
                            ((class471) var14).field5820 = null;
                        }
                        if (~var10.field9426 == -2) {
                            arg0.method972(arg1, arg4, 125);
                            return;
                        }
                    }
                    return;
                }
                class597 var15 = class513.method2796(arg3, arg1, arg4, field7875 != null ? field7875 : (field7875 = method3257("pba")));
                if (var15 instanceof class484 && ~var15.field8017 == ~arg1 && var15.field8014 == arg4) {
                    ((class484) var15).field6007 = null;
                } else {
                    class288.method1731(arg3, arg1, arg4, field7875 != null ? field7875 : (field7875 = method3257("pba")));
                }
                if (var10.field9426 != 0 && ~(var10.field9459 + arg1) > ~super.field2233 && var10.field9459 + arg4 < super.field2236 && super.field2233 > var10.field9395 + arg1 && ~(var10.field9395 + arg4) > ~super.field2236) {
                    arg0.method967(arg4, var10.field9395, var10.field9459, false, !var10.field9448, var12, arg1, var10.field9378);
                    return;
                }
            } else {
                class539 var16 = class546.method2924(arg3, arg1, arg4);
                if (!(var16 instanceof class322)) {
                    class305.method1817(arg3, arg1, arg4);
                    return;
                }
                ((class322) var16).field4004 = null;
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIILji;Loa;[IIII)V", line = 914)
    public final void method3251(int arg0, int arg1, int arg2, int arg3, int arg4, class572 arg5, class650 arg6, int[] arg7, int arg8, int arg9, int arg10) {
        ++field7868;
        if (!super.field2240) {
            boolean var12 = false;
            class284 var13 = null;
            if (arg7 != null) {
                arg7[0] = -1;
            }
            int var14 = (arg3 & 7) * arg1;
            int var15 = (7 & arg2) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (~arg5.field7313 > ~arg5.field7318.length) {
                                int var20 = arg5.method3097((byte) 12);
                                if (var20 != 0) {
                                    if (var20 != 1) {
                                        if (var20 != 2) {
                                            if (var20 == 128) {
                                                if (arg7 != null) {
                                                    arg7[0] = arg5.method3031(-1);
                                                    arg7[1] = arg5.method3086(65280);
                                                    arg7[2] = arg5.method3086(65280);
                                                    arg7[3] = arg5.method3086(65280);
                                                    arg7[4] = arg5.method3031(-1);
                                                } else {
                                                    arg5.field7313 += 10;
                                                }
                                            } else {
                                                if (var20 != 129) {
                                                    throw new IllegalStateException("");
                                                }
                                                if (super.field2228 == null) {
                                                    super.field2228 = new byte[4][][];
                                                }
                                                for (int var21 = 0; ~var21 > -5; ++var21) {
                                                    byte var22 = arg5.method3083(255);
                                                    if (~var22 == -1 && super.field2228[arg10] != null) {
                                                        if (~arg0 <= ~var21) {
                                                            int var23 = arg9;
                                                            int var24 = arg9 - -7;
                                                            int var25 = arg4;
                                                            if (~arg9 > -1) {
                                                                var23 = 0;
                                                            } else if (super.field2233 <= arg9) {
                                                                var23 = super.field2233;
                                                            }
                                                            if (~var24 <= -1) {
                                                                if (~super.field2233 >= ~var24) {
                                                                    var24 = super.field2233;
                                                                }
                                                            } else {
                                                                var24 = 0;
                                                            }
                                                            if (arg4 < 0) {
                                                                var25 = 0;
                                                            } else if (~super.field2236 >= ~arg4) {
                                                                var25 = super.field2236;
                                                            }
                                                            int var26 = arg4 + 7;
                                                            if (~var26 > -1) {
                                                                var26 = 0;
                                                            } else if (~super.field2236 >= ~var26) {
                                                                var26 = super.field2236;
                                                            }
                                                            while (~var23 > ~var24) {
                                                                while (var25 < var26) {
                                                                    super.field2228[arg10][var23][var25] = 0;
                                                                    ++var25;
                                                                }
                                                                ++var23;
                                                            }
                                                        }
                                                    } else if (~var22 == -2) {
                                                        if (super.field2228[arg10] == null) {
                                                            super.field2228[arg10] = new byte[super.field2233 + 1][super.field2236 - -1];
                                                        }
                                                        for (int var27 = 0; var27 < 64; var27 += 4) {
                                                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                                                byte var29 = arg5.method3083(255);
                                                                if (~var21 >= ~arg0) {
                                                                    for (int var30 = var27; ~var30 > ~(var27 - -4); ++var30) {
                                                                        for (int var31 = var28; var28 + 4 > var31; ++var31) {
                                                                            if (~var14 >= ~var30 && var14 - -8 > var30 && var31 >= var15 && ~(var15 + 8) < ~var15) {
                                                                                int var32 = class122.method806((byte) 85, 7 & var30, arg8, var31 & 7) + arg9;
                                                                                int var33 = class379.method2184(var30 & 7, var31 & 7, arg1 + -6, arg8) + arg4;
                                                                                if (~var32 <= -1 && var32 < super.field2233 && var33 >= 0 && ~var33 > ~super.field2236) {
                                                                                    super.field2228[arg10][var32][var33] = var29;
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
                                        } else {
                                            if (var13 == null) {
                                                var13 = new class284();
                                            }
                                            var13.method1711(arg5, arg1 + -15358);
                                        }
                                    } else {
                                        int var34 = arg5.method3097((byte) 12);
                                        if (var34 > 0) {
                                            for (int var35 = 0; var34 > var35; ++var35) {
                                                class660 var36 = new class660(arg6, arg5, 2);
                                                if (~var36.field8959 == -32) {
                                                    class438 var37 = class558.field6987.method2540(arg5.method3031(-1), (byte) -98);
                                                    var36.method3678(var37.field5515, var37.field5514, var37.field5513, var37.field5521, (byte) 33);
                                                }
                                                if (~arg6.method430() < -1) {
                                                    class227 var38 = var36.field8960;
                                                    int var39 = var38.method1374((byte) 31) >> 9;
                                                    int var40 = var38.method1370((byte) -5) >> 9;
                                                    if (var36.field8956 == arg0 && ~var39 <= ~var14 && var39 < var14 + 8 && ~var15 >= ~var40 && var40 < var15 + 8) {
                                                        int var41 = class164.method1007(false, arg8, 4095 & var38.method1374((byte) 94), var38.method1370((byte) -5) & 4095) + (arg9 << 9);
                                                        int var42 = (arg4 << 9) - -class46.method281(var38.method1374((byte) 98) & 4095, (byte) 94, arg8, var38.method1370((byte) -5) & 4095);
                                                        int var43 = var41 >> 9;
                                                        int var44 = var42 >> 9;
                                                        if (~var43 <= -1 && ~var44 <= -1 && ~var43 > ~super.field2233 && ~super.field2236 < ~var44) {
                                                            var38.method116((byte) 86, var41, var42, super.field2232[arg0][var43][var44] - var38.method1373((byte) -72));
                                                            class628.method3506(var36);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    var13 = new class284(arg5);
                                }
                            }
                            if (var13 != null) {
                                class243.method1462(var13, arg9 >> 3, arg4 >> 3, arg1 + 79);
                            }
                            if (!var12 && super.field2228 != null && super.field2228[arg10] != null) {
                                int var16 = arg9 + 7;
                                int var17 = arg4 - -7;
                                for (int var18 = arg9; var18 < var16; ++var18) {
                                    for (int var19 = arg4; ~var17 < ~var19; ++var19) {
                                        super.field2228[arg10][var18][var19] = 0;
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
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I[Lld;Loa;II[B)V", line = 1211)
    public final void method3252(int arg0, class158[] arg1, class650 arg2, int arg3, int arg4, byte[] arg5) {
        if (arg0 != 0) {
            this.method3250((class158) null, -28, (class650) null, -3, -115, (byte) -55, 100);
        }
        ++field7872;
        class572 var7 = new class572(arg5);
        int var8 = -1;
        while (true) {
            int var9 = var7.method3069((byte) 103);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method3033((byte) 91);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = (var10 & 4032) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method3097((byte) 12);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg4 + var13;
                int var19 = var12 - -arg3;
                if (~var18 < -1 && var19 > 0 && super.field2233 + -1 > var18 && super.field2236 + -1 > var19) {
                    class158 var20 = null;
                    if (!super.field2240) {
                        int var21 = var14;
                        if ((class234.field3033[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg1[var21];
                        }
                    }
                    this.method3248(var17, false, -1, var18, var16, var8, var14, arg2, var14, var19, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BLpfa;)V", line = 1287)
    public static final void method3253(byte arg0, class275 arg1) {
        class480.field5978 = arg1.method1651("hitmarks", (byte) 77);
        ++field7865;
        class51.field646 = arg1.method1651("hitbar_default", (byte) 77);
        class550.field6908 = arg1.method1651("timerbar_default", (byte) 77);
        class364.field4665 = arg1.method1651("headicons_pk", (byte) 77);
        int var2 = -98 / ((arg0 - 24) / 42);
        class631.field8564 = arg1.method1651("headicons_prayer", (byte) 77);
        class17.field169 = arg1.method1651("hint_headicons", (byte) 77);
        class56.field718 = arg1.method1651("hint_mapmarkers", (byte) 77);
        class177.field2070 = arg1.method1651("mapflag", (byte) 77);
        class301.field3835 = arg1.method1651("cross", (byte) 77);
        class696.field9642 = arg1.method1651("mapdots", (byte) 77);
        class207.field2452 = arg1.method1651("scrollbar", (byte) 77);
        class477.field5950 = arg1.method1651("name_icons", (byte) 77);
        class687.field9451 = arg1.method1651("floorshadows", (byte) 77);
        class290.field3665 = arg1.method1651("compass", (byte) 77);
        class410.field5277 = arg1.method1651("otherlevel", (byte) 77);
        class90.field1162 = arg1.method1651("hint_mapedge", (byte) 77);
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIZ)V", line = 1975)
    public class586(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class55.field707, class329.field4092);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILoa;I[IILji;)V", line = 1323)
    public final void method3254(int arg0, class650 arg1, int arg2, int[] arg3, int arg4, class572 arg5) {
        ++field7866;
        if (!super.field2240) {
            if (arg2 != 1775) {
                this.field7869 = -66;
            }
            boolean var7 = false;
            class284 var8 = null;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            while (true) {
                int var19;
                label313: do {
                    while (true) {
                        while (arg5.field7313 < arg5.field7318.length) {
                            int var18 = arg5.method3097((byte) 12);
                            if (~var18 != -1) {
                                if (var18 == 1) {
                                    var19 = arg5.method3097((byte) 12);
                                    continue label313;
                                }
                                if (var18 == 2) {
                                    if (var8 == null) {
                                        var8 = new class284();
                                    }
                                    var8.method1711(arg5, -15350);
                                } else if (~var18 == -129) {
                                    if (arg3 == null) {
                                        arg5.field7313 += 10;
                                    } else {
                                        arg3[0] = arg5.method3031(-1);
                                        arg3[1] = arg5.method3086(arg2 + 63505);
                                        arg3[2] = arg5.method3086(65280);
                                        arg3[3] = arg5.method3086(65280);
                                        arg3[4] = arg5.method3031(arg2 + -1776);
                                    }
                                } else {
                                    if (~var18 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field2228 == null) {
                                        super.field2228 = new byte[4][][];
                                    }
                                    var7 = true;
                                    for (int var28 = 0; ~var28 > -5; ++var28) {
                                        byte var29 = arg5.method3083(255);
                                        if (var29 == 0 && super.field2228[var28] != null) {
                                            int var30 = arg4;
                                            int var31 = arg4 + 64;
                                            int var32 = arg0;
                                            int var33 = arg0 - -64;
                                            if (~arg4 > -1) {
                                                var30 = 0;
                                            } else if (~super.field2233 >= ~arg4) {
                                                var30 = super.field2233;
                                            }
                                            if (var31 >= 0) {
                                                if (~super.field2233 >= ~var31) {
                                                    var31 = super.field2233;
                                                }
                                            } else {
                                                var31 = 0;
                                            }
                                            if (~arg0 <= -1) {
                                                if (~super.field2236 >= ~arg0) {
                                                    var32 = super.field2236;
                                                }
                                            } else {
                                                var32 = 0;
                                            }
                                            if (~var33 > -1) {
                                                var33 = 0;
                                            } else if (~var33 <= ~super.field2236) {
                                                var33 = super.field2236;
                                            }
                                            while (var31 > var30) {
                                                while (var32 < var33) {
                                                    super.field2228[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (var29 == 1) {
                                            if (super.field2228[var28] == null) {
                                                super.field2228[var28] = new byte[super.field2233 + 1][super.field2236 + 1];
                                            }
                                            for (int var34 = 0; var34 < 64; var34 += 4) {
                                                for (int var35 = 0; var35 < 64; var35 += 4) {
                                                    byte var36 = arg5.method3083(arg2 + -1520);
                                                    for (int var37 = var34 - -arg4; ~var37 > ~(arg4 + var34 + 4); ++var37) {
                                                        for (int var38 = arg0 + var35; ~var38 > ~(arg0 + var35 - -4); ++var38) {
                                                            if (var37 >= 0 && ~super.field2233 < ~var37 && ~var38 <= -1 && ~super.field2236 < ~var38) {
                                                                super.field2228[var28][var37][var38] = var36;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (var29 == 2) {
                                            if (super.field2228[var28] == null) {
                                                super.field2228[var28] = new byte[super.field2233 - -1][super.field2236 + 1];
                                            }
                                            if (~var28 < -1) {
                                                int var39 = arg4;
                                                int var40 = arg4 + 64;
                                                int var41 = arg0;
                                                if (~var40 <= -1) {
                                                    if (super.field2233 <= var40) {
                                                        var40 = super.field2233;
                                                    }
                                                } else {
                                                    var40 = 0;
                                                }
                                                if (arg4 < 0) {
                                                    var39 = 0;
                                                } else if (super.field2233 <= arg4) {
                                                    var39 = super.field2233;
                                                }
                                                if (arg0 < 0) {
                                                    var41 = 0;
                                                } else if (arg0 >= super.field2236) {
                                                    var41 = super.field2236;
                                                }
                                                int var42 = arg0 + 64;
                                                if (var42 < 0) {
                                                    var42 = 0;
                                                } else if (~super.field2236 >= ~var42) {
                                                    var42 = super.field2236;
                                                }
                                                while (~var40 < ~var39) {
                                                    while (~var41 > ~var42) {
                                                        super.field2228[var28][var39][var41] = super.field2228[var28 - 1][var39][var41];
                                                        ++var41;
                                                    }
                                                    ++var39;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class284(arg5);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; ~var9 > -9; ++var9) {
                                for (int var10 = 0; ~var10 > -9; ++var10) {
                                    int var11 = (arg4 >> 3) - -var9;
                                    int var12 = (arg0 >> 3) + var10;
                                    if (~var11 <= -1 && ~var11 > ~(super.field2233 >> 3) && var12 >= 0 && super.field2236 >> 3 > var12) {
                                        class243.method1462(var8, var11, var12, -79);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field2228 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field2228[var13] != null) {
                                    for (int var14 = 0; ~var14 > -17; ++var14) {
                                        for (int var15 = 0; var15 < 16; ++var15) {
                                            int var16 = (arg4 >> 2) + var14;
                                            int var17 = (arg0 >> 2) - -var15;
                                            if (~var16 <= -1 && ~var16 > -27 && ~var17 <= -1 && ~var17 > -27) {
                                                super.field2228[var13][var16][var17] = 0;
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
                for (int var20 = 0; var19 > var20; ++var20) {
                    class660 var21 = new class660(arg1, arg5, 2);
                    if (var21.field8959 == 31) {
                        class438 var22 = class558.field6987.method2540(arg5.method3031(-1), (byte) -105);
                        var21.method3678(var22.field5515, var22.field5514, var22.field5513, var22.field5521, (byte) 33);
                    }
                    if (~arg1.method430() < -1) {
                        class227 var23 = var21.field8960;
                        int var24 = (arg4 << 9) + var23.method1374((byte) 93);
                        int var25 = var23.method1370((byte) -5) + (arg0 << 9);
                        int var26 = var24 >> 9;
                        int var27 = var25 >> 9;
                        if (var26 >= 0 && var27 >= 0 && super.field2233 > var26 && super.field2236 > var27) {
                            var23.method116((byte) -11, var24, var25, super.field2232[var21.field8956][var26][var27] - var23.method1373((byte) -46));
                            class628.method3506(var21);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BLoa;)V", line = 1689)
    public final void method3255(byte arg0, class650 arg1) {
        class14.method79(arg1);
        ++field7874;
        if (super.field2221 > 1) {
            for (int var3 = 0; ~var3 > ~super.field2233; ++var3) {
                for (int var4 = 0; var4 < super.field2236; ++var4) {
                    if (~(2 & class234.field3033[1][var3][var4]) == -3) {
                        class706.method3899(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; ~var5 > ~super.field2221; ++var5) {
            for (int var6 = 0; ~super.field2236 <= ~var6; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field2233; ++var7) {
                    if ((1 & super.field2222[var5][var7][var6]) != 0) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var8 > 0 && ~(super.field2222[var5][var7][var8 + -1] & 1) != -1) {
                            --var8;
                        }
                        int var11 = var5;
                        while (~var9 > ~super.field2236 && (super.field2222[var5][var7][var9 - -1] & 1) != 0) {
                            ++var9;
                        }
                        label171: while (var10 > 0) {
                            for (int var12 = var8; var12 <= var9; ++var12) {
                                if (~(1 & super.field2222[var10 + -1][var7][var12]) == -1) {
                                    break label171;
                                }
                            }
                            --var10;
                        }
                        label160: while (~var11 > -4) {
                            for (int var13 = var8; ~var9 <= ~var13; ++var13) {
                                if (~(super.field2222[var11 - -1][var7][var13] & 1) == -1) {
                                    break label160;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var9 - var8 - -1) * (-var10 + var11 + 1);
                        if (var14 >= 2) {
                            short var15 = 960;
                            int var16 = super.field2232[var11][var7][var8] + -var15;
                            int var17 = super.field2232[var10][var7][var8];
                            class659.method3677(1, var7 << 9, var7 << 9, var8 << 9, (var9 << 9) + 512, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; ~var9 <= ~var19; ++var19) {
                                    super.field2222[var18][var7][var19] = (byte) class109.method762(super.field2222[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(super.field2222[var5][var7][var6] & 2) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var20 < -1 && (2 & super.field2222[var5][var20 + -1][var6]) != 0) {
                            --var20;
                        }
                        while (var21 < super.field2233 && (2 & super.field2222[var5][var21 + 1][var6]) != 0) {
                            ++var21;
                        }
                        int var23 = var5;
                        label225: while (var22 > 0) {
                            for (int var24 = var20; var21 >= var24; ++var24) {
                                if (~(2 & super.field2222[var22 + -1][var24][var6]) == -1) {
                                    break label225;
                                }
                            }
                            --var22;
                        }
                        label214: while (~var23 > -4) {
                            for (int var25 = var20; var21 >= var25; ++var25) {
                                if ((super.field2222[var23 + 1][var25][var6] & 2) == 0) {
                                    break label214;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var23 - -1 + -var22) * (-var20 + var21 + 1);
                        if (~var26 <= -3) {
                            short var27 = 960;
                            int var28 = super.field2232[var23][var20][var6] + -var27;
                            int var29 = super.field2232[var22][var20][var6];
                            class659.method3677(2, var20 << 9, (var21 << 9) - -512, var6 << 9, var6 << 9, var28, var29);
                            for (int var30 = var22; ~var23 <= ~var30; ++var30) {
                                for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                    super.field2222[var30][var31][var6] = (byte) class109.method762(super.field2222[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((4 & super.field2222[var5][var7][var6]) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (~var34 < -1 && ~(super.field2222[var5][var7][var34 + -1] & 4) != -1) {
                            --var34;
                        }
                        while (var35 < super.field2236 && (super.field2222[var5][var7][var35 + 1] & 4) != 0) {
                            ++var35;
                        }
                        label279: while (var32 > 0) {
                            for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                if (~(4 & super.field2222[var5][var32 - 1][var36]) == -1) {
                                    break label279;
                                }
                            }
                            --var32;
                        }
                        label268: while (~var33 > ~super.field2233) {
                            for (int var37 = var34; var37 <= var35; ++var37) {
                                if (~(super.field2222[var5][var33 + 1][var37] & 4) == -1) {
                                    break label268;
                                }
                            }
                            ++var33;
                        }
                        if ((var33 + 1 - var32) * (var35 - var34 + 1) >= 4) {
                            int var38 = super.field2232[var5][var32][var34];
                            class659.method3677(4, var32 << 9, (var33 << 9) - -512, var34 << 9, (var35 << 9) + 512, var38, var38);
                            for (int var39 = var32; var39 <= var33; ++var39) {
                                for (int var40 = var34; ~var40 >= ~var35; ++var40) {
                                    super.field2222[var5][var39][var40] = (byte) class109.method762(super.field2222[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= -124) {
            field7873 = -74;
        }
        super.field2222 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 1978)
    public static void method3256(int arg0) {
        field7867 = null;
        if (arg0 != 12790) {
            method3256(-31);
        }
    }
}
