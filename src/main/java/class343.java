import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class343 extends class322 {

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "S")
    public static short field4787 = 320;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public static int field4791 = -1;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "Ljk;")
    public static class633 field4785;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "Lhda;")
    public static class748 field4784;

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(ILch;)V")
    public class343(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        ++field4794;
        if (arg0) {
            this.method2218((byte) -90);
        }
        if (super.field4450.field6521.method2558(5) && !class416.method2555(super.field4450.field6521.method2556(false), arg0)) {
            super.field4451 = 0;
        }
        if (~super.field4451 > -1 || super.field4451 > 1) {
            super.field4451 = this.method17((byte) 123);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
    public static void method2216(byte arg0) {
        if (arg0 != -126) {
            method2220(-53, (byte[][][]) null, -32, (int[]) null, (byte) 117, (int[]) null, (int[]) null, -84, 47, -64, false, 34, -16, -42, (int[]) null, (int[]) null, false, 19);
        }
        field4784 = null;
        field4785 = null;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)I")
    public final int method2217(boolean arg0) {
        ++field4792;
        return arg0 ? 98 : super.field4451;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)Z")
    public final boolean method2218(byte arg0) {
        ++field4788;
        if (!class416.method2555(super.field4450.field6521.method2556(false), false)) {
            return false;
        } else {
            if (arg0 != -53) {
                this.method23(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = 47 % ((70 - arg0) / 51);
        ++field4783;
        return 0;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2219(String arg0, int arg1) {
        ++field4786;
        for (int var2 = 0; ~class473.field6707.length < ~var2; ++var2) {
            if (class473.field6707[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        if (arg1 != 1) {
            field4787 = -87;
        }
        return -1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[[[BI[IB[I[IIIIZIII[I[IZI)V")
    public static final void method2220(int arg0, byte[][][] arg1, int arg2, int[] arg3, byte arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12, int arg13, int[] arg14, int[] arg15, boolean arg16, int arg17) {
        ++field4793;
        if (class221.field2883 != -1) {
            int[] var18 = class263.field3799.method395();
            int var19 = var18[0];
            int var20 = var18[1];
            int var21 = var18[2];
            int var22 = var18[3];
            int var23 = var21;
            int var24 = var22;
            if (~class221.field2883 == -2) {
                var23 = (int) ((double) class586.field8252 * (double) var21 / (double) class712.field9900);
                var24 = (int) ((double) class586.field8252 * (double) var22 / (double) class712.field9900);
            }
            if (!class230.field3098) {
                if (class221.field2883 == 1) {
                    class129.method863((byte) -27);
                }
                int var25 = -class556.field7799 + arg8;
                int var26 = -class348.field4918 + arg7;
                int var27 = -class246.field3283 + arg2;
                int var28 = (int) (((double) var27 * class160.field2202 + (double) var25 * class698.field9624 + (double) var26 * class555.field7792) * (double) var23 / (double) arg9);
                int var29 = (int) (((double) var27 * class134.field1954 + (double) var25 * class449.field6367 + (double) var26 * class568.field8060) * (double) var24 / (double) arg9);
                double var30 = (double) var27 * class635.field8745 + (double) var25 * class510.field7295 + (double) var26 * class277.field3924;
                int var32 = -class547.field7638 + var28 + class378.field5372;
                int var33 = class335.field4673 - -var29 + -class584.field8219;
                int var34 = class260.field3746 + var32;
                int var35 = class586.field8252 + var33;
                if ((var32 < 0 || var33 < 0 || class414.field5838 < var34 || ~var35 < ~class712.field9900) && class221.field2883 != 2) {
                    if (var34 > 0 && var35 > 0 && ~class414.field5838 < ~var32 && var33 < class712.field9900) {
                        int var36 = -class378.field5372 + var32;
                        int var37 = -class335.field4673 + var33;
                        int var38 = 0;
                        int var39 = 0;
                        int var40 = 0;
                        int var41 = 0;
                        double var42 = 0.0D;
                        if (~class221.field2883 != -1) {
                            if (~class221.field2883 == -2) {
                                var40 = var36 / class338.field4700;
                                var41 = var37 / class47.field555;
                                var39 = class47.field555 * var41;
                                var38 = class338.field4700 * var40;
                                var42 = (class289.field4082 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                            }
                        } else {
                            var42 = class289.field4082 + var30;
                            var39 = var37;
                            var38 = var36;
                        }
                        double var44 = -var42;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        int var50 = 0;
                        int var51;
                        int var52;
                        int var53;
                        int var54;
                        if (var38 >= 0) {
                            var51 = -var38 + class414.field5838;
                            var52 = 0;
                            var53 = var51;
                            if (class221.field2883 == 1) {
                                var50 = var40;
                                var48 = -var40 + class224.field3008;
                            }
                            var54 = var38;
                        } else {
                            var51 = class414.field5838 + var38;
                            var53 = 0;
                            var52 = -var38;
                            var54 = var52;
                            if (class221.field2883 == 1) {
                                var48 = 0;
                                var50 = -var40;
                            }
                        }
                        int var55 = 0;
                        int var56;
                        int var57;
                        int var58;
                        int var59;
                        int var60;
                        int var61;
                        if (var39 >= 0) {
                            var56 = -var39 + class712.field9900;
                            var57 = 0;
                            var58 = var39;
                            var59 = 0;
                            var60 = var56;
                            var61 = var56;
                            if (~class221.field2883 == -2) {
                                var46 = -var41 + class296.field4168;
                                var47 = var41;
                                var49 = 0;
                                var55 = var46;
                            }
                        } else {
                            var60 = 0;
                            var57 = -var39;
                            var56 = class712.field9900 + var39;
                            var58 = var57;
                            var59 = var57;
                            if (class221.field2883 == 1) {
                                var46 = 0;
                                var47 = -var41;
                                var49 = var47;
                                var55 = class296.field4168 - -var41;
                            }
                            var61 = var56;
                        }
                        class360 var62 = class556.field7796.field6595;
                        for (class387 var63 = (class387) var62.method2301(arg11 ^ -31182); var63 != null; var63 = (class387) var62.method2310(56)) {
                            class137[] var69 = var63.field5482;
                            boolean var70 = true;
                            for (int var71 = 0; var69.length > var71; ++var71) {
                                class137 var72 = var69[var71];
                                int var73 = var72.field1985;
                                int var74 = var72.field1986;
                                int var75 = var72.field1990;
                                int var76 = var72.field1989;
                                int var77 = var72.field1988;
                                int var78;
                                var72.field1989 = var78 = -var39 + var76;
                                int var79;
                                var72.field1986 = var79 = -var39 + var74;
                                int var80;
                                var72.field1985 = var80 = var73 - var38;
                                int var81;
                                var72.field1990 = var81 = -var38 + var75;
                                if (var70) {
                                    int var82 = -var77 + (var80 < var81 ? var80 : var81);
                                    if (class414.field5838 >= var82) {
                                        int var83 = -var77 + (~var79 > ~var78 ? var79 : var78);
                                        if (~class712.field9900 <= ~var83) {
                                            int var84 = var77 + (~var80 > ~var81 ? var81 : var80);
                                            if (var84 >= 0) {
                                                int var85 = var77 + (var78 <= var79 ? var79 : var78);
                                                if (var85 >= 0) {
                                                    var70 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var70) {
                                var63.method3646((byte) -111);
                                class266.method1739(0, var63);
                            }
                        }
                        if (~class221.field2883 == -1) {
                            class263.field3799.method478(class643.field8815);
                        }
                        class263.field3799.method492(-var38, -var39);
                        class263.field3799.method493(var52, var57, var51, var56, var44);
                        class649.method3578(class289.field4082 + var44, (byte) 104);
                        class195.field2595 = class289.field4082 + var44;
                        if (class221.field2883 == 1) {
                            class654.field8963 = -class584.field8219 + var20 + -var39;
                            class21.field320 = -class547.field7638 + var19 + -var38;
                            class473.field6701 = var24;
                            class151.field2146 = var23;
                            class263.field3799.method391(class21.field320, class654.field8963, class151.field2146, class473.field6701);
                        } else {
                            class473.field6701 = var24;
                            class21.field320 = class378.field5372 + var19 + -class547.field7638 + -var38;
                            class654.field8963 = -class584.field8219 + -var39 + var20 + class335.field4673;
                            class151.field2146 = var23;
                            class263.field3799.method391(class21.field320, class654.field8963, class151.field2146, class473.field6701);
                        }
                        class451.method2695(class556.field7796);
                        if (~var58 < -1) {
                            class263.field3799.method469(0, var60, class414.field5838, var58 + var60);
                            class263.field3799.method440();
                            class263.field3799.method429(class25.field351);
                            class614.method3435(arg12, arg8, arg7, arg2, arg1, arg5, arg6, arg3, arg15, arg14, arg0, arg4, arg17, arg13, arg16, arg10, arg9, 1, false);
                        }
                        if (var54 > 0) {
                            class263.field3799.method469(var53, var59, var53 - -var54, var59 + var61);
                            class263.field3799.method440();
                            class263.field3799.method429(class25.field351);
                            class614.method3435(arg12, arg8, arg7, arg2, arg1, arg5, arg6, arg3, arg15, arg14, arg0, arg4, arg17, arg13, arg16, arg10, arg9, 1, false);
                        }
                        class263.field3799.method424();
                        class670.method3644();
                        if (class221.field2883 == 0) {
                            class263.field3799.method412();
                        }
                        class289.field4082 += var44;
                        class547.field7638 += var38;
                        class584.field8219 += var39;
                        class143.field2043 = -class547.field7638 + var28 + class378.field5372;
                        class155.field2166 = class335.field4673 + var29 + -class584.field8219;
                        if (~class221.field2883 == -2) {
                            class584.field8213 += var40;
                            class233.field3144 += var41;
                            for (int var64 = 0; var64 < class296.field4168; ++var64) {
                                int var65 = class415.method2548(class233.field3144 + var64, class296.field4168, false) * class224.field3008;
                                for (int var66 = 0; ~var66 > ~class224.field3008; ++var66) {
                                    int var67 = var65 - -class415.method2548(class584.field8213 + var66, class224.field3008, false);
                                    boolean var68 = var64 >= var46 && ~(var46 + var47) < ~var64 || ~var64 <= ~var49 && var49 - -var55 > var64 && var48 <= var66 && ~(var48 + var50) < ~var66;
                                    class448.field6358[var67].method2194(class338.field4700 * var66, class47.field555 * var64, class338.field4700, class47.field555, 0, 0, var68, true);
                                }
                            }
                        }
                    } else {
                        class230.field3098 = true;
                    }
                } else {
                    class155.field2166 = var33;
                    class143.field2043 = var32;
                    if (class221.field2883 == 2) {
                        class289.field4082 = -var30;
                    }
                }
            }
            if (class230.field3098) {
                class547.field7638 = 0;
                class289.field4082 = 0.0D;
                class556.field7799 = arg8;
                class348.field4918 = arg7;
                class246.field3283 = arg2;
                class155.field2166 = class335.field4673;
                class143.field2043 = class378.field5372;
                class584.field8219 = 0;
                if (~class221.field2883 == -1) {
                    class263.field3799.method478(class643.field8815);
                }
                class263.field3799.method424();
                class263.field3799.method440();
                class263.field3799.method429(class25.field351);
                class210.field2759.method340(class556.field7799, class348.field4918, class246.field3283, class650.field8925, class473.field6702, class407.field5772);
                class263.field3799.method483(class210.field2759);
                if (class221.field2883 != 1) {
                    class151.field2146 = var23;
                    class21.field320 = class378.field5372 + var19;
                    class654.field8963 = var20 - -class335.field4673;
                    class473.field6701 = var24;
                    class263.field3799.method391(class21.field320, class654.field8963, class151.field2146, class473.field6701);
                } else {
                    class151.field2146 = var23;
                    class654.field8963 = var20;
                    class21.field320 = var19;
                    class473.field6701 = var24;
                    class263.field3799.method391(class21.field320, class654.field8963, class151.field2146, class473.field6701);
                }
                class195.field2595 = 0.0D;
                class556.field7796.method2781(-109);
                class451.method2695(class556.field7796);
                class614.method3435(arg12, arg8, arg7, arg2, arg1, arg5, arg6, arg3, arg15, arg14, arg0, arg4, arg17, arg13, arg16, arg10, arg9, 1, false);
                class670.method3644();
                class230.field3098 = false;
                if (~class221.field2883 == -1) {
                    class263.field3799.method412();
                }
                if (~class221.field2883 == -2) {
                    class220.method1348((byte) 109);
                }
            }
            if (~class221.field2883 == -1) {
                class643.field8815.method2195(class143.field2043, class155.field2166, class260.field3746, class586.field8252, 0, 0, true, true);
            }
            ++class681.field9340;
            class649.method3578(class289.field4082, (byte) 116);
            class589.field8304 = class289.field4082;
            if (class221.field2883 != arg11 && class221.field2883 != 2) {
                if (~class221.field2883 == -2) {
                    class177.field2379 = var24;
                    class208.field2730 = var20 - class584.field8219;
                    class399.field5644 = var23;
                    class248.field3294 = -class547.field7638 + var19;
                    class263.field3799.method391(class248.field3294, class208.field2730, class399.field5644, class177.field2379);
                    class263.field3799.method469(class143.field2043, class155.field2166, class260.field3746 + class143.field2043, class586.field8252 + class155.field2166);
                }
            } else {
                if (~class221.field2883 == -3) {
                    class263.field3799.method429(class25.field351);
                    class263.field3799.method440();
                }
                class399.field5644 = var23;
                class208.field2730 = -class584.field8219 + -class155.field2166 + class335.field4673 + var20;
                class248.field3294 = class378.field5372 + var19 + -class143.field2043 + -class547.field7638;
                class177.field2379 = var24;
                class263.field3799.method391(class248.field3294, class208.field2730, class399.field5644, class177.field2379);
            }
            class614.method3435(arg12, arg8, arg7, arg2, arg1, arg5, arg6, arg3, arg15, arg14, arg0, arg4, arg17, arg13, arg16, arg10, arg9, class221.field2883 == 2 ? 0 : 2, class221.field2883 == 1);
            class263.field3799.method424();
            class263.field3799.method391(var19, var20, var21, var22);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        ++field4789;
        if (arg0 != 0) {
            this.method23(true);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field4795;
        if (!class416.method2555(super.field4450.field6521.method2556(false), false)) {
            return 3;
        } else {
            if (arg1 <= 10) {
                this.method17((byte) -19);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLpr;III)V")
    public static final void method2221(byte arg0, class446 arg1, int arg2, int arg3, int arg4) {
        ++field4790;
        if (arg0 > -78) {
            field4791 = 37;
        }
        long var5 = (long) (arg3 | arg4 << 14 | arg2 << 28);
        class338 var7 = (class338) class178.field2391.method1180((byte) 26, var5);
        if (var7 == null) {
            class338 var8 = new class338();
            class178.field2391.method1179(var5, var8, (byte) -26);
            var8.field4698.method2770((byte) -13, arg1);
        } else {
            class551 var9 = class682.field9361.method3424(arg1.field6325, false);
            int var10 = var9.field7708;
            if (~var9.field7734 == -2) {
                var10 = (arg1.field6322 + 1) * var10;
            }
            for (class446 var11 = (class446) var7.field4698.method2765(-12261); var11 != null; var11 = (class446) var7.field4698.method2759(-15361)) {
                class551 var12 = class682.field9361.method3424(var11.field6325, false);
                int var13 = var12.field7708;
                if (var12.field7734 == 1) {
                    var13 = (var11.field6322 + 1) * var13;
                }
                if (var10 > var13) {
                    class162.method1066((byte) -102, var11, arg1);
                    return;
                }
            }
            var7.field4698.method2770((byte) -13, arg1);
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lch;)V")
    public class343(class463 arg0) {
        super(arg0);
    }
}
