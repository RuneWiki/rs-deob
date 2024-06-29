import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class145 extends class260 {

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Lfba;")
    public static class27 field2114 = new class27(35, 8);

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "[I")
    public static int[] field2122 = new int[8];

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Ljd;")
    public static class241 field2117;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2120;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
    public static int[] field2121;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)I", line = 4)
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            method1028(119);
        }
        ++field2112;
        return 1;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)I", line = 15)
    public final int method1024(int arg0) {
        ++field2115;
        if (arg0 >= -14) {
            field2120 = null;
        }
        return super.field3828;
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V", line = 29)
    public static final void method1025(int arg0) {
        ++field2116;
        if (arg0 != 0) {
            field2117 = null;
        }
        class720.field9964.method3735(arg0 + 2);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lgn;)V", line = 41)
    public class145(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(ILgn;)V", line = 44)
    public class145(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)V", line = 47)
    public final void method128(int arg0, byte arg1) {
        ++field2118;
        super.field3828 = arg0;
        if (arg1 != 122) {
            field2122 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)Z", line = 58)
    public final boolean method1026(int arg0) {
        ++field2113;
        if (arg0 <= 73) {
            method1025(52);
        }
        if (super.field3829.method4081(24) == class422.field5780) {
            return !super.field3829.method4076(-5569);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[II[IZIIBIZIB[I[[[B[I[III)V", line = 78)
    public static final void method1027(int arg0, int[] arg1, int arg2, int[] arg3, boolean arg4, int arg5, int arg6, byte arg7, int arg8, boolean arg9, int arg10, byte arg11, int[] arg12, byte[][][] arg13, int[] arg14, int[] arg15, int arg16, int arg17) {
        if (arg7 < 18) {
            method1028(-25);
        }
        ++field2110;
        if (class763.field10520 != -1) {
            int[] var18 = class571.field8060.method510();
            int var19 = var18[0];
            int var20 = var18[1];
            int var21 = var18[2];
            int var22 = var18[3];
            int var23 = var21;
            int var24 = var22;
            if (class763.field10520 == 1) {
                var23 = (int) ((double) class82.field908 * (double) var21 / (double) class549.field7896);
                var24 = (int) ((double) class82.field908 * (double) var22 / (double) class549.field7896);
            }
            if (!class98.field1115) {
                if (class763.field10520 == 1) {
                    class246.method1631(-111);
                }
                int var25 = -class10.field97 + arg5;
                int var26 = -class267.field3894 + arg16;
                int var27 = -class219.field3391 + arg6;
                int var28 = (int) (((double) var27 * class77.field877 + (double) var25 * class3.field21 + (double) var26 * class283.field4190) * (double) var23 / (double) arg8);
                int var29 = (int) (((double) var27 * class242.field3615 + (double) var25 * class442.field6030 + (double) var26 * class582.field8225) * (double) var24 / (double) arg8);
                double var30 = (double) var27 * class246.field3654 + (double) var25 * class27.field403 + (double) var26 * class438.field5905;
                int var32 = class250.field3700 + var28 - class348.field4869;
                int var33 = class470.field6593 - (-var29 + class182.field2817);
                int var34 = class355.field4991 + var32;
                int var35 = var33 - -class82.field908;
                if ((~var32 > -1 || var33 < 0 || var34 > class194.field2992 || var35 > class549.field7896) && class763.field10520 != 2) {
                    if (var34 > 0 && ~var35 < -1 && ~class194.field2992 < ~var32 && class549.field7896 > var33) {
                        int var36 = var32 - class250.field3700;
                        int var37 = -class470.field6593 + var33;
                        int var38 = 0;
                        int var39 = 0;
                        int var40 = 0;
                        int var41 = 0;
                        double var42 = 0.0D;
                        if (~class763.field10520 == -1) {
                            var42 = class207.field3215 + var30;
                            var39 = var37;
                            var38 = var36;
                        } else if (class763.field10520 == 1) {
                            var40 = var36 / class103.field1192;
                            var41 = var37 / class373.field5148;
                            var39 = class373.field5148 * var41;
                            var38 = class103.field1192 * var40;
                            var42 = (class207.field3215 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
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
                            var51 = -var38 + class194.field2992;
                            var52 = 0;
                            var53 = var38;
                            var54 = var51;
                            if (~class763.field10520 == -2) {
                                var48 = -var40 + class703.field9803;
                                var50 = var40;
                            }
                        } else {
                            var51 = class194.field2992 + var38;
                            var52 = -var38;
                            var54 = 0;
                            if (class763.field10520 == 1) {
                                var50 = -var40;
                                var48 = 0;
                            }
                            var53 = var52;
                        }
                        int var55 = 0;
                        int var56;
                        int var57;
                        int var58;
                        int var59;
                        int var60;
                        int var61;
                        if (~var39 > -1) {
                            var56 = class549.field7896 - -var39;
                            var57 = -var39;
                            var58 = 0;
                            var59 = var57;
                            if (~class763.field10520 == -2) {
                                var47 = -var41;
                                var46 = 0;
                                var49 = var47;
                                var55 = class422.field5771 + var41;
                            }
                            var60 = var57;
                            var61 = var56;
                        } else {
                            var57 = 0;
                            var56 = -var39 + class549.field7896;
                            var58 = var56;
                            var59 = var39;
                            var61 = var56;
                            if (~class763.field10520 == -2) {
                                var49 = 0;
                                var46 = -var41 + class422.field5771;
                                var47 = var41;
                                var55 = var46;
                            }
                            var60 = 0;
                        }
                        class343 var62 = class266.field3875.field5452;
                        for (class495 var63 = (class495) var62.method2170(false); var63 != null; var63 = (class495) var62.method2176(-17754)) {
                            class711[] var69 = var63.field7067;
                            boolean var70 = true;
                            for (int var71 = 0; var71 < var69.length; ++var71) {
                                class711 var72 = var69[var71];
                                int var73 = var72.field9872;
                                int var74 = var72.field9876;
                                int var75 = var72.field9877;
                                int var76 = var72.field9874;
                                int var77;
                                var72.field9872 = var77 = -var38 + var73;
                                int var78;
                                var72.field9877 = var78 = -var38 + var75;
                                int var79;
                                var72.field9874 = var79 = -var39 + var76;
                                int var80 = var72.field9873;
                                int var81;
                                var72.field9876 = var81 = var74 - var39;
                                if (var70) {
                                    int var82 = (~var77 <= ~var78 ? var78 : var77) - var80;
                                    if (~class194.field2992 <= ~var82) {
                                        int var83 = (var81 < var79 ? var81 : var79) + -var80;
                                        if (~var83 >= ~class549.field7896) {
                                            int var84 = (~var78 < ~var77 ? var78 : var77) + var80;
                                            if (var84 >= 0) {
                                                int var85 = (var79 > var81 ? var79 : var81) + var80;
                                                if (~var85 <= -1) {
                                                    var70 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var70) {
                                var63.method3358(-123);
                                class121.method919(var63, (byte) -31);
                            }
                        }
                        if (class763.field10520 == 0) {
                            class571.field8060.method528(class523.field7393);
                        }
                        class571.field8060.method450(-var38, -var39);
                        class571.field8060.method460(var52, var57, var51, var56, var44);
                        class282.method1828(class207.field3215 + var44, 11266);
                        class348.field4863 = class207.field3215 + var44;
                        if (class763.field10520 != 1) {
                            class62.field743 = -var38 + class250.field3700 + var19 + -class348.field4869;
                            class403.field5509 = var24;
                            class186.field2852 = var20 - (-class470.field6593 + class182.field2817) + -var39;
                            class788.field10814 = var23;
                            class571.field8060.method503(class62.field743, class186.field2852, class788.field10814, class403.field5509);
                        } else {
                            class186.field2852 = -class182.field2817 + var20 + -var39;
                            class403.field5509 = var24;
                            class62.field743 = var19 - (class348.field4869 + var38);
                            class788.field10814 = var23;
                            class571.field8060.method503(class62.field743, class186.field2852, class788.field10814, class403.field5509);
                        }
                        class539.method3236(class266.field3875);
                        if (var59 > 0) {
                            class571.field8060.method434(0, var58, class194.field2992, var58 + var59);
                            class571.field8060.method518();
                            class571.field8060.method509(class82.field911);
                            class139.method1008(arg2, arg5, arg16, arg6, arg13, arg12, arg14, arg1, arg15, arg3, arg0, arg11, arg17, arg10, arg9, arg4, arg8, 1, false);
                        }
                        if (~var53 < -1) {
                            class571.field8060.method434(var54, var60, var53 + var54, var60 + var61);
                            class571.field8060.method518();
                            class571.field8060.method509(class82.field911);
                            class139.method1008(arg2, arg5, arg16, arg6, arg13, arg12, arg14, arg1, arg15, arg3, arg0, arg11, arg17, arg10, arg9, arg4, arg8, 1, false);
                        }
                        class571.field8060.method511();
                        class83.method628();
                        if (~class763.field10520 == -1) {
                            class571.field8060.method468();
                        }
                        class207.field3215 += var44;
                        class182.field2817 += var39;
                        class348.field4869 += var38;
                        class387.field5362 = class250.field3700 + var28 - class348.field4869;
                        class631.field8874 = class470.field6593 + var29 + -class182.field2817;
                        if (~class763.field10520 == -2) {
                            class793.field10902 += var41;
                            class725.field10028 += var40;
                            for (int var64 = 0; ~var64 > ~class422.field5771; ++var64) {
                                int var65 = class37.method290(class793.field10902 + var64, class422.field5771, -1365732769) * class703.field9803;
                                for (int var66 = 0; ~var66 > ~class703.field9803; ++var66) {
                                    int var67 = var65 - -class37.method290(var66 - -class725.field10028, class703.field9803, -1365732769);
                                    boolean var68 = var46 <= var64 && var46 + var47 > var64 || var64 >= var49 && ~var64 > ~(var49 + var55) && ~var66 <= ~var48 && ~var66 > ~(var48 - -var50);
                                    class537.field7719[var67].method1551(class103.field1192 * var66, class373.field5148 * var64, class103.field1192, class373.field5148, 0, 0, var68, true);
                                }
                            }
                        }
                    } else {
                        class98.field1115 = true;
                    }
                } else {
                    if (~class763.field10520 == -3) {
                        class207.field3215 = -var30;
                    }
                    class387.field5362 = var32;
                    class631.field8874 = var33;
                }
            }
            if (class98.field1115) {
                class348.field4869 = 0;
                class207.field3215 = 0.0D;
                class182.field2817 = 0;
                class387.field5362 = class250.field3700;
                class267.field3894 = arg16;
                class631.field8874 = class470.field6593;
                class219.field3391 = arg6;
                class10.field97 = arg5;
                if (class763.field10520 == 0) {
                    class571.field8060.method528(class523.field7393);
                }
                class571.field8060.method511();
                class571.field8060.method518();
                class571.field8060.method509(class82.field911);
                class757.field10437.method1870(class10.field97, class267.field3894, class219.field3391, class23.field381, class633.field8891, class9.field90);
                class571.field8060.method550(class757.field10437);
                if (class763.field10520 == 1) {
                    class186.field2852 = var20;
                    class403.field5509 = var24;
                    class788.field10814 = var23;
                    class62.field743 = var19;
                    class571.field8060.method503(class62.field743, class186.field2852, class788.field10814, class403.field5509);
                } else {
                    class62.field743 = class250.field3700 + var19;
                    class788.field10814 = var23;
                    class403.field5509 = var24;
                    class186.field2852 = class470.field6593 + var20;
                    class571.field8060.method503(class62.field743, class186.field2852, class788.field10814, class403.field5509);
                }
                class348.field4863 = 0.0D;
                class266.field3875.method2451((byte) 127);
                class539.method3236(class266.field3875);
                class139.method1008(arg2, arg5, arg16, arg6, arg13, arg12, arg14, arg1, arg15, arg3, arg0, arg11, arg17, arg10, arg9, arg4, arg8, 1, false);
                class83.method628();
                class98.field1115 = false;
                if (~class763.field10520 == -1) {
                    class571.field8060.method468();
                }
                if (~class763.field10520 == -2) {
                    class520.method3130(124);
                }
            }
            if (~class763.field10520 == -1) {
                class523.field7393.method1547(class387.field5362, class631.field8874, class355.field4991, class82.field908, 0, 0, true, true);
            }
            ++class601.field8432;
            class282.method1828(class207.field3215, 11266);
            class199.field3044 = class207.field3215;
            if (~class763.field10520 != -1 && class763.field10520 != 2) {
                if (class763.field10520 == 1) {
                    class5.field43 = var23;
                    class161.field2551 = -class182.field2817 + var20;
                    class547.field7867 = var19 - class348.field4869;
                    class251.field3703 = var24;
                    class571.field8060.method503(class547.field7867, class161.field2551, class5.field43, class251.field3703);
                    class571.field8060.method434(class387.field5362, class631.field8874, class387.field5362 - -class355.field4991, class82.field908 + class631.field8874);
                }
            } else {
                if (~class763.field10520 == -3) {
                    class571.field8060.method509(class82.field911);
                    class571.field8060.method518();
                }
                class547.field7867 = -class387.field5362 + -class348.field4869 + class250.field3700 + var19;
                class5.field43 = var23;
                class161.field2551 = var20 - (-class470.field6593 - -class182.field2817 - -class631.field8874);
                class251.field3703 = var24;
                class571.field8060.method503(class547.field7867, class161.field2551, class5.field43, class251.field3703);
            }
            class139.method1008(arg2, arg5, arg16, arg6, arg13, arg12, arg14, arg1, arg15, arg3, arg0, arg11, arg17, arg10, arg9, arg4, arg8, ~class763.field10520 == -3 ? 0 : 2, class763.field10520 == 1);
            class571.field8060.method511();
            class571.field8060.method503(var19, var20, var21, var22);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 522)
    public final void method126(int arg0) {
        ++field2111;
        if (super.field3829.method4081(24) != class422.field5780) {
            super.field3828 = 1;
        } else if (super.field3829.method4076(-5569)) {
            super.field3828 = 0;
        }
        if (super.field3828 != 0 && ~super.field3828 != -2) {
            super.field3828 = this.method123(4377);
        }
        if (arg0 <= 102) {
            field2120 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V", line = 543)
    public static void method1028(int arg0) {
        field2120 = null;
        if (arg0 >= 20) {
            field2121 = null;
            field2114 = null;
            field2122 = null;
            field2117 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)I", line = 558)
    public final int method129(int arg0, int arg1) {
        if (arg0 != -1) {
            return -66;
        } else {
            ++field2119;
            if (super.field3829.method4081(24) == class422.field5780) {
                if (super.field3829.method4076(arg0 + -5568)) {
                    return 3;
                } else {
                    return arg1 != 0 && super.field3829.field10089.method124(arg0 ^ 112) != 1 ? 2 : 1;
                }
            } else {
                return 3;
            }
        }
    }
}
