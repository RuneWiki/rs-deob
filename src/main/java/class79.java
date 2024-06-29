import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class79 extends class761 {

    @OriginalMember(owner = "client!qv", name = "O", descriptor = "I")
    public int field1182 = 99;

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "I")
    public static int field1174 = 0;

    @OriginalMember(owner = "client!qv", name = "L", descriptor = "[I")
    public static int[] field1179 = new int[1];

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!qv", name = "H", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!qv", name = "J", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!qv", name = "K", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!qv", name = "M", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!qv", name = "N", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!qv", name = "P", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!qv", name = "Q", descriptor = "I")
    public static int field1184;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qv", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field1185;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIBIILkn;ILha;III)V")
    public final void method700(int arg0, int arg1, byte arg2, int arg3, int arg4, class340 arg5, int arg6, class475 arg7, int arg8, int arg9, int arg10) {
        ++field1173;
        if (class420.field5820.field9495.method1677(17539) != 0 || class530.method3091(arg6, class112.field1620, -113, arg1, arg4)) {
            if (~this.field1182 < ~arg3) {
                this.field1182 = arg3;
            }
            class416 var12 = class312.field4418.method369((byte) 126, arg9);
            if (class420.field5820.field9487.method3081(17539) != 0 || !var12.field5725) {
                int var13;
                int var14;
                if (~arg10 != -2 && ~arg10 != -4) {
                    var13 = var12.field5734;
                    var14 = var12.field5776;
                } else {
                    var14 = var12.field5734;
                    var13 = var12.field5776;
                }
                int var15;
                int var16;
                if (~super.field10536 <= ~(arg6 + var14)) {
                    var15 = (var14 + 1 >> 1) + arg6;
                    var16 = arg6 - -(var14 >> 1);
                } else {
                    var16 = arg6;
                    var15 = arg6 - -1;
                }
                int var17;
                int var18;
                if (super.field10554 < arg1 + var13) {
                    var17 = arg1;
                    var18 = arg1 - -1;
                } else {
                    var17 = arg1 - -(var13 >> 1);
                    var18 = (var13 + 1 >> 1) + arg1;
                }
                class419 var19 = class678.field9594[arg4];
                int var20 = var19.method2476(var17, var16, -1) - -var19.method2476(var17, var15, -1) + (var19.method2476(var18, var16, -1) - -var19.method2476(var18, var15, -1)) >> 2;
                int var21 = (arg6 << 9) - -(var14 << 8);
                int var22 = (arg1 << 9) + (var13 << 8);
                boolean var23 = class219.field3210 && !super.field10544 && var12.field5707;
                if (var12.method2457(8)) {
                    class616.method3542((class506) null, (class21) null, arg10, arg1, var12, (byte) 127, arg3, arg6);
                }
                boolean var24 = arg8 == -1 && ~var12.field5744 == 0 && var12.field5703 == null && var12.field5736 == null && !var12.field5758 && !var12.field5753;
                if (!class327.field4650 || (!class229.method1564(false, arg0) || ~var12.field5787 == -2) && (!class504.method2945((byte) -109, arg0) || var12.field5787 != 0)) {
                    if (~arg0 == -23) {
                        if (~class420.field5820.field9479.method288(17539) != -1 || var12.field5754 != 0 || ~var12.field5693 == -2 || var12.field5783) {
                            class203 var25;
                            if (!var24) {
                                var25 = new class457(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg10, arg8);
                            } else {
                                class651 var26 = new class651(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg10, var23);
                                if (var26.method1164((byte) 4)) {
                                    var26.method1169(-10526, arg7);
                                }
                                var25 = var26;
                            }
                            class424.method2496(arg3, arg6, arg1, var25);
                            if (~var12.field5693 == -2 && arg5 != null) {
                                arg5.method2087((byte) 51, arg6, arg1);
                            }
                        }
                    } else if (arg0 != 10 && ~arg0 != -12) {
                        if (~arg0 <= -13 && arg0 <= 17 || arg0 >= 18 && ~arg0 >= -22) {
                            class208 var27;
                            if (!var24) {
                                var27 = new class148(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg6, var14 + -1 + arg6, arg1, arg1 + var13 + -1, arg0, arg10, arg8);
                            } else {
                                class497 var28 = new class497(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg6, arg6 + var14 + -1, arg1, arg1 + var13 + -1, arg0, arg10, var23);
                                var27 = var28;
                                if (var28.method1164((byte) 4)) {
                                    var28.method1169(-10526, arg7);
                                }
                            }
                            class630.method3597(var27, false);
                            if (class219.field3210 && !super.field10544 && arg0 >= 12 && ~arg0 >= -18 && ~arg0 != -14 && arg3 > 0 && ~var12.field5787 != -1) {
                                super.field10542[arg3][arg6][arg1] = (byte) class694.method3895(super.field10542[arg3][arg6][arg1], 4);
                            }
                            if (~var12.field5693 != -1 && arg5 != null) {
                                arg5.method2089(!var12.field5743, arg1, var12.field5760, -102, var14, var13, arg6);
                            }
                        } else if (~arg0 == -1) {
                            int var29 = var12.field5787;
                            if (class206.field3017 && var12.field5787 == -1) {
                                var29 = 1;
                            }
                            class338 var30;
                            if (!var24) {
                                var30 = new class266(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg0, arg10, arg8);
                            } else {
                                class352 var31 = new class352(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg0, arg10, var23);
                                var30 = var31;
                                if (var31.method1164((byte) 4)) {
                                    var31.method1169(-10526, arg7);
                                }
                            }
                            class317.method1930(arg3, arg6, arg1, var30, (class338) null);
                            if (arg10 == 0) {
                                if (class219.field3210 && var12.field5704) {
                                    var19.method819(arg6, arg1, 50);
                                    var19.method819(arg6, arg1 - -1, 50);
                                }
                                if (var29 == 1 && !super.field10544) {
                                    class3.method24(arg3, arg1, var12.field5756, 1, 1, arg6, var12.field5713);
                                }
                            } else if (~arg10 != -2) {
                                if (arg10 == 2) {
                                    if (class219.field3210 && var12.field5704) {
                                        var19.method819(arg6 + 1, arg1, 50);
                                        var19.method819(arg6 + 1, arg1 + 1, 50);
                                    }
                                    if (~var29 == -2 && !super.field10544) {
                                        class3.method24(arg3, arg1, -var12.field5756, 1, 1, arg6 + 1, var12.field5713);
                                    }
                                } else if (arg10 == 3) {
                                    if (class219.field3210 && var12.field5704) {
                                        var19.method819(arg6, arg1, 50);
                                        var19.method819(arg6 + 1, arg1, 50);
                                    }
                                    if (var29 == 1 && !super.field10544) {
                                        class3.method24(arg3, arg1, var12.field5756, 2, 1, arg6, var12.field5713);
                                    }
                                }
                            } else {
                                if (class219.field3210 && var12.field5704) {
                                    var19.method819(arg6, arg1 + 1, 50);
                                    var19.method819(arg6 + 1, arg1 + 1, 50);
                                }
                                if (var29 == 1 && !super.field10544) {
                                    class3.method24(arg3, arg1 + 1, -var12.field5756, 2, 1, arg6, var12.field5713);
                                }
                            }
                            if (var12.field5693 != 0 && arg5 != null) {
                                arg5.method2079(!var12.field5743, arg1, arg10, 125, arg0, var12.field5760, arg6);
                            }
                            if (var12.field5692 != 64) {
                                class475.method2768(arg3, arg6, arg1, var12.field5692);
                            }
                        } else if (arg0 == 1) {
                            class338 var33;
                            if (var24) {
                                class352 var32 = new class352(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg0, arg10, var23);
                                var33 = var32;
                                if (var32.method1164((byte) 4)) {
                                    var32.method1169(-10526, arg7);
                                }
                            } else {
                                var33 = new class266(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg0, arg10, arg8);
                            }
                            class317.method1930(arg3, arg6, arg1, var33, (class338) null);
                            if (var12.field5704 && class219.field3210) {
                                if (arg10 != 0) {
                                    if (arg10 != 1) {
                                        if (arg10 == 2) {
                                            var19.method819(arg6 + 1, arg1, 50);
                                        } else if (arg10 == 3) {
                                            var19.method819(arg6, arg1, 50);
                                        }
                                    } else {
                                        var19.method819(arg6 - -1, arg1 + 1, 50);
                                    }
                                } else {
                                    var19.method819(arg6, arg1 + 1, 50);
                                }
                            }
                            if (var12.field5693 != 0 && arg5 != null) {
                                arg5.method2079(!var12.field5743, arg1, arg10, 125, arg0, var12.field5760, arg6);
                            }
                        } else if (~arg0 == -3) {
                            int var34 = 3 & arg10 + 1;
                            class338 var35;
                            class338 var36;
                            if (!var24) {
                                var35 = new class266(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg0, arg10 + 4, arg8);
                                var36 = new class266(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg0, var34, arg8);
                            } else {
                                class352 var37 = new class352(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg0, arg10 + 4, var23);
                                class352 var38 = new class352(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg0, var34, var23);
                                if (var37.method1164((byte) 4)) {
                                    var37.method1169(-10526, arg7);
                                }
                                var35 = var37;
                                if (var38.method1164((byte) 4)) {
                                    var38.method1169(-10526, arg7);
                                }
                                var36 = var38;
                            }
                            class317.method1930(arg3, arg6, arg1, var35, var36);
                            if ((var12.field5787 == 1 || class206.field3017 && ~var12.field5787 == 0) && !super.field10544) {
                                if (~arg10 == -1) {
                                    class3.method24(arg3, arg1, var12.field5756, 1, 1, arg6, var12.field5713);
                                    class3.method24(arg3, arg1 + 1, var12.field5756, 2, 1, arg6, var12.field5713);
                                } else if (arg10 == 1) {
                                    class3.method24(arg3, arg1, var12.field5756, 1, 1, arg6 - -1, var12.field5713);
                                    class3.method24(arg3, arg1 + 1, var12.field5756, 2, 1, arg6, var12.field5713);
                                } else if (~arg10 == -3) {
                                    class3.method24(arg3, arg1, var12.field5756, 1, 1, arg6 + 1, var12.field5713);
                                    class3.method24(arg3, arg1, var12.field5756, 2, 1, arg6, var12.field5713);
                                } else if (arg10 == 3) {
                                    class3.method24(arg3, arg1, var12.field5756, 1, 1, arg6, var12.field5713);
                                    class3.method24(arg3, arg1, var12.field5756, 2, 1, arg6, var12.field5713);
                                }
                            }
                            if (~var12.field5693 != -1 && arg5 != null) {
                                arg5.method2079(!var12.field5743, arg1, arg10, 124, arg0, var12.field5760, arg6);
                            }
                            if (var12.field5692 != 64) {
                                class475.method2768(arg3, arg6, arg1, var12.field5692);
                            }
                        } else if (arg0 == 3) {
                            class338 var40;
                            if (var24) {
                                class352 var39 = new class352(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg0, arg10, var23);
                                var40 = var39;
                                if (var39.method1164((byte) 4)) {
                                    var39.method1169(-10526, arg7);
                                }
                            } else {
                                var40 = new class266(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg0, arg10, arg8);
                            }
                            class317.method1930(arg3, arg6, arg1, var40, (class338) null);
                            if (var12.field5704 && class219.field3210) {
                                if (arg10 != 0) {
                                    if (arg10 != 1) {
                                        if (~arg10 == -3) {
                                            var19.method819(arg6 + 1, arg1, 50);
                                        } else if (~arg10 == -4) {
                                            var19.method819(arg6, arg1, 50);
                                        }
                                    } else {
                                        var19.method819(arg6 - -1, arg1 - -1, 50);
                                    }
                                } else {
                                    var19.method819(arg6, arg1 - -1, 50);
                                }
                            }
                            if (~var12.field5693 != -1 && arg5 != null) {
                                arg5.method2079(!var12.field5743, arg1, arg10, 122, arg0, var12.field5760, arg6);
                            }
                        } else if (arg0 == 9) {
                            class208 var42;
                            if (var24) {
                                class497 var41 = new class497(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg6, arg6, arg1, arg1, arg0, arg10, var23);
                                if (var41.method1164((byte) 4)) {
                                    var41.method1169(-10526, arg7);
                                }
                                var42 = var41;
                            } else {
                                var42 = new class148(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg6, var14 + -1 + arg6, arg1, arg1 + var13 - 1, arg0, arg10, arg8);
                            }
                            class630.method3597(var42, false);
                            if (var12.field5787 == 1 && !super.field10544) {
                                byte var43;
                                if (~(arg10 & 1) != -1) {
                                    var43 = 16;
                                } else {
                                    var43 = 8;
                                }
                                class3.method24(arg3, arg1, 0, var43, 1, arg6, var12.field5713);
                            }
                            if (~var12.field5693 != -1 && arg5 != null) {
                                arg5.method2089(!var12.field5743, arg1, var12.field5760, 106, var14, var13, arg6);
                            }
                            if (~var12.field5692 != -65) {
                                class475.method2768(arg3, arg6, arg1, var12.field5692);
                            }
                        } else if (arg0 == 4) {
                            class427 var45;
                            if (var24) {
                                class209 var44 = new class209(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, 0, 0, arg0, arg10);
                                if (var44.method1164((byte) 4)) {
                                    var44.method1169(-10526, arg7);
                                }
                                var45 = var44;
                            } else {
                                var45 = new class413(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, 0, 0, arg0, arg10, arg8);
                            }
                            class233.method1588(arg3, arg6, arg1, var45, (class427) null);
                        } else if (arg0 == 5) {
                            int var46 = 65;
                            class226 var47 = (class226) class133.method1109(arg3, arg6, arg1);
                            if (var47 != null) {
                                var46 = 1 + class312.field4418.method369((byte) 122, var47.method1165((byte) 90)).field5692;
                            }
                            class427 var48;
                            if (!var24) {
                                var48 = new class413(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, class657.field9275[arg10] * var46, class191.field2879[arg10] * var46, arg0, arg10, arg8);
                            } else {
                                class209 var49 = new class209(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, class657.field9275[arg10] * var46, class191.field2879[arg10] * var46, arg0, arg10);
                                var48 = var49;
                                if (var49.method1164((byte) 4)) {
                                    var49.method1169(-10526, arg7);
                                }
                            }
                            class233.method1588(arg3, arg6, arg1, var48, (class427) null);
                        } else if (arg0 == 6) {
                            int var50 = 33;
                            class226 var51 = (class226) class133.method1109(arg3, arg6, arg1);
                            if (var51 != null) {
                                var50 = 1 + class312.field4418.method369((byte) 127, var51.method1165((byte) 96)).field5692 / 2;
                            }
                            class427 var53;
                            if (var24) {
                                class209 var52 = new class209(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, class657.field9275[arg10] * var50, class191.field2879[arg10] * var50, arg0, arg10 + 4);
                                if (var52.method1164((byte) 4)) {
                                    var52.method1169(-10526, arg7);
                                }
                                var53 = var52;
                            } else {
                                var53 = new class413(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, class541.field7493[arg10] * var50, class319.field4540[arg10] * var50, arg0, arg10 + 4, arg8);
                            }
                            class233.method1588(arg3, arg6, arg1, var53, (class427) null);
                        } else {
                            int var54 = 18 / ((70 - arg2) / 44);
                            if (~arg0 == -8) {
                                int var55 = 3 & arg10 + 2;
                                class427 var56;
                                if (!var24) {
                                    var56 = new class413(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, 0, 0, arg0, var55 + 4, arg8);
                                } else {
                                    class209 var57 = new class209(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, 0, 0, arg0, var55 + 4);
                                    var56 = var57;
                                    if (var57.method1164((byte) 4)) {
                                        var57.method1169(-10526, arg7);
                                    }
                                }
                                class233.method1588(arg3, arg6, arg1, var56, (class427) null);
                            } else if (~arg0 == -9) {
                                int var58 = 3 & arg10 + 2;
                                int var59 = 33;
                                class226 var60 = (class226) class133.method1109(arg3, arg6, arg1);
                                if (var60 != null) {
                                    var59 = 1 + class312.field4418.method369((byte) 126, var60.method1165((byte) 127)).field5692 / 2;
                                }
                                class427 var62;
                                class427 var64;
                                if (!var24) {
                                    class413 var61 = new class413(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, class541.field7493[arg10] * var59, class319.field4540[arg10] * var59, arg0, arg10 - -4, arg8);
                                    var62 = var61;
                                    class413 var63 = new class413(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, 0, 0, arg0, var58 + 4, arg8);
                                    var64 = var63;
                                } else {
                                    class209 var65 = new class209(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, class541.field7493[arg10] * var59, class319.field4540[arg10] * var59, arg0, arg10 + 4);
                                    class209 var66 = new class209(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, 0, 0, arg0, var58 + 4);
                                    if (var65.method1164((byte) 4)) {
                                        var65.method1169(-10526, arg7);
                                    }
                                    var64 = var66;
                                    var62 = var65;
                                    if (var66.method1164((byte) 4)) {
                                        var66.method1169(-10526, arg7);
                                    }
                                }
                                class233.method1588(arg3, arg6, arg1, var62, var64);
                            }
                        }
                    } else {
                        class497 var67 = null;
                        int var69;
                        class208 var70;
                        if (var24) {
                            class497 var68 = new class497(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg6, arg6 - -var14 + -1, arg1, arg1 + -1 - -var13, arg0, arg10, var23);
                            var69 = var68.method2907(15);
                            var70 = var68;
                            var67 = var68;
                        } else {
                            var69 = 15;
                            var70 = new class148(arg7, var12, arg3, arg4, var21, var20, var22, super.field10544, arg6, arg6 + -1 + var14, arg1, arg1 + var13 + -1, arg0, arg10, arg8);
                        }
                        if (class630.method3597(var70, false)) {
                            if (var67 != null && var67.method1164((byte) 4)) {
                                var67.method1169(-10526, arg7);
                            }
                            if (var12.field5704 && class219.field3210) {
                                if (~var69 < -31) {
                                    var69 = 30;
                                }
                                for (int var71 = 0; ~var71 >= ~var14; ++var71) {
                                    for (int var72 = 0; var13 >= var72; ++var72) {
                                        var19.method819(arg6 + var71, arg1 + var72, var69);
                                    }
                                }
                            }
                        }
                        if (~var12.field5693 != -1 && arg5 != null) {
                            arg5.method2089(!var12.field5743, arg1, var12.field5760, -99, var14, var13, arg6);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)Z")
    public static final boolean method701(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            return true;
        } else {
            ++field1178;
            return ~(458752 & arg2) != -1 | class356.method2149(arg2, arg1, (byte) 99) || class692.method3890(arg2, arg1, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(III[Lkn;II[BZIILha;)V")
    public final void method702(int arg0, int arg1, int arg2, class340[] arg3, int arg4, int arg5, byte[] arg6, boolean arg7, int arg8, int arg9, class475 arg10) {
        ++field1184;
        class431 var12 = new class431(arg6);
        if (arg7) {
            method707(false);
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method2522(-890248784);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2527((byte) -24);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2557(14929);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (arg9 == var19 && ~var18 <= ~arg2 && ~(arg2 - -8) < ~var18 && arg4 <= var17 && ~var17 > ~(arg4 + 8)) {
                    class416 var23 = class312.field4418.method369((byte) 125, var13);
                    int var24 = class727.method4037(var22, 7 & var17, 29356, var23.field5776, arg8, var23.field5734, 7 & var18) + arg0;
                    int var25 = arg1 - -class243.method1615(7 & var17, (byte) 122, var23.field5776, arg8, var22, var23.field5734, var18 & 7);
                    if (~var24 < -1 && ~var25 < -1 && super.field10536 + -1 > var24 && var25 < super.field10554 - 1) {
                        class340 var26 = null;
                        if (!super.field10544) {
                            int var27 = arg5;
                            if (~(class336.field4782[1][var24][var25] & 2) == -3) {
                                var27 = arg5 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg3[var27];
                            }
                        }
                        this.method700(var21, var25, (byte) -6, arg5, arg5, var26, var24, arg10, -1, var13, arg8 + var22 & 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lol;BLha;II[I)V")
    public final void method703(class431 arg0, byte arg1, class475 arg2, int arg3, int arg4, int[] arg5) {
        ++field1177;
        if (!super.field10544) {
            boolean var7 = false;
            class341 var8 = null;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            while (true) {
                while (arg0.field6002.length > arg0.field5983) {
                    int var18 = arg0.method2557(14929);
                    if (~var18 == -1) {
                        var8 = new class341(arg0);
                    } else if (var18 == 1) {
                        int var19 = arg0.method2557(arg1 + 14825);
                        if (~var19 < -1) {
                            for (int var20 = 0; ~var19 < ~var20; ++var20) {
                                class284 var21 = new class284(arg2, arg0, 2);
                                if (var21.field4176 == 31) {
                                    class603 var22 = class402.field5547.method1475(arg0.method2565((byte) -123), arg1 + 26650);
                                    var21.method1807(-28922, var22.field8560, var22.field8565, var22.field8563, var22.field8564);
                                }
                                if (arg2.method472() > 0) {
                                    class217 var23 = var21.field4161;
                                    int var24 = var23.method1495(false) - -(arg4 << 9);
                                    int var25 = (arg3 << 9) + var23.method1490((byte) -126);
                                    int var26 = var24 >> 9;
                                    int var27 = var25 >> 9;
                                    if (~var26 <= -1 && var27 >= 0 && ~var26 > ~super.field10536 && ~super.field10554 < ~var27) {
                                        var23.method1198(var24, super.field10529[var21.field4162][var26][var27] + -var23.method1494(false), var25, -103);
                                        class260.method1692(var21);
                                    }
                                }
                            }
                        }
                    } else if (~var18 == -3) {
                        if (var8 == null) {
                            var8 = new class341();
                        }
                        var8.method2098(arg0, 3973);
                    } else if (var18 == 128) {
                        if (arg5 == null) {
                            arg0.field5983 += 10;
                        } else {
                            arg5[0] = arg0.method2565((byte) -121);
                            arg5[1] = arg0.method2528((byte) 89);
                            arg5[2] = arg0.method2528((byte) 89);
                            arg5[3] = arg0.method2528((byte) 89);
                            arg5[4] = arg0.method2565((byte) -112);
                        }
                    } else {
                        if (var18 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field10555 == null) {
                            super.field10555 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var28 = 0; var28 < 4; ++var28) {
                            byte var29 = arg0.method2529(118);
                            if (var29 == 0 && super.field10555[var28] != null) {
                                int var30 = arg4;
                                int var31 = arg4 + 64;
                                int var32 = arg3;
                                if (arg3 >= 0) {
                                    if (super.field10554 <= arg3) {
                                        var32 = super.field10554;
                                    }
                                } else {
                                    var32 = 0;
                                }
                                if (~arg4 > -1) {
                                    var30 = 0;
                                } else if (arg4 >= super.field10536) {
                                    var30 = super.field10536;
                                }
                                int var33 = arg3 + 64;
                                if (var31 < 0) {
                                    var31 = 0;
                                } else if (var31 >= super.field10536) {
                                    var31 = super.field10536;
                                }
                                if (var33 < 0) {
                                    var33 = 0;
                                } else if (super.field10554 <= var33) {
                                    var33 = super.field10554;
                                }
                                while (~var31 < ~var30) {
                                    while (~var33 < ~var32) {
                                        super.field10555[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (var29 == 1) {
                                if (super.field10555[var28] == null) {
                                    super.field10555[var28] = new byte[super.field10536 + 1][super.field10554 + 1];
                                }
                                for (int var34 = 0; var34 < 64; var34 += 4) {
                                    for (int var35 = 0; var35 < 64; var35 += 4) {
                                        byte var36 = arg0.method2529(108);
                                        for (int var37 = arg4 + var34; ~(arg4 + var34 - -4) < ~var37; ++var37) {
                                            for (int var38 = arg3 + var35; ~(var35 + 4 - -arg3) < ~var38; ++var38) {
                                                if (~var37 <= -1 && ~super.field10536 < ~var37 && ~var38 <= -1 && var38 < super.field10554) {
                                                    super.field10555[var28][var37][var38] = var36;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var29 == -3) {
                                if (super.field10555[var28] == null) {
                                    super.field10555[var28] = new byte[super.field10536 - -1][super.field10554 + 1];
                                }
                                if (~var28 < -1) {
                                    int var39 = arg4;
                                    int var40 = arg4 + 64;
                                    int var41 = arg3;
                                    if (arg4 < 0) {
                                        var39 = 0;
                                    } else if (arg4 >= super.field10536) {
                                        var39 = super.field10536;
                                    }
                                    if (arg3 >= 0) {
                                        if (super.field10554 <= arg3) {
                                            var41 = super.field10554;
                                        }
                                    } else {
                                        var41 = 0;
                                    }
                                    int var42 = arg3 - -64;
                                    if (var40 < 0) {
                                        var40 = 0;
                                    } else if (~var40 <= ~super.field10536) {
                                        var40 = super.field10536;
                                    }
                                    if (var42 >= 0) {
                                        if (super.field10554 <= var42) {
                                            var42 = super.field10554;
                                        }
                                    } else {
                                        var42 = 0;
                                    }
                                    while (var39 < var40) {
                                        while (var41 < var42) {
                                            super.field10555[var28][var39][var41] = super.field10555[var28 - 1][var39][var41];
                                            ++var41;
                                        }
                                        ++var39;
                                    }
                                }
                            }
                        }
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; ~var9 > -9; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            int var11 = (arg4 >> 3) + var9;
                            int var12 = (arg3 >> 3) + var10;
                            if (~var11 <= -1 && var11 < super.field10536 >> 3 && var12 >= 0 && ~var12 > ~(super.field10554 >> 3)) {
                                class436.method2605(var12, var8, true, var11);
                            }
                        }
                    }
                }
                if (!var7 && super.field10555 != null) {
                    for (int var13 = 0; ~var13 > -5; ++var13) {
                        if (super.field10555[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg4 >> 2) + var14;
                                    int var17 = (arg3 >> 2) + var15;
                                    if (~var16 <= -1 && ~var16 > -27 && ~var17 <= -1 && ~var17 > -27) {
                                        super.field10555[var13][var16][var17] = 0;
                                    }
                                }
                            }
                        }
                    }
                }
                if (arg1 != 104) {
                    method701(105, -38, -114);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIIZ)V")
    public class79(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class613.field8701, class452.field6197);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lha;I[Lkn;I[BI)V")
    public final void method704(class475 arg0, int arg1, class340[] arg2, int arg3, byte[] arg4, int arg5) {
        ++field1183;
        class431 var7 = new class431(arg4);
        if (arg3 == 27523) {
            int var8 = -1;
            while (true) {
                int var9 = var7.method2522(-890248784);
                if (~var9 == -1) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method2527((byte) -24);
                    if (~var11 == -1) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = var10 & 63;
                    int var13 = (4087 & var10) >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method2557(arg3 ^ 20946);
                    int var16 = var15 >> 2;
                    int var17 = var15 & 3;
                    int var18 = arg5 + var13;
                    int var19 = var12 - -arg1;
                    if (~var18 < -1 && ~var19 < -1 && var18 < super.field10536 - 1 && super.field10554 - 1 > var19) {
                        class340 var20 = null;
                        if (!super.field10544) {
                            int var21 = var14;
                            if ((2 & class336.field4782[1][var18][var19]) == 2) {
                                var21 = var14 - 1;
                            }
                            if (var21 >= 0) {
                                var20 = arg2[var21];
                            }
                        }
                        this.method700(var16, var19, (byte) 126, var14, var14, var20, var18, arg0, -1, var8, var17);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lha;ZI)V")
    public final void method705(class475 arg0, boolean arg1, int arg2) {
        class244.method1623();
        ++field1175;
        if (!arg1) {
            if (super.field10531 > 1) {
                for (int var4 = 0; var4 < super.field10536; ++var4) {
                    for (int var5 = 0; var5 < super.field10554; ++var5) {
                        if (~(class336.field4782[1][var4][var5] & 2) == -3) {
                            class442.method2616(var4, var5);
                        }
                    }
                }
            }
            for (int var6 = 0; ~super.field10531 < ~var6; ++var6) {
                for (int var7 = 0; ~super.field10554 <= ~var7; ++var7) {
                    for (int var8 = 0; var8 <= super.field10536; ++var8) {
                        if (~(super.field10542[var6][var8][var7] & 4) != -1) {
                            int var9 = var8;
                            int var10 = var8;
                            int var11 = var7;
                            int var12 = var7;
                            while (~var11 < -1 && (super.field10542[var6][var8][var11 + -1] & 4) != 0 && -var11 + var12 < 10) {
                                --var11;
                            }
                            while (~super.field10554 < ~var12 && (4 & super.field10542[var6][var8][var12 - -1]) != 0 && ~(-var11 + var12) > -11) {
                                ++var12;
                            }
                            label118: while (var9 > 0 && ~(-var9 + var10) > -11) {
                                for (int var13 = var11; ~var12 <= ~var13; ++var13) {
                                    if (~(4 & super.field10542[var6][var9 + -1][var13]) == -1) {
                                        break label118;
                                    }
                                }
                                --var9;
                            }
                            label105: while (super.field10536 > var10 && -var9 + var10 < 10) {
                                for (int var14 = var11; var12 >= var14; ++var14) {
                                    if (~(4 & super.field10542[var6][var10 + 1][var14]) == -1) {
                                        break label105;
                                    }
                                }
                                ++var10;
                            }
                            if ((-var9 + var10 + 1) * (-var11 + 1 + var12) >= 4) {
                                int var15 = super.field10529[var6][var9][var11];
                                class642.method3645(var15, (var10 << 9) + 512, var11 << 9, (var12 << 9) + 512, var6, (byte) 1, 4, var9 << 9, var15);
                                for (int var16 = var9; var16 <= var10; ++var16) {
                                    for (int var17 = var11; var12 >= var17; ++var17) {
                                        super.field10542[var6][var16][var17] = (byte) class194.method1380(super.field10542[var6][var16][var17], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class532.method3098(arg2 + -122);
        }
        if (arg2 != 8) {
            field1174 = 7;
        }
        super.field10542 = null;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIILol;Lha;II[I)V")
    public final void method706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class431 arg6, class475 arg7, int arg8, int arg9, int[] arg10) {
        ++field1181;
        if (!super.field10544) {
            boolean var12 = false;
            class341 var13 = null;
            if (arg10 != null) {
                arg10[0] = -1;
            }
            int var14 = 101 / ((40 - arg5) / 40);
            int var15 = (arg9 & 7) * 8;
            int var16 = (7 & arg8) * 8;
            while (true) {
                int var22;
                label237: do {
                    while (true) {
                        while (~arg6.field5983 > ~arg6.field6002.length) {
                            int var21 = arg6.method2557(14929);
                            if (var21 != 0) {
                                if (var21 == 1) {
                                    var22 = arg6.method2557(14929);
                                    continue label237;
                                }
                                if (var21 == 2) {
                                    if (var13 == null) {
                                        var13 = new class341();
                                    }
                                    var13.method2098(arg6, 3973);
                                } else if (var21 == 128) {
                                    if (arg10 != null) {
                                        arg10[0] = arg6.method2565((byte) -98);
                                        arg10[1] = arg6.method2528((byte) 89);
                                        arg10[2] = arg6.method2528((byte) 89);
                                        arg10[3] = arg6.method2528((byte) 89);
                                        arg10[4] = arg6.method2565((byte) -90);
                                    } else {
                                        arg6.field5983 += 10;
                                    }
                                } else {
                                    if (var21 != 129) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field10555 == null) {
                                        super.field10555 = new byte[4][][];
                                    }
                                    for (int var33 = 0; var33 < 4; ++var33) {
                                        byte var34 = arg6.method2529(101);
                                        if (~var34 == -1 && super.field10555[arg1] != null) {
                                            if (~var33 >= ~arg0) {
                                                int var35 = arg4;
                                                int var36 = arg4 + 7;
                                                int var37 = arg2;
                                                if (~arg4 > -1) {
                                                    var35 = 0;
                                                } else if (~super.field10536 >= ~arg4) {
                                                    var35 = super.field10536;
                                                }
                                                if (~arg2 <= -1) {
                                                    if (~arg2 <= ~super.field10554) {
                                                        var37 = super.field10554;
                                                    }
                                                } else {
                                                    var37 = 0;
                                                }
                                                int var38 = arg2 + 7;
                                                if (~var36 > -1) {
                                                    var36 = 0;
                                                } else if (super.field10536 <= var36) {
                                                    var36 = super.field10536;
                                                }
                                                if (~var38 > -1) {
                                                    var38 = 0;
                                                } else if (super.field10554 <= var38) {
                                                    var38 = super.field10554;
                                                }
                                                while (~var35 > ~var36) {
                                                    while (~var38 < ~var37) {
                                                        super.field10555[arg1][var35][var37] = 0;
                                                        ++var37;
                                                    }
                                                    ++var35;
                                                }
                                            }
                                        } else if (~var34 == -2) {
                                            if (super.field10555[arg1] == null) {
                                                super.field10555[arg1] = new byte[super.field10536 + 1][super.field10554 + 1];
                                            }
                                            for (int var39 = 0; var39 < 64; var39 += 4) {
                                                for (int var40 = 0; var40 < 64; var40 += 4) {
                                                    byte var41 = arg6.method2529(62);
                                                    if (arg0 >= var33) {
                                                        for (int var42 = var39; ~(var39 + 4) < ~var42; ++var42) {
                                                            for (int var43 = var40; ~(var40 + 4) < ~var43; ++var43) {
                                                                if (var15 <= var42 && ~var42 > ~(var15 - -8) && ~var43 <= ~var16 && var16 < var16 - -8) {
                                                                    int var44 = class23.method216(true, 7 & var43, arg3, 7 & var42) + arg4;
                                                                    int var45 = class605.method3513(arg3, -2, var42 & 7, 7 & var43) + arg2;
                                                                    if (var44 >= 0 && ~var44 > ~super.field10536 && ~var45 <= -1 && var45 < super.field10554) {
                                                                        super.field10555[arg1][var44][var45] = var41;
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
                                var13 = new class341(arg6);
                            }
                        }
                        if (var13 != null) {
                            class436.method2605(arg2 >> 3, var13, true, arg4 >> 3);
                        }
                        if (!var12 && super.field10555 != null && super.field10555[arg1] != null) {
                            int var17 = arg4 - -7;
                            int var18 = arg2 + 7;
                            for (int var19 = arg4; ~var19 > ~var17; ++var19) {
                                for (int var20 = arg2; var20 < var18; ++var20) {
                                    super.field10555[arg1][var19][var20] = 0;
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (var22 <= 0);
                for (int var23 = 0; ~var22 < ~var23; ++var23) {
                    class284 var24 = new class284(arg7, arg6, 2);
                    if (var24.field4176 == 31) {
                        class603 var25 = class402.field5547.method1475(arg6.method2565((byte) -123), 26754);
                        var24.method1807(-28922, var25.field8560, var25.field8565, var25.field8563, var25.field8564);
                    }
                    if (arg7.method472() > 0) {
                        class217 var26 = var24.field4161;
                        int var27 = var26.method1495(false) >> 9;
                        int var28 = var26.method1490((byte) -126) >> 9;
                        if (~var24.field4162 == ~arg0 && var15 <= var27 && ~var27 > ~(var15 + 8) && var16 <= var28 && var28 < var16 + 8) {
                            int var29 = (arg4 << 9) + class273.method1739(4095 & var26.method1490((byte) -126), var26.method1495(false) & 4095, arg3, 122);
                            int var30 = class656.method3682(var26.method1495(false) & 4095, var26.method1490((byte) -126) & 4095, (byte) 46, arg3) + (arg2 << 9);
                            int var31 = var29 >> 9;
                            int var32 = var30 >> 9;
                            if (var31 >= 0 && var32 >= 0 && var31 < super.field10536 && ~super.field10554 < ~var32) {
                                var26.method1198(var29, super.field10529[arg0][var31][var32] + -var26.method1494(false), var30, -80);
                                class260.method1692(var24);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)V")
    public static void method707(boolean arg0) {
        field1179 = null;
        if (!arg0) {
            method707(true);
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(IIIII)Lvu;")
    public final class226 method708(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1180;
        class226 var6 = null;
        if (~arg2 == -1) {
            var6 = (class226) class133.method1109(arg1, arg4, arg3);
        }
        if (~arg2 == -2) {
            var6 = (class226) class87.method770(arg1, arg4, arg3);
        }
        if (~arg2 == arg0) {
            var6 = (class226) class608.method3523(arg1, arg4, arg3, field1185 != null ? field1185 : (field1185 = method710("vu")));
        }
        if (arg2 == 3) {
            var6 = (class226) class180.method1311(arg1, arg4, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILkn;IIILha;)V")
    public final void method709(int arg0, int arg1, class340 arg2, int arg3, int arg4, int arg5, class475 arg6) {
        ++field1176;
        class226 var8 = this.method708(arg1 + -26565, arg0, arg5, arg4, arg3);
        if (var8 != null) {
            class416 var9 = class312.field4418.method369((byte) 125, var8.method1165((byte) 124));
            int var10 = var8.method1166(arg1 + -26461);
            int var11 = var8.method1174((byte) 66);
            if (var9.method2457(8)) {
                class139.method1134(arg3, arg4, var9, arg0, false);
            }
            if (var8.method1164((byte) 4)) {
                var8.method1163(18030, arg6);
            }
            if (arg5 == 0) {
                class185.method1339(arg0, arg3, arg4);
                if (var9.field5693 != 0) {
                    arg2.method2082(var9.field5760, var11, arg3, !var9.field5743, arg4, true, var10);
                }
                if (~var9.field5787 == -2) {
                    if (~var11 == -1) {
                        class673.method3771(1, arg3, arg4, arg0, 70);
                    } else if (var11 == 1) {
                        class673.method3771(2, arg3, arg4 - -1, arg0, 91);
                    } else if (~var11 != -3) {
                        if (~var11 == -4) {
                            class673.method3771(2, arg3, arg4, arg0, arg1 ^ 26553);
                        }
                    } else {
                        class673.method3771(1, arg3 + 1, arg4, arg0, arg1 + -26439);
                    }
                }
            } else if (~arg5 == -2) {
                class546.method3159(arg0, arg3, arg4);
            } else if (arg5 != 2) {
                if (~arg5 == -4) {
                    class695.method3909(arg0, arg3, arg4);
                    if (~var9.field5693 == -2) {
                        arg2.method2083(arg3, 124, arg4);
                    }
                }
            } else {
                class380.method2289(arg0, arg3, arg4, field1185 != null ? field1185 : (field1185 = method710("vu")));
                if (~var9.field5693 != -1 && super.field10536 > var9.field5776 + arg3 && ~super.field10554 < ~(var9.field5776 + arg4) && var9.field5734 + arg3 < super.field10536 && ~super.field10554 < ~(var9.field5734 + arg4)) {
                    arg2.method2086(arg3, var9.field5734, arg1 + -26633, !var9.field5743, arg4, var9.field5776, var9.field5760, var11);
                }
                if (~var10 == -10) {
                    if (~(1 & var11) != -1) {
                        class673.method3771(16, arg3, arg4, arg0, 63);
                    } else {
                        class673.method3771(8, arg3, arg4, arg0, 54);
                    }
                }
            }
        }
        if (arg1 != 26562) {
            this.method700(87, -24, (byte) -7, -23, 84, (class340) null, 26, (class475) null, -120, 46, -41);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method710(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
