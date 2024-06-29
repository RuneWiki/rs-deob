import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class341 extends class518 {

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public int field4701 = 99;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "Llf;")
    public static class157 field4700 = null;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "Lcs;")
    public static class225 field4702 = new class225();

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "Luf;")
    public static class310 field4710 = new class310(15, 8);

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "Luf;")
    public static class310 field4711 = new class310(84, -2);

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "Z")
    public static boolean field4712 = false;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field4709;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mi", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field4713;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1908(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1899(boolean arg0) {
        if (arg0) {
            method1899(true);
        }
        field4700 = null;
        field4702 = null;
        field4711 = null;
        field4710 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILqa;IBLid;I)V", line = 18)
    public final void method1900(int arg0, int arg1, class162 arg2, int arg3, byte arg4, class413 arg5, int arg6) {
        ++field4708;
        int var8 = -120 / ((arg4 - -64) / 61);
        class55 var9 = null;
        if (arg1 == 0) {
            var9 = (class55) class195.method1184(arg0, arg6, arg3);
        }
        if (arg1 == 1) {
            var9 = (class55) class503.method2956(arg0, arg6, arg3);
        }
        if (arg1 == 2) {
            var9 = (class55) class490.method2876(arg0, arg6, arg3, field4713 != null ? field4713 : (field4713 = method1908("jv")));
        }
        if (arg1 == 3) {
            var9 = (class55) class391.method2240(arg0, arg6, arg3);
        }
        if (var9 != null) {
            class132 var10 = class82.field1154.method2121(var9.method354((byte) 1), true);
            int var11 = var9.method355(13599);
            int var12 = var9.method359((byte) -8);
            if (var10.method867((byte) -123)) {
                class437.method2612(arg0, arg3, var10, (byte) 111, arg6);
            }
            if (var9.method360(58)) {
                var9.method356(107, arg2);
            }
            if (arg1 == 0) {
                class134 var13 = class195.method1184(arg0, arg6, arg3);
                if (var13 instanceof class107) {
                    ((class107) var13).field1458 = null;
                } else {
                    class485.method2862(arg0, arg6, arg3);
                }
                if (~var10.field1892 != -1) {
                    arg5.method2461(var10.field1876, arg6, -7856, var12, !var10.field1878, var11, arg3);
                    return;
                }
            } else if (arg1 != 1) {
                if (~arg1 == -3) {
                    class33 var14 = class490.method2876(arg0, arg6, arg3, field4713 != null ? field4713 : (field4713 = method1908("jv")));
                    if (var14 instanceof class63 && var14.field463 == arg6 && var14.field468 == arg3) {
                        ((class63) var14).field869 = null;
                    } else {
                        class270.method1542(arg0, arg6, arg3, field4713 != null ? field4713 : (field4713 = method1908("jv")));
                    }
                    if (var10.field1892 != 0 && ~super.field7637 < ~(arg6 - -var10.field1880) && super.field7623 > arg3 - -var10.field1880 && var10.field1881 + arg6 < super.field7637 && arg3 - -var10.field1881 < super.field7623) {
                        arg5.method2465(!var10.field1878, var12, var10.field1881, 2883872, var10.field1876, var10.field1880, arg6, arg3);
                        return;
                    }
                    return;
                }
                if (arg1 == 3) {
                    class180 var15 = class391.method2240(arg0, arg6, arg3);
                    if (var15 instanceof class521) {
                        ((class521) var15).field7679 = null;
                    } else {
                        class52.method319(arg0, arg6, arg3);
                    }
                    if (var10.field1892 == 1) {
                        arg5.method2478(false, arg3, arg6);
                        return;
                    }
                }
            } else {
                class463 var16 = class503.method2956(arg0, arg6, arg3);
                if (!(var16 instanceof class331)) {
                    class7.method39(arg0, arg6, arg3);
                    return;
                }
                ((class331) var16).field4506 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILqa;IIIIIILid;II)V", line = 128)
    public final void method1901(int arg0, class162 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class413 arg8, int arg9, int arg10) {
        ++field4709;
        if (class437.field6374.method560((byte) 115, class278.field3761) || class361.method2003((byte) -21, arg3, arg6, class304.field4173, arg9)) {
            if (this.field4701 > arg7) {
                this.field4701 = arg7;
            }
            class132 var12 = class82.field1154.method2121(arg0, true);
            if (!arg1.method536() || !class437.field6374.field4286 || !var12.field1896) {
                int var13;
                int var14;
                if (~arg4 != -2 && ~arg4 != -4) {
                    var13 = var12.field1881;
                    var14 = var12.field1880;
                } else {
                    var14 = var12.field1881;
                    var13 = var12.field1880;
                }
                if (arg2 <= 51) {
                    this.field4701 = 90;
                }
                int var15;
                int var16;
                if (~(arg3 + var14) < ~super.field7637) {
                    var15 = arg3 + 1;
                    var16 = arg3;
                } else {
                    var16 = (var14 >> 1) + arg3;
                    var15 = (var14 + 1 >> 1) + arg3;
                }
                int var17;
                int var18;
                if (~(arg6 + var13) >= ~super.field7623) {
                    var17 = (var13 >> 1) + arg6;
                    var18 = (var13 + 1 >> 1) + arg6;
                } else {
                    var18 = arg6 + 1;
                    var17 = arg6;
                }
                class35 var19 = class383.field5391[arg9];
                int var20 = var19.method221(var16, var17) - -var19.method221(var15, var17) + var19.method221(var16, var18) + var19.method221(var15, var18) >> 2;
                int var21 = (arg3 << 7) + (var14 << 6);
                int var22 = (arg6 << 7) + (var13 << 6);
                boolean var23 = class270.field3695 && !super.field7626 && var12.field1890;
                if (var12.method867((byte) 63)) {
                    class405.method2344(arg4, 65535, arg7, (class192) null, arg3, arg6, (class405) null, var12);
                }
                boolean var24 = ~arg10 == 0 && ~var12.field1819 == 0 && var12.field1820 == null && var12.field1814 == null && !var12.field1843;
                if (!class393.field5480 || (!class306.method1738(-17521, arg5) || var12.field1828 == 1) && (!class451.method2655(true, arg5) || var12.field1828 != 0)) {
                    if (~arg5 == -23) {
                        if (class437.field6374.field4279 || var12.field1850 != 0 || ~var12.field1892 == -2 || var12.field1869) {
                            class180 var26;
                            if (var24) {
                                class143 var25 = new class143(arg1, var12, arg9, var21, var20, var22, super.field7626, arg4, var23);
                                var26 = var25;
                                if (var25.method360(71)) {
                                    var25.method357(100, arg1);
                                }
                            } else {
                                var26 = new class496(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg4, arg10);
                            }
                            class180 var27 = class391.method2240(arg7, arg3, arg6);
                            if (var27 instanceof class521) {
                                ((class521) var27).field7679 = var26;
                            } else {
                                class13.method108(arg7, arg3, arg6, var26);
                            }
                            if (var12.field1892 == 1 && arg8 != null) {
                                arg8.method2477(arg3, arg6, (byte) 115);
                            }
                        }
                    } else if (arg5 != 10 && ~arg5 != -12) {
                        if (arg5 >= 12 && arg5 <= 17 || arg5 >= 18 && arg5 <= 21) {
                            class33 var28;
                            if (!var24) {
                                var28 = new class158(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg3, arg3 + var14 + -1, arg6, arg6 + var13 + -1, arg5, arg4, arg10);
                            } else {
                                class266 var29 = new class266(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg3, arg3 + var14 + -1, arg6, arg6 + -1 - -var13, arg5, arg4, var23);
                                if (var29.method360(37)) {
                                    var29.method357(84, arg1);
                                }
                                var28 = var29;
                            }
                            class33 var30 = class490.method2876(arg7, arg3, arg6, field4713 != null ? field4713 : (field4713 = method1908("jv")));
                            if (var30 instanceof class63 && var30.field463 == arg3 && var30.field468 == arg6) {
                                ((class63) var30).field869 = var28;
                            } else {
                                class7.method41(var28, false);
                            }
                            if (class270.field3695 && !super.field7626 && arg5 >= 12 && ~arg5 >= -18 && ~arg5 != -14 && arg7 > 0 && ~var12.field1828 != -1) {
                                super.field7616[arg7][arg3][arg6] = (byte) class25.method183(super.field7616[arg7][arg3][arg6], 4);
                            }
                            if (var12.field1892 != 0 && arg8 != null) {
                                arg8.method2474(arg3, arg6, var13, var12.field1876, false, !var12.field1878, var14);
                            }
                        } else if (~arg5 == -1) {
                            int var31 = var12.field1828;
                            if (class2.field21 && ~var12.field1828 == 0) {
                                var31 = 1;
                            }
                            class134 var32;
                            if (!var24) {
                                var32 = new class268(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg5, arg4, arg10);
                            } else {
                                class334 var33 = new class334(arg1, var12, arg9, var21, var20, var22, super.field7626, arg5, arg4, var23);
                                if (var33.method360(75)) {
                                    var33.method357(113, arg1);
                                }
                                var32 = var33;
                            }
                            class134 var34 = class195.method1184(arg7, arg3, arg6);
                            if (var34 instanceof class107) {
                                ((class107) var34).field1458 = var32;
                            } else {
                                class289.method1654(arg7, arg3, arg6, var32, (class134) null);
                            }
                            if (class270.field3695) {
                                if (arg4 != 0) {
                                    if (~arg4 == -2) {
                                        if (var12.field1826) {
                                            var19.method231(arg3, arg6 + 1, 50);
                                            var19.method231(arg3 - -1, arg6 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field7626) {
                                            super.field7616[arg7][arg3][arg6 + 1] = (byte) class25.method183(super.field7616[arg7][arg3][arg6 + 1], 2);
                                        }
                                    } else if (arg4 == 2) {
                                        if (var12.field1826) {
                                            var19.method231(arg3 - -1, arg6, 50);
                                            var19.method231(arg3 + 1, arg6 - -1, 50);
                                        }
                                        if (var31 == 1 && !super.field7626) {
                                            super.field7616[arg7][arg3 + 1][arg6] = (byte) class25.method183(super.field7616[arg7][arg3 + 1][arg6], 1);
                                        }
                                    } else if (arg4 == 3) {
                                        if (var12.field1826) {
                                            var19.method231(arg3, arg6, 50);
                                            var19.method231(arg3 - -1, arg6, 50);
                                        }
                                        if (var31 == 1 && !super.field7626) {
                                            super.field7616[arg7][arg3][arg6] = (byte) class25.method183(super.field7616[arg7][arg3][arg6], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field1826) {
                                        var19.method231(arg3, arg6, 50);
                                        var19.method231(arg3, arg6 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field7626) {
                                        super.field7616[arg7][arg3][arg6] = (byte) class25.method183(super.field7616[arg7][arg3][arg6], 1);
                                    }
                                }
                            }
                            if (var12.field1892 != 0 && arg8 != null) {
                                arg8.method2472(arg4, arg6, (byte) -120, arg3, !var12.field1878, var12.field1876, arg5);
                            }
                            if (~var12.field1871 != -17) {
                                class452.method2664(arg7, arg3, arg6, var12.field1871);
                            }
                        } else if (~arg5 == -2) {
                            class134 var36;
                            if (var24) {
                                class334 var35 = new class334(arg1, var12, arg9, var21, var20, var22, super.field7626, arg5, arg4, var23);
                                var36 = var35;
                                if (var35.method360(116)) {
                                    var35.method357(67, arg1);
                                }
                            } else {
                                var36 = new class268(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg5, arg4, arg10);
                            }
                            class134 var37 = class195.method1184(arg7, arg3, arg6);
                            if (var37 instanceof class107) {
                                ((class107) var37).field1458 = var36;
                            } else {
                                class289.method1654(arg7, arg3, arg6, var36, (class134) null);
                            }
                            if (var12.field1826 && class270.field3695) {
                                if (arg4 == 0) {
                                    var19.method231(arg3, arg6 + 1, 50);
                                } else if (~arg4 != -2) {
                                    if (arg4 == 2) {
                                        var19.method231(arg3 + 1, arg6, 50);
                                    } else if (arg4 == 3) {
                                        var19.method231(arg3, arg6, 50);
                                    }
                                } else {
                                    var19.method231(arg3 + 1, arg6 + 1, 50);
                                }
                            }
                            if (~var12.field1892 != -1 && arg8 != null) {
                                arg8.method2472(arg4, arg6, (byte) -86, arg3, !var12.field1878, var12.field1876, arg5);
                            }
                        } else if (~arg5 == -3) {
                            int var38 = arg4 + 1 & 3;
                            class134 var41;
                            class134 var42;
                            if (var24) {
                                class334 var39 = new class334(arg1, var12, arg9, var21, var20, var22, super.field7626, arg5, arg4 + 4, var23);
                                class334 var40 = new class334(arg1, var12, arg9, var21, var20, var22, super.field7626, arg5, var38, var23);
                                if (var39.method360(118)) {
                                    var39.method357(68, arg1);
                                }
                                var41 = var40;
                                if (var40.method360(111)) {
                                    var40.method357(88, arg1);
                                }
                                var42 = var39;
                            } else {
                                var42 = new class268(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg5, arg4 - -4, arg10);
                                var41 = new class268(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg5, var38, arg10);
                            }
                            class289.method1654(arg7, arg3, arg6, var42, var41);
                            if (~var12.field1828 == -2 && class270.field3695 && !super.field7626) {
                                if (~arg4 != -1) {
                                    if (arg4 != 1) {
                                        if (~arg4 == -3) {
                                            super.field7616[arg7][arg3 + 1][arg6] = (byte) class25.method183(super.field7616[arg7][arg3 + 1][arg6], 1);
                                            super.field7616[arg7][arg3][arg6] = (byte) class25.method183(super.field7616[arg7][arg3][arg6], 2);
                                        } else if (~arg4 == -4) {
                                            super.field7616[arg7][arg3][arg6] = (byte) class25.method183(super.field7616[arg7][arg3][arg6], 2);
                                            super.field7616[arg7][arg3][arg6] = (byte) class25.method183(super.field7616[arg7][arg3][arg6], 1);
                                        }
                                    } else {
                                        super.field7616[arg7][arg3][arg6 - -1] = (byte) class25.method183(super.field7616[arg7][arg3][arg6 - -1], 2);
                                        super.field7616[arg7][arg3 - -1][arg6] = (byte) class25.method183(super.field7616[arg7][arg3 - -1][arg6], 1);
                                    }
                                } else {
                                    super.field7616[arg7][arg3][arg6] = (byte) class25.method183(super.field7616[arg7][arg3][arg6], 1);
                                    super.field7616[arg7][arg3][arg6 + 1] = (byte) class25.method183(super.field7616[arg7][arg3][arg6 + 1], 2);
                                }
                            }
                            if (~var12.field1892 != -1 && arg8 != null) {
                                arg8.method2472(arg4, arg6, (byte) -120, arg3, !var12.field1878, var12.field1876, arg5);
                            }
                            if (var12.field1871 != 16) {
                                class452.method2664(arg7, arg3, arg6, var12.field1871);
                            }
                        } else if (~arg5 == -4) {
                            class134 var44;
                            if (var24) {
                                class334 var43 = new class334(arg1, var12, arg9, var21, var20, var22, super.field7626, arg5, arg4, var23);
                                if (var43.method360(108)) {
                                    var43.method357(120, arg1);
                                }
                                var44 = var43;
                            } else {
                                var44 = new class268(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg5, arg4, arg10);
                            }
                            class134 var45 = class195.method1184(arg7, arg3, arg6);
                            if (var45 instanceof class107) {
                                ((class107) var45).field1458 = var44;
                            } else {
                                class289.method1654(arg7, arg3, arg6, var44, (class134) null);
                            }
                            if (var12.field1826 && class270.field3695) {
                                if (~arg4 == -1) {
                                    var19.method231(arg3, arg6 + 1, 50);
                                } else if (arg4 != 1) {
                                    if (~arg4 == -3) {
                                        var19.method231(arg3 + 1, arg6, 50);
                                    } else if (~arg4 == -4) {
                                        var19.method231(arg3, arg6, 50);
                                    }
                                } else {
                                    var19.method231(arg3 + 1, arg6 - -1, 50);
                                }
                            }
                            if (~var12.field1892 != -1 && arg8 != null) {
                                arg8.method2472(arg4, arg6, (byte) -96, arg3, !var12.field1878, var12.field1876, arg5);
                            }
                        } else if (~arg5 == -10) {
                            class33 var46;
                            if (!var24) {
                                var46 = new class158(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg3, arg3 + var14 + -1, arg6, arg6 + var13 + -1, arg5, arg4, arg10);
                            } else {
                                class266 var47 = new class266(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg3, arg3, arg6, arg6, arg5, arg4, var23);
                                if (var47.method360(107)) {
                                    var47.method357(98, arg1);
                                }
                                var46 = var47;
                            }
                            class33 var48 = class490.method2876(arg7, arg3, arg6, field4713 != null ? field4713 : (field4713 = method1908("jv")));
                            if (var48 instanceof class63 && ~var48.field463 == ~arg3 && ~var48.field468 == ~arg6) {
                                ((class63) var48).field869 = var46;
                            } else {
                                class7.method41(var46, false);
                            }
                            if (~var12.field1892 != -1 && arg8 != null) {
                                arg8.method2474(arg3, arg6, var13, var12.field1876, false, !var12.field1878, var14);
                            }
                            if (~var12.field1871 != -17) {
                                class452.method2664(arg7, arg3, arg6, var12.field1871);
                            }
                        } else if (arg5 == 4) {
                            class463 var50;
                            if (var24) {
                                class364 var49 = new class364(arg1, var12, arg9, var21, var20, var22, super.field7626, 0, 0, 0, arg5, arg4);
                                var50 = var49;
                                if (var49.method360(46)) {
                                    var49.method357(70, arg1);
                                }
                            } else {
                                var50 = new class511(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, 0, 0, 0, arg5, arg4, arg10);
                            }
                            class463 var51 = class503.method2956(arg7, arg3, arg6);
                            if (var51 instanceof class331) {
                                ((class331) var51).field4506 = var50;
                            } else {
                                class306.method1739(arg7, arg3, arg6, var50, (class463) null);
                            }
                        } else if (~arg5 == -6) {
                            int var52 = 17;
                            class55 var53 = (class55) class195.method1184(arg7, arg3, arg6);
                            if (var53 != null) {
                                var52 = 1 + class82.field1154.method2121(var53.method354((byte) 121), true).field1871;
                            }
                            class463 var54;
                            if (!var24) {
                                var54 = new class511(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, 0, class499.field7345[arg4] * var52, class58.field791[arg4] * var52, arg5, arg4, arg10);
                            } else {
                                class364 var55 = new class364(arg1, var12, arg9, var21, var20, var22, super.field7626, 0, class499.field7345[arg4] * var52, class58.field791[arg4] * var52, arg5, arg4);
                                var54 = var55;
                                if (var55.method360(54)) {
                                    var55.method357(108, arg1);
                                }
                            }
                            class463 var56 = class503.method2956(arg7, arg3, arg6);
                            if (!(var56 instanceof class331)) {
                                class306.method1739(arg7, arg3, arg6, var54, (class463) null);
                            } else {
                                ((class331) var56).field4506 = var54;
                            }
                        } else if (~arg5 == -7) {
                            int var57 = 9;
                            class55 var58 = (class55) class195.method1184(arg7, arg3, arg6);
                            if (var58 != null) {
                                var57 = 1 + class82.field1154.method2121(var58.method354((byte) 118), true).field1871 / 2;
                            }
                            class463 var59;
                            if (!var24) {
                                var59 = new class511(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg4, class190.field2642[arg4] * var57, class91.field1224[arg4] * var57, arg5, arg4 + 4, arg10);
                            } else {
                                class364 var60 = new class364(arg1, var12, arg9, var21, var20, var22, super.field7626, arg4, class499.field7345[arg4] * var57, class58.field791[arg4] * var57, arg5, arg4 - -4);
                                if (var60.method360(71)) {
                                    var60.method357(50, arg1);
                                }
                                var59 = var60;
                            }
                            class463 var61 = class503.method2956(arg7, arg3, arg6);
                            if (var61 instanceof class331) {
                                ((class331) var61).field4506 = var59;
                            } else {
                                class306.method1739(arg7, arg3, arg6, var59, (class463) null);
                            }
                        } else if (arg5 == 7) {
                            int var62 = 3 & arg4 + 2;
                            class463 var63;
                            if (!var24) {
                                var63 = new class511(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, var62, 0, 0, arg5, var62 + 4, arg10);
                            } else {
                                class364 var64 = new class364(arg1, var12, arg9, var21, var20, var22, super.field7626, var62, 0, 0, arg5, var62 + 4);
                                if (var64.method360(55)) {
                                    var64.method357(79, arg1);
                                }
                                var63 = var64;
                            }
                            class463 var65 = class503.method2956(arg7, arg3, arg6);
                            if (var65 instanceof class331) {
                                ((class331) var65).field4506 = var63;
                            } else {
                                class306.method1739(arg7, arg3, arg6, var63, (class463) null);
                            }
                        } else if (arg5 == 8) {
                            int var66 = arg4 + 2 & 3;
                            int var67 = 9;
                            class55 var68 = (class55) class195.method1184(arg7, arg3, arg6);
                            if (var68 != null) {
                                var67 = class82.field1154.method2121(var68.method354((byte) -32), true).field1871 / 2 + 1;
                            }
                            class463 var71;
                            class463 var72;
                            if (!var24) {
                                class511 var69 = new class511(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg4, class190.field2642[arg4] * var67, class91.field1224[arg4] * var67, arg5, arg4 - -4, arg10);
                                class511 var70 = new class511(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg4, 0, 0, arg5, var66 + 4, arg10);
                                var71 = var69;
                                var72 = var70;
                            } else {
                                class364 var73 = new class364(arg1, var12, arg9, var21, var20, var22, super.field7626, arg4, class190.field2642[arg4] * var67, class91.field1224[arg4] * var67, arg5, arg4 - -4);
                                class364 var74 = new class364(arg1, var12, arg9, var21, var20, var22, super.field7626, arg4, 0, 0, arg5, var66 + 4);
                                if (var73.method360(72)) {
                                    var73.method357(120, arg1);
                                }
                                if (var74.method360(121)) {
                                    var74.method357(115, arg1);
                                }
                                var71 = var73;
                                var72 = var74;
                            }
                            class306.method1739(arg7, arg3, arg6, var71, var72);
                        }
                    } else {
                        class266 var75 = null;
                        class33 var77;
                        int var78;
                        if (var24) {
                            class266 var76 = new class266(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg3, arg3 - -var14 + -1, arg6, arg6 + -1 + var13, arg5, arg4, var23);
                            var77 = var76;
                            var75 = var76;
                            var78 = var76.method1534((byte) 110);
                        } else {
                            var78 = 15;
                            var77 = new class158(arg1, var12, arg7, arg9, var21, var20, var22, super.field7626, arg3, arg3 - 1 + var14, arg6, var13 + -1 + arg6, arg5, arg4, arg10);
                        }
                        class33 var79 = class490.method2876(arg7, arg3, arg6, field4713 != null ? field4713 : (field4713 = method1908("jv")));
                        boolean var80 = false;
                        if (var79 instanceof class63 && ~var79.field463 == ~arg3 && var79.field468 == arg6) {
                            var80 = true;
                            ((class63) var79).field869 = var77;
                        }
                        if (var80 || class7.method41(var77, false)) {
                            if (var75 != null && var75.method360(67)) {
                                var75.method357(88, arg1);
                            }
                            if (var12.field1826 && class270.field3695) {
                                if (~var78 < -31) {
                                    var78 = 30;
                                }
                                for (int var81 = 0; ~var81 >= ~var14; ++var81) {
                                    for (int var82 = 0; ~var13 <= ~var82; ++var82) {
                                        var19.method231(arg3 + var81, arg6 + var82, var78);
                                    }
                                }
                            }
                        }
                        if (~var12.field1892 != -1 && arg8 != null) {
                            arg8.method2474(arg3, arg6, var13, var12.field1876, false, !var12.field1878, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIZ)V", line = 845)
    public class341(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class306.field4201, class528.field7770);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)[[[B", line = 851)
    public static final byte[][][] method1902(int arg0, byte arg1) {
        ++field4707;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var4 > var7; ++var7) {
            for (int var132 = 0; ~var3 < ~var132; ++var132) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                ++var6;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 + -1; var10 >= 0; --var10) {
            for (int var131 = 0; ~var131 > ~var4; ++var131) {
                if (~var131 >= ~var10) {
                    var8[var9] = -1;
                }
                ++var9;
            }
        }
        var2[0][1] = var8;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var4 > var13; ++var13) {
            for (int var130 = 0; ~var130 > ~var3; ++var130) {
                if (var130 >= var13) {
                    var11[var12] = -1;
                }
                ++var12;
            }
        }
        var2[0][2] = var11;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 + -1; var16 >= 0; --var16) {
            for (int var129 = 0; var3 > var129; ++var129) {
                if (~var129 <= ~var16) {
                    var14[var15] = -1;
                }
                ++var15;
            }
        }
        var2[0][3] = var14;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 + -1; ~var19 <= -1; --var19) {
            for (int var128 = 0; ~var3 < ~var128; ++var128) {
                if (~var128 >= ~(var19 >> 1)) {
                    var18[var17] = -1;
                }
                ++var17;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; ~var22 > ~var4; ++var22) {
            for (int var127 = 0; var127 < var3; ++var127) {
                if (~var20 <= -1 && var20 < var21.length) {
                    if (var22 << 1 <= var127) {
                        var21[var20] = -1;
                    }
                    ++var20;
                } else {
                    ++var20;
                }
            }
        }
        var2[1][1] = var21;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; ++var25) {
            for (int var126 = var3 - 1; var126 >= 0; --var126) {
                if (var126 <= var25 >> 1) {
                    var23[var24] = -1;
                }
                ++var24;
            }
        }
        var2[1][2] = var23;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 + -1; ~var28 <= -1; --var28) {
            for (int var125 = var3 + -1; ~var125 <= -1; --var125) {
                if (~(var28 << 1) >= ~var125) {
                    var26[var27] = -1;
                }
                ++var27;
            }
        }
        var2[1][3] = var26;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 + -1; ~var31 <= -1; --var31) {
            for (int var124 = var3 - 1; var124 >= 0; --var124) {
                if (var124 <= var31 >> 1) {
                    var29[var30] = -1;
                }
                ++var30;
            }
        }
        var2[2][0] = var29;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 + -1; var34 >= 0; --var34) {
            for (int var123 = 0; var123 < var3; ++var123) {
                if (var34 << 1 <= var123) {
                    var33[var32] = -1;
                }
                ++var32;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; ~var37 > ~var4; ++var37) {
            for (int var122 = 0; var122 < var3; ++var122) {
                if (var37 >> 1 >= var122) {
                    var35[var36] = -1;
                }
                ++var36;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; ~var4 < ~var40; ++var40) {
            for (int var121 = var3 + -1; var121 >= 0; --var121) {
                if (var121 >= var40 << 1) {
                    var39[var38] = -1;
                }
                ++var38;
            }
        }
        var2[2][3] = var39;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; --var43) {
            for (int var120 = 0; ~var3 < ~var120; ++var120) {
                if (var43 >> 1 <= var120) {
                    var41[var42] = -1;
                }
                ++var42;
            }
        }
        var2[3][0] = var41;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; ~var4 < ~var46; ++var46) {
            for (int var119 = 0; ~var119 > ~var3; ++var119) {
                if (~var119 >= ~(var46 << 1)) {
                    var45[var44] = -1;
                }
                ++var44;
            }
        }
        if (arg1 != 5) {
            return null;
        } else {
            var2[3][1] = var45;
            byte[] var47 = new byte[var3 * var4];
            int var48 = 0;
            for (int var49 = 0; ~var49 > ~var4; ++var49) {
                for (int var118 = var3 + -1; ~var118 <= -1; --var118) {
                    if (var118 >= var49 >> 1) {
                        var47[var48] = -1;
                    }
                    ++var48;
                }
            }
            var2[3][2] = var47;
            byte[] var50 = new byte[var3 * var4];
            int var51 = 0;
            for (int var52 = var4 + -1; ~var52 <= -1; --var52) {
                for (int var117 = var3 + -1; var117 >= 0; --var117) {
                    if (~(var52 << 1) <= ~var117) {
                        var50[var51] = -1;
                    }
                    ++var51;
                }
            }
            var2[3][3] = var50;
            byte[] var53 = new byte[var3 * var4];
            int var54 = 0;
            for (int var55 = var4 + -1; var55 >= 0; --var55) {
                for (int var116 = var3 + -1; ~var116 <= -1; --var116) {
                    if (~(var55 >> 1) >= ~var116) {
                        var53[var54] = -1;
                    }
                    ++var54;
                }
            }
            var2[4][0] = var53;
            int var56 = 0;
            byte[] var57 = new byte[var3 * var4];
            for (int var58 = var4 + -1; var58 >= 0; --var58) {
                for (int var115 = 0; var3 > var115; ++var115) {
                    if (~var115 >= ~(var58 << 1)) {
                        var57[var56] = -1;
                    }
                    ++var56;
                }
            }
            var2[4][1] = var57;
            byte[] var59 = new byte[var3 * var4];
            int var60 = 0;
            for (int var61 = 0; var61 < var4; ++var61) {
                for (int var114 = 0; var114 < var3; ++var114) {
                    if (var114 >= var61 >> 1) {
                        var59[var60] = -1;
                    }
                    ++var60;
                }
            }
            var2[4][2] = var59;
            int var62 = 0;
            byte[] var63 = new byte[var3 * var4];
            for (int var64 = 0; var64 < var4; ++var64) {
                for (int var113 = var3 - 1; var113 >= 0; --var113) {
                    if (~var113 >= ~(var64 << 1)) {
                        var63[var62] = -1;
                    }
                    ++var62;
                }
            }
            var2[4][3] = var63;
            byte[] var65 = new byte[var3 * var4];
            int var66 = 0;
            for (int var67 = 0; var4 > var67; ++var67) {
                for (int var112 = 0; var3 > var112; ++var112) {
                    if (var3 / 2 >= var112) {
                        var65[var66] = -1;
                    }
                    ++var66;
                }
            }
            var2[5][0] = var65;
            byte[] var68 = new byte[var3 * var4];
            int var69 = 0;
            for (int var70 = 0; ~var4 < ~var70; ++var70) {
                for (int var111 = 0; ~var111 > ~var3; ++var111) {
                    if (~(var4 / 2) <= ~var70) {
                        var68[var69] = -1;
                    }
                    ++var69;
                }
            }
            var2[5][1] = var68;
            byte[] var71 = new byte[var3 * var4];
            int var72 = 0;
            for (int var73 = 0; var4 > var73; ++var73) {
                for (int var110 = 0; ~var3 < ~var110; ++var110) {
                    if (var110 >= var3 / 2) {
                        var71[var72] = -1;
                    }
                    ++var72;
                }
            }
            var2[5][2] = var71;
            int var74 = 0;
            byte[] var75 = new byte[var3 * var4];
            for (int var76 = 0; var4 > var76; ++var76) {
                for (int var109 = 0; var3 > var109; ++var109) {
                    if (~(var4 / 2) >= ~var76) {
                        var75[var74] = -1;
                    }
                    ++var74;
                }
            }
            var2[5][3] = var75;
            byte[] var77 = new byte[var3 * var4];
            int var78 = 0;
            for (int var79 = 0; var79 < var4; ++var79) {
                for (int var108 = 0; ~var3 < ~var108; ++var108) {
                    if (-(var4 / 2) + var79 >= var108) {
                        var77[var78] = -1;
                    }
                    ++var78;
                }
            }
            var2[6][0] = var77;
            byte[] var80 = new byte[var3 * var4];
            int var81 = 0;
            for (int var82 = var4 + -1; ~var82 <= -1; --var82) {
                for (int var107 = 0; ~var3 < ~var107; ++var107) {
                    if (~var107 >= ~(-(var4 / 2) + var82)) {
                        var80[var81] = -1;
                    }
                    ++var81;
                }
            }
            var2[6][1] = var80;
            byte[] var83 = new byte[var3 * var4];
            int var84 = 0;
            for (int var85 = var4 - 1; ~var85 <= -1; --var85) {
                for (int var106 = var3 + -1; ~var106 <= -1; --var106) {
                    if (~var106 >= ~(-(var4 / 2) + var85)) {
                        var83[var84] = -1;
                    }
                    ++var84;
                }
            }
            var2[6][2] = var83;
            byte[] var86 = new byte[var3 * var4];
            int var87 = 0;
            for (int var88 = 0; ~var88 > ~var4; ++var88) {
                for (int var105 = var3 + -1; var105 >= 0; --var105) {
                    if (~var105 >= ~(-(var4 / 2) + var88)) {
                        var86[var87] = -1;
                    }
                    ++var87;
                }
            }
            var2[6][3] = var86;
            int var89 = 0;
            byte[] var90 = new byte[var3 * var4];
            for (int var91 = 0; var91 < var4; ++var91) {
                for (int var104 = 0; var104 < var3; ++var104) {
                    if (~var104 <= ~(var91 - var4 / 2)) {
                        var90[var89] = -1;
                    }
                    ++var89;
                }
            }
            var2[7][0] = var90;
            int var92 = 0;
            byte[] var93 = new byte[var3 * var4];
            for (int var94 = var4 + -1; var94 >= 0; --var94) {
                for (int var103 = 0; ~var3 < ~var103; ++var103) {
                    if (-(var4 / 2) + var94 <= var103) {
                        var93[var92] = -1;
                    }
                    ++var92;
                }
            }
            var2[7][1] = var93;
            int var95 = 0;
            byte[] var96 = new byte[var3 * var4];
            for (int var97 = var4 - 1; ~var97 <= -1; --var97) {
                for (int var102 = var3 + -1; var102 >= 0; --var102) {
                    if (~var102 <= ~(var97 - var4 / 2)) {
                        var96[var95] = -1;
                    }
                    ++var95;
                }
            }
            var2[7][2] = var96;
            int var98 = 0;
            byte[] var99 = new byte[var3 * var4];
            for (int var100 = 0; ~var100 > ~var4; ++var100) {
                for (int var101 = var3 - 1; ~var101 <= -1; --var101) {
                    if (var101 >= -(var4 / 2) + var100) {
                        var99[var98] = -1;
                    }
                    ++var98;
                }
            }
            var2[7][3] = var99;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lqa;Z)V", line = 1630)
    public final void method1903(class162 arg0, boolean arg1) {
        class12.method102(arg0);
        if (!arg1) {
            ++field4703;
            if (~super.field7639 < -2) {
                for (int var3 = 0; ~super.field7637 < ~var3; ++var3) {
                    for (int var4 = 0; super.field7623 > var4; ++var4) {
                        if (~(class456.field6661[1][var3][var4] & 2) == -3) {
                            class131.method851(var3, var4);
                        }
                    }
                }
            }
            for (int var5 = 0; var5 < super.field7639; ++var5) {
                for (int var6 = 0; super.field7623 >= var6; ++var6) {
                    for (int var7 = 0; ~super.field7637 <= ~var7; ++var7) {
                        if (~(super.field7616[var5][var7][var6] & 1) != -1) {
                            int var8 = var6;
                            int var9 = var6;
                            int var10 = var5;
                            while (~super.field7623 < ~var9 && ~(super.field7616[var5][var7][var9 + 1] & 1) != -1) {
                                ++var9;
                            }
                            int var11 = var5;
                            while (~var8 < -1 && ~(1 & super.field7616[var5][var7][var8 + -1]) != -1) {
                                --var8;
                            }
                            label170: while (var10 > 0) {
                                for (int var12 = var8; var12 <= var9; ++var12) {
                                    if ((1 & super.field7616[var10 + -1][var7][var12]) == 0) {
                                        break label170;
                                    }
                                }
                                --var10;
                            }
                            label159: while (var11 < 3) {
                                for (int var13 = var8; ~var13 >= ~var9; ++var13) {
                                    if (~(1 & super.field7616[var11 + 1][var7][var13]) == -1) {
                                        break label159;
                                    }
                                }
                                ++var11;
                            }
                            int var14 = (var11 - (var10 + -1)) * (-var8 + var9 + 1);
                            if (var14 >= 2) {
                                short var15 = 240;
                                int var16 = super.field7641[var11][var7][var8] + -var15;
                                int var17 = super.field7641[var10][var7][var8];
                                class497.method2934(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) + 128, var16, var17);
                                for (int var18 = var10; ~var18 >= ~var11; ++var18) {
                                    for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                        super.field7616[var18][var7][var19] = (byte) class118.method750(super.field7616[var18][var7][var19], -2);
                                    }
                                }
                            }
                        }
                        if (~(super.field7616[var5][var7][var6] & 2) != -1) {
                            int var20 = var7;
                            int var21 = var7;
                            int var22 = var5;
                            while (~var20 < -1 && ~(2 & super.field7616[var5][var20 + -1][var6]) != -1) {
                                --var20;
                            }
                            int var23 = var5;
                            while (~super.field7637 < ~var21 && ~(super.field7616[var5][var21 + 1][var6] & 2) != -1) {
                                ++var21;
                            }
                            label224: while (~var22 < -1) {
                                for (int var24 = var20; var21 >= var24; ++var24) {
                                    if ((2 & super.field7616[var22 + -1][var24][var6]) == 0) {
                                        break label224;
                                    }
                                }
                                --var22;
                            }
                            label213: while (var23 < 3) {
                                for (int var25 = var20; var25 <= var21; ++var25) {
                                    if (~(2 & super.field7616[var23 - -1][var25][var6]) == -1) {
                                        break label213;
                                    }
                                }
                                ++var23;
                            }
                            int var26 = (var21 - (var20 - 1)) * (var23 - -1 + -var22);
                            if (var26 >= 2) {
                                short var27 = 240;
                                int var28 = super.field7641[var23][var20][var6] + -var27;
                                int var29 = super.field7641[var22][var20][var6];
                                class497.method2934(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                                for (int var30 = var22; var30 <= var23; ++var30) {
                                    for (int var31 = var20; var31 <= var21; ++var31) {
                                        super.field7616[var30][var31][var6] = (byte) class118.method750(super.field7616[var30][var31][var6], -3);
                                    }
                                }
                            }
                        }
                        if ((super.field7616[var5][var7][var6] & 4) != 0) {
                            int var32 = var7;
                            int var33 = var7;
                            int var34 = var6;
                            int var35 = var6;
                            while (~var34 < -1 && ~(4 & super.field7616[var5][var7][var34 + -1]) != -1) {
                                --var34;
                            }
                            while (var35 < super.field7623 && (4 & super.field7616[var5][var7][var35 + 1]) != 0) {
                                ++var35;
                            }
                            label278: while (var32 > 0) {
                                for (int var36 = var34; var35 >= var36; ++var36) {
                                    if (~(super.field7616[var5][var32 - 1][var36] & 4) == -1) {
                                        break label278;
                                    }
                                }
                                --var32;
                            }
                            label267: while (super.field7637 > var33) {
                                for (int var37 = var34; ~var35 <= ~var37; ++var37) {
                                    if (~(super.field7616[var5][var33 + 1][var37] & 4) == -1) {
                                        break label267;
                                    }
                                }
                                ++var33;
                            }
                            if ((var33 - var32 + 1) * (-var34 + var35 + 1) >= 4) {
                                int var38 = super.field7641[var5][var32][var34];
                                class497.method2934(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) + 128, var38, var38);
                                for (int var39 = var32; ~var39 >= ~var33; ++var39) {
                                    for (int var40 = var34; var40 <= var35; ++var40) {
                                        super.field7616[var5][var39][var40] = (byte) class118.method750(super.field7616[var5][var39][var40], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            super.field7616 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([IIILqa;ZLlh;)V", line = 1922)
    public final void method1904(int[] arg0, int arg1, int arg2, class162 arg3, boolean arg4, class365 arg5) {
        ++field4699;
        if (!super.field7626) {
            boolean var7 = false;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            class483 var8 = null;
            while (true) {
                while (arg5.field5073.length > arg5.field5069) {
                    int var18 = arg5.method2099(255);
                    if (var18 == 0) {
                        var8 = new class483(arg5);
                    } else if (~var18 == -2) {
                        int var19 = arg5.method2099(255);
                        if (~var19 < -1) {
                            for (int var20 = 0; var20 < var19; ++var20) {
                                class340 var21 = new class340(arg3, arg5, 0);
                                if (var21.field4696 == 31) {
                                    class300 var22 = class269.field3686.method1505(true, arg5.method2062((byte) 14));
                                    var21.method1894(var22.field4122, var22.field4128, var22.field4120, var22.field4124, (byte) 126);
                                }
                                if (arg3.method528() > 0) {
                                    class432 var23 = var21.field4681;
                                    int var24 = var23.method2578(true) - -(arg1 << 7);
                                    int var25 = var23.method2572(false) - -(arg2 << 7);
                                    int var26 = var24 >> 7;
                                    int var27 = var25 >> 7;
                                    if (var26 >= 0 && ~var27 <= -1 && super.field7637 > var26 && ~var27 > ~super.field7623) {
                                        var23.method1079((byte) 0, var24, var25, super.field7641[var21.field4683][var26][var27] + -var23.method2573(-103));
                                        if (~arg3.method528() < -1) {
                                            class530.method3119(var21);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var18 == -3) {
                        if (var8 == null) {
                            var8 = new class483();
                        }
                        var8.method2854(64, arg5);
                    } else if (~var18 == -129) {
                        if (arg0 == null) {
                            arg5.field5069 += 10;
                        } else {
                            arg0[0] = arg5.method2062((byte) 14);
                            arg0[1] = arg5.method2069(-123);
                            arg0[2] = arg5.method2069(-127);
                            arg0[3] = arg5.method2069(-123);
                            arg0[4] = arg5.method2062((byte) 14);
                        }
                    } else {
                        if (var18 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field7615 == null) {
                            super.field7615 = new byte[4][][];
                        }
                        for (int var28 = 0; ~var28 > -5; ++var28) {
                            byte var29 = arg5.method2081((byte) 109);
                            if (var29 == 0 && super.field7615[var28] != null) {
                                int var30 = arg1;
                                int var31 = arg1 + 64;
                                int var32 = arg2;
                                if (~var31 <= -1) {
                                    if (~var31 <= ~super.field7637) {
                                        var31 = super.field7637;
                                    }
                                } else {
                                    var31 = 0;
                                }
                                if (~arg2 > -1) {
                                    var32 = 0;
                                } else if (~super.field7623 >= ~arg2) {
                                    var32 = super.field7623;
                                }
                                if (~arg1 <= -1) {
                                    if (~arg1 <= ~super.field7637) {
                                        var30 = super.field7637;
                                    }
                                } else {
                                    var30 = 0;
                                }
                                int var33 = arg2 + 64;
                                if (var33 < 0) {
                                    var33 = 0;
                                } else if (~super.field7623 >= ~var33) {
                                    var33 = super.field7623;
                                }
                                while (~var30 > ~var31) {
                                    while (~var32 > ~var33) {
                                        super.field7615[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (~var29 != -2) {
                                if (~var29 == -3) {
                                    if (super.field7615[var28] == null) {
                                        super.field7615[var28] = new byte[super.field7637 + 1][super.field7623 + 1];
                                    }
                                    if (~var28 < -1) {
                                        int var34 = arg1;
                                        int var35 = arg1 + 64;
                                        int var36 = arg2;
                                        int var37 = arg2 - -64;
                                        if (~var35 > -1) {
                                            var35 = 0;
                                        } else if (var35 >= super.field7637) {
                                            var35 = super.field7637;
                                        }
                                        if (~arg1 <= -1) {
                                            if (arg1 >= super.field7637) {
                                                var34 = super.field7637;
                                            }
                                        } else {
                                            var34 = 0;
                                        }
                                        if (~arg2 <= -1) {
                                            if (super.field7623 <= arg2) {
                                                var36 = super.field7623;
                                            }
                                        } else {
                                            var36 = 0;
                                        }
                                        if (var37 >= 0) {
                                            if (var37 >= super.field7623) {
                                                var37 = super.field7623;
                                            }
                                        } else {
                                            var37 = 0;
                                        }
                                        while (~var35 < ~var34) {
                                            while (var37 > var36) {
                                                super.field7615[var28][var34][var36] = super.field7615[var28 + -1][var34][var36];
                                                ++var36;
                                            }
                                            ++var34;
                                        }
                                    }
                                }
                            } else {
                                if (super.field7615[var28] == null) {
                                    super.field7615[var28] = new byte[super.field7637 + 1][super.field7623 + 1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; var39 < 64; var39 += 4) {
                                        byte var40 = arg5.method2081((byte) -15);
                                        for (int var41 = arg1 + var38; ~var41 > ~(arg1 - -4 + var38); ++var41) {
                                            for (int var42 = var39 - -arg2; ~var42 > ~(var39 + 4 + arg2); ++var42) {
                                                if (var41 >= 0 && ~super.field7637 < ~var41 && var42 >= 0 && super.field7623 > var42) {
                                                    super.field7615[var28][var41][var42] = var40;
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
                            int var11 = (arg1 >> 3) + var9;
                            int var12 = (arg2 >> 3) - -var10;
                            if (var11 >= 0 && ~var11 > ~(super.field7637 >> 3) && var12 >= 0 && super.field7623 >> 3 > var12) {
                                class451.method2658(var8, var11, false, var12);
                            }
                        }
                    }
                }
                if (!var7 && super.field7615 != null) {
                    for (int var13 = 0; var13 < 4; ++var13) {
                        if (super.field7615[var13] != null) {
                            for (int var14 = 0; ~var14 > -17; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg1 >> 2) + var14;
                                    int var17 = (arg2 >> 2) + var15;
                                    if (~var16 <= -1 && var16 < 26 && var17 >= 0 && var17 < 26) {
                                        super.field7615[var13][var16][var17] = 0;
                                    }
                                }
                            }
                        }
                    }
                }
                if (!arg4) {
                    field4712 = true;
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[BIIIIILqa;I[Lid;I)V", line = 2306)
    public final void method1905(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class162 arg7, int arg8, class413[] arg9, int arg10) {
        ++field4704;
        class365 var12 = new class365(arg1);
        if (arg4 != 3) {
            field4702 = null;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method2089((byte) 74);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2065(false);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4058 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2099(255);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (arg0 == var19 && ~var18 <= ~arg10 && var18 < arg10 - -8 && arg5 <= var17 && ~(arg5 + 8) < ~var17) {
                    class132 var23 = class82.field1154.method2121(var13, true);
                    int var24 = class317.method1804((byte) 41, var22, var18 & 7, var23.field1880, arg8, 7 & var17, var23.field1881) + arg6;
                    int var25 = arg2 + class110.method712(var17 & 7, arg8, var18 & 7, var23.field1881, var23.field1880, var22, -112);
                    if (var24 > 0 && ~var25 < -1 && ~var24 > ~(super.field7637 + -1) && var25 < super.field7623 + -1) {
                        class413 var26 = null;
                        if (!super.field7626) {
                            int var27 = arg3;
                            if ((2 & class456.field6661[1][var24][var25]) == 2) {
                                var27 = arg3 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg9[var27];
                            }
                        }
                        this.method1901(var13, arg7, 73, var24, 3 & arg8 + var22, var21, var25, arg3, var26, arg3, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILqa;[BII[Lid;)V", line = 2388)
    public final void method1906(int arg0, class162 arg1, byte[] arg2, int arg3, int arg4, class413[] arg5) {
        int var7 = -51 / ((-74 - arg3) / 44);
        ++field4706;
        class365 var8 = new class365(arg2);
        int var9 = -1;
        while (true) {
            int var10 = var8.method2089((byte) 36);
            if (~var10 == -1) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method2065(false);
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = 63 & var11;
                int var14 = (var11 & 4090) >> 6;
                int var15 = var11 >> 12;
                int var16 = var8.method2099(255);
                int var17 = var16 >> 2;
                int var18 = 3 & var16;
                int var19 = arg0 + var14;
                int var20 = arg4 + var13;
                if (var19 > 0 && var20 > 0 && super.field7637 + -1 > var19 && ~(super.field7623 + -1) < ~var20) {
                    class413 var21 = null;
                    if (!super.field7626) {
                        int var22 = var15;
                        if (~(2 & class456.field6661[1][var19][var20]) == -3) {
                            var22 = var15 - 1;
                        }
                        if (~var22 <= -1) {
                            var21 = arg5[var22];
                        }
                    }
                    this.method1901(var9, arg1, 104, var19, var18, var17, var20, var15, var21, var15, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[ILqa;IBIILlh;II)V", line = 2466)
    public final void method1907(int arg0, int arg1, int[] arg2, class162 arg3, int arg4, byte arg5, int arg6, int arg7, class365 arg8, int arg9, int arg10) {
        ++field4705;
        if (!super.field7626) {
            boolean var12 = false;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            class483 var13 = null;
            int var14 = (arg0 & 7) * 8;
            int var15 = (arg7 & 7) * 8;
            while (true) {
                while (~arg8.field5073.length < ~arg8.field5069) {
                    int var20 = arg8.method2099(arg5 + 352);
                    if (var20 == 0) {
                        var13 = new class483(arg8);
                    } else if (~var20 == -2) {
                        int var34 = arg8.method2099(arg5 ^ -160);
                        if (var34 > 0) {
                            for (int var35 = 0; var34 > var35; ++var35) {
                                class340 var36 = new class340(arg3, arg8, 0);
                                if (var36.field4696 == 31) {
                                    class300 var37 = class269.field3686.method1505(true, arg8.method2062((byte) 14));
                                    var36.method1894(var37.field4122, var37.field4128, var37.field4120, var37.field4124, (byte) 36);
                                }
                                if (~arg3.method528() < -1) {
                                    class432 var38 = var36.field4681;
                                    int var39 = var38.method2578(true) >> 7;
                                    int var40 = var38.method2572(false) >> 7;
                                    if (~var36.field4683 == ~arg6 && var39 >= var14 && var14 + 8 > var39 && ~var15 >= ~var40 && var40 < var15 + 8) {
                                        int var41 = (arg9 << 7) + class47.method293(arg1, var38.method2578(true) & 1023, var38.method2572(false) & 1023, arg5 ^ -98);
                                        int var42 = (arg4 << 7) - -class492.method2918(arg1, 9851, 1023 & var38.method2578(true), var38.method2572(false) & 1023);
                                        int var43 = var41 >> 7;
                                        int var44 = var42 >> 7;
                                        if (~var43 <= -1 && ~var44 <= -1 && ~super.field7637 < ~var43 && ~super.field7623 < ~var44) {
                                            var38.method1079((byte) 0, var41, var42, super.field7641[arg6][var43][var44] + -var38.method2573(115));
                                            if (~arg3.method528() < -1) {
                                                class530.method3119(var36);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2) {
                        if (var13 == null) {
                            var13 = new class483();
                        }
                        var13.method2854(64, arg8);
                    } else if (var20 == 128) {
                        if (arg2 == null) {
                            arg8.field5069 += 10;
                        } else {
                            arg2[0] = arg8.method2062((byte) 14);
                            arg2[1] = arg8.method2069(class63.method396(arg5, 31));
                            arg2[2] = arg8.method2069(-128);
                            arg2[3] = arg8.method2069(class63.method396(arg5, 26));
                            arg2[4] = arg8.method2062((byte) 14);
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field7615 == null) {
                            super.field7615 = new byte[4][][];
                        }
                        for (int var21 = 0; ~var21 > -5; ++var21) {
                            byte var22 = arg8.method2081((byte) -127);
                            if (var22 == 0 && super.field7615[arg10] != null) {
                                if (var21 <= arg6) {
                                    int var23 = arg9;
                                    int var24 = arg9 + 7;
                                    int var25 = arg4;
                                    if (~var24 <= -1) {
                                        if (~super.field7637 >= ~var24) {
                                            var24 = super.field7637;
                                        }
                                    } else {
                                        var24 = 0;
                                    }
                                    if (arg9 < 0) {
                                        var23 = 0;
                                    } else if (~super.field7637 >= ~arg9) {
                                        var23 = super.field7637;
                                    }
                                    if (~arg4 <= -1) {
                                        if (~super.field7623 >= ~arg4) {
                                            var25 = super.field7623;
                                        }
                                    } else {
                                        var25 = 0;
                                    }
                                    int var26 = arg4 + 7;
                                    if (var26 < 0) {
                                        var26 = 0;
                                    } else if (super.field7623 <= var26) {
                                        var26 = super.field7623;
                                    }
                                    while (~var24 < ~var23) {
                                        while (var25 < var26) {
                                            super.field7615[arg10][var23][var25] = 0;
                                            ++var25;
                                        }
                                        ++var23;
                                    }
                                }
                            } else if (~var22 == -2) {
                                if (super.field7615[arg10] == null) {
                                    super.field7615[arg10] = new byte[super.field7637 + 1][super.field7623 + 1];
                                }
                                for (int var27 = 0; ~var27 > -65; var27 += 4) {
                                    for (int var28 = 0; ~var28 > -65; var28 += 4) {
                                        byte var29 = arg8.method2081((byte) 113);
                                        if (~var21 >= ~arg6) {
                                            for (int var30 = var27; ~var30 > ~(var27 - -4); ++var30) {
                                                for (int var31 = var28; var28 - -4 > var31; ++var31) {
                                                    if (~var30 <= ~var14 && ~var30 > ~(var14 + 8) && var15 <= var31 && ~(var15 + 8) < ~var15) {
                                                        int var32 = class347.method1922(arg1, 7 & var30, 95, var31 & 7) + arg9;
                                                        int var33 = arg4 - -class495.method2927(7 & var30, (byte) 104, var31 & 7, arg1);
                                                        if (~var32 <= -1 && ~super.field7637 < ~var32 && ~var33 <= -1 && var33 < super.field7623) {
                                                            super.field7615[arg10][var32][var33] = var29;
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
                if (arg5 != -97) {
                    this.field4701 = 126;
                }
                if (var13 != null) {
                    class451.method2658(var13, arg9 >> 3, false, arg4 >> 3);
                }
                if (!var12 && super.field7615 != null && super.field7615[arg10] != null) {
                    int var16 = arg9 + 7;
                    int var17 = arg4 + 7;
                    for (int var18 = arg9; ~var18 > ~var16; ++var18) {
                        for (int var19 = arg4; ~var17 < ~var19; ++var19) {
                            super.field7615[arg10][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
