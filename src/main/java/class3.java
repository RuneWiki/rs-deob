import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 extends class644 {

    @OriginalMember(owner = "client!dp", name = "I", descriptor = "I")
    public static int field30 = 0;

    @OriginalMember(owner = "client!dp", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field38 = new String[100];

    @OriginalMember(owner = "client!dp", name = "H", descriptor = "Lmga;")
    public static class666 field29 = new class666(64);

    @OriginalMember(owner = "client!dp", name = "F", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!dp", name = "J", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dp", name = "L", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!dp", name = "M", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!dp", name = "N", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!dp", name = "O", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!dp", name = "P", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dp", name = "R", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dp", name = "K", descriptor = "Lbi;")
    public static class449 field32;

    @OriginalMember(owner = "client!dp", name = "S", descriptor = "[I")
    public static int[] field40;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "([II[IILml;IIIII[[ZI)V")
    private final void method16(int[] arg0, int arg1, int[] arg2, int arg3, class359 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean[][] arg10, int arg11) {
        ++field31;
        int var13 = (-arg8 + arg7) * arg9 / 256;
        int var14 = arg9 >> 8;
        int var15 = -100 / ((arg11 - -23) / 61);
        arg4.field4855 = false;
        arg4.field4856 = false;
        int var16 = arg1;
        int var17 = arg5 - -var13;
        for (int var18 = arg3; arg6 > var18; ++var18) {
            for (int var19 = arg8; arg7 > var19; ++var19) {
                if (arg10[-arg3 + var18][-arg8 + var19]) {
                    if (super.field8646[var18][var19] != null) {
                        class40 var20 = super.field8646[var18][var19];
                        if (var20.field591 != -1 && ~(var20.field592 & 2) == -1 && ~var20.field595 == 0) {
                            int var21 = super.field8648.method2488(var20.field591);
                            arg4.method2121(-var14 + var17, var17 - var14, var17, var14 + var16, var16, var14 + var16, class329.method1963(65535 & var20.field594, -680993689, var21), class329.method1963(65535 & var20.field589, -680993689, var21), class329.method1963(var20.field590 & 65535, -680993689, var21));
                            arg4.method2121(var17, var17, -var14 + var17, var16, var14 + var16, var16, class329.method1963(var20.field593 & 65535, -680993689, var21), class329.method1963(65535 & var20.field590, -680993689, var21), class329.method1963(65535 & var20.field589, -680993689, var21));
                        } else if (var20.field595 == -1) {
                            arg4.method2121(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 65535 & var20.field594, 65535 & var20.field589, 65535 & var20.field590);
                            arg4.method2121(var17, var17, -var14 + var17, var16, var14 + var16, var16, 65535 & var20.field593, var20.field590 & 65535, var20.field589 & 65535);
                        } else {
                            int var22 = var20.field595;
                            arg4.method2121(-var14 + var17, var17 - var14, var17, var14 + var16, var16, var14 + var16, var22, var22, var22);
                            arg4.method2121(var17, var17, -var14 + var17, var16, var14 + var16, var16, var22, var22, var22);
                        }
                    } else if (super.field8643[var18][var19] != null) {
                        class45 var23 = super.field8643[var18][var19];
                        for (int var24 = 0; var23.field645 > var24; ++var24) {
                            arg2[var24] = var23.field648[var24] * var14 / super.field2250 + var16;
                            arg0[var24] = -(var23.field653[var24] * var14 / super.field2250) + var17;
                        }
                        for (int var25 = 0; var23.field652 > var25; ++var25) {
                            short var26 = var23.field649[var25];
                            short var27 = var23.field651[var25];
                            short var28 = var23.field644[var25];
                            int var29 = arg2[var26];
                            int var30 = arg2[var27];
                            int var31 = arg2[var28];
                            int var32 = arg0[var26];
                            int var33 = arg0[var27];
                            int var34 = arg0[var28];
                            if (var23.field647 != null && var23.field647[var25] != -1) {
                                int var35 = var23.field647[var25];
                                arg4.method2121(var32, var33, var34, var29, var30, var31, class329.method1963(var23.field642[var26], -680993689, var35), class329.method1963(var23.field642[var27], -680993689, var35), class329.method1963(var23.field642[var28], -680993689, var35));
                            } else if (var23.field650 != null && ~var23.field650[var25] != 0) {
                                int var36 = super.field8648.method2488(var23.field650[var25]);
                                arg4.method2121(var32, var33, var34, var29, var30, var31, class329.method1963(var23.field642[var26], -680993689, var36), class329.method1963(var23.field642[var27], -680993689, var36), class329.method1963(var23.field642[var28], -680993689, var36));
                            } else {
                                int var37 = var23.field646[var25];
                                arg4.method2121(var32, var33, var34, var29, var30, var31, class329.method1963(var23.field642[var26], -680993689, var37), class329.method1963(var23.field642[var27], -680993689, var37), class329.method1963(var23.field642[var28], -680993689, var37));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg5 - -var13;
            var16 += var14;
        }
        arg4.field4856 = true;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIB)Z")
    public static final boolean method17(int arg0, int arg1, byte arg2) {
        if (arg2 > -16) {
            return false;
        } else {
            ++field28;
            return class480.method2679(arg1, -1, arg0) | (arg0 & 458752) != 0 || class565.method3097((byte) 17, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
    public final void method18(int arg0, int arg1) {
        ++field33;
        class232 var3 = (class232) super.field8648.method2478(Thread.currentThread());
        var3.field3257.field4857 = 0;
        if (super.field8651 != null) {
            this.method20(arg1, (byte) 0, var3.field3844, var3.field3805, var3.field3830, super.field8648.field5994, arg0, var3.field3257);
        } else if (super.field8646 != null) {
            this.method22(var3.field3830, var3.field3844, var3.field3805, var3.field3257, arg0, arg1, true);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II[IILml;B[[ZIII[II)V")
    private final void method19(int arg0, int arg1, int[] arg2, int arg3, class359 arg4, byte arg5, boolean[][] arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11) {
        ++field34;
        int var13 = (-arg9 + arg3) * arg0 / 256;
        arg4.field4855 = false;
        int var14 = arg0 >> 8;
        arg4.field4856 = false;
        if (arg5 == 82) {
            int var15 = arg8;
            int var16 = arg7 + var13;
            for (int var17 = arg1; ~var17 > ~arg11; ++var17) {
                for (int var18 = arg9; ~arg3 < ~var18; ++var18) {
                    if (arg6[-arg1 + var17][-arg9 + var18]) {
                        if (super.field8651[var17][var18] != null) {
                            class610 var19 = super.field8651[var17][var18];
                            if (var19.field8061 != -1 && ~(2 & var19.field8052) == -1 && var19.field8051 == 0) {
                                int var20 = super.field8648.method2488(var19.field8061);
                                arg4.method2121(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var15 - -var14, class329.method1963(var19.field8054, -680993689, var20), class329.method1963(var19.field8055, arg5 + -680993771, var20), class329.method1963(var19.field8058, -680993689, var20));
                                arg4.method2121(var16, var16, -var14 + var16, var15, var14 + var15, var15, class329.method1963(var19.field8053, -680993689, var20), class329.method1963(var19.field8058, arg5 + -680993771, var20), class329.method1963(var19.field8055, -680993689, var20));
                            } else if (var19.field8051 != 0) {
                                int var21 = var19.field8051;
                                arg4.method2128(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class64.method513(-16777216 & var19.field8054, (byte) -108, var21), class64.method513(-16777216 & var19.field8055, (byte) -85, var21), class64.method513(var19.field8058 & -16777216, (byte) -74, var21));
                                arg4.method2128(var16, var16, -var14 + var16, var15, var14 + var15, var15, class64.method513(-16777216 & var19.field8053, (byte) -108, var21), class64.method513(var19.field8058 & -16777216, (byte) -117, var21), class64.method513(var19.field8055 & -16777216, (byte) -69, var21));
                            } else {
                                arg4.method2128(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var15 - -var14, var19.field8054, var19.field8055, var19.field8058);
                                arg4.method2128(var16, var16, var16 - var14, var15, var15 - -var14, var15, var19.field8053, var19.field8058, var19.field8055);
                            }
                        } else if (super.field8644[var17][var18] != null) {
                            class323 var22 = super.field8644[var17][var18];
                            for (int var23 = 0; ~var22.field4496 < ~var23; ++var23) {
                                arg2[var23] = var22.field4494[var23] * var14 / super.field2250 + var15;
                                arg10[var23] = var16 - var22.field4488[var23] * var14 / super.field2250;
                            }
                            for (int var24 = 0; var22.field4489 > var24; ++var24) {
                                int var25 = var24 * 3;
                                int var26 = var25 - -1;
                                int var27 = var26 + 1;
                                int var28 = arg2[var25];
                                int var29 = arg2[var26];
                                int var30 = arg2[var27];
                                int var31 = arg10[var25];
                                int var32 = arg10[var26];
                                int var33 = arg10[var27];
                                if (var22.field4492 != null && var22.field4492[var24] != 0 && (var22.field4490 == null || var22.field4490 != null && ~var22.field4490[var24] == 0)) {
                                    int var34 = var22.field4492[var24];
                                    arg4.method2128(var31, var32, var33, var28, var29, var30, class64.method513(-(-16777216 & var22.field4493[var25]) + -16777216, (byte) -117, var34), class64.method513(-(-16777216 & var22.field4493[var26]) + -16777216, (byte) -59, var34), class64.method513(-(-16777216 & var22.field4493[var27]) + -16777216, (byte) -91, var34));
                                } else if (var22.field4490 != null && ~var22.field4490[var24] != 0) {
                                    int var35 = super.field8648.method2488(var22.field4490[var24]);
                                    arg4.method2121(var31, var32, var33, var28, var29, var30, var35, var35, var35);
                                } else {
                                    arg4.method2128(var31, var32, var33, var28, var29, var30, var22.field4493[var25], var22.field4493[var26], var22.field4493[var27]);
                                }
                            }
                        }
                    }
                    var16 -= var14;
                }
                var16 = arg7 + var13;
                var15 += var14;
            }
            arg4.field4856 = true;
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lqe;IIII[[I[[II)V")
    public class3(class437 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB[I[I[IZILml;)V")
    private final void method20(int arg0, byte arg1, int[] arg2, int[] arg3, int[] arg4, boolean arg5, int arg6, class359 arg7) {
        if (arg1 != 0) {
            this.method18(125, 102);
        }
        ++field39;
        class610 var9 = super.field8651[arg6][arg0];
        if (var9 != null) {
            if (~(var9.field8052 & 2) == -1) {
                int var10 = super.field2250 * arg6;
                int var11 = var10 - -super.field2250;
                int var12 = super.field2250 * arg0;
                int var13 = var12 - -super.field2250;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var20;
                int var21;
                int var22;
                int var23;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                int var45;
                if (~(var9.field8052 & 1) != -1 && !arg5) {
                    int var18 = super.field8647[arg6][arg0];
                    if (~super.field8634 == 0) {
                        int var19 = super.field8637 * var18;
                        var20 = (super.field8638 * var12 + super.field8640 * var10 + var19 >> 14) + super.field8653;
                        if (var20 <= super.field8648.field5982) {
                            return;
                        }
                        var21 = (super.field8640 * var11 - -var19 - -(super.field8638 * var12) >> 14) + super.field8653;
                        if (~super.field8648.field5982 <= ~var21) {
                            return;
                        }
                        var22 = (super.field8640 * var11 + super.field8638 * var13 + var19 >> 14) + super.field8653;
                        if (~super.field8648.field5982 <= ~var22) {
                            return;
                        }
                        var23 = (super.field8638 * var13 + super.field8640 * var10 + var19 >> 14) + super.field8653;
                        if (~var23 >= ~super.field8648.field5982) {
                            return;
                        }
                    } else {
                        var23 = super.field8634;
                        var22 = super.field8634;
                        var21 = super.field8634;
                        var20 = super.field8634;
                    }
                    if (super.field8648.field5998) {
                        int var24 = -super.field8648.field6006 + var20;
                        if (~var24 < -1) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = -super.field8648.field6006 + var21;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - super.field8648.field6006;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field8648.field6006 + var23;
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                    }
                    int var28 = super.field8635 * var18;
                    int var29 = super.field8652 * var18;
                    var30 = (super.field8649 * var10 + super.field8650 * var12 + var28 >> 14) + super.field8654;
                    var31 = super.field8641 - -(super.field8655 * var10 + super.field8642 * var12 + var29 >> 14);
                    var32 = super.field8648.field6017 * var30 / var20 + arg7.field4862;
                    var33 = super.field8648.field6009 * var31 / var20 + arg7.field4852;
                    var34 = (super.field8649 * var11 + super.field8650 * var12 + var28 >> 14) + super.field8654;
                    var35 = (super.field8642 * var12 + (super.field8655 * var11 - -var29) >> 14) + super.field8641;
                    var36 = super.field8648.field6017 * var34 / var21 + arg7.field4862;
                    var37 = (super.field8649 * var11 + (var28 - -(super.field8650 * var13)) >> 14) + super.field8654;
                    var38 = super.field8648.field6009 * var35 / var21 + arg7.field4852;
                    var39 = (super.field8655 * var11 - -(super.field8642 * var13) + var29 >> 14) + super.field8641;
                    var40 = super.field8648.field6017 * var37 / var22 + arg7.field4862;
                    var41 = (super.field8650 * var13 + super.field8649 * var10 + var28 >> 14) + super.field8654;
                    var42 = super.field8648.field6009 * var39 / var22 + arg7.field4852;
                    var43 = (super.field8642 * var13 + super.field8655 * var10 + var29 >> 14) + super.field8641;
                    var44 = arg7.field4862 - -(super.field8648.field6017 * var41 / var23);
                    var45 = super.field8648.field6009 * var43 / var23 + arg7.field4852;
                } else {
                    int var46 = super.field8647[arg6][arg0];
                    int var47 = super.field8647[arg6 + 1][arg0];
                    int var48 = super.field8647[arg6 + 1][arg0 + 1];
                    int var49 = super.field8647[arg6][arg0 - -1];
                    if (~super.field8634 != 0) {
                        var23 = super.field8634;
                        var22 = super.field8634;
                        var21 = super.field8634;
                        var20 = super.field8634;
                    } else {
                        var20 = (super.field8637 * var46 + super.field8640 * var10 + super.field8638 * var12 >> 14) + super.field8653;
                        if (var20 <= super.field8648.field5982) {
                            return;
                        }
                        var21 = super.field8653 - -(super.field8640 * var11 + super.field8638 * var12 + super.field8637 * var47 >> 14);
                        if (~var21 >= ~super.field8648.field5982) {
                            return;
                        }
                        var22 = (super.field8638 * var13 + super.field8640 * var11 + super.field8637 * var48 >> 14) + super.field8653;
                        if (var22 <= super.field8648.field5982) {
                            return;
                        }
                        var23 = (super.field8638 * var13 + super.field8640 * var10 + super.field8637 * var49 >> 14) + super.field8653;
                        if (super.field8648.field5982 >= var23) {
                            return;
                        }
                    }
                    if (!arg5) {
                        if (super.field8648.field5998) {
                            int var50 = var20 - super.field8648.field6006;
                            if (var50 > 0) {
                                var14 = var50;
                                if (var50 > 255) {
                                    var14 = 255;
                                }
                            }
                            int var51 = -super.field8648.field6006 + var21;
                            if (var51 > 0) {
                                var15 = var51;
                                if (var51 > 255) {
                                    var15 = 255;
                                }
                            }
                            int var52 = -super.field8648.field6006 + var22;
                            if (var52 > 0) {
                                var16 = var52;
                                if (~var52 < -256) {
                                    var16 = 255;
                                }
                            }
                            int var53 = -super.field8648.field6006 + var23;
                            if (var53 > 0) {
                                var17 = var53;
                                if (var53 > 255) {
                                    var17 = 255;
                                }
                            }
                        }
                    } else {
                        int var54 = var20 - super.field8648.field6006;
                        if (var54 > 255) {
                            var54 = 255;
                        }
                        if (var54 > 0) {
                            var14 = var54;
                            int var55 = var9.field8060 * var54 / 255;
                            if (var55 > 0) {
                                var46 -= var55;
                            }
                        }
                        int var56 = var21 - super.field8648.field6006;
                        if (~var56 < -256) {
                            var56 = 255;
                        }
                        if (~var56 < -1) {
                            var15 = var56;
                            int var57 = var9.field8057 * var56 / 255;
                            if (~var57 < -1) {
                                var47 -= var57;
                            }
                        }
                        int var58 = -super.field8648.field6006 + var22;
                        if (~var58 < -256) {
                            var58 = 255;
                        }
                        if (~var58 < -1) {
                            var16 = var58;
                            int var59 = var9.field8059 * var58 / 255;
                            if (~var59 < -1) {
                                var48 -= var59;
                            }
                        }
                        int var60 = -super.field8648.field6006 + var23;
                        if (var60 > 255) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var17 = var60;
                            int var61 = var9.field8056 * var60 / 255;
                            if (var61 > 0) {
                                var49 -= var61;
                            }
                        }
                    }
                    var30 = (super.field8649 * var10 + super.field8635 * var46 - -(super.field8650 * var12) >> 14) + super.field8654;
                    var32 = super.field8648.field6017 * var30 / var20 + arg7.field4862;
                    var31 = (super.field8642 * var12 + (super.field8655 * var10 - -(super.field8652 * var46)) >> 14) + super.field8641;
                    var34 = (super.field8650 * var12 + (super.field8649 * var11 - -(super.field8635 * var47)) >> 14) + super.field8654;
                    var33 = arg7.field4852 - -(super.field8648.field6009 * var31 / var20);
                    var35 = (super.field8642 * var12 + super.field8655 * var11 + super.field8652 * var47 >> 14) + super.field8641;
                    var36 = arg7.field4862 - -(super.field8648.field6017 * var34 / var21);
                    var37 = (super.field8649 * var11 + super.field8635 * var48 - -(super.field8650 * var13) >> 14) + super.field8654;
                    var38 = super.field8648.field6009 * var35 / var21 + arg7.field4852;
                    var40 = super.field8648.field6017 * var37 / var22 + arg7.field4862;
                    var39 = (super.field8642 * var13 + super.field8655 * var11 + super.field8652 * var48 >> 14) + super.field8641;
                    var41 = (super.field8650 * var13 + (super.field8649 * var10 - -(super.field8635 * var49)) >> 14) + super.field8654;
                    var42 = arg7.field4852 - -(super.field8648.field6009 * var39 / var22);
                    var43 = (super.field8642 * var13 + super.field8655 * var10 + super.field8652 * var49 >> 14) + super.field8641;
                    var44 = arg7.field4862 - -(super.field8648.field6017 * var41 / var23);
                    var45 = arg7.field4852 - -(super.field8648.field6009 * var43 / var23);
                }
                boolean var62 = var9.field8061 != -1 && this.method3538(super.field8648.field8808.method2760(var9.field8061, 21351).field4937);
                int var63 = var15 - -var16 + var17;
                if (~((-var44 + var40) * (-var45 + var38) + -((-var44 + var36) * (-var45 + var42))) < -1) {
                    arg7.field4861 = var40 < 0 || ~var44 > -1 || ~var36 > -1 || ~arg7.field4853 > ~var40 || arg7.field4853 < var44 || var36 > arg7.field4853;
                    if (~var63 <= -766) {
                        arg7.method2119(var42, var45, var38, var40, var44, var36, super.field8648.field5987);
                    } else {
                        if (var62) {
                            arg7.field4857 = 100;
                        }
                        if (~var63 >= -1) {
                            if (~var9.field8061 <= -1) {
                                arg7.method2122(var42, var45, var38, var40, var44, var36, var9.field8054, var9.field8055, var9.field8058, var37, var41, var34, var39, var43, var35, var22, var23, var21, var9.field8061);
                            } else {
                                arg7.method2128(var42, var45, var38, var40, var44, var36, var9.field8054, var9.field8055, var9.field8058);
                            }
                        } else if (var9.field8061 >= 0) {
                            arg7.method2130(var42, var45, var38, var40, var44, var36, super.field8648.field5987, var16, var17, var15, var9.field8054, var9.field8055, var9.field8058, var37, var41, var34, var39, var43, var35, var22, var23, var21, var9.field8061);
                        } else {
                            arg7.method2128(var42, var45, var38, var40, var44, var36, class64.method513(super.field8648.field5987 | var16 << 24, (byte) -100, var9.field8054), class64.method513(super.field8648.field5987 | var17 << 24, (byte) -62, var9.field8055), class64.method513(var15 << 24 | super.field8648.field5987, (byte) -104, var9.field8058));
                        }
                        arg7.field4857 = 0;
                    }
                }
                int var64 = var14 + var17 - -var15;
                if (~((var32 - var36) * (-var38 + var45) + -((-var36 + var44) * (-var38 + var33))) < -1) {
                    arg7.field4861 = ~var32 > -1 || var36 < 0 || var44 < 0 || ~var32 < ~arg7.field4853 || ~arg7.field4853 > ~var36 || arg7.field4853 < var44;
                    if (var64 < 765) {
                        if (var62) {
                            arg7.field4857 = 100;
                        }
                        if (var64 <= 0) {
                            if (~var9.field8061 > -1) {
                                arg7.method2128(var33, var38, var45, var32, var36, var44, var9.field8053, var9.field8058, var9.field8055);
                            } else {
                                arg7.method2122(var33, var38, var45, var32, var36, var44, var9.field8053, var9.field8058, var9.field8055, var30, var34, var41, var31, var35, var43, var20, var21, var23, var9.field8061);
                            }
                        } else if (~var9.field8061 > -1) {
                            arg7.method2128(var33, var38, var45, var32, var36, var44, class64.method513(var14 << 24 | super.field8648.field5987, (byte) -61, var9.field8053), class64.method513(super.field8648.field5987 | var15 << 24, (byte) -92, var9.field8058), class64.method513(var17 << 24 | super.field8648.field5987, (byte) -85, var9.field8055));
                        } else {
                            arg7.method2130(var33, var38, var45, var32, var36, var44, super.field8648.field5987, var14, var15, var17, var9.field8053, var9.field8058, var9.field8055, var30, var34, var41, var31, var35, var43, var20, var21, var23, var9.field8061);
                        }
                        arg7.field4857 = 0;
                        return;
                    }
                    arg7.method2119(var33, var38, var45, var32, var36, var44, super.field8648.field5987);
                }
            }
        } else {
            class323 var65 = super.field8644[arg6][arg0];
            if (var65 != null) {
                if (~super.field8634 != 0) {
                    for (int var66 = 0; var65.field4496 > var66; ++var66) {
                        int var67 = (arg6 << super.field2245) + var65.field4494[var66];
                        int var68 = var65.field4497[var66];
                        int var69 = var65.field4488[var66] - -(arg0 << super.field2245);
                        arg3[var66] = 0;
                        if (arg5) {
                            int var70 = super.field8634 - super.field8648.field6006;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (~var70 < -1) {
                                arg3[var66] = var70;
                                int var71 = var65.field4491[var66] * var70 / 255;
                                if (var71 > 0) {
                                    var68 -= var71;
                                }
                            }
                        } else if (super.field8648.field5998) {
                            int var72 = -super.field8648.field6006 + super.field8634;
                            if (var72 > 0) {
                                arg3[var66] = var72;
                                if (~arg3[var66] < -256) {
                                    arg3[var66] = 255;
                                }
                            }
                        }
                        int var73 = (super.field8635 * var68 + super.field8650 * var69 + super.field8649 * var67 >> 14) + super.field8654;
                        int var74 = (super.field8655 * var67 + (super.field8652 * var68 - -(super.field8642 * var69)) >> 14) + super.field8641;
                        arg4[var66] = super.field8648.field6017 * var73 / super.field8634 + arg7.field4862;
                        arg2[var66] = arg7.field4852 - -(super.field8648.field6009 * var74 / super.field8634);
                    }
                } else {
                    for (int var75 = 0; ~var75 > ~var65.field4496; ++var75) {
                        int var115 = (arg6 << super.field2245) + var65.field4494[var75];
                        int var116 = var65.field4497[var75];
                        int var117 = (arg0 << super.field2245) + var65.field4488[var75];
                        int var118 = super.field8653 - -(super.field8640 * var115 + super.field8638 * var117 - -(super.field8637 * var116) >> 14);
                        if (super.field8648.field5982 >= var118) {
                            return;
                        }
                        arg3[var75] = 0;
                        if (arg5) {
                            int var119 = -super.field8648.field6006 + var118;
                            if (~var119 < -256) {
                                var119 = 255;
                            }
                            if (~var119 < -1) {
                                arg3[var75] = var119;
                                int var120 = var65.field4491[var75] * var119 / 255;
                                if (var120 > 0) {
                                    var116 -= var120;
                                }
                            }
                        } else if (super.field8648.field5998) {
                            int var121 = -super.field8648.field6006 + var118;
                            if (var121 > 0) {
                                arg3[var75] = var121;
                                if (~arg3[var75] < -256) {
                                    arg3[var75] = 255;
                                }
                            }
                        }
                        int var122 = (super.field8655 * var115 + super.field8652 * var116 + super.field8642 * var117 >> 14) + super.field8641;
                        int var123 = (super.field8649 * var115 + super.field8650 * var117 + super.field8635 * var116 >> 14) + super.field8654;
                        arg4[var75] = arg7.field4862 - -(super.field8648.field6017 * var123 / var118);
                        arg2[var75] = super.field8648.field6009 * var122 / var118 + arg7.field4852;
                    }
                }
                if (var65.field4490 != null) {
                    int var76 = super.field8647[arg6][arg0];
                    int var77 = super.field8647[arg6 + 1][arg0];
                    int var78 = super.field8647[arg6][arg0 + 1];
                    int var79 = super.field2250 * arg6;
                    int var80 = super.field2250 + var79;
                    int var81 = super.field2250 * arg0;
                    int var82 = super.field2250 + var81;
                    int var83 = (super.field8650 * var81 + super.field8649 * var79 + super.field8635 * var76 >> 14) + super.field8654;
                    int var84 = (super.field8652 * var76 + super.field8655 * var79 + super.field8642 * var81 >> 14) + super.field8641;
                    int var85 = super.field8653 - -(super.field8638 * var81 + (super.field8640 * var79 - -(super.field8637 * var76)) >> 14);
                    int var86 = (super.field8635 * var77 + (super.field8649 * var80 - -(super.field8650 * var81)) >> 14) + super.field8654;
                    int var87 = (super.field8652 * var77 + super.field8655 * var80 + super.field8642 * var81 >> 14) + super.field8641;
                    int var88 = super.field8653 - -(super.field8638 * var81 + super.field8640 * var80 + super.field8637 * var77 >> 14);
                    int var89 = (super.field8650 * var82 + (super.field8649 * var79 - -(super.field8635 * var78)) >> 14) + super.field8654;
                    int var90 = (super.field8652 * var78 + (super.field8655 * var79 - -(super.field8642 * var82)) >> 14) + super.field8641;
                    int var91 = super.field8653 - -(super.field8640 * var79 + super.field8637 * var78 - -(super.field8638 * var82) >> 14);
                    for (int var92 = 0; ~var65.field4489 < ~var92; ++var92) {
                        int var93 = var92 * 3;
                        int var94 = var93 + 1;
                        int var95 = var94 + 1;
                        int var96 = arg4[var93];
                        int var97 = arg4[var94];
                        int var98 = arg4[var95];
                        int var99 = arg2[var93];
                        int var100 = arg2[var94];
                        int var101 = arg2[var95];
                        int var102 = arg3[var94] - -arg3[var95] + arg3[var93];
                        if ((-var97 + var96) * (-var100 + var101) + -((var98 - var97) * (var99 - var100)) > 0) {
                            arg7.field4861 = var96 < 0 || ~var97 > -1 || ~var98 > -1 || ~var96 < ~arg7.field4853 || arg7.field4853 < var97 || arg7.field4853 < var98;
                            short var103 = var65.field4490[var92];
                            if (var102 >= 765) {
                                arg7.method2119(var99, var100, var101, var96, var97, var98, super.field8648.field5987);
                            } else {
                                if (~var103 != 0 && this.method3538(super.field8648.field8808.method2760(var103, 21351).field4937)) {
                                    arg7.field4857 = 100;
                                }
                                if (var102 <= 0) {
                                    if (var103 != -1) {
                                        arg7.method2122(var99, var100, var101, var96, var97, var98, var65.field4493[var93], var65.field4493[var94], var65.field4493[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if (~(var65.field4493[var93] & 16777215) != -1) {
                                        arg7.method2128(var99, var100, var101, var96, var97, var98, var65.field4493[var93], var65.field4493[var94], var65.field4493[var95]);
                                    }
                                } else if (var103 != -1) {
                                    arg7.method2130(var99, var100, var101, var96, var97, var98, super.field8648.field5987, arg3[var93], arg3[var94], arg3[var95], var65.field4493[var93], var65.field4493[var94], var65.field4493[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if (~(var65.field4493[var93] & 16777215) != -1) {
                                    arg7.method2128(var99, var100, var101, var96, var97, var98, class64.method513(arg3[var93] << 24 | super.field8648.field5987, (byte) -67, var65.field4493[var93]), class64.method513(super.field8648.field5987 | arg3[var94] << 24, (byte) -112, var65.field4493[var94]), class64.method513(arg3[var95] << 24 | super.field8648.field5987, (byte) -101, var65.field4493[var95]));
                                }
                                arg7.field4857 = 0;
                            }
                        }
                    }
                } else {
                    for (int var104 = 0; ~var104 > ~var65.field4489; ++var104) {
                        int var105 = var104 * 3;
                        int var106 = var105 + 1;
                        int var107 = var106 + 1;
                        int var108 = arg4[var105];
                        int var109 = arg4[var106];
                        int var110 = arg4[var107];
                        int var111 = arg2[var105];
                        int var112 = arg2[var106];
                        int var113 = arg2[var107];
                        int var114 = arg3[var105] + arg3[var107] + arg3[var106];
                        if ((-var109 + var108) * (-var112 + var113) + -((-var109 + var110) * (-var112 + var111)) > 0) {
                            arg7.field4861 = var108 < 0 || ~var109 > -1 || var110 < 0 || var108 > arg7.field4853 || ~var109 < ~arg7.field4853 || ~arg7.field4853 > ~var110;
                            if (~var114 > -766) {
                                if (var114 <= 0) {
                                    if (~(16777215 & var65.field4493[var105]) != -1) {
                                        arg7.method2128(var111, var112, var113, var108, var109, var110, var65.field4493[var105], var65.field4493[var106], var65.field4493[var107]);
                                    }
                                } else if (~(16777215 & var65.field4493[var105]) != -1) {
                                    arg7.method2128(var111, var112, var113, var108, var109, var110, class226.method1420(var65.field4493[var105], true, arg3[var105], super.field8648.field5987), class226.method1420(var65.field4493[var106], true, arg3[var106], super.field8648.field5987), class226.method1420(var65.field4493[var107], true, arg3[var107], super.field8648.field5987));
                                }
                            } else {
                                arg7.method2119(var111, var112, var113, var108, var109, var110, super.field8648.field5987);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field36;
        class232 var9 = (class232) super.field8648.method2478(Thread.currentThread());
        class359 var10 = var9.field3257;
        var10.field4857 = 0;
        var10.field4861 = false;
        if (super.field8651 == null) {
            if (super.field8646 != null) {
                this.method16(var9.field3844, arg0, var9.field3830, arg3, var10, arg1, arg5, arg6, arg4, arg2, arg7, 60);
                return;
            }
        } else {
            this.method19(arg2, arg3, var9.field3830, arg6, var10, (byte) 82, arg7, arg1, arg0, arg4, var9.field3844, arg5);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "([I[I[ILml;IIZ)V")
    private final void method22(int[] arg0, int[] arg1, int[] arg2, class359 arg3, int arg4, int arg5, boolean arg6) {
        ++field37;
        class40 var8 = super.field8646[arg4][arg5];
        if (var8 != null) {
            if ((2 & var8.field592) == 0) {
                int var9 = super.field2250 * arg4;
                int var10 = super.field2250 + var9;
                int var11 = super.field2250 * arg5;
                int var12 = super.field2250 + var11;
                int var14;
                int var16;
                int var17;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var30;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                if (~(var8.field592 & 1) != -1) {
                    int var13 = super.field8647[arg4][arg5];
                    int var15;
                    if (~super.field8634 != 0) {
                        var14 = super.field8634;
                        var15 = super.field8634;
                        var16 = super.field8634;
                        var17 = super.field8634;
                    } else {
                        int var18 = super.field8637 * var13;
                        var17 = (super.field8640 * var9 + super.field8638 * var11 + var18 >> 14) + super.field8653;
                        if (super.field8648.field5982 >= var17) {
                            return;
                        }
                        var16 = super.field8653 - -(super.field8640 * var10 + super.field8638 * var11 + var18 >> 14);
                        if (~var16 >= ~super.field8648.field5982) {
                            return;
                        }
                        var15 = (super.field8638 * var12 + (super.field8640 * var10 - -var18) >> 14) + super.field8653;
                        if (~super.field8648.field5982 <= ~var15) {
                            return;
                        }
                        var14 = super.field8653 - -(super.field8640 * var9 + super.field8638 * var12 - -var18 >> 14);
                        if (var14 <= super.field8648.field5982) {
                            return;
                        }
                    }
                    int var19 = super.field8635 * var13;
                    int var20 = super.field8652 * var13;
                    var21 = (super.field8650 * var11 + super.field8649 * var9 + var19 >> 14) + super.field8654;
                    var22 = super.field8648.field6017 * var21 / var17 + arg3.field4862;
                    var23 = (super.field8655 * var9 + super.field8642 * var11 - -var20 >> 14) + super.field8641;
                    var24 = super.field8648.field6009 * var23 / var17 + arg3.field4852;
                    var25 = (super.field8649 * var10 - -var19 - -(super.field8650 * var11) >> 14) + super.field8654;
                    var26 = super.field8648.field6017 * var25 / var16 + arg3.field4862;
                    var27 = (super.field8642 * var11 + super.field8655 * var10 + var20 >> 14) + super.field8641;
                    int var28 = (super.field8650 * var12 + super.field8649 * var10 + var19 >> 14) + super.field8654;
                    var29 = super.field8648.field6009 * var27 / var16 + arg3.field4852;
                    var30 = super.field8648.field6017 * var28 / var15 + arg3.field4862;
                    int var31 = super.field8641 - -(super.field8642 * var12 + super.field8655 * var10 + var20 >> 14);
                    var32 = arg3.field4852 - -(super.field8648.field6009 * var31 / var15);
                    var33 = (super.field8650 * var12 + super.field8649 * var9 + var19 >> 14) + super.field8654;
                    var34 = (super.field8655 * var9 - -var20 - -(super.field8642 * var12) >> 14) + super.field8641;
                    var35 = super.field8648.field6017 * var33 / var14 + arg3.field4862;
                    var36 = super.field8648.field6009 * var34 / var14 + arg3.field4852;
                } else {
                    int var37 = super.field8647[arg4][arg5];
                    int var38 = super.field8647[arg4 + 1][arg5];
                    int var39 = super.field8647[arg4 + 1][arg5 - -1];
                    int var40 = super.field8647[arg4][arg5 - -1];
                    int var41;
                    if (super.field8634 != -1) {
                        var14 = super.field8634;
                        var41 = super.field8634;
                        var16 = super.field8634;
                        var17 = super.field8634;
                    } else {
                        var17 = super.field8653 - -(super.field8640 * var9 - (-(super.field8638 * var11) + -(super.field8637 * var37)) >> 14);
                        if (~var17 >= ~super.field8648.field5982) {
                            return;
                        }
                        var16 = (super.field8640 * var10 + super.field8637 * var38 - -(super.field8638 * var11) >> 14) + super.field8653;
                        if (~super.field8648.field5982 <= ~var16) {
                            return;
                        }
                        var41 = (super.field8638 * var12 + super.field8640 * var10 + super.field8637 * var39 >> 14) + super.field8653;
                        if (super.field8648.field5982 >= var41) {
                            return;
                        }
                        var14 = (super.field8637 * var40 + super.field8640 * var9 + super.field8638 * var12 >> 14) + super.field8653;
                        if (~super.field8648.field5982 <= ~var14) {
                            return;
                        }
                    }
                    var21 = (super.field8649 * var9 + super.field8650 * var11 + super.field8635 * var37 >> 14) + super.field8654;
                    var22 = super.field8648.field6017 * var21 / var17 + arg3.field4862;
                    var23 = (super.field8642 * var11 + (super.field8655 * var9 - -(super.field8652 * var37)) >> 14) + super.field8641;
                    var24 = super.field8648.field6009 * var23 / var17 + arg3.field4852;
                    var25 = (super.field8635 * var38 + super.field8650 * var11 + super.field8649 * var10 >> 14) + super.field8654;
                    var26 = super.field8648.field6017 * var25 / var16 + arg3.field4862;
                    var27 = (super.field8655 * var10 - -(super.field8652 * var38) - -(super.field8642 * var11) >> 14) + super.field8641;
                    int var42 = (super.field8649 * var10 + super.field8635 * var39 - -(super.field8650 * var12) >> 14) + super.field8654;
                    var29 = arg3.field4852 - -(super.field8648.field6009 * var27 / var16);
                    var30 = super.field8648.field6017 * var42 / var41 + arg3.field4862;
                    int var43 = (super.field8642 * var12 + (super.field8655 * var10 - -(super.field8652 * var39)) >> 14) + super.field8641;
                    var33 = super.field8654 - -(super.field8635 * var40 + (super.field8649 * var9 - -(super.field8650 * var12)) >> 14);
                    var32 = super.field8648.field6009 * var43 / var41 + arg3.field4852;
                    var35 = arg3.field4862 - -(super.field8648.field6017 * var33 / var14);
                    var34 = super.field8641 - -(super.field8642 * var12 + super.field8655 * var9 + super.field8652 * var40 >> 14);
                    var36 = super.field8648.field6009 * var34 / var14 + arg3.field4852;
                }
                if ((-var35 + var30) * (-var36 + var29) - (-var35 + var26) * (-var36 + var32) > 0) {
                    arg3.field4861 = ~var30 > -1 || var35 < 0 || var26 < 0 || ~var30 < ~arg3.field4853 || arg3.field4853 < var35 || var26 > arg3.field4853;
                    if (~var8.field591 <= -1) {
                        if (this.method3538(super.field8648.field8808.method2760(var8.field591, 21351).field4937)) {
                            arg3.field4857 = 100;
                        }
                        arg3.method2122(var32, var36, var29, var30, var35, var26, 65535 & var8.field594, 65535 & var8.field589, var8.field590 & 65535, var21, var25, var33, var23, var27, var34, var17, var16, var14, var8.field591);
                        arg3.field4857 = 0;
                    } else {
                        arg3.method2121(var32, var36, var29, var30, var35, var26, var8.field594 & 65535, 65535 & var8.field589, 65535 & var8.field590);
                    }
                }
                if (~((var22 - var26) * (-var29 + var36) + -((-var26 + var35) * (-var29 + var24))) < -1) {
                    arg3.field4861 = ~var22 > -1 || ~var26 > -1 || ~var35 > -1 || var22 > arg3.field4853 || ~var26 < ~arg3.field4853 || arg3.field4853 < var35;
                    if (~var8.field591 > -1) {
                        arg3.method2121(var24, var29, var36, var22, var26, var35, 65535 & var8.field593, 65535 & var8.field590, 65535 & var8.field589);
                        return;
                    }
                    if (this.method3538(super.field8648.field8808.method2760(var8.field591, 21351).field4937)) {
                        arg3.field4857 = 100;
                    }
                    arg3.method2122(var24, var29, var36, var22, var26, var35, var8.field593 & 65535, 65535 & var8.field590, 65535 & var8.field589, var21, var25, var33, var23, var27, var34, var17, var16, var14, var8.field591);
                    arg3.field4857 = 0;
                }
            }
        } else {
            if (!arg6) {
                field29 = null;
            }
            class45 var44 = super.field8643[arg4][arg5];
            if (var44 != null) {
                if (~super.field8634 != 0) {
                    for (int var45 = 0; ~var44.field645 < ~var45; ++var45) {
                        int var46 = (arg4 << super.field2245) + var44.field648[var45];
                        short var47 = var44.field641[var45];
                        int var48 = (arg5 << super.field2245) + var44.field653[var45];
                        int var49 = (super.field8642 * var48 + super.field8655 * var46 + super.field8652 * var47 >> 14) + super.field8641;
                        int var50 = super.field8654 - -(super.field8650 * var48 + (super.field8649 * var46 - -(super.field8635 * var47)) >> 14);
                        arg0[var45] = super.field8648.field6017 * var50 / super.field8634 + arg3.field4862;
                        arg1[var45] = super.field8648.field6009 * var49 / super.field8634 + arg3.field4852;
                    }
                } else {
                    for (int var51 = 0; ~var44.field645 < ~var51; ++var51) {
                        int var91 = var44.field648[var51] - -(arg4 << super.field2245);
                        short var92 = var44.field641[var51];
                        int var93 = var44.field653[var51] - -(arg5 << super.field2245);
                        int var94 = (super.field8640 * var91 + super.field8638 * var93 + super.field8637 * var92 >> 14) + super.field8653;
                        if (~super.field8648.field5982 <= ~var94) {
                            return;
                        }
                        int var95 = (super.field8655 * var91 + super.field8642 * var93 - -(super.field8652 * var92) >> 14) + super.field8641;
                        int var96 = (super.field8650 * var93 + (super.field8649 * var91 - -(super.field8635 * var92)) >> 14) + super.field8654;
                        arg0[var51] = super.field8648.field6017 * var96 / var94 + arg3.field4862;
                        arg1[var51] = super.field8648.field6009 * var95 / var94 + arg3.field4852;
                    }
                }
                if (var44.field650 == null) {
                    for (int var52 = 0; ~var52 > ~var44.field652; ++var52) {
                        short var53 = var44.field649[var52];
                        short var54 = var44.field651[var52];
                        short var55 = var44.field644[var52];
                        int var56 = arg0[var53];
                        int var57 = arg0[var54];
                        int var58 = arg0[var55];
                        int var59 = arg1[var53];
                        int var60 = arg1[var54];
                        int var61 = arg1[var55];
                        if ((-var57 + var56) * (-var60 + var61) + -((-var57 + var58) * (-var60 + var59)) > 0) {
                            int var62 = var44.field646[var52];
                            if (~var62 != 0) {
                                arg3.field4861 = var56 < 0 || ~var57 > -1 || ~var58 > -1 || arg3.field4853 < var56 || arg3.field4853 < var57 || ~var58 < ~arg3.field4853;
                                arg3.method2121(var59, var60, var61, var56, var57, var58, class329.method1963(var44.field642[var53], -680993689, var62), class329.method1963(var44.field642[var54], -680993689, var62), class329.method1963(var44.field642[var55], -680993689, var62));
                            }
                        }
                    }
                } else {
                    int var63 = super.field8647[arg4][arg5];
                    int var64 = super.field8647[arg4 + 1][arg5];
                    int var65 = super.field8647[arg4][arg5 + 1];
                    int var66 = super.field2250 * arg4;
                    int var67 = super.field2250 + var66;
                    int var68 = super.field2250 * arg5;
                    int var69 = super.field2250 + var68;
                    int var70 = super.field8654 - -(super.field8635 * var63 + (super.field8649 * var66 - -(super.field8650 * var68)) >> 14);
                    int var71 = (super.field8642 * var68 + super.field8655 * var66 + super.field8652 * var63 >> 14) + super.field8641;
                    int var72 = (super.field8640 * var66 + super.field8638 * var68 + super.field8637 * var63 >> 14) + super.field8653;
                    int var73 = (super.field8650 * var68 + super.field8649 * var67 - -(super.field8635 * var64) >> 14) + super.field8654;
                    int var74 = (super.field8652 * var64 + super.field8655 * var67 + super.field8642 * var68 >> 14) + super.field8641;
                    int var75 = super.field8653 - -(super.field8638 * var68 + (super.field8640 * var67 - -(super.field8637 * var64)) >> 14);
                    int var76 = (super.field8650 * var69 + super.field8649 * var66 + super.field8635 * var65 >> 14) + super.field8654;
                    int var77 = (super.field8655 * var66 + super.field8652 * var65 - -(super.field8642 * var69) >> 14) + super.field8641;
                    int var78 = super.field8653 - -(super.field8638 * var69 + super.field8640 * var66 + super.field8637 * var65 >> 14);
                    for (int var79 = 0; ~var44.field652 < ~var79; ++var79) {
                        short var80 = var44.field649[var79];
                        short var81 = var44.field651[var79];
                        short var82 = var44.field644[var79];
                        int var83 = arg0[var80];
                        int var84 = arg0[var81];
                        int var85 = arg0[var82];
                        int var86 = arg1[var80];
                        int var87 = arg1[var81];
                        int var88 = arg1[var82];
                        if ((-var84 + var83) * (-var87 + var88) + -((-var84 + var85) * (-var87 + var86)) > 0) {
                            arg3.field4861 = ~var83 > -1 || ~var84 > -1 || var85 < 0 || var83 > arg3.field4853 || ~arg3.field4853 > ~var84 || arg3.field4853 < var85;
                            short var89 = var44.field650[var79];
                            if (var89 == -1) {
                                int var90 = var44.field646[var79];
                                if (~var90 != 0) {
                                    arg3.method2121(var86, var87, var88, var83, var84, var85, class329.method1963(var44.field642[var80], -680993689, var90), class329.method1963(var44.field642[var81], -680993689, var90), class329.method1963(var44.field642[var82], -680993689, var90));
                                }
                            } else {
                                if (this.method3538(super.field8648.field8808.method2760(var89, 21351).field4937)) {
                                    arg3.field4857 = 100;
                                }
                                arg3.method2122(var86, var87, var88, var83, var84, var85, var44.field642[var80], var44.field642[var81], var44.field642[var82], var70, var73, var76, var71, var74, var77, var72, var75, var78, var89);
                                arg3.field4857 = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V")
    public static void method23(int arg0) {
        field32 = null;
        field29 = null;
        field40 = null;
        if (arg0 != -1) {
            method23(-98);
        }
        field38 = null;
    }
}
