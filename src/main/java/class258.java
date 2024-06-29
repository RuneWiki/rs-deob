import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class258 extends class264 {

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Ljo;")
    public static class351 field3630 = new class351(0, -1);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field3632 = -1;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "Ljo;")
    public static class351 field3631 = new class351(54, 7);

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field3633 = 0;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[F)[F")
    public static final float[] method1695(int arg0, int arg1, float[] arg2) {
        ++field3621;
        if (arg1 < 99) {
            return null;
        } else {
            float[] var3 = new float[arg0];
            class42.method286(arg2, 0, var3, 0, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lmfa;)V")
    public class258(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)I")
    public final int method1696(byte arg0) {
        if (arg0 > -31) {
            return -37;
        } else {
            ++field3626;
            return super.field3733;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        if (arg0 >= -114) {
            this.method659((byte) 52, -9);
        }
        super.field3733 = arg1;
        ++field3627;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        ++field3623;
        if (super.field3731.method3633(116)) {
            super.field3733 = 0;
        }
        if (super.field3733 != 1 && super.field3733 != 0) {
            super.field3733 = this.method663((byte) -38);
        }
        int var2 = 107 % ((1 - arg0) / 41);
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)Z")
    public final boolean method1697(int arg0) {
        if (arg0 != 14996) {
            return true;
        } else {
            ++field3629;
            return !super.field3731.method3633(arg0 ^ 15054);
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public static void method1698(int arg0) {
        field3630 = null;
        if (arg0 != 0) {
            field3630 = null;
        }
        field3631 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        ++field3625;
        if (super.field3731.method3633(87)) {
            return 3;
        } else {
            if (arg0 != 112) {
                this.method659((byte) 18, -9);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILmfa;)V")
    public class258(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIZ[[[BIIIIB[I[I[I[I[IIBII)V")
    public static final void method1699(boolean arg0, int arg1, boolean arg2, byte[][][] arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int[] arg13, int arg14, byte arg15, int arg16, int arg17) {
        ++field3624;
        if (~class463.field6612 != 0) {
            int[] var18 = class438.field6281.method469();
            int var19 = var18[0];
            int var20 = var18[1];
            int var21 = var18[2];
            int var22 = var18[3];
            if (arg15 <= -76) {
                int var23 = var21;
                int var24 = var22;
                if (class463.field6612 == 1) {
                    var23 = (int) ((double) class333.field4974 * (double) var21 / (double) class212.field3070);
                    var24 = (int) ((double) class333.field4974 * (double) var22 / (double) class212.field3070);
                }
                if (!class432.field6151) {
                    if (class463.field6612 == 1) {
                        class147.method1014(-23232);
                    }
                    int var25 = arg17 - class779.field10748;
                    int var26 = -class38.field633 + arg16;
                    int var27 = -class87.field1117 + arg4;
                    int var28 = (int) (((double) var27 * class422.field5966 + (double) var25 * class399.field5664 + (double) var26 * class476.field6765) * (double) var23 / (double) arg6);
                    int var29 = (int) (((double) var27 * class345.field5084 + (double) var25 * class395.field5606 + (double) var26 * class61.field838) * (double) var24 / (double) arg6);
                    double var30 = (double) var27 * class714.field10071 + (double) var25 * class503.field7194 + (double) var26 * class251.field3553;
                    int var32 = -class123.field1598 + class151.field1984 - -var28;
                    int var33 = class394.field5585 + var29 + -class652.field9199;
                    int var34 = class377.field5425 + var32;
                    int var35 = class333.field4974 + var33;
                    if ((~var32 > -1 || var33 < 0 || ~var34 < ~class745.field10372 || var35 > class212.field3070) && ~class463.field6612 != -3) {
                        if (var34 > 0 && var35 > 0 && var32 < class745.field10372 && var33 < class212.field3070) {
                            int var36 = var32 - class151.field1984;
                            int var37 = -class394.field5585 + var33;
                            int var38 = 0;
                            int var39 = 0;
                            int var40 = 0;
                            int var41 = 0;
                            double var42 = 0.0D;
                            if (~class463.field6612 == -1) {
                                var42 = class683.field9705 + var30;
                                var39 = var37;
                                var38 = var36;
                            } else if (~class463.field6612 == -2) {
                                var41 = var37 / class637.field8968;
                                var40 = var36 / class692.field9768;
                                var39 = class637.field8968 * var41;
                                var38 = class692.field9768 * var40;
                                var42 = (class683.field9705 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 - -(var37 * var37));
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
                            if (~var38 <= -1) {
                                var51 = class745.field10372 - var38;
                                var52 = 0;
                                if (class463.field6612 == 1) {
                                    var48 = class606.field8522 - var40;
                                    var50 = var40;
                                }
                                var53 = var51;
                                var54 = var38;
                            } else {
                                var53 = 0;
                                var51 = class745.field10372 + var38;
                                var52 = -var38;
                                var54 = var52;
                                if (class463.field6612 == 1) {
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
                            if (~var39 <= -1) {
                                var56 = 0;
                                var57 = -var39 + class212.field3070;
                                var58 = var57;
                                if (~class463.field6612 == -2) {
                                    var46 = -var41 + class526.field7491;
                                    var47 = var41;
                                    var49 = 0;
                                    var55 = var46;
                                }
                                var59 = var57;
                                var60 = var39;
                                var61 = 0;
                            } else {
                                var56 = -var39;
                                var57 = class212.field3070 + var39;
                                var58 = 0;
                                var60 = var56;
                                var61 = var56;
                                var59 = var57;
                                if (~class463.field6612 == -2) {
                                    var46 = 0;
                                    var47 = -var41;
                                    var49 = var47;
                                    var55 = class526.field7491 - -var41;
                                }
                            }
                            class310 var62 = class369.field5300.field9153;
                            for (class167 var63 = (class167) var62.method2033(0); var63 != null; var63 = (class167) var62.method2025((byte) -88)) {
                                class660[] var69 = var63.field2426;
                                boolean var70 = true;
                                for (int var71 = 0; var71 < var69.length; ++var71) {
                                    class660 var72 = var69[var71];
                                    int var73 = var72.field9280;
                                    int var74 = var72.field9281;
                                    int var75 = var72.field9278;
                                    int var76 = var72.field9277;
                                    int var77 = var72.field9276;
                                    int var78;
                                    var72.field9280 = var78 = var73 - var38;
                                    int var79;
                                    var72.field9277 = var79 = var76 - var39;
                                    int var80;
                                    var72.field9278 = var80 = -var38 + var75;
                                    int var81;
                                    var72.field9281 = var81 = -var39 + var74;
                                    if (var70) {
                                        int var82 = (~var78 > ~var80 ? var78 : var80) - var77;
                                        if (var82 <= class745.field10372) {
                                            int var83 = (var79 > var81 ? var81 : var79) - var77;
                                            if (~class212.field3070 <= ~var83) {
                                                int var84 = var77 + (~var80 >= ~var78 ? var78 : var80);
                                                if (~var84 <= -1) {
                                                    int var85 = var77 + (var79 > var81 ? var79 : var81);
                                                    if (var85 >= 0) {
                                                        var70 = false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (var70) {
                                    var63.method592(2);
                                    class192.method1407(var63, 1949);
                                }
                            }
                            if (~class463.field6612 == -1) {
                                class438.field6281.method485(class27.field393);
                            }
                            class438.field6281.method512(-var38, -var39);
                            class438.field6281.method410(var52, var56, var51, var57, var44);
                            class403.method2434((byte) 112, class683.field9705 + var44);
                            class599.field8441 = class683.field9705 + var44;
                            if (class463.field6612 == 1) {
                                class767.field10595 = var23;
                                class592.field8356 = var19 - var38 + -class123.field1598;
                                class161.field2375 = -class652.field9199 + var20 + -var39;
                                class99.field1256 = var24;
                                class438.field6281.method409(class592.field8356, class161.field2375, class767.field10595, class99.field1256);
                            } else {
                                class592.field8356 = -var38 + class151.field1984 + var19 - class123.field1598;
                                class767.field10595 = var23;
                                class99.field1256 = var24;
                                class161.field2375 = class394.field5585 + var20 - (class652.field9199 + var39);
                                class438.field6281.method409(class592.field8356, class161.field2375, class767.field10595, class99.field1256);
                            }
                            class254.method1677(class369.field5300);
                            if (var60 > 0) {
                                class438.field6281.method455(0, var58, class745.field10372, var58 + var60);
                                class438.field6281.method449();
                                class438.field6281.method417(class527.field7499);
                                class511.method2986(arg7, arg17, arg16, arg4, arg3, arg10, arg9, arg12, arg11, arg13, arg5, arg8, arg14, arg1, arg0, arg2, arg6, 1, false);
                            }
                            if (var54 > 0) {
                                class438.field6281.method455(var53, var61, var53 + var54, var59 + var61);
                                class438.field6281.method449();
                                class438.field6281.method417(class527.field7499);
                                class511.method2986(arg7, arg17, arg16, arg4, arg3, arg10, arg9, arg12, arg11, arg13, arg5, arg8, arg14, arg1, arg0, arg2, arg6, 1, false);
                            }
                            class438.field6281.method463();
                            class306.method2016();
                            if (~class463.field6612 == -1) {
                                class438.field6281.method413();
                            }
                            class683.field9705 += var44;
                            class652.field9199 += var39;
                            class123.field1598 += var38;
                            class614.field8677 = class151.field1984 + var28 + -class123.field1598;
                            class364.field5265 = var29 - class652.field9199 + class394.field5585;
                            if (class463.field6612 == 1) {
                                class596.field8414 += var40;
                                class37.field556 += var41;
                                for (int var64 = 0; ~class526.field7491 < ~var64; ++var64) {
                                    int var65 = class468.method2759(class526.field7491, class37.field556 + var64, 0) * class606.field8522;
                                    for (int var66 = 0; ~class606.field8522 < ~var66; ++var66) {
                                        int var67 = var65 - -class468.method2759(class606.field8522, class596.field8414 + var66, 0);
                                        boolean var68 = ~var46 >= ~var64 && var46 + var47 > var64 || var64 >= var49 && ~var64 > ~(var49 + var55) && ~var66 <= ~var48 && ~(var48 + var50) < ~var66;
                                        class519.field7409[var67].method3617(class692.field9768 * var66, class637.field8968 * var64, class692.field9768, class637.field8968, 0, 0, var68, true);
                                    }
                                }
                            }
                        } else {
                            class432.field6151 = true;
                        }
                    } else {
                        class614.field8677 = var32;
                        class364.field5265 = var33;
                        if (class463.field6612 == 2) {
                            class683.field9705 = -var30;
                        }
                    }
                }
                if (class432.field6151) {
                    class364.field5265 = class394.field5585;
                    class614.field8677 = class151.field1984;
                    class87.field1117 = arg4;
                    class123.field1598 = 0;
                    class652.field9199 = 0;
                    class779.field10748 = arg17;
                    class683.field9705 = 0.0D;
                    class38.field633 = arg16;
                    if (class463.field6612 == 0) {
                        class438.field6281.method485(class27.field393);
                    }
                    class438.field6281.method463();
                    class438.field6281.method449();
                    class438.field6281.method417(class527.field7499);
                    class754.field10433.method1938(class779.field10748, class38.field633, class87.field1117, class603.field8490, class4.field53, class135.field1747);
                    class438.field6281.method445(class754.field10433);
                    if (class463.field6612 == 1) {
                        class99.field1256 = var24;
                        class161.field2375 = var20;
                        class592.field8356 = var19;
                        class767.field10595 = var23;
                        class438.field6281.method409(class592.field8356, class161.field2375, class767.field10595, class99.field1256);
                    } else {
                        class161.field2375 = class394.field5585 + var20;
                        class767.field10595 = var23;
                        class592.field8356 = class151.field1984 + var19;
                        class99.field1256 = var24;
                        class438.field6281.method409(class592.field8356, class161.field2375, class767.field10595, class99.field1256);
                    }
                    class599.field8441 = 0.0D;
                    class369.field5300.method3719(0);
                    class254.method1677(class369.field5300);
                    class511.method2986(arg7, arg17, arg16, arg4, arg3, arg10, arg9, arg12, arg11, arg13, arg5, arg8, arg14, arg1, arg0, arg2, arg6, 1, false);
                    class306.method2016();
                    class432.field6151 = false;
                    if (~class463.field6612 == -1) {
                        class438.field6281.method413();
                    }
                    if (class463.field6612 == 1) {
                        class372.method2305(0);
                    }
                }
                if (~class463.field6612 == -1) {
                    class27.field393.method3618(class614.field8677, class364.field5265, class377.field5425, class333.field4974, 0, 0, true, true);
                }
                ++class502.field7191;
                class403.method2434((byte) 108, class683.field9705);
                class708.field9987 = class683.field9705;
                if (~class463.field6612 != -1 && ~class463.field6612 != -3) {
                    if (class463.field6612 == 1) {
                        class554.field7886 = var23;
                        class704.field9919 = -class123.field1598 + var19;
                        class459.field6576 = var24;
                        class637.field8969 = var20 - class652.field9199;
                        class438.field6281.method409(class704.field9919, class637.field8969, class554.field7886, class459.field6576);
                        class438.field6281.method455(class614.field8677, class364.field5265, class614.field8677 + class377.field5425, class364.field5265 - -class333.field4974);
                    }
                } else {
                    if (~class463.field6612 == -3) {
                        class438.field6281.method417(class527.field7499);
                        class438.field6281.method449();
                    }
                    class554.field7886 = var23;
                    class704.field9919 = -class614.field8677 + var19 + -class123.field1598 + class151.field1984;
                    class637.field8969 = var20 - (class652.field9199 - -class364.field5265) + class394.field5585;
                    class459.field6576 = var24;
                    class438.field6281.method409(class704.field9919, class637.field8969, class554.field7886, class459.field6576);
                }
                class511.method2986(arg7, arg17, arg16, arg4, arg3, arg10, arg9, arg12, arg11, arg13, arg5, arg8, arg14, arg1, arg0, arg2, arg6, ~class463.field6612 != -3 ? 2 : 0, ~class463.field6612 == -2);
                class438.field6281.method463();
                class438.field6281.method409(var19, var20, var21, var22);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lr;III[Z)V")
    public static final void method1700(class192 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class622.field8777 != class311.field4628) {
            int var5 = class750.field10395[arg1].method1977((byte) -38, arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class292 var7 = class750.field10395[var6];
                    if (var7 != null) {
                        var7.method1251(arg0, arg2, var5 - var7.method1977((byte) -3, arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            return 5;
        } else {
            ++field3622;
            return 1;
        }
    }
}
