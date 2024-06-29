import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class331 extends class118 {

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    private int field4954 = 4096;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field4950 = 0;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZILdr;Lek;IIZIIBIII)V")
    public static final void method2031(boolean arg0, int arg1, class261 arg2, class375 arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, byte arg9, int arg10, int arg11, int arg12) {
        ++field4947;
        if (class360.method2172(87) || class56.method319(arg10, arg4, class88.field1263, (byte) 8, arg11)) {
            if (~class396.field5922 < ~arg11) {
                class396.field5922 = arg11;
            }
            class85 var13 = class411.method2575(0, arg5);
            if (~class405.field6032 != -2 || !var13.field1168) {
                if (arg9 > 84) {
                    int var14;
                    int var15;
                    if (~arg1 != -2 && ~arg1 != -4) {
                        var14 = var13.field1122;
                        var15 = var13.field1197;
                    } else {
                        var14 = var13.field1197;
                        var15 = var13.field1122;
                    }
                    int var16;
                    int var17;
                    if (~class115.field1522 <= ~(arg10 - -var15)) {
                        var16 = (var15 + 1 >> 1) + arg10;
                        var17 = (var15 >> 1) + arg10;
                    } else {
                        var17 = arg10;
                        var16 = arg10 + 1;
                    }
                    int var18;
                    int var19;
                    if (class198.field3004 >= arg4 + var14) {
                        var18 = arg4 - -(var14 + 1 >> 1);
                        var19 = arg4 - -(var14 >> 1);
                    } else {
                        var19 = arg4;
                        var18 = arg4 + 1;
                    }
                    class143 var20 = class307.field4638[arg7];
                    int var21 = var20.method92(var17, var19) + var20.method92(var16, var19) + (var20.method92(var17, var18) - -var20.method92(var16, var18)) >> 2;
                    int var22 = (arg10 << 7) - -(var15 << 6);
                    int var23 = (arg4 << 7) + (var14 << 6);
                    boolean var24 = arg0 && !arg6 && var13.field1151;
                    if (var13.method554((byte) -10)) {
                        class113.method685(arg1, (class169) null, arg11, var13, arg4, arg10, (byte) -46, (class155) null);
                    }
                    boolean var25 = ~arg8 == 0 && var13.field1125 == -1 && var13.field1124 == null && var13.field1133 == null && !var13.field1159;
                    if (!class289.field4398 || var13.field1206 == 1) {
                        if (arg12 == 22) {
                            if (class345.field5157 || ~var13.field1184 != -1 || var13.field1147 == 1 || var13.field1186) {
                                class316 var27;
                                if (var25) {
                                    class313 var26 = new class313(arg2, var13, arg7, var22, var21, var23, arg6, arg1, var24);
                                    if (var26.method1(60)) {
                                        var26.method2((byte) 76, arg2);
                                    }
                                    var27 = var26;
                                } else {
                                    var27 = new class39(arg2, var13, arg1, arg11, arg7, var22, var21, var23, arg6, arg8);
                                }
                                class301.method1857(arg11, arg10, arg4, var27);
                                if (~var13.field1147 == -2 && arg3 != null) {
                                    arg3.method2258(arg10, arg4, 262144);
                                }
                            }
                        } else if (arg12 != 10 && arg12 != 11) {
                            if ((arg12 < 12 || arg12 > 17) && (arg12 < 18 || ~arg12 < -22)) {
                                if (~arg12 == -1) {
                                    class233 var30;
                                    if (!var25) {
                                        var30 = new class103(arg2, var13, 0, arg1, arg11, arg7, var22, var21, var23, arg6, arg8);
                                    } else {
                                        class136 var31 = new class136(arg2, var13, arg7, var22, var21, var23, arg6, arg12, arg1, var24);
                                        var30 = var31;
                                        if (var31.method1(-89)) {
                                            var31.method2((byte) 76, arg2);
                                        }
                                    }
                                    class266.method1649(arg11, arg10, arg4, var30, (class233) null);
                                    if (arg0) {
                                        if (~arg1 == -1) {
                                            if (var13.field1157) {
                                                var20.method106(arg10, arg4, 50);
                                                var20.method106(arg10, arg4 + 1, 50);
                                            }
                                            if (var13.field1206 == 1 && !arg6) {
                                                class354.field5235[arg11][arg10][arg4] = (byte) class276.method1712(class354.field5235[arg11][arg10][arg4], 1);
                                            }
                                        } else if (~arg1 == -2) {
                                            if (var13.field1157) {
                                                var20.method106(arg10, arg4 - -1, 50);
                                                var20.method106(arg10 - -1, arg4 + 1, 50);
                                            }
                                            if (var13.field1206 == 1 && !arg6) {
                                                class354.field5235[arg11][arg10][arg4 + 1] = (byte) class276.method1712(class354.field5235[arg11][arg10][arg4 + 1], 2);
                                            }
                                        } else if (~arg1 == -3) {
                                            if (var13.field1157) {
                                                var20.method106(arg10 + 1, arg4, 50);
                                                var20.method106(arg10 + 1, arg4 - -1, 50);
                                            }
                                            if (~var13.field1206 == -2 && !arg6) {
                                                class354.field5235[arg11][arg10 - -1][arg4] = (byte) class276.method1712(class354.field5235[arg11][arg10 - -1][arg4], 1);
                                            }
                                        } else if (~arg1 == -4) {
                                            if (var13.field1157) {
                                                var20.method106(arg10, arg4, 50);
                                                var20.method106(arg10 - -1, arg4, 50);
                                            }
                                            if (~var13.field1206 == -2 && !arg6) {
                                                class354.field5235[arg11][arg10][arg4] = (byte) class276.method1712(class354.field5235[arg11][arg10][arg4], 2);
                                            }
                                        }
                                    }
                                    if (var13.field1147 != 0 && arg3 != null) {
                                        arg3.method2255(arg1, arg10, arg12, !var13.field1143, var13.field1191, (byte) 102, arg4);
                                    }
                                    if (~var13.field1204 != -17) {
                                        class6.method49(arg11, arg10, arg4, var13.field1204);
                                    }
                                } else if (~arg12 == -2) {
                                    class233 var32;
                                    if (!var25) {
                                        var32 = new class103(arg2, var13, 1, arg1, arg11, arg7, var22, var21, var23, arg6, arg8);
                                    } else {
                                        class136 var33 = new class136(arg2, var13, arg7, var22, var21, var23, arg6, arg12, arg1, var24);
                                        var32 = var33;
                                        if (var33.method1(57)) {
                                            var33.method2((byte) 76, arg2);
                                        }
                                    }
                                    class266.method1649(arg11, arg10, arg4, var32, (class233) null);
                                    if (var13.field1157 && arg0) {
                                        if (~arg1 != -1) {
                                            if (~arg1 == -2) {
                                                var20.method106(arg10 - -1, arg4 + 1, 50);
                                            } else if (~arg1 == -3) {
                                                var20.method106(arg10 + 1, arg4, 50);
                                            } else if (~arg1 == -4) {
                                                var20.method106(arg10, arg4, 50);
                                            }
                                        } else {
                                            var20.method106(arg10, arg4 + 1, 50);
                                        }
                                    }
                                    if (~var13.field1147 != -1 && arg3 != null) {
                                        arg3.method2255(arg1, arg10, arg12, !var13.field1143, var13.field1191, (byte) 107, arg4);
                                    }
                                } else if (~arg12 == -3) {
                                    int var34 = 3 & arg1 + 1;
                                    class233 var37;
                                    class233 var38;
                                    if (var25) {
                                        class136 var35 = new class136(arg2, var13, arg7, var22, var21, var23, arg6, arg12, arg1 - -4, var24);
                                        class136 var36 = new class136(arg2, var13, arg7, var22, var21, var23, arg6, arg12, var34, var24);
                                        if (var35.method1(-114)) {
                                            var35.method2((byte) 76, arg2);
                                        }
                                        var37 = var35;
                                        if (var36.method1(77)) {
                                            var36.method2((byte) 76, arg2);
                                        }
                                        var38 = var36;
                                    } else {
                                        var37 = new class103(arg2, var13, 2, arg1 + 4, arg11, arg7, var22, var21, var23, arg6, arg8);
                                        var38 = new class103(arg2, var13, 2, var34, arg11, arg7, var22, var21, var23, arg6, arg8);
                                    }
                                    class266.method1649(arg11, arg10, arg4, var37, var38);
                                    if (var13.field1206 == 1 && arg0 && !arg6) {
                                        if (~arg1 == -1) {
                                            class354.field5235[arg11][arg10][arg4] = (byte) class276.method1712(class354.field5235[arg11][arg10][arg4], 1);
                                            class354.field5235[arg11][arg10][arg4 + 1] = (byte) class276.method1712(class354.field5235[arg11][arg10][arg4 + 1], 2);
                                        } else if (arg1 == 1) {
                                            class354.field5235[arg11][arg10][arg4 - -1] = (byte) class276.method1712(class354.field5235[arg11][arg10][arg4 - -1], 2);
                                            class354.field5235[arg11][arg10 + 1][arg4] = (byte) class276.method1712(class354.field5235[arg11][arg10 + 1][arg4], 1);
                                        } else if (arg1 != 2) {
                                            if (arg1 == 3) {
                                                class354.field5235[arg11][arg10][arg4] = (byte) class276.method1712(class354.field5235[arg11][arg10][arg4], 2);
                                                class354.field5235[arg11][arg10][arg4] = (byte) class276.method1712(class354.field5235[arg11][arg10][arg4], 1);
                                            }
                                        } else {
                                            class354.field5235[arg11][arg10 + 1][arg4] = (byte) class276.method1712(class354.field5235[arg11][arg10 + 1][arg4], 1);
                                            class354.field5235[arg11][arg10][arg4] = (byte) class276.method1712(class354.field5235[arg11][arg10][arg4], 2);
                                        }
                                    }
                                    if (var13.field1147 != 0 && arg3 != null) {
                                        arg3.method2255(arg1, arg10, arg12, !var13.field1143, var13.field1191, (byte) 125, arg4);
                                    }
                                    if (var13.field1204 != 16) {
                                        class6.method49(arg11, arg10, arg4, var13.field1204);
                                    }
                                } else if (arg12 == 3) {
                                    class233 var40;
                                    if (var25) {
                                        class136 var39 = new class136(arg2, var13, arg7, var22, var21, var23, arg6, arg12, arg1, var24);
                                        var40 = var39;
                                        if (var39.method1(-113)) {
                                            var39.method2((byte) 76, arg2);
                                        }
                                    } else {
                                        var40 = new class103(arg2, var13, 3, arg1, arg11, arg7, var22, var21, var23, arg6, arg8);
                                    }
                                    class266.method1649(arg11, arg10, arg4, var40, (class233) null);
                                    if (var13.field1157 && arg0) {
                                        if (arg1 == 0) {
                                            var20.method106(arg10, arg4 - -1, 50);
                                        } else if (arg1 == 1) {
                                            var20.method106(arg10 + 1, arg4 - -1, 50);
                                        } else if (~arg1 == -3) {
                                            var20.method106(arg10 + 1, arg4, 50);
                                        } else if (arg1 == 3) {
                                            var20.method106(arg10, arg4, 50);
                                        }
                                    }
                                    if (~var13.field1147 != -1 && arg3 != null) {
                                        arg3.method2255(arg1, arg10, arg12, !var13.field1143, var13.field1191, (byte) 107, arg4);
                                    }
                                } else if (~arg12 == -10) {
                                    class141 var41;
                                    if (!var25) {
                                        var41 = new class163(arg2, var13, arg12, arg1, arg11, arg7, var22, var21, var23, arg6, arg10, arg10 + var15 + -1, arg4, arg4 - -var14 + -1, arg8);
                                    } else {
                                        class17 var42 = new class17(arg2, var13, arg11, arg7, var22, var21, var23, arg6, arg10, arg10, arg4, arg4, arg12, arg1, var24);
                                        var41 = var42;
                                        if (var42.method1(-89)) {
                                            var42.method2((byte) 76, arg2);
                                        }
                                    }
                                    class50.method287(var41, false);
                                    if (~var13.field1147 != -1 && arg3 != null) {
                                        arg3.method2261(var14, var13.field1191, 32, var15, arg10, !var13.field1143, arg4);
                                    }
                                    if (var13.field1204 != 16) {
                                        class6.method49(arg11, arg10, arg4, var13.field1204);
                                    }
                                } else if (arg12 == 4) {
                                    class337 var43;
                                    if (!var25) {
                                        var43 = new class1(arg2, var13, arg12, arg1, arg11, arg7, var22, var21, var23, arg6, 0, 0, 0, arg8);
                                    } else {
                                        class338 var44 = new class338(arg2, var13, arg7, var22, var21, var23, arg6, 0, 0, 0, arg12, arg1);
                                        if (var44.method1(-104)) {
                                            var44.method2((byte) 76, arg2);
                                        }
                                        var43 = var44;
                                    }
                                    class299.method1851(arg11, arg10, arg4, var43, (class337) null);
                                } else if (arg12 == 5) {
                                    int var45 = 16;
                                    class18 var46 = (class18) class37.method211(arg11, arg10, arg4);
                                    if (var46 != null) {
                                        var45 = class411.method2575(0, var46.method7(true)).field1204;
                                    }
                                    class337 var47;
                                    if (!var25) {
                                        var47 = new class1(arg2, var13, arg12, arg1, arg11, arg7, var22, var21, var23, arg6, 0, class301.field4542[arg1] * var45, class374.field5443[arg1] * var45, arg8);
                                    } else {
                                        class338 var48 = new class338(arg2, var13, arg7, var22, var21, var23, arg6, 0, class301.field4542[arg1] * var45, class374.field5443[arg1] * var45, arg12, arg1);
                                        var47 = var48;
                                        if (var48.method1(-69)) {
                                            var48.method2((byte) 76, arg2);
                                        }
                                    }
                                    class299.method1851(arg11, arg10, arg4, var47, (class337) null);
                                } else if (arg12 == 6) {
                                    int var49 = 8;
                                    class18 var50 = (class18) class37.method211(arg11, arg10, arg4);
                                    if (var50 != null) {
                                        var49 = class411.method2575(0, var50.method7(true)).field1204 / 2;
                                    }
                                    class337 var51;
                                    if (!var25) {
                                        var51 = new class1(arg2, var13, arg12, arg1 + 4, arg11, arg7, var22, var21, var23, arg6, arg1, class50.field642[arg1] * var49, class192.field2884[arg1] * var49, arg8);
                                    } else {
                                        class338 var52 = new class338(arg2, var13, arg7, var22, var21, var23, arg6, arg1, class301.field4542[arg1] * var49, class374.field5443[arg1] * var49, arg12, arg1 + 4);
                                        if (var52.method1(-51)) {
                                            var52.method2((byte) 76, arg2);
                                        }
                                        var51 = var52;
                                    }
                                    class299.method1851(arg11, arg10, arg4, var51, (class337) null);
                                } else if (arg12 == 7) {
                                    int var53 = 3 & arg1 + 2;
                                    class337 var54;
                                    if (!var25) {
                                        var54 = new class1(arg2, var13, arg12, var53 + 4, arg11, arg7, var22, var21, var23, arg6, var53, 0, 0, arg8);
                                    } else {
                                        class338 var55 = new class338(arg2, var13, arg7, var22, var21, var23, arg6, var53, 0, 0, arg12, var53 - -4);
                                        if (var55.method1(56)) {
                                            var55.method2((byte) 76, arg2);
                                        }
                                        var54 = var55;
                                    }
                                    class299.method1851(arg11, arg10, arg4, var54, (class337) null);
                                } else if (arg12 == 8) {
                                    int var56 = 3 & arg1 + 2;
                                    int var57 = 8;
                                    class18 var58 = (class18) class37.method211(arg11, arg10, arg4);
                                    if (var58 != null) {
                                        var57 = class411.method2575(0, var58.method7(true)).field1204 / 2;
                                    }
                                    class337 var60;
                                    class337 var62;
                                    if (!var25) {
                                        class1 var59 = new class1(arg2, var13, arg12, arg1 + 4, arg11, arg7, var22, var21, var23, arg6, arg1, class50.field642[arg1] * var57, class192.field2884[arg1] * var57, arg8);
                                        var60 = var59;
                                        class1 var61 = new class1(arg2, var13, arg12, var56 + 4, arg11, arg7, var22, var21, var23, arg6, arg1, 0, 0, arg8);
                                        var62 = var61;
                                    } else {
                                        class338 var63 = new class338(arg2, var13, arg7, var22, var21, var23, arg6, arg1, class50.field642[arg1] * var57, class192.field2884[arg1] * var57, arg12, arg1 + 4);
                                        class338 var64 = new class338(arg2, var13, arg7, var22, var21, var23, arg6, arg1, 0, 0, arg12, var56 + 4);
                                        if (var63.method1(97)) {
                                            var63.method2((byte) 76, arg2);
                                        }
                                        if (var64.method1(-82)) {
                                            var64.method2((byte) 76, arg2);
                                        }
                                        var60 = var63;
                                        var62 = var64;
                                    }
                                    class299.method1851(arg11, arg10, arg4, var60, var62);
                                }
                            } else {
                                class141 var29;
                                if (var25) {
                                    class17 var28 = new class17(arg2, var13, arg11, arg7, var22, var21, var23, arg6, arg10, arg10 + -1 + var15, arg4, arg4 + var14 - 1, arg12, arg1, var24);
                                    if (var28.method1(-98)) {
                                        var28.method2((byte) 76, arg2);
                                    }
                                    var29 = var28;
                                } else {
                                    var29 = new class163(arg2, var13, arg12, arg1, arg11, arg7, var22, var21, var23, arg6, arg10, arg10 + -1 + var15, arg4, arg4 + var14 - 1, arg8);
                                }
                                class50.method287(var29, false);
                                if (arg0 && !arg6 && ~arg12 <= -13 && arg12 <= 17 && arg12 != 13 && ~arg11 < -1 && var13.field1206 != 0) {
                                    class354.field5235[arg11][arg10][arg4] = (byte) class276.method1712(class354.field5235[arg11][arg10][arg4], 4);
                                }
                                if (~var13.field1147 != -1 && arg3 != null) {
                                    arg3.method2261(var14, var13.field1191, 69, var15, arg10, !var13.field1143, arg4);
                                }
                            }
                        } else {
                            class17 var65 = null;
                            class141 var67;
                            int var68;
                            if (var25) {
                                class17 var66 = new class17(arg2, var13, arg11, arg7, var22, var21, var23, arg6, arg10, arg10 + -1 + var15, arg4, var14 + -1 + arg4, arg12, arg1, var24);
                                var67 = var66;
                                var65 = var66;
                                var68 = var66.method113(false);
                            } else {
                                var68 = 15;
                                var67 = new class163(arg2, var13, arg12, arg1, arg11, arg7, var22, var21, var23, arg6, arg10, arg10 + -1 + var15, arg4, arg4 + var14 + -1, arg8);
                            }
                            if (class50.method287(var67, false)) {
                                if (var65 != null && var65.method1(90)) {
                                    var65.method2((byte) 76, arg2);
                                }
                                if (var13.field1157 && arg0) {
                                    if (~var68 < -31) {
                                        var68 = 30;
                                    }
                                    for (int var69 = 0; var15 >= var69; ++var69) {
                                        for (int var70 = 0; ~var14 <= ~var70; ++var70) {
                                            var20.method106(arg10 + var69, arg4 + var70, var68);
                                        }
                                    }
                                }
                            }
                            if (var13.field1147 != 0 && arg3 != null) {
                                arg3.method2261(var14, var13.field1191, -114, var15, arg10, !var13.field1143, arg4);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(III)Z")
    public static final boolean method2032(int arg0, int arg1, int arg2) {
        int var3 = client.field6665[arg0][arg1][arg2];
        if (-class68.field892 == var3) {
            return false;
        } else if (class68.field892 == var3) {
            return true;
        } else {
            int var4 = arg1 << class254.field3869;
            int var5 = arg2 << class254.field3869;
            if (class430.method2641(var4 + 1, class307.field4638[arg0].method92(arg1, arg2), var5 + 1) && class430.method2641(class26.field337 + var4 - 1, class307.field4638[arg0].method92(arg1 + 1, arg2), var5 + 1) && class430.method2641(class26.field337 + var4 - 1, class307.field4638[arg0].method92(arg1 + 1, arg2 + 1), class26.field337 + var5 - 1) && class430.method2641(var4 + 1, class307.field4638[arg0].method92(arg1, arg2 + 1), class26.field337 + var5 - 1)) {
                client.field6665[arg0][arg1][arg2] = class68.field892;
                return true;
            } else {
                client.field6665[arg0][arg1][arg2] = -class68.field892;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(III)I")
    public static final int method2033(int arg0, int arg1, int arg2) {
        ++field4953;
        int var3 = (arg0 & 127) * arg2 >> 7;
        if (~var3 <= -3) {
            if (var3 > 126) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        int var4 = -13 / ((30 - arg1) / 33);
        return (arg0 & 65408) - -var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg1 != 1) {
            field4946 = -116;
        }
        ++field4956;
        if (arg0 == 0) {
            this.field4954 = arg2.method2323(-77);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field4948;
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (arg0 != 1) {
            return null;
        } else {
            if (super.field1537.field5756) {
                int[] var4 = this.method703(0, arg1 - 1 & class438.field6441, -2);
                int[] var5 = this.method703(0, arg1, -2);
                int[] var6 = this.method703(0, arg1 - -1 & class438.field6441, -2);
                for (int var7 = 0; class440.field6474 > var7; ++var7) {
                    int var8 = (var6[var7] - var4[var7]) * this.field4954;
                    int var9 = (var5[class87.field1230 & var7 + 1] + -var5[class87.field1230 & var7 + -1]) * this.field4954;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)));
                    int var15 = var14 != 0 ? 16777216 / var14 : 0;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class331() {
        super(1, true);
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
    public static final void method2034(int arg0) {
        class38.field462.method1485(-22032);
        if (arg0 >= -8) {
            method2034(115);
        }
        ++field4952;
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
    public static final void method2035(int arg0) {
        if (arg0 == 5283) {
            for (int var1 = 0; class324.field4875 > var1; ++var1) {
                int var2 = class28.field358[var1];
                class155 var3 = class170.field2626[var2];
                int var4 = class424.field6232.method2343(255);
                if ((var4 & 64) != 0) {
                    var4 += class424.field6232.method2343(255) << 8;
                }
                if ((1024 & var4) != 0) {
                    int var5 = class424.field6232.method2365(0);
                    int[] var6 = new int[var5];
                    int[] var7 = new int[var5];
                    int[] var8 = new int[var5];
                    for (int var9 = 0; ~var9 > ~var5; ++var9) {
                        int var10 = class424.field6232.method2323(-119);
                        if (~var10 == -65536) {
                            var10 = -1;
                        }
                        var6[var9] = var10;
                        var7[var9] = class424.field6232.method2351((byte) 107);
                        var8[var9] = class424.field6232.method2328(-108);
                    }
                    class338.method2064((byte) 112, var8, var6, var7, var3);
                }
                if (~(var4 & 8) != -1) {
                    var3.field1956 = class424.field6232.method2328(-128);
                    if (var3.field1956 == 65535) {
                        var3.field1956 = -1;
                    }
                }
                if (~(1 & var4) != -1) {
                    if (var3.field2137.method1690(arg0 + -5204)) {
                        class422.method2606((byte) 113, var3);
                    }
                    var3.method956(class228.method1385(class424.field6232.method2318(-32), (byte) 61), 0);
                    var3.method906(arg0 ^ -32591, var3.field2137.field4110);
                    var3.field1959 = var3.field2137.field4158 << 3;
                    if (var3.field2137.method1690(119)) {
                        class113.method685(0, (class169) null, var3.field1902, (class85) null, var3.field2018[0], var3.field2019[0], (byte) 94, var3);
                    }
                }
                if (~(var4 & 2) != -1) {
                    var3.field1979 = class424.field6232.method2332(arg0 + -5160);
                    var3.field1982 = 100;
                }
                if (~(var4 & 32) != -1) {
                    int var11 = class424.field6232.method2372(true);
                    int var12 = class424.field6232.method2359((byte) -21);
                    var3.method903(var11, class26.field332, var12, true);
                    var3.field1981 = class26.field332 + 300;
                    var3.field1964 = class424.field6232.method2359((byte) -21);
                }
                if ((var4 & 128) != 0) {
                    int var13 = class424.field6232.method2372(true);
                    int var14 = class424.field6232.method2359((byte) -21);
                    var3.method903(var13, class26.field332, var14, true);
                }
                if ((var4 & 512) != 0) {
                    var3.field2153 = class424.field6232.method2323(-79);
                    var3.field2149 = class424.field6232.method2328(-97);
                }
                if (~(var4 & 256) != -1) {
                    int var15 = class424.field6232.method2323(-110);
                    var3.field1984 = class424.field6232.method2365(arg0 ^ 5283);
                    var3.field1953 = class424.field6232.method2365(0);
                    var3.field1970 = (var15 & 32768) != 0;
                    var3.field1961 = 32767 & var15;
                    var3.field1965 = class26.field332 - -var3.field1961 + var3.field1984;
                }
                if ((16 & var4) != 0) {
                    int var16 = class424.field6232.method2335(-26);
                    int var17 = class424.field6232.method2367(30);
                    if (var16 == 65535) {
                        var16 = -1;
                    }
                    boolean var18 = true;
                    if (var16 != -1 && var3.field1938 != -1) {
                        if (var3.field1938 == var16) {
                            class195 var19 = class251.method1530(var16, arg0 ^ 5365);
                            if (var19.field2949 && var19.field2950 != -1) {
                                class379 var20 = class98.method629(var19.field2950, (byte) -115);
                                int var21 = var20.field5531;
                                if (~var21 == -1) {
                                    var18 = false;
                                } else if (var21 != 1) {
                                    if (var21 == 2) {
                                        var18 = false;
                                        var3.field1948 = 0;
                                    }
                                } else {
                                    var18 = true;
                                }
                            }
                        } else {
                            class195 var22 = class251.method1530(var16, 106);
                            class195 var23 = class251.method1530(var3.field1938, 80);
                            if (~var22.field2950 != 0 && var23.field2950 != -1) {
                                class379 var24 = class98.method629(var22.field2950, (byte) -115);
                                class379 var25 = class98.method629(var23.field2950, (byte) -115);
                                if (~var25.field5536 < ~var24.field5536) {
                                    var18 = false;
                                }
                            }
                        }
                    }
                    if (var18) {
                        var3.field1932 = 0;
                        var3.field1938 = var16;
                        var3.field1993 = var17 >> 16;
                        var3.field2005 = 1;
                        var3.field1995 = class26.field332 - -(65535 & var17);
                        var3.field1992 = 0;
                        if (~class26.field332 > ~var3.field1995) {
                            var3.field1932 = -1;
                        }
                        if (var3.field1938 != -1 && ~class26.field332 == ~var3.field1995) {
                            int var26 = class251.method1530(var3.field1938, 104).field2950;
                            if (~var26 != 0) {
                                class379 var27 = class98.method629(var26, (byte) -115);
                                if (var27 != null && var27.field5539 != null) {
                                    class251.method1528(false, 0, var3.field1892, var3.field1900, var27, var3.field1902, (byte) -118);
                                }
                            }
                        }
                    }
                }
                if ((4 & var4) != 0) {
                    int var28 = class424.field6232.method2323(-121);
                    if (~var28 == -65536) {
                        var28 = -1;
                    }
                    int var29 = class424.field6232.method2359((byte) -21);
                    class146.method916(var28, var3, (byte) -99, var29);
                }
            }
            ++field4951;
        }
    }
}
