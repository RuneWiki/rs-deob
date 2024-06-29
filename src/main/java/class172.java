import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class172 extends class265 {

    @OriginalMember(owner = "client!op", name = "O", descriptor = "I")
    public int field2581 = 99;

    @OriginalMember(owner = "client!op", name = "K", descriptor = "Luc;")
    public static class27 field2577 = new class27(34, -1);

    @OriginalMember(owner = "client!op", name = "Q", descriptor = "Lbf;")
    public static class492 field2583 = new class492();

    @OriginalMember(owner = "client!op", name = "D", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!op", name = "G", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!op", name = "H", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!op", name = "J", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!op", name = "L", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!op", name = "M", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!op", name = "N", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!op", name = "P", descriptor = "I")
    public static int field2582;

    // $FF: synthetic field
    @OriginalMember(owner = "client!op", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field2584;

    // $FF: synthetic method
    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1185(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V", line = 6)
    public static final void method1174(byte arg0) {
        if (arg0 >= -107) {
            method1174((byte) 114);
        }
        if (!class283.method1710(class340.field4947, -6060) && !class202.method1352(class340.field4947, (byte) -93)) {
            int var1 = class253.field3576.field6483[0] >> 3;
            int var2 = class253.field3576.field6477[0] >> 3;
            if (var1 >= 0 && var1 < class86.field1185 >> 3 && var2 >= 0 && ~(class526.field7212 >> 3) < ~var2) {
                class454.method2602(5000, var1, var2, -117);
            } else {
                class454.method2602(0, class86.field1185 >> 4, class526.field7212 >> 4, -119);
            }
        } else {
            class454.method2602(5000, field2572 >> 12, class117.field1563 >> 12, -119);
        }
        ++field2571;
        class420.method2394(0);
        class308.method1895((byte) -27);
        class285.method1714(-3918);
        class86.method657(54);
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIZ)V", line = 36)
    public class172(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class207.field3062, class602.field8358);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZZI)Lsl;", line = 39)
    public static final class421 method1175(boolean arg0, boolean arg1, int arg2) {
        if (!arg0) {
            method1183((class345) null, -4);
        }
        ++field2580;
        long var3 = (long) (arg2 | (arg1 ? Integer.MIN_VALUE : 0));
        return (class421) class587.field8203.method2061(-17305, var3);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 53)
    public static void method1176(int arg0) {
        if (arg0 == 32308) {
            field2577 = null;
            field2583 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILoa;ILiaa;II)V", line = 64)
    public final void method1177(int arg0, int arg1, class638 arg2, int arg3, class455 arg4, int arg5, int arg6) {
        ++field2582;
        if (arg6 > -3) {
            this.method1177(-80, 52, (class638) null, 90, (class455) null, 120, 97);
        }
        class147 var8 = null;
        if (~arg0 == -1) {
            var8 = (class147) class171.method1170(arg3, arg1, arg5);
        }
        if (arg0 == 1) {
            var8 = (class147) class493.method2759(arg3, arg1, arg5);
        }
        if (arg0 == 2) {
            var8 = (class147) class410.method2344(arg3, arg1, arg5, field2584 != null ? field2584 : (field2584 = method1185("uq")));
        }
        if (arg0 == 3) {
            var8 = (class147) class237.method1497(arg3, arg1, arg5);
        }
        if (var8 != null) {
            class620 var9 = class164.field2499.method2013(var8.method554(-18971), false);
            int var10 = var8.method549(12352);
            int var11 = var8.method560(15654);
            if (var9.method3454(true)) {
                class350.method2081(arg1, 125, arg5, var9, arg3);
            }
            if (var8.method562(29008)) {
                var8.method561((byte) 111, arg2);
            }
            if (arg0 == 0) {
                class86 var12 = class171.method1170(arg3, arg1, arg5);
                if (!(var12 instanceof class563)) {
                    class533.method2944(arg3, arg1, arg5);
                } else {
                    ((class563) var12).field7606 = null;
                }
                if (~var9.field8627 != -1) {
                    arg4.method2624(arg1, (byte) -32, var9.field8612, arg5, var10, !var9.field8562, var11);
                    return;
                }
                return;
            }
            if (arg0 == 1) {
                class404 var13 = class493.method2759(arg3, arg1, arg5);
                if (!(var13 instanceof class411)) {
                    class381.method2205(arg3, arg1, arg5);
                    return;
                }
                ((class411) var13).field5817 = null;
                return;
            }
            if (~arg0 == -3) {
                class39 var14 = class410.method2344(arg3, arg1, arg5, field2584 != null ? field2584 : (field2584 = method1185("uq")));
                if (var14 instanceof class68 && ~var14.field517 == ~arg1 && var14.field512 == arg5) {
                    ((class68) var14).field937 = null;
                } else {
                    class385.method2213(arg3, arg1, arg5, field2584 != null ? field2584 : (field2584 = method1185("uq")));
                }
                if (var9.field8627 != 0 && ~super.field3774 < ~(var9.field8582 + arg1) && ~super.field3759 < ~(var9.field8582 + arg5) && ~(var9.field8566 + arg1) > ~super.field3774 && var9.field8566 + arg5 < super.field3759) {
                    arg4.method2621(arg5, var9.field8582, !var9.field8562, var9.field8612, var11, var9.field8566, (byte) 25, arg1);
                    return;
                }
                return;
            }
            if (arg0 == 3) {
                class348 var15 = class237.method1497(arg3, arg1, arg5);
                if (!(var15 instanceof class72)) {
                    class316.method1937(arg3, arg1, arg5);
                } else {
                    ((class72) var15).field996 = null;
                }
                if (var9.field8627 == 1) {
                    arg4.method2626(2883842, arg5, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Loa;IIIIIIBIILiaa;)V", line = 180)
    public final void method1178(class638 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, class455 arg10) {
        ++field2576;
        if (class274.field3872.method2433(0, class429.field6020) || class269.method1632(arg8, class122.field1683, (byte) 48, arg4, arg5)) {
            if (arg2 < this.field2581) {
                this.field2581 = arg2;
            }
            class620 var12 = class164.field2499.method2013(arg9, false);
            if (!arg0.method424() || !class274.field3872.field885 || !var12.field8642) {
                int var13;
                int var14;
                if (~arg1 != -2 && ~arg1 != -4) {
                    var13 = var12.field8582;
                    var14 = var12.field8566;
                } else {
                    var14 = var12.field8582;
                    var13 = var12.field8566;
                }
                int var15;
                int var16;
                if (super.field3774 >= arg8 + var13) {
                    var15 = (var13 + 1 >> 1) + arg8;
                    var16 = arg8 - -(var13 >> 1);
                } else {
                    var15 = arg8 - -1;
                    var16 = arg8;
                }
                int var17;
                int var18;
                if (~(arg4 + var14) >= ~super.field3759) {
                    var17 = (var14 >> 1) + arg4;
                    var18 = (var14 + 1 >> 1) + arg4;
                } else {
                    var18 = arg4 - -1;
                    var17 = arg4;
                }
                class136 var19 = class144.field2149[arg5];
                int var20 = var19.method273(var16, var17) - (-var19.method273(var15, var17) - var19.method273(var16, var18) - var19.method273(var15, var18)) >> 2;
                int var21 = (arg8 << 9) + (var13 << 8);
                int var22 = (arg4 << 9) + (var14 << 8);
                boolean var23 = class134.field1897 && !super.field3775 && var12.field8635;
                if (var12.method3454(true)) {
                    class80.method637((byte) -95, (class286) null, arg1, var12, arg8, arg2, (class225) null, arg4);
                }
                boolean var24 = ~arg3 == 0 && var12.field8649 == -1 && var12.field8645 == null && var12.field8623 == null && !var12.field8604;
                if (!class410.field5805 || (!class84.method651(4, arg6) || ~var12.field8576 == -2) && (!class181.method1222(false, arg6) || var12.field8576 != 0)) {
                    if (~arg6 == -23) {
                        if (class274.field3872.field916 || var12.field8592 != 0 || ~var12.field8627 == -2 || var12.field8578) {
                            class348 var25;
                            if (!var24) {
                                var25 = new class418(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg1, arg3);
                            } else {
                                class153 var26 = new class153(arg0, var12, arg5, var21, var20, var22, super.field3775, arg1, var23);
                                var25 = var26;
                                if (var26.method562(29008)) {
                                    var26.method556((byte) 107, arg0);
                                }
                            }
                            class348 var27 = class237.method1497(arg2, arg8, arg4);
                            if (!(var27 instanceof class72)) {
                                class57.method499(arg2, arg8, arg4, var25);
                            } else {
                                ((class72) var27).field996 = var25;
                            }
                            if (var12.field8627 == 1 && arg10 != null) {
                                arg10.method2614(-110, arg4, arg8);
                            }
                        }
                    } else if (~arg6 != -11 && arg6 != 11) {
                        if (~arg6 <= -13 && ~arg6 >= -18 || ~arg6 <= -19 && ~arg6 >= -22) {
                            class39 var29;
                            if (var24) {
                                class315 var28 = new class315(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg8, var13 + -1 + arg8, arg4, arg4 + var14 + -1, arg6, arg1, var23);
                                var29 = var28;
                                if (var28.method562(29008)) {
                                    var28.method556((byte) 18, arg0);
                                }
                            } else {
                                var29 = new class218(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg8, arg8 - -var13 + -1, arg4, arg4 + var14 + -1, arg6, arg1, arg3);
                            }
                            class39 var30 = class410.method2344(arg2, arg8, arg4, field2584 != null ? field2584 : (field2584 = method1185("uq")));
                            if (var30 instanceof class68 && ~var30.field517 == ~arg8 && ~var30.field512 == ~arg4) {
                                ((class68) var30).field937 = var29;
                            } else {
                                class580.method3224(var29, false);
                            }
                            if (class134.field1897 && !super.field3775 && ~arg6 <= -13 && ~arg6 >= -18 && arg6 != 13 && arg2 > 0 && ~var12.field8576 != -1) {
                                super.field3760[arg2][arg8][arg4] = (byte) class266.method1624(super.field3760[arg2][arg8][arg4], 4);
                            }
                            if (~var12.field8627 != -1 && arg10 != null) {
                                arg10.method2608(arg4, var13, var14, arg8, var12.field8612, !var12.field8562, true);
                            }
                        } else if (arg6 == 0) {
                            int var31 = var12.field8576;
                            if (class450.field6287 && ~var12.field8576 == 0) {
                                var31 = 1;
                            }
                            class86 var33;
                            if (var24) {
                                class419 var32 = new class419(arg0, var12, arg5, var21, var20, var22, super.field3775, arg6, arg1, var23);
                                if (var32.method562(29008)) {
                                    var32.method556((byte) 34, arg0);
                                }
                                var33 = var32;
                            } else {
                                var33 = new class238(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg6, arg1, arg3);
                            }
                            class86 var34 = class171.method1170(arg2, arg8, arg4);
                            if (!(var34 instanceof class563)) {
                                class346.method2065(arg2, arg8, arg4, var33, (class86) null);
                            } else {
                                ((class563) var34).field7606 = var33;
                            }
                            if (class134.field1897) {
                                if (arg1 == 0) {
                                    if (var12.field8561) {
                                        var19.method272(arg8, arg4, 50);
                                        var19.method272(arg8, arg4 - -1, 50);
                                    }
                                    if (var31 == 1 && !super.field3775) {
                                        super.field3760[arg2][arg8][arg4] = (byte) class266.method1624(super.field3760[arg2][arg8][arg4], 1);
                                    }
                                } else if (arg1 == 1) {
                                    if (var12.field8561) {
                                        var19.method272(arg8, arg4 + 1, 50);
                                        var19.method272(arg8 + 1, arg4 + 1, 50);
                                    }
                                    if (var31 == 1 && !super.field3775) {
                                        super.field3760[arg2][arg8][arg4 + 1] = (byte) class266.method1624(super.field3760[arg2][arg8][arg4 + 1], 2);
                                    }
                                } else if (~arg1 != -3) {
                                    if (arg1 == 3) {
                                        if (var12.field8561) {
                                            var19.method272(arg8, arg4, 50);
                                            var19.method272(arg8 + 1, arg4, 50);
                                        }
                                        if (~var31 == -2 && !super.field3775) {
                                            super.field3760[arg2][arg8][arg4] = (byte) class266.method1624(super.field3760[arg2][arg8][arg4], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field8561) {
                                        var19.method272(arg8 + 1, arg4, 50);
                                        var19.method272(arg8 + 1, arg4 - -1, 50);
                                    }
                                    if (~var31 == -2 && !super.field3775) {
                                        super.field3760[arg2][arg8 + 1][arg4] = (byte) class266.method1624(super.field3760[arg2][arg8 + 1][arg4], 1);
                                    }
                                }
                            }
                            if (var12.field8627 != 0 && arg10 != null) {
                                arg10.method2622(!var12.field8562, arg6, arg4, 10534, var12.field8612, arg8, arg1);
                            }
                            if (~var12.field8601 != -65) {
                                class182.method1231(arg2, arg8, arg4, var12.field8601);
                            }
                        } else if (arg6 == 1) {
                            class86 var36;
                            if (var24) {
                                class419 var35 = new class419(arg0, var12, arg5, var21, var20, var22, super.field3775, arg6, arg1, var23);
                                var36 = var35;
                                if (var35.method562(29008)) {
                                    var35.method556((byte) 38, arg0);
                                }
                            } else {
                                var36 = new class238(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg6, arg1, arg3);
                            }
                            class86 var37 = class171.method1170(arg2, arg8, arg4);
                            if (var37 instanceof class563) {
                                ((class563) var37).field7606 = var36;
                            } else {
                                class346.method2065(arg2, arg8, arg4, var36, (class86) null);
                            }
                            if (var12.field8561 && class134.field1897) {
                                if (~arg1 != -1) {
                                    if (arg1 == 1) {
                                        var19.method272(arg8 + 1, arg4 - -1, 50);
                                    } else if (arg1 != 2) {
                                        if (~arg1 == -4) {
                                            var19.method272(arg8, arg4, 50);
                                        }
                                    } else {
                                        var19.method272(arg8 + 1, arg4, 50);
                                    }
                                } else {
                                    var19.method272(arg8, arg4 - -1, 50);
                                }
                            }
                            if (~var12.field8627 != -1 && arg10 != null) {
                                arg10.method2622(!var12.field8562, arg6, arg4, 10534, var12.field8612, arg8, arg1);
                            }
                        } else {
                            if (arg7 < 20) {
                                field2583 = null;
                            }
                            if (~arg6 == -3) {
                                int var38 = arg1 + 1 & 3;
                                class86 var39;
                                class86 var40;
                                if (!var24) {
                                    var39 = new class238(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg6, arg1 - -4, arg3);
                                    var40 = new class238(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg6, var38, arg3);
                                } else {
                                    class419 var41 = new class419(arg0, var12, arg5, var21, var20, var22, super.field3775, arg6, arg1 + 4, var23);
                                    class419 var42 = new class419(arg0, var12, arg5, var21, var20, var22, super.field3775, arg6, var38, var23);
                                    if (var41.method562(29008)) {
                                        var41.method556((byte) 32, arg0);
                                    }
                                    var40 = var42;
                                    if (var42.method562(29008)) {
                                        var42.method556((byte) 49, arg0);
                                    }
                                    var39 = var41;
                                }
                                class346.method2065(arg2, arg8, arg4, var39, var40);
                                if (~var12.field8576 == -2 && class134.field1897 && !super.field3775) {
                                    if (~arg1 == -1) {
                                        super.field3760[arg2][arg8][arg4] = (byte) class266.method1624(super.field3760[arg2][arg8][arg4], 1);
                                        super.field3760[arg2][arg8][arg4 - -1] = (byte) class266.method1624(super.field3760[arg2][arg8][arg4 - -1], 2);
                                    } else if (~arg1 != -2) {
                                        if (arg1 == 2) {
                                            super.field3760[arg2][arg8 + 1][arg4] = (byte) class266.method1624(super.field3760[arg2][arg8 + 1][arg4], 1);
                                            super.field3760[arg2][arg8][arg4] = (byte) class266.method1624(super.field3760[arg2][arg8][arg4], 2);
                                        } else if (arg1 == 3) {
                                            super.field3760[arg2][arg8][arg4] = (byte) class266.method1624(super.field3760[arg2][arg8][arg4], 2);
                                            super.field3760[arg2][arg8][arg4] = (byte) class266.method1624(super.field3760[arg2][arg8][arg4], 1);
                                        }
                                    } else {
                                        super.field3760[arg2][arg8][arg4 + 1] = (byte) class266.method1624(super.field3760[arg2][arg8][arg4 + 1], 2);
                                        super.field3760[arg2][arg8 - -1][arg4] = (byte) class266.method1624(super.field3760[arg2][arg8 - -1][arg4], 1);
                                    }
                                }
                                if (var12.field8627 != 0 && arg10 != null) {
                                    arg10.method2622(!var12.field8562, arg6, arg4, 10534, var12.field8612, arg8, arg1);
                                }
                                if (~var12.field8601 != -65) {
                                    class182.method1231(arg2, arg8, arg4, var12.field8601);
                                }
                            } else if (arg6 == 3) {
                                class86 var44;
                                if (var24) {
                                    class419 var43 = new class419(arg0, var12, arg5, var21, var20, var22, super.field3775, arg6, arg1, var23);
                                    var44 = var43;
                                    if (var43.method562(29008)) {
                                        var43.method556((byte) 96, arg0);
                                    }
                                } else {
                                    var44 = new class238(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg6, arg1, arg3);
                                }
                                class86 var45 = class171.method1170(arg2, arg8, arg4);
                                if (!(var45 instanceof class563)) {
                                    class346.method2065(arg2, arg8, arg4, var44, (class86) null);
                                } else {
                                    ((class563) var45).field7606 = var44;
                                }
                                if (var12.field8561 && class134.field1897) {
                                    if (~arg1 == -1) {
                                        var19.method272(arg8, arg4 + 1, 50);
                                    } else if (arg1 != 1) {
                                        if (~arg1 == -3) {
                                            var19.method272(arg8 - -1, arg4, 50);
                                        } else if (~arg1 == -4) {
                                            var19.method272(arg8, arg4, 50);
                                        }
                                    } else {
                                        var19.method272(arg8 + 1, arg4 + 1, 50);
                                    }
                                }
                                if (~var12.field8627 != -1 && arg10 != null) {
                                    arg10.method2622(!var12.field8562, arg6, arg4, 10534, var12.field8612, arg8, arg1);
                                }
                            } else if (arg6 == 9) {
                                class39 var46;
                                if (!var24) {
                                    var46 = new class218(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg8, arg8 + var13 + -1, arg4, arg4 + var14 + -1, arg6, arg1, arg3);
                                } else {
                                    class315 var47 = new class315(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg8, arg8, arg4, arg4, arg6, arg1, var23);
                                    if (var47.method562(29008)) {
                                        var47.method556((byte) 52, arg0);
                                    }
                                    var46 = var47;
                                }
                                class39 var48 = class410.method2344(arg2, arg8, arg4, field2584 != null ? field2584 : (field2584 = method1185("uq")));
                                if (var48 instanceof class68 && var48.field517 == arg8 && var48.field512 == arg4) {
                                    ((class68) var48).field937 = var46;
                                } else {
                                    class580.method3224(var46, false);
                                }
                                if (~var12.field8627 != -1 && arg10 != null) {
                                    arg10.method2608(arg4, var13, var14, arg8, var12.field8612, !var12.field8562, true);
                                }
                                if (~var12.field8601 != -65) {
                                    class182.method1231(arg2, arg8, arg4, var12.field8601);
                                }
                            } else if (arg6 == 4) {
                                class404 var50;
                                if (var24) {
                                    class70 var49 = new class70(arg0, var12, arg5, var21, var20, var22, super.field3775, 0, 0, 0, arg6, arg1);
                                    var50 = var49;
                                    if (var49.method562(29008)) {
                                        var49.method556((byte) 90, arg0);
                                    }
                                } else {
                                    var50 = new class487(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, 0, 0, 0, arg6, arg1, arg3);
                                }
                                class404 var51 = class493.method2759(arg2, arg8, arg4);
                                if (!(var51 instanceof class411)) {
                                    class520.method2883(arg2, arg8, arg4, var50, (class404) null);
                                } else {
                                    ((class411) var51).field5817 = var50;
                                }
                            } else if (arg6 == 5) {
                                int var52 = 65;
                                class147 var53 = (class147) class171.method1170(arg2, arg8, arg4);
                                if (var53 != null) {
                                    var52 = class164.field2499.method2013(var53.method554(-18971), false).field8601 - -1;
                                }
                                class404 var55;
                                if (var24) {
                                    class70 var54 = new class70(arg0, var12, arg5, var21, var20, var22, super.field3775, 0, class463.field6526[arg1] * var52, class363.field5182[arg1] * var52, arg6, arg1);
                                    var55 = var54;
                                    if (var54.method562(29008)) {
                                        var54.method556((byte) 115, arg0);
                                    }
                                } else {
                                    var55 = new class487(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, 0, class463.field6526[arg1] * var52, class363.field5182[arg1] * var52, arg6, arg1, arg3);
                                }
                                class404 var56 = class493.method2759(arg2, arg8, arg4);
                                if (var56 instanceof class411) {
                                    ((class411) var56).field5817 = var55;
                                } else {
                                    class520.method2883(arg2, arg8, arg4, var55, (class404) null);
                                }
                            } else if (~arg6 == -7) {
                                int var57 = 33;
                                class147 var58 = (class147) class171.method1170(arg2, arg8, arg4);
                                if (var58 != null) {
                                    var57 = class164.field2499.method2013(var58.method554(-18971), false).field8601 / 2 - -1;
                                }
                                class404 var60;
                                if (var24) {
                                    class70 var59 = new class70(arg0, var12, arg5, var21, var20, var22, super.field3775, arg1, class463.field6526[arg1] * var57, class363.field5182[arg1] * var57, arg6, arg1 - -4);
                                    if (var59.method562(29008)) {
                                        var59.method556((byte) 92, arg0);
                                    }
                                    var60 = var59;
                                } else {
                                    var60 = new class487(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg1, class601.field8338[arg1] * var57, class173.field2593[arg1] * var57, arg6, arg1 + 4, arg3);
                                }
                                class404 var61 = class493.method2759(arg2, arg8, arg4);
                                if (var61 instanceof class411) {
                                    ((class411) var61).field5817 = var60;
                                } else {
                                    class520.method2883(arg2, arg8, arg4, var60, (class404) null);
                                }
                            } else if (~arg6 == -8) {
                                int var62 = arg1 + 2 & 3;
                                class404 var63;
                                if (!var24) {
                                    var63 = new class487(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, var62, 0, 0, arg6, var62 + 4, arg3);
                                } else {
                                    class70 var64 = new class70(arg0, var12, arg5, var21, var20, var22, super.field3775, var62, 0, 0, arg6, var62 + 4);
                                    if (var64.method562(29008)) {
                                        var64.method556((byte) 18, arg0);
                                    }
                                    var63 = var64;
                                }
                                class404 var65 = class493.method2759(arg2, arg8, arg4);
                                if (!(var65 instanceof class411)) {
                                    class520.method2883(arg2, arg8, arg4, var63, (class404) null);
                                } else {
                                    ((class411) var65).field5817 = var63;
                                }
                            } else if (arg6 == 8) {
                                int var66 = arg1 + 2 & 3;
                                int var67 = 33;
                                class147 var68 = (class147) class171.method1170(arg2, arg8, arg4);
                                if (var68 != null) {
                                    var67 = class164.field2499.method2013(var68.method554(-18971), false).field8601 / 2 + 1;
                                }
                                class404 var71;
                                class404 var72;
                                if (!var24) {
                                    class487 var69 = new class487(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg1, class601.field8338[arg1] * var67, class173.field2593[arg1] * var67, arg6, arg1 + 4, arg3);
                                    class487 var70 = new class487(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg1, 0, 0, arg6, var66 + 4, arg3);
                                    var71 = var69;
                                    var72 = var70;
                                } else {
                                    class70 var73 = new class70(arg0, var12, arg5, var21, var20, var22, super.field3775, arg1, class601.field8338[arg1] * var67, class173.field2593[arg1] * var67, arg6, arg1 + 4);
                                    class70 var74 = new class70(arg0, var12, arg5, var21, var20, var22, super.field3775, arg1, 0, 0, arg6, var66 + 4);
                                    if (var73.method562(29008)) {
                                        var73.method556((byte) 50, arg0);
                                    }
                                    var72 = var74;
                                    if (var74.method562(29008)) {
                                        var74.method556((byte) 127, arg0);
                                    }
                                    var71 = var73;
                                }
                                class520.method2883(arg2, arg8, arg4, var71, var72);
                            }
                        }
                    } else {
                        class315 var75 = null;
                        int var76;
                        class39 var77;
                        if (!var24) {
                            var76 = 15;
                            var77 = new class218(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg8, arg8 + -1 - -var13, arg4, arg4 + var14 + -1, arg6, arg1, arg3);
                        } else {
                            class315 var78 = new class315(arg0, var12, arg2, arg5, var21, var20, var22, super.field3775, arg8, arg8 + var13 + -1, arg4, arg4 + var14 + -1, arg6, arg1, var23);
                            var75 = var78;
                            var76 = var78.method1930(-64);
                            var77 = var78;
                        }
                        class39 var79 = class410.method2344(arg2, arg8, arg4, field2584 != null ? field2584 : (field2584 = method1185("uq")));
                        boolean var80 = false;
                        if (var79 instanceof class68 && var79.field517 == arg8 && ~var79.field512 == ~arg4) {
                            ((class68) var79).field937 = var77;
                            var80 = true;
                        }
                        if (var80 || class580.method3224(var77, false)) {
                            if (var75 != null && var75.method562(29008)) {
                                var75.method556((byte) 59, arg0);
                            }
                            if (var12.field8561 && class134.field1897) {
                                if (~var76 < -31) {
                                    var76 = 30;
                                }
                                for (int var81 = 0; ~var13 <= ~var81; ++var81) {
                                    for (int var82 = 0; var82 <= var14; ++var82) {
                                        var19.method272(arg8 + var81, arg4 - -var82, var76);
                                    }
                                }
                            }
                        }
                        if (~var12.field8627 != -1 && arg10 != null) {
                            arg10.method2608(arg4, var13, var14, arg8, var12.field8612, !var12.field8562, true);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIILoa;Ljr;IIIII[I)V", line = 888)
    public final void method1179(int arg0, int arg1, int arg2, class638 arg3, class96 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        ++field2574;
        if (!super.field3775) {
            if (arg7 < 125) {
                field2583 = null;
            }
            boolean var12 = false;
            if (arg10 != null) {
                arg10[0] = -1;
            }
            class667 var13 = null;
            int var14 = (7 & arg5) * 8;
            int var15 = (arg2 & 7) * 8;
            while (true) {
                while (~arg4.field1301 > ~arg4.field1316.length) {
                    int var20 = arg4.method718(123);
                    if (~var20 == -1) {
                        var13 = new class667(arg4);
                    } else if (~var20 == -2) {
                        int var21 = arg4.method718(-110);
                        if (~var21 < -1) {
                            for (int var22 = 0; ~var21 < ~var22; ++var22) {
                                class517 var23 = new class517(arg3, arg4, 2);
                                if (var23.field7064 == 31) {
                                    class164 var24 = class546.field7390.method3047(arg4.method743((byte) -92), false);
                                    var23.method2873(var24.field2500, (byte) 56, var24.field2503, var24.field2505, var24.field2501);
                                }
                                if (~arg3.method473() < -1) {
                                    class154 var25 = var23.field7053;
                                    int var26 = var25.method1079(-868177151) >> 9;
                                    int var27 = var25.method1074(0) >> 9;
                                    if (var23.field7057 == arg6 && var14 <= var26 && ~var26 > ~(var14 + 8) && ~var15 >= ~var27 && var27 < var15 + 8) {
                                        int var28 = (arg1 << 9) - -class506.method2819(arg9, 126, var25.method1079(-868177151) & 4095, 4095 & var25.method1074(0));
                                        int var29 = var28 >> 9;
                                        int var30 = class359.method2117(4095 & var25.method1079(-868177151), arg9, 2, 4095 & var25.method1074(0)) + (arg8 << 9);
                                        int var31 = var30 >> 9;
                                        if (var29 >= 0 && var31 >= 0 && ~super.field3774 < ~var29 && var31 < super.field3759) {
                                            var25.method1078(var30, 4671, var28, super.field3751[arg6][var29][var31] + -var25.method1076(false));
                                            class184.method1237(var23);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class667();
                        }
                        var13.method3697(-1, arg4);
                    } else if (~var20 == -129) {
                        if (arg10 != null) {
                            arg10[0] = arg4.method743((byte) -49);
                            arg10[1] = arg4.method722(4);
                            arg10[2] = arg4.method722(4);
                            arg10[3] = arg4.method722(4);
                            arg10[4] = arg4.method743((byte) -87);
                        } else {
                            arg4.field1301 += 10;
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field3773 == null) {
                            super.field3773 = new byte[4][][];
                        }
                        for (int var32 = 0; ~var32 > -5; ++var32) {
                            byte var33 = arg4.method748(-813976688);
                            if (~var33 == -1 && super.field3773[arg0] != null) {
                                if (~arg6 <= ~var32) {
                                    int var34 = arg1;
                                    int var35 = arg1 - -7;
                                    int var36 = arg8;
                                    if (~var35 > -1) {
                                        var35 = 0;
                                    } else if (~var35 <= ~super.field3774) {
                                        var35 = super.field3774;
                                    }
                                    if (arg1 >= 0) {
                                        if (~super.field3774 >= ~arg1) {
                                            var34 = super.field3774;
                                        }
                                    } else {
                                        var34 = 0;
                                    }
                                    if (arg8 >= 0) {
                                        if (super.field3759 <= arg8) {
                                            var36 = super.field3759;
                                        }
                                    } else {
                                        var36 = 0;
                                    }
                                    int var37 = arg8 + 7;
                                    if (var37 < 0) {
                                        var37 = 0;
                                    } else if (super.field3759 <= var37) {
                                        var37 = super.field3759;
                                    }
                                    while (~var34 > ~var35) {
                                        while (~var36 > ~var37) {
                                            super.field3773[arg0][var34][var36] = 0;
                                            ++var36;
                                        }
                                        ++var34;
                                    }
                                }
                            } else if (var33 == 1) {
                                if (super.field3773[arg0] == null) {
                                    super.field3773[arg0] = new byte[super.field3774 + 1][super.field3759 + 1];
                                }
                                for (int var38 = 0; var38 < 64; var38 += 4) {
                                    for (int var39 = 0; var39 < 64; var39 += 4) {
                                        byte var40 = arg4.method748(-813976688);
                                        if (arg6 >= var32) {
                                            for (int var41 = var38; ~var41 > ~(var38 + 4); ++var41) {
                                                for (int var42 = var39; ~var42 > ~(var39 + 4); ++var42) {
                                                    if (var14 <= var41 && var14 + 8 > var41 && ~var42 <= ~var15 && var15 < var15 + 8) {
                                                        int var43 = arg1 + class315.method1929(7 & var41, var42 & 7, 65535, arg9);
                                                        int var44 = class677.method3742((byte) 58, 7 & var41, 7 & var42, arg9) + arg8;
                                                        if (var43 >= 0 && ~var43 > ~super.field3774 && var44 >= 0 && var44 < super.field3759) {
                                                            super.field3773[arg0][var43][var44] = var40;
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
                    class30.method136(0, arg8 >> 3, arg1 >> 3, var13);
                }
                if (!var12 && super.field3773 != null && super.field3773[arg0] != null) {
                    int var16 = arg1 + 7;
                    int var17 = arg8 + 7;
                    for (int var18 = arg1; var16 > var18; ++var18) {
                        for (int var19 = arg8; ~var19 > ~var17; ++var19) {
                            super.field3773[arg0][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILoa;[Liaa;III[BIIBI)V", line = 1182)
    public final void method1180(int arg0, class638 arg1, class455[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, byte arg9, int arg10) {
        ++field2578;
        class96 var12 = new class96(arg6);
        int var13 = -1;
        if (arg9 < 89) {
            this.method1179(-112, 112, 118, (class638) null, (class96) null, 70, -71, -21, 21, 52, (int[]) null);
        }
        while (true) {
            int var14 = var12.method702((byte) 108);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method733((byte) 88);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 63;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method718(95);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg4 == ~var19 && arg7 <= var18 && ~var18 > ~(arg7 - -8) && ~arg3 >= ~var17 && ~(arg3 - -8) < ~var17) {
                    class620 var23 = class164.field2499.method2013(var13, false);
                    int var24 = class29.method134(var22, var23.field8566, 109, arg10, var17 & 7, var23.field8582, 7 & var18) + arg8;
                    int var25 = class134.method959(var23.field8566, false, 7 & var18, arg10, 7 & var17, var22, var23.field8582) + arg0;
                    if (var24 > 0 && ~var25 < -1 && ~var24 > ~(super.field3774 - 1) && ~var25 > ~(super.field3759 + -1)) {
                        class455 var26 = null;
                        if (!super.field3775) {
                            int var27 = arg5;
                            if (~(class246.field3501[1][var24][var25] & 2) == -3) {
                                var27 = arg5 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg2[var27];
                            }
                        }
                        this.method1178(arg1, arg10 + var22 & 3, arg5, -1, var25, arg5, var21, (byte) 93, var24, var13, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IILoa;[Liaa;I[B)V", line = 1265)
    public final void method1181(int arg0, int arg1, class638 arg2, class455[] arg3, int arg4, byte[] arg5) {
        ++field2579;
        class96 var7 = new class96(arg5);
        int var8 = -1;
        while (true) {
            int var9 = var7.method702((byte) 100);
            if (var9 == 0) {
                if (arg0 != 29924) {
                    this.method1180(51, (class638) null, (class455[]) null, 123, -18, -43, (byte[]) null, 78, 115, (byte) -24, -103);
                    return;
                }
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method733((byte) 108);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = (4058 & var10) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method718(-89);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg1 + var13;
                int var19 = arg4 + var12;
                if (~var18 < -1 && var19 > 0 && ~(super.field3774 + -1) < ~var18 && super.field3759 + -1 > var19) {
                    class455 var20 = null;
                    if (!super.field3775) {
                        int var21 = var14;
                        if ((class246.field3501[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg3[var21];
                        }
                    }
                    this.method1178(arg2, var17, var14, -1, var19, var14, var16, (byte) 83, var18, var8, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I[IILoa;Ljr;I)V", line = 1340)
    public final void method1182(int arg0, int[] arg1, int arg2, class638 arg3, class96 arg4, int arg5) {
        ++field2573;
        if (!super.field3775) {
            boolean var7 = false;
            if (arg2 < 95) {
                field2583 = null;
            }
            if (arg1 != null) {
                arg1[0] = -1;
            }
            class667 var8 = null;
            while (true) {
                while (true) {
                    while (true) {
                        while (arg4.field1316.length > arg4.field1301) {
                            int var18 = arg4.method718(-67);
                            if (~var18 != -1) {
                                if (var18 != 1) {
                                    if (~var18 == -3) {
                                        if (var8 == null) {
                                            var8 = new class667();
                                        }
                                        var8.method3697(-1, arg4);
                                    } else if (~var18 == -129) {
                                        if (arg1 != null) {
                                            arg1[0] = arg4.method743((byte) -7);
                                            arg1[1] = arg4.method722(4);
                                            arg1[2] = arg4.method722(4);
                                            arg1[3] = arg4.method722(4);
                                            arg1[4] = arg4.method743((byte) -75);
                                        } else {
                                            arg4.field1301 += 10;
                                        }
                                    } else {
                                        if (~var18 != -130) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field3773 == null) {
                                            super.field3773 = new byte[4][][];
                                        }
                                        for (int var19 = 0; var19 < 4; ++var19) {
                                            byte var20 = arg4.method748(-813976688);
                                            if (var20 == 0 && super.field3773[var19] != null) {
                                                int var21 = arg0;
                                                int var22 = arg0 + 64;
                                                int var23 = arg5;
                                                int var24 = arg5 - -64;
                                                if (var22 < 0) {
                                                    var22 = 0;
                                                } else if (~super.field3774 >= ~var22) {
                                                    var22 = super.field3774;
                                                }
                                                if (~arg5 <= -1) {
                                                    if (arg5 >= super.field3759) {
                                                        var23 = super.field3759;
                                                    }
                                                } else {
                                                    var23 = 0;
                                                }
                                                if (~arg0 > -1) {
                                                    var21 = 0;
                                                } else if (~super.field3774 >= ~arg0) {
                                                    var21 = super.field3774;
                                                }
                                                if (~var24 <= -1) {
                                                    if (var24 >= super.field3759) {
                                                        var24 = super.field3759;
                                                    }
                                                } else {
                                                    var24 = 0;
                                                }
                                                while (~var22 < ~var21) {
                                                    while (~var23 > ~var24) {
                                                        super.field3773[var19][var21][var23] = 0;
                                                        ++var23;
                                                    }
                                                    ++var21;
                                                }
                                            } else if (~var20 == -2) {
                                                if (super.field3773[var19] == null) {
                                                    super.field3773[var19] = new byte[super.field3774 + 1][super.field3759 + 1];
                                                }
                                                for (int var25 = 0; var25 < 64; var25 += 4) {
                                                    for (int var26 = 0; ~var26 > -65; var26 += 4) {
                                                        byte var27 = arg4.method748(-813976688);
                                                        for (int var28 = arg0 + var25; ~(arg0 + var25 + 4) < ~var28; ++var28) {
                                                            for (int var29 = arg5 + var26; var29 < var26 - -arg5 + 4; ++var29) {
                                                                if (~var28 <= -1 && super.field3774 > var28 && var29 >= 0 && var29 < super.field3759) {
                                                                    super.field3773[var19][var28][var29] = var27;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (var20 == 2) {
                                                if (super.field3773[var19] == null) {
                                                    super.field3773[var19] = new byte[super.field3774 + 1][super.field3759 + 1];
                                                }
                                                if (~var19 < -1) {
                                                    int var30 = arg0;
                                                    int var31 = arg0 - -64;
                                                    int var32 = arg5;
                                                    if (arg5 >= 0) {
                                                        if (~arg5 <= ~super.field3759) {
                                                            var32 = super.field3759;
                                                        }
                                                    } else {
                                                        var32 = 0;
                                                    }
                                                    if (var31 >= 0) {
                                                        if (~var31 <= ~super.field3774) {
                                                            var31 = super.field3774;
                                                        }
                                                    } else {
                                                        var31 = 0;
                                                    }
                                                    int var33 = arg5 - -64;
                                                    if (arg0 >= 0) {
                                                        if (arg0 >= super.field3774) {
                                                            var30 = super.field3774;
                                                        }
                                                    } else {
                                                        var30 = 0;
                                                    }
                                                    if (~var33 <= -1) {
                                                        if (var33 >= super.field3759) {
                                                            var33 = super.field3759;
                                                        }
                                                    } else {
                                                        var33 = 0;
                                                    }
                                                    while (~var31 < ~var30) {
                                                        while (~var33 < ~var32) {
                                                            super.field3773[var19][var30][var32] = super.field3773[var19 + -1][var30][var32];
                                                            ++var32;
                                                        }
                                                        ++var30;
                                                    }
                                                }
                                            }
                                        }
                                        var7 = true;
                                    }
                                } else {
                                    int var34 = arg4.method718(90);
                                    if (~var34 < -1) {
                                        for (int var35 = 0; var34 > var35; ++var35) {
                                            class517 var36 = new class517(arg3, arg4, 2);
                                            if (var36.field7064 == 31) {
                                                class164 var37 = class546.field7390.method3047(arg4.method743((byte) -100), false);
                                                var36.method2873(var37.field2500, (byte) 97, var37.field2503, var37.field2505, var37.field2501);
                                            }
                                            if (~arg3.method473() < -1) {
                                                class154 var38 = var36.field7053;
                                                int var39 = (arg0 << 9) + var38.method1079(-868177151);
                                                int var40 = var38.method1074(0) - -(arg5 << 9);
                                                int var41 = var39 >> 9;
                                                int var42 = var40 >> 9;
                                                if (var41 >= 0 && ~var42 <= -1 && super.field3774 > var41 && super.field3759 > var42) {
                                                    var38.method1078(var40, 4671, var39, super.field3751[var36.field7057][var41][var42] - var38.method1076(false));
                                                    class184.method1237(var36);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class667(arg4);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; var9 < 8; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg0 >> 3) + var9;
                                    int var12 = (arg5 >> 3) + var10;
                                    if (var11 >= 0 && ~(super.field3774 >> 3) < ~var11 && var12 >= 0 && ~(super.field3759 >> 3) < ~var12) {
                                        class30.method136(0, var12, var11, var8);
                                    }
                                }
                            }
                        }
                        if (!var7 && super.field3773 != null) {
                            for (int var13 = 0; ~var13 > -5; ++var13) {
                                if (super.field3773[var13] != null) {
                                    for (int var14 = 0; var14 < 16; ++var14) {
                                        for (int var15 = 0; var15 < 16; ++var15) {
                                            int var16 = (arg0 >> 2) + var14;
                                            int var17 = (arg5 >> 2) + var15;
                                            if (~var16 <= -1 && ~var16 > -27 && var17 >= 0 && ~var17 > -27) {
                                                super.field3773[var13][var16][var17] = 0;
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
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lln;I)Ljava/lang/String;", line = 1710)
    public static final String method1183(class345 arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field2570;
            return arg0.field4985 != null && arg0.field4985.length() > 0 ? arg0.field4988 + class9.field166.method42(class666.field9377, 19572) + arg0.field4985 : arg0.field4988;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Loa;B)V", line = 1733)
    public final void method1184(class638 arg0, byte arg1) {
        class472.method2685(arg0);
        ++field2575;
        if (super.field3766 > 1) {
            for (int var3 = 0; ~var3 > ~super.field3774; ++var3) {
                for (int var4 = 0; var4 < super.field3759; ++var4) {
                    if (~(2 & class246.field3501[1][var3][var4]) == -3) {
                        class86.method658(var3, var4);
                    }
                }
            }
        }
        if (arg1 != 7) {
            method1176(-99);
        }
        for (int var5 = 0; super.field3766 > var5; ++var5) {
            for (int var6 = 0; ~super.field3759 <= ~var6; ++var6) {
                for (int var7 = 0; ~var7 >= ~super.field3774; ++var7) {
                    if (~(1 & super.field3760[var5][var7][var6]) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (~var8 < -1 && ~(1 & super.field3760[var5][var7][var8 + -1]) != -1) {
                            --var8;
                        }
                        while (~super.field3759 < ~var9 && ~(super.field3760[var5][var7][var9 - -1] & 1) != -1) {
                            ++var9;
                        }
                        int var11 = var5;
                        label171: while (~var10 < -1) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if ((1 & super.field3760[var10 + -1][var7][var12]) == 0) {
                                    break label171;
                                }
                            }
                            --var10;
                        }
                        label160: while (~var11 > -4) {
                            for (int var13 = var8; var9 >= var13; ++var13) {
                                if (~(super.field3760[var11 + 1][var7][var13] & 1) == -1) {
                                    break label160;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + var9 + 1) * (-var10 + var11 + 1);
                        if (~var14 <= -3) {
                            short var15 = 960;
                            int var16 = super.field3751[var11][var7][var8] + -var15;
                            int var17 = super.field3751[var10][var7][var8];
                            class584.method3260(1, var7 << 9, var7 << 9, var8 << 9, (var9 << 9) + 512, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; var9 >= var19; ++var19) {
                                    super.field3760[var18][var7][var19] = (byte) class249.method1537(super.field3760[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & super.field3760[var5][var7][var6]) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (~var21 > ~super.field3774 && ~(super.field3760[var5][var21 + 1][var6] & 2) != -1) {
                            ++var21;
                        }
                        while (~var20 < -1 && ~(2 & super.field3760[var5][var20 - 1][var6]) != -1) {
                            --var20;
                        }
                        label225: while (~var22 < -1) {
                            for (int var24 = var20; ~var21 <= ~var24; ++var24) {
                                if ((super.field3760[var22 - 1][var24][var6] & 2) == 0) {
                                    break label225;
                                }
                            }
                            --var22;
                        }
                        label214: while (var23 < 3) {
                            for (int var25 = var20; ~var21 <= ~var25; ++var25) {
                                if ((2 & super.field3760[var23 - -1][var25][var6]) == 0) {
                                    break label214;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var21 - var20 + 1) * (-var22 + 1 + var23);
                        if (~var26 <= -3) {
                            short var27 = 960;
                            int var28 = super.field3751[var23][var20][var6] - var27;
                            int var29 = super.field3751[var22][var20][var6];
                            class584.method3260(2, var20 << 9, (var21 << 9) - -512, var6 << 9, var6 << 9, var28, var29);
                            for (int var30 = var22; var30 <= var23; ++var30) {
                                for (int var31 = var20; ~var21 <= ~var31; ++var31) {
                                    super.field3760[var30][var31][var6] = (byte) class249.method1537(super.field3760[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((super.field3760[var5][var7][var6] & 4) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; var34 > 0 && ~(super.field3760[var5][var7][var34 - 1] & 4) != -1; --var34) {
                        }
                        int var35;
                        for (var35 = var6; super.field3759 > var35 && (super.field3760[var5][var7][var35 + 1] & 4) != 0; ++var35) {
                        }
                        label278: while (var32 > 0) {
                            for (int var36 = var34; var36 <= var35; ++var36) {
                                if (~(4 & super.field3760[var5][var32 + -1][var36]) == -1) {
                                    break label278;
                                }
                            }
                            --var32;
                        }
                        label267: while (~var33 > ~super.field3774) {
                            for (int var37 = var34; ~var35 <= ~var37; ++var37) {
                                if (~(4 & super.field3760[var5][var33 + 1][var37]) == -1) {
                                    break label267;
                                }
                            }
                            ++var33;
                        }
                        if ((var33 - (var32 - 1)) * (-var34 + var35 + 1) >= 4) {
                            int var38 = super.field3751[var5][var32][var34];
                            class584.method3260(4, var32 << 9, (var33 << 9) - -512, var34 << 9, (var35 << 9) + 512, var38, var38);
                            for (int var39 = var32; ~var39 >= ~var33; ++var39) {
                                for (int var40 = var34; var35 >= var40; ++var40) {
                                    super.field3760[var5][var39][var40] = (byte) class249.method1537(super.field3760[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field3760 = null;
    }
}
