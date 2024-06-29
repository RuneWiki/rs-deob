import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class431 extends class425 {

    @OriginalMember(owner = "client!th", name = "X", descriptor = "I")
    public int field6203 = 99;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "[I")
    public static int[] field6191 = new int[64];

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!th", name = "S", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!th", name = "U", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!th", name = "V", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!th", name = "W", descriptor = "I")
    public static int field6202;

    // $FF: synthetic field
    @OriginalMember(owner = "client!th", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field6204;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Z")
    public static final boolean method2551(int arg0, int arg1, int arg2) {
        ++field6197;
        if (arg0 != -3) {
            field6191 = null;
        }
        return (arg2 & 52) != 0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([II[I[ILki;)V")
    public static final void method2552(int[] arg0, int arg1, int[] arg2, int[] arg3, class510 arg4) {
        ++field6194;
        if (arg1 != -1) {
            method2557(-45, true, 98);
        }
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            int var6 = arg0[var5];
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg4.field313.length; ++var9) {
                if ((1 & var7) != 0) {
                    if (var6 != -1) {
                        class183 var10 = class96.field1526.method2717(-125, var6);
                        int var11 = var10.field2687;
                        class490 var12 = arg4.field313[var9];
                        if (var12 != null) {
                            if (var12.field7066 == var6) {
                                if (~var11 != -1) {
                                    if (~var11 == -2) {
                                        var12.field7062 = 1;
                                        var12.field7063 = 0;
                                        var12.field7067 = 0;
                                        var12.field7065 = var8;
                                        var12.field7061 = 0;
                                        class511.method2983(arg4.field6961, 0, arg4.field6965, -64, class364.field5293 == arg4, var10, arg4.field6956);
                                    } else if (~var11 == -3) {
                                        var12.field7063 = 0;
                                    }
                                } else {
                                    var12 = arg4.field313[var9] = null;
                                }
                            } else if (~var10.field2688 <= ~class96.field1526.method2717(arg1 + -122, var12.field7066).field2688) {
                                var12 = arg4.field313[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class490 var13 = arg4.field313[var9] = new class490();
                            var13.field7066 = var6;
                            var13.field7065 = var8;
                            var13.field7063 = 0;
                            var13.field7061 = 0;
                            var13.field7062 = 1;
                            var13.field7067 = 0;
                            class511.method2983(arg4.field6961, 0, arg4.field6965, -64, class364.field5293 == arg4, var10, arg4.field6956);
                        }
                    } else {
                        arg4.field313[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIZ)V")
    public class431(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class451.field6589, class90.field1452);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBLue;IIILqa;)V")
    public final void method2553(int arg0, byte arg1, class159 arg2, int arg3, int arg4, int arg5, class167 arg6) {
        ++field6193;
        class534 var8 = null;
        if (~arg0 == -1) {
            var8 = (class534) class500.method2921(arg5, arg4, arg3);
        }
        if (~arg0 == -2) {
            var8 = (class534) class415.method2475(arg5, arg4, arg3);
        }
        if (arg0 == 2) {
            var8 = (class534) class413.method2470(arg5, arg4, arg3, field6204 != null ? field6204 : (field6204 = method2562("wo")));
        }
        if (arg0 == 3) {
            var8 = (class534) class388.method2347(arg5, arg4, arg3);
        }
        if (arg1 == -15) {
            if (var8 != null) {
                class261 var9 = class277.field4139.method569((byte) 84, var8.method561((byte) -85));
                int var10 = var8.method559((byte) 60);
                int var11 = var8.method560(arg1 + -29848);
                if (var9.method1688((byte) -114)) {
                    class217.method1445(false, arg5, var9, arg4, arg3);
                }
                if (var8.method547(-117)) {
                    var8.method557((byte) -77, arg6);
                }
                if (arg0 != 0) {
                    if (~arg0 == -2) {
                        class469 var12 = class415.method2475(arg5, arg4, arg3);
                        if (var12 instanceof class533) {
                            ((class533) var12).field7863 = null;
                            return;
                        }
                        class544.method3197(arg5, arg4, arg3);
                        return;
                    }
                    if (arg0 == 2) {
                        class478 var13 = class413.method2470(arg5, arg4, arg3, field6204 != null ? field6204 : (field6204 = method2562("wo")));
                        if (var13 instanceof class446 && var13.field6971 == arg4 && ~var13.field6962 == ~arg3) {
                            ((class446) var13).field6367 = null;
                        } else {
                            class244.method1604(arg5, arg4, arg3, field6204 != null ? field6204 : (field6204 = method2562("wo")));
                        }
                        if (var9.field3883 != 0 && arg4 - -var9.field3864 < super.field6002 && ~(var9.field3864 + arg3) > ~super.field6001 && var9.field3859 + arg4 < super.field6002 && super.field6001 > var9.field3859 + arg3) {
                            arg2.method1120(!var9.field3933, var9.field3859, arg4, arg3, var9.field3864, var11, false, var9.field3908);
                            return;
                        }
                        return;
                    }
                    if (arg0 == 3) {
                        class108 var14 = class388.method2347(arg5, arg4, arg3);
                        if (!(var14 instanceof class397)) {
                            class55.method475(arg5, arg4, arg3);
                        } else {
                            ((class397) var14).field5635 = null;
                        }
                        if (~var9.field3883 == -2) {
                            arg2.method1121(true, arg3, arg4);
                            return;
                        }
                    }
                    return;
                }
                class468 var15 = class500.method2921(arg5, arg4, arg3);
                if (!(var15 instanceof class72)) {
                    class468.method2775(arg5, arg4, arg3);
                } else {
                    ((class72) var15).field1179 = null;
                }
                if (~var9.field3883 != -1) {
                    arg2.method1123(var11, arg1 ^ 14, arg3, !var9.field3933, var10, var9.field3908, arg4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILue;IBIIIILqa;I)V")
    public final void method2554(int arg0, int arg1, class159 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class167 arg9, int arg10) {
        ++field6199;
        if (class220.field3371.method1048(class74.field1211, -114) || class380.method2312(arg3, arg5, arg10, (byte) -85, class10.field95)) {
            if (~this.field6203 < ~arg0) {
                this.field6203 = arg0;
            }
            class261 var12 = class277.field4139.method569((byte) 110, arg1);
            if (!arg9.method329() || !class220.field3371.field2583 || !var12.field3870) {
                int var13;
                int var14;
                if (~arg6 != -2 && ~arg6 != -4) {
                    var13 = var12.field3859;
                    var14 = var12.field3864;
                } else {
                    var14 = var12.field3859;
                    var13 = var12.field3864;
                }
                int var15;
                int var16;
                if (~(arg3 + var14) >= ~super.field6002) {
                    var15 = arg3 - -(var14 >> 1);
                    var16 = (var14 + 1 >> 1) + arg3;
                } else {
                    var16 = arg3 + 1;
                    var15 = arg3;
                }
                int var17;
                int var18;
                if (~(arg10 + var13) < ~super.field6001) {
                    var17 = arg10 - -1;
                    var18 = arg10;
                } else {
                    var17 = (var13 + 1 >> 1) + arg10;
                    var18 = (var13 >> 1) + arg10;
                }
                class24 var19 = class146.field2262[arg5];
                int var20 = var19.method156(var15, var18) - (-var19.method156(var16, var18) + (-var19.method156(var15, var17) - var19.method156(var16, var17))) >> 2;
                int var21 = (arg3 << 7) + (var14 << 6);
                int var22 = (arg10 << 7) - -(var13 << 6);
                boolean var23 = class494.field7146 && !super.field6006 && var12.field3858;
                if (var12.method1688((byte) -120)) {
                    class332.method2105(81, arg3, arg0, (class279) null, arg6, arg10, var12, (class510) null);
                }
                boolean var24 = arg8 == -1 && ~var12.field3932 == 0 && var12.field3849 == null && var12.field3926 == null && !var12.field3869;
                if (!class307.field4546 || (!class498.method2920(28407, arg7) || var12.field3923 == 1) && (!class494.method2905(126, arg7) || ~var12.field3923 != -1)) {
                    if (~arg7 == -23) {
                        if (class220.field3371.field2577 || var12.field3872 != 0 || var12.field3883 == 1 || var12.field3871) {
                            class108 var25;
                            if (!var24) {
                                var25 = new class257(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg6, arg8);
                            } else {
                                class238 var26 = new class238(arg9, var12, arg5, var21, var20, var22, super.field6006, arg6, var23);
                                var25 = var26;
                                if (var26.method547(31)) {
                                    var26.method551(arg9, 106);
                                }
                            }
                            class108 var27 = class388.method2347(arg0, arg3, arg10);
                            if (!(var27 instanceof class397)) {
                                class409.method2432(arg0, arg3, arg10, var25);
                            } else {
                                ((class397) var27).field5635 = var25;
                            }
                            if (var12.field3883 == 1 && arg2 != null) {
                                arg2.method1124(arg3, 40, arg10);
                            }
                        }
                    } else if (arg7 != 10 && arg7 != 11) {
                        if ((~arg7 > -13 || arg7 > 17) && (arg7 < 18 || arg7 > 21)) {
                            if (~arg7 == -1) {
                                int var31 = var12.field3923;
                                if (class476.field6938 && var12.field3923 == -1) {
                                    var31 = 1;
                                }
                                class468 var33;
                                if (var24) {
                                    class403 var32 = new class403(arg9, var12, arg5, var21, var20, var22, super.field6006, arg7, arg6, var23);
                                    if (var32.method547(-126)) {
                                        var32.method551(arg9, 108);
                                    }
                                    var33 = var32;
                                } else {
                                    var33 = new class347(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg7, arg6, arg8);
                                }
                                class468 var34 = class500.method2921(arg0, arg3, arg10);
                                if (!(var34 instanceof class72)) {
                                    class121.method898(arg0, arg3, arg10, var33, (class468) null);
                                } else {
                                    ((class72) var34).field1179 = var33;
                                }
                                if (class494.field7146) {
                                    if (~arg6 != -1) {
                                        if (arg6 != 1) {
                                            if (arg6 != 2) {
                                                if (arg6 == 3) {
                                                    if (var12.field3889) {
                                                        var19.method149(arg3, arg10, 50);
                                                        var19.method149(arg3 - -1, arg10, 50);
                                                    }
                                                    if (~var31 == -2 && !super.field6006) {
                                                        super.field6009[arg0][arg3][arg10] = (byte) class442.method2600(super.field6009[arg0][arg3][arg10], 2);
                                                    }
                                                }
                                            } else {
                                                if (var12.field3889) {
                                                    var19.method149(arg3 + 1, arg10, 50);
                                                    var19.method149(arg3 + 1, arg10 - -1, 50);
                                                }
                                                if (var31 == 1 && !super.field6006) {
                                                    super.field6009[arg0][arg3 - -1][arg10] = (byte) class442.method2600(super.field6009[arg0][arg3 - -1][arg10], 1);
                                                }
                                            }
                                        } else {
                                            if (var12.field3889) {
                                                var19.method149(arg3, arg10 + 1, 50);
                                                var19.method149(arg3 + 1, arg10 + 1, 50);
                                            }
                                            if (var31 == 1 && !super.field6006) {
                                                super.field6009[arg0][arg3][arg10 + 1] = (byte) class442.method2600(super.field6009[arg0][arg3][arg10 + 1], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field3889) {
                                            var19.method149(arg3, arg10, 50);
                                            var19.method149(arg3, arg10 + 1, 50);
                                        }
                                        if (var31 == 1 && !super.field6006) {
                                            super.field6009[arg0][arg3][arg10] = (byte) class442.method2600(super.field6009[arg0][arg3][arg10], 1);
                                        }
                                    }
                                }
                                if (var12.field3883 != 0 && arg2 != null) {
                                    arg2.method1117(!var12.field3933, arg3, arg7, arg10, var12.field3908, arg6, 2883848);
                                }
                                if (var12.field3940 != 16) {
                                    class434.method2567(arg0, arg3, arg10, var12.field3940);
                                }
                            } else if (arg7 == 1) {
                                class468 var35;
                                if (!var24) {
                                    var35 = new class347(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg7, arg6, arg8);
                                } else {
                                    class403 var36 = new class403(arg9, var12, arg5, var21, var20, var22, super.field6006, arg7, arg6, var23);
                                    if (var36.method547(-16)) {
                                        var36.method551(arg9, 114);
                                    }
                                    var35 = var36;
                                }
                                class468 var37 = class500.method2921(arg0, arg3, arg10);
                                if (var37 instanceof class72) {
                                    ((class72) var37).field1179 = var35;
                                } else {
                                    class121.method898(arg0, arg3, arg10, var35, (class468) null);
                                }
                                if (var12.field3889 && class494.field7146) {
                                    if (arg6 == 0) {
                                        var19.method149(arg3, arg10 + 1, 50);
                                    } else if (~arg6 == -2) {
                                        var19.method149(arg3 + 1, arg10 + 1, 50);
                                    } else if (arg6 == 2) {
                                        var19.method149(arg3 + 1, arg10, 50);
                                    } else if (~arg6 == -4) {
                                        var19.method149(arg3, arg10, 50);
                                    }
                                }
                                if (~var12.field3883 != -1 && arg2 != null) {
                                    arg2.method1117(!var12.field3933, arg3, arg7, arg10, var12.field3908, arg6, 2883848);
                                }
                            } else if (~arg7 == -3) {
                                int var38 = arg6 + 1 & 3;
                                class468 var41;
                                class468 var42;
                                if (var24) {
                                    class403 var39 = new class403(arg9, var12, arg5, var21, var20, var22, super.field6006, arg7, arg6 + 4, var23);
                                    class403 var40 = new class403(arg9, var12, arg5, var21, var20, var22, super.field6006, arg7, var38, var23);
                                    if (var39.method547(8)) {
                                        var39.method551(arg9, 113);
                                    }
                                    var41 = var40;
                                    if (var40.method547(104)) {
                                        var40.method551(arg9, 115);
                                    }
                                    var42 = var39;
                                } else {
                                    var42 = new class347(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg7, arg6 + 4, arg8);
                                    var41 = new class347(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg7, var38, arg8);
                                }
                                class121.method898(arg0, arg3, arg10, var42, var41);
                                if (~var12.field3923 == -2 && class494.field7146 && !super.field6006) {
                                    if (~arg6 == -1) {
                                        super.field6009[arg0][arg3][arg10] = (byte) class442.method2600(super.field6009[arg0][arg3][arg10], 1);
                                        super.field6009[arg0][arg3][arg10 - -1] = (byte) class442.method2600(super.field6009[arg0][arg3][arg10 - -1], 2);
                                    } else if (arg6 == 1) {
                                        super.field6009[arg0][arg3][arg10 - -1] = (byte) class442.method2600(super.field6009[arg0][arg3][arg10 - -1], 2);
                                        super.field6009[arg0][arg3 + 1][arg10] = (byte) class442.method2600(super.field6009[arg0][arg3 + 1][arg10], 1);
                                    } else if (~arg6 == -3) {
                                        super.field6009[arg0][arg3 + 1][arg10] = (byte) class442.method2600(super.field6009[arg0][arg3 + 1][arg10], 1);
                                        super.field6009[arg0][arg3][arg10] = (byte) class442.method2600(super.field6009[arg0][arg3][arg10], 2);
                                    } else if (arg6 == 3) {
                                        super.field6009[arg0][arg3][arg10] = (byte) class442.method2600(super.field6009[arg0][arg3][arg10], 2);
                                        super.field6009[arg0][arg3][arg10] = (byte) class442.method2600(super.field6009[arg0][arg3][arg10], 1);
                                    }
                                }
                                if (var12.field3883 != 0 && arg2 != null) {
                                    arg2.method1117(!var12.field3933, arg3, arg7, arg10, var12.field3908, arg6, 2883848);
                                }
                                if (var12.field3940 != 16) {
                                    class434.method2567(arg0, arg3, arg10, var12.field3940);
                                }
                            } else if (~arg7 == -4) {
                                class468 var43;
                                if (!var24) {
                                    var43 = new class347(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg7, arg6, arg8);
                                } else {
                                    class403 var44 = new class403(arg9, var12, arg5, var21, var20, var22, super.field6006, arg7, arg6, var23);
                                    var43 = var44;
                                    if (var44.method547(-116)) {
                                        var44.method551(arg9, 69);
                                    }
                                }
                                class468 var45 = class500.method2921(arg0, arg3, arg10);
                                if (!(var45 instanceof class72)) {
                                    class121.method898(arg0, arg3, arg10, var43, (class468) null);
                                } else {
                                    ((class72) var45).field1179 = var43;
                                }
                                if (var12.field3889 && class494.field7146) {
                                    if (arg6 != 0) {
                                        if (~arg6 == -2) {
                                            var19.method149(arg3 + 1, arg10 + 1, 50);
                                        } else if (~arg6 == -3) {
                                            var19.method149(arg3 + 1, arg10, 50);
                                        } else if (~arg6 == -4) {
                                            var19.method149(arg3, arg10, 50);
                                        }
                                    } else {
                                        var19.method149(arg3, arg10 + 1, 50);
                                    }
                                }
                                if (~var12.field3883 != -1 && arg2 != null) {
                                    arg2.method1117(!var12.field3933, arg3, arg7, arg10, var12.field3908, arg6, 2883848);
                                }
                            } else if (~arg7 == -10) {
                                class478 var46;
                                if (!var24) {
                                    var46 = new class444(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg3, var14 - 1 + arg3, arg10, arg10 + var13 + -1, arg7, arg6, arg8);
                                } else {
                                    class497 var47 = new class497(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg3, arg3, arg10, arg10, arg7, arg6, var23);
                                    if (var47.method547(-115)) {
                                        var47.method551(arg9, 83);
                                    }
                                    var46 = var47;
                                }
                                class478 var48 = class413.method2470(arg0, arg3, arg10, field6204 != null ? field6204 : (field6204 = method2562("wo")));
                                if (var48 instanceof class446 && var48.field6971 == arg3 && var48.field6962 == arg10) {
                                    ((class446) var48).field6367 = var46;
                                } else {
                                    class501.method2930(var46, false);
                                }
                                if (~var12.field3883 != -1 && arg2 != null) {
                                    arg2.method1110(var12.field3908, var14, arg3, !var12.field3933, var13, (byte) -110, arg10);
                                }
                                if (~var12.field3940 != -17) {
                                    class434.method2567(arg0, arg3, arg10, var12.field3940);
                                }
                            } else if (arg7 == 4) {
                                class469 var50;
                                if (var24) {
                                    class123 var49 = new class123(arg9, var12, arg5, var21, var20, var22, super.field6006, 0, 0, 0, arg7, arg6);
                                    if (var49.method547(125)) {
                                        var49.method551(arg9, 117);
                                    }
                                    var50 = var49;
                                } else {
                                    var50 = new class146(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, 0, 0, 0, arg7, arg6, arg8);
                                }
                                class469 var51 = class415.method2475(arg0, arg3, arg10);
                                if (var51 instanceof class533) {
                                    ((class533) var51).field7863 = var50;
                                } else {
                                    class502.method2931(arg0, arg3, arg10, var50, (class469) null);
                                }
                            } else if (~arg7 == -6) {
                                int var52 = 17;
                                class534 var53 = (class534) class500.method2921(arg0, arg3, arg10);
                                if (var53 != null) {
                                    var52 = 1 + class277.field4139.method569((byte) 112, var53.method561((byte) -85)).field3940;
                                }
                                class469 var55;
                                if (var24) {
                                    class123 var54 = new class123(arg9, var12, arg5, var21, var20, var22, super.field6006, 0, class500.field7232[arg6] * var52, class140.field2174[arg6] * var52, arg7, arg6);
                                    var55 = var54;
                                    if (var54.method547(-114)) {
                                        var54.method551(arg9, 126);
                                    }
                                } else {
                                    var55 = new class146(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, 0, class500.field7232[arg6] * var52, class140.field2174[arg6] * var52, arg7, arg6, arg8);
                                }
                                class469 var56 = class415.method2475(arg0, arg3, arg10);
                                if (!(var56 instanceof class533)) {
                                    class502.method2931(arg0, arg3, arg10, var55, (class469) null);
                                } else {
                                    ((class533) var56).field7863 = var55;
                                }
                            } else if (arg7 == 6) {
                                int var57 = 9;
                                class534 var58 = (class534) class500.method2921(arg0, arg3, arg10);
                                if (var58 != null) {
                                    var57 = class277.field4139.method569((byte) 69, var58.method561((byte) -85)).field3940 / 2 + 1;
                                }
                                class469 var60;
                                if (var24) {
                                    class123 var59 = new class123(arg9, var12, arg5, var21, var20, var22, super.field6006, arg6, class500.field7232[arg6] * var57, class140.field2174[arg6] * var57, arg7, arg6 + 4);
                                    var60 = var59;
                                    if (var59.method547(6)) {
                                        var59.method551(arg9, 126);
                                    }
                                } else {
                                    var60 = new class146(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg6, class7.field47[arg6] * var57, class541.field7960[arg6] * var57, arg7, arg6 - -4, arg8);
                                }
                                class469 var61 = class415.method2475(arg0, arg3, arg10);
                                if (!(var61 instanceof class533)) {
                                    class502.method2931(arg0, arg3, arg10, var60, (class469) null);
                                } else {
                                    ((class533) var61).field7863 = var60;
                                }
                            } else if (~arg7 == -8) {
                                int var62 = 3 & arg6 + 2;
                                class469 var63;
                                if (!var24) {
                                    var63 = new class146(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, var62, 0, 0, arg7, var62 + 4, arg8);
                                } else {
                                    class123 var64 = new class123(arg9, var12, arg5, var21, var20, var22, super.field6006, var62, 0, 0, arg7, var62 + 4);
                                    if (var64.method547(-115)) {
                                        var64.method551(arg9, 94);
                                    }
                                    var63 = var64;
                                }
                                class469 var65 = class415.method2475(arg0, arg3, arg10);
                                if (var65 instanceof class533) {
                                    ((class533) var65).field7863 = var63;
                                } else {
                                    class502.method2931(arg0, arg3, arg10, var63, (class469) null);
                                }
                            } else {
                                if (arg4 >= -50) {
                                    field6188 = -111;
                                }
                                if (arg7 == 8) {
                                    int var66 = arg6 + 2 & 3;
                                    int var67 = 9;
                                    class534 var68 = (class534) class500.method2921(arg0, arg3, arg10);
                                    if (var68 != null) {
                                        var67 = class277.field4139.method569((byte) 97, var68.method561((byte) -85)).field3940 / 2 - -1;
                                    }
                                    class469 var71;
                                    class469 var72;
                                    if (var24) {
                                        class123 var69 = new class123(arg9, var12, arg5, var21, var20, var22, super.field6006, arg6, class7.field47[arg6] * var67, class541.field7960[arg6] * var67, arg7, arg6 - -4);
                                        class123 var70 = new class123(arg9, var12, arg5, var21, var20, var22, super.field6006, arg6, 0, 0, arg7, var66 + 4);
                                        if (var69.method547(-27)) {
                                            var69.method551(arg9, 123);
                                        }
                                        var71 = var69;
                                        var72 = var70;
                                        if (var70.method547(-126)) {
                                            var70.method551(arg9, 87);
                                        }
                                    } else {
                                        class146 var73 = new class146(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg6, class7.field47[arg6] * var67, class541.field7960[arg6] * var67, arg7, arg6 + 4, arg8);
                                        var71 = var73;
                                        class146 var74 = new class146(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg6, 0, 0, arg7, var66 - -4, arg8);
                                        var72 = var74;
                                    }
                                    class502.method2931(arg0, arg3, arg10, var71, var72);
                                }
                            }
                        } else {
                            class478 var28;
                            if (!var24) {
                                var28 = new class444(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg3, var14 + -1 + arg3, arg10, arg10 + var13 + -1, arg7, arg6, arg8);
                            } else {
                                class497 var29 = new class497(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg3, var14 + -1 + arg3, arg10, var13 + -1 + arg10, arg7, arg6, var23);
                                var28 = var29;
                                if (var29.method547(90)) {
                                    var29.method551(arg9, 126);
                                }
                            }
                            class478 var30 = class413.method2470(arg0, arg3, arg10, field6204 != null ? field6204 : (field6204 = method2562("wo")));
                            if (var30 instanceof class446 && var30.field6971 == arg3 && var30.field6962 == arg10) {
                                ((class446) var30).field6367 = var28;
                            } else {
                                class501.method2930(var28, false);
                            }
                            if (class494.field7146 && !super.field6006 && ~arg7 <= -13 && arg7 <= 17 && arg7 != 13 && arg0 > 0 && ~var12.field3923 != -1) {
                                super.field6009[arg0][arg3][arg10] = (byte) class442.method2600(super.field6009[arg0][arg3][arg10], 4);
                            }
                            if (~var12.field3883 != -1 && arg2 != null) {
                                arg2.method1110(var12.field3908, var14, arg3, !var12.field3933, var13, (byte) -99, arg10);
                            }
                        }
                    } else {
                        class497 var75 = null;
                        int var76;
                        class478 var77;
                        if (!var24) {
                            var76 = 15;
                            var77 = new class444(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg3, arg3 + var14 - 1, arg10, arg10 + var13 + -1, arg7, arg6, arg8);
                        } else {
                            class497 var78 = new class497(arg9, var12, arg0, arg5, var21, var20, var22, super.field6006, arg3, arg3 + var14 + -1, arg10, arg10 - -var13 - 1, arg7, arg6, var23);
                            var76 = var78.method2915((byte) -51);
                            var75 = var78;
                            var77 = var78;
                        }
                        class478 var79 = class413.method2470(arg0, arg3, arg10, field6204 != null ? field6204 : (field6204 = method2562("wo")));
                        boolean var80 = false;
                        if (var79 instanceof class446 && ~var79.field6971 == ~arg3 && var79.field6962 == arg10) {
                            var80 = true;
                            ((class446) var79).field6367 = var77;
                        }
                        if (var80 || class501.method2930(var77, false)) {
                            if (var75 != null && var75.method547(23)) {
                                var75.method551(arg9, 123);
                            }
                            if (var12.field3889 && class494.field7146) {
                                if (var76 > 30) {
                                    var76 = 30;
                                }
                                for (int var81 = 0; var81 <= var14; ++var81) {
                                    for (int var82 = 0; ~var82 >= ~var13; ++var82) {
                                        var19.method149(arg3 - -var81, arg10 - -var82, var76);
                                    }
                                }
                            }
                        }
                        if (~var12.field3883 != -1 && arg2 != null) {
                            arg2.method1110(var12.field3908, var14, arg3, !var12.field3933, var13, (byte) -117, arg10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([IILwn;ILqa;IBIIII)V")
    public final void method2555(int[] arg0, int arg1, class519 arg2, int arg3, class167 arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg6 != -39) {
            field6191 = null;
        }
        ++field6200;
        if (!super.field6006) {
            boolean var12 = false;
            if (arg0 != null) {
                arg0[0] = -1;
            }
            class414 var13 = null;
            int var14 = (arg9 & 7) * 8;
            int var15 = (7 & arg7) * 8;
            while (true) {
                while (true) {
                    while (true) {
                        while (~arg2.field7545.length < ~arg2.field7558) {
                            int var20 = arg2.method3072((byte) -125);
                            if (var20 != 0) {
                                if (~var20 != -2) {
                                    if (~var20 == -3) {
                                        if (var13 == null) {
                                            var13 = new class414();
                                        }
                                        var13.method2473(101, arg2);
                                    } else if (~var20 == -129) {
                                        if (arg0 != null) {
                                            arg0[0] = arg2.method3018(class288.method1845(arg6, -566990879));
                                            arg0[1] = arg2.method3044((byte) -102);
                                            arg0[2] = arg2.method3044((byte) -107);
                                            arg0[3] = arg2.method3044((byte) -98);
                                            arg0[4] = arg2.method3018(566990904);
                                        } else {
                                            arg2.field7558 += 10;
                                        }
                                    } else {
                                        if (var20 != 129) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field6012 == null) {
                                            super.field6012 = new byte[4][][];
                                        }
                                        for (int var21 = 0; ~var21 > -5; ++var21) {
                                            byte var22 = arg2.method3034((byte) 101);
                                            if (var22 == 0 && super.field6012[arg8] != null) {
                                                if (~var21 >= ~arg5) {
                                                    int var23 = arg10;
                                                    int var24 = arg10 + 7;
                                                    int var25 = arg1;
                                                    if (~arg1 <= -1) {
                                                        if (arg1 >= super.field6001) {
                                                            var25 = super.field6001;
                                                        }
                                                    } else {
                                                        var25 = 0;
                                                    }
                                                    if (~var24 <= -1) {
                                                        if (super.field6002 <= var24) {
                                                            var24 = super.field6002;
                                                        }
                                                    } else {
                                                        var24 = 0;
                                                    }
                                                    int var26 = arg1 + 7;
                                                    if (~arg10 > -1) {
                                                        var23 = 0;
                                                    } else if (arg10 >= super.field6002) {
                                                        var23 = super.field6002;
                                                    }
                                                    if (~var26 > -1) {
                                                        var26 = 0;
                                                    } else if (var26 >= super.field6001) {
                                                        var26 = super.field6001;
                                                    }
                                                    while (var23 < var24) {
                                                        while (var26 > var25) {
                                                            super.field6012[arg8][var23][var25] = 0;
                                                            ++var25;
                                                        }
                                                        ++var23;
                                                    }
                                                }
                                            } else if (var22 == 1) {
                                                if (super.field6012[arg8] == null) {
                                                    super.field6012[arg8] = new byte[super.field6002 + 1][super.field6001 - -1];
                                                }
                                                for (int var27 = 0; var27 < 64; var27 += 4) {
                                                    for (int var28 = 0; var28 < 64; var28 += 4) {
                                                        byte var29 = arg2.method3034((byte) 96);
                                                        if (var21 <= arg5) {
                                                            for (int var30 = var27; var27 + 4 > var30; ++var30) {
                                                                for (int var31 = var28; ~var31 > ~(var28 + 4); ++var31) {
                                                                    if (var14 <= var30 && var14 + 8 > var30 && ~var31 <= ~var15 && var15 + 8 > var15) {
                                                                        int var32 = class538.method3168(arg3, 7 & var30, var31 & 7, (byte) -93) + arg10;
                                                                        int var33 = arg1 - -class127.method942(7 & var31, 103, arg3, 7 & var30);
                                                                        if (~var32 <= -1 && super.field6002 > var32 && ~var33 <= -1 && ~super.field6001 < ~var33) {
                                                                            super.field6012[arg8][var32][var33] = var29;
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
                                    int var34 = arg2.method3072((byte) -121);
                                    if (~var34 < -1) {
                                        for (int var35 = 0; ~var34 < ~var35; ++var35) {
                                            class130 var36 = new class130(arg4, arg2, 0);
                                            if (var36.field2027 == 31) {
                                                class299 var37 = class163.field2468.method2419(2, arg2.method3018(566990904));
                                                var36.method962(var37.field4458, var37.field4456, var37.field4464, var37.field4465, (byte) -47);
                                            }
                                            if (arg4.method303() > 0) {
                                                class369 var38 = var36.field2038;
                                                int var39 = var38.method2264((byte) -119) >> 7;
                                                int var40 = var38.method2261((byte) 96) >> 7;
                                                if (var36.field2028 == arg5 && var39 >= var14 && var39 < var14 + 8 && ~var40 <= ~var15 && ~var40 > ~(var15 + 8)) {
                                                    int var41 = class486.method2866(42, arg3, var38.method2261((byte) 96) & 1023, 1023 & var38.method2264((byte) -107)) + (arg10 << 7);
                                                    int var42 = (arg1 << 7) + class363.method2240(var38.method2261((byte) 96) & 1023, var38.method2264((byte) -61) & 1023, arg3, 2048);
                                                    int var43 = var41 >> 7;
                                                    int var44 = var42 >> 7;
                                                    if (~var43 <= -1 && ~var44 <= -1 && ~var43 > ~super.field6002 && ~var44 > ~super.field6001) {
                                                        var38.method1507((byte) 111, var42, var41, super.field6029[arg5][var43][var44] - var38.method2262(6));
                                                        class526.method3119(var36);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var13 = new class414(arg2);
                            }
                        }
                        if (var13 != null) {
                            class541.method3179(var13, (byte) -128, arg1 >> 3, arg10 >> 3);
                        }
                        if (!var12 && super.field6012 != null && super.field6012[arg8] != null) {
                            int var16 = arg10 + 7;
                            int var17 = arg1 - -7;
                            for (int var18 = arg10; ~var18 > ~var16; ++var18) {
                                for (int var19 = arg1; ~var19 > ~var17; ++var19) {
                                    super.field6012[arg8][var18][var19] = 0;
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

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lqa;I)V")
    public final void method2556(class167 arg0, int arg1) {
        ++field6202;
        class512.method2994(arg0);
        if (arg1 <= 14) {
            field6195 = -23;
        }
        if (~super.field6023 < -2) {
            for (int var3 = 0; ~super.field6002 < ~var3; ++var3) {
                for (int var4 = 0; ~super.field6001 < ~var4; ++var4) {
                    if ((2 & class234.field3497[1][var3][var4]) == 2) {
                        class372.method2278(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; super.field6023 > var5; ++var5) {
            for (int var6 = 0; var6 <= super.field6001; ++var6) {
                for (int var7 = 0; ~super.field6002 <= ~var7; ++var7) {
                    if (~(super.field6009[var5][var7][var6] & 1) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        while (var8 > 0 && ~(super.field6009[var5][var7][var8 - 1] & 1) != -1) {
                            --var8;
                        }
                        while (~var9 > ~super.field6001 && (super.field6009[var5][var7][var9 + 1] & 1) != 0) {
                            ++var9;
                        }
                        int var11 = var5;
                        label169: while (~var10 < -1) {
                            for (int var12 = var8; ~var9 <= ~var12; ++var12) {
                                if ((1 & super.field6009[var10 + -1][var7][var12]) == 0) {
                                    break label169;
                                }
                            }
                            --var10;
                        }
                        label158: while (~var11 > -4) {
                            for (int var13 = var8; ~var9 <= ~var13; ++var13) {
                                if (~(super.field6009[var11 - -1][var7][var13] & 1) == -1) {
                                    break label158;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + var9 + 1) * (-var10 + 1 + var11);
                        if (~var14 <= -3) {
                            short var15 = 240;
                            int var16 = super.field6029[var11][var7][var8] + -var15;
                            int var17 = super.field6029[var10][var7][var8];
                            class27.method161(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) - -128, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; ~var9 <= ~var19; ++var19) {
                                    super.field6009[var18][var7][var19] = (byte) class168.method1203(super.field6009[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(2 & super.field6009[var5][var7][var6]) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        int var23 = var5;
                        while (var21 < super.field6002 && (2 & super.field6009[var5][var21 - -1][var6]) != 0) {
                            ++var21;
                        }
                        while (~var20 < -1 && ~(super.field6009[var5][var20 - 1][var6] & 2) != -1) {
                            --var20;
                        }
                        label223: while (~var22 < -1) {
                            for (int var24 = var20; ~var21 <= ~var24; ++var24) {
                                if (~(2 & super.field6009[var22 + -1][var24][var6]) == -1) {
                                    break label223;
                                }
                            }
                            --var22;
                        }
                        label212: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; ++var25) {
                                if ((2 & super.field6009[var23 + 1][var25][var6]) == 0) {
                                    break label212;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var21 - var20 - -1) * (var23 + 1 + -var22);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = super.field6029[var23][var20][var6] + -var27;
                            int var29 = super.field6029[var22][var20][var6];
                            class27.method161(2, var20 << 7, (var21 << 7) + 128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                for (int var31 = var20; var31 <= var21; ++var31) {
                                    super.field6009[var30][var31][var6] = (byte) class168.method1203(super.field6009[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(4 & super.field6009[var5][var7][var6]) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34 = var6;
                        int var35 = var6;
                        while (~var34 < -1 && ~(super.field6009[var5][var7][var34 + -1] & 4) != -1) {
                            --var34;
                        }
                        while (~var35 > ~super.field6001 && (4 & super.field6009[var5][var7][var35 - -1]) != 0) {
                            ++var35;
                        }
                        label276: while (~var32 < -1) {
                            for (int var36 = var34; var36 <= var35; ++var36) {
                                if (~(super.field6009[var5][var32 + -1][var36] & 4) == -1) {
                                    break label276;
                                }
                            }
                            --var32;
                        }
                        label265: while (~var33 > ~super.field6002) {
                            for (int var37 = var34; var37 <= var35; ++var37) {
                                if (~(super.field6009[var5][var33 + 1][var37] & 4) == -1) {
                                    break label265;
                                }
                            }
                            ++var33;
                        }
                        if ((var33 + 1 + -var32) * (var35 + 1 + -var34) >= 4) {
                            int var38 = super.field6029[var5][var32][var34];
                            class27.method161(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) - -128, var38, var38);
                            for (int var39 = var32; var39 <= var33; ++var39) {
                                for (int var40 = var34; var40 <= var35; ++var40) {
                                    super.field6009[var5][var39][var40] = (byte) class168.method1203(super.field6009[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field6009 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2557(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field6195 = 14;
        }
        ++field6189;
        return ~(arg2 & 256) != -1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lqa;IIII[BI[Lue;III)V")
    public final void method2558(class167 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, class159[] arg7, int arg8, int arg9, int arg10) {
        ++field6192;
        if (arg10 != -1978681722) {
            field6188 = -115;
        }
        class519 var12 = new class519(arg5);
        int var13 = -1;
        while (true) {
            int var14 = var12.method3078(32767);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method3033(arg10 ^ -1978689400);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4094 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method3072((byte) -121);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg1 == ~var19 && arg4 <= var18 && var18 < arg4 + 8 && ~var17 <= ~arg8 && ~(arg8 + 8) < ~var17) {
                    class261 var23 = class277.field4139.method569((byte) 104, var13);
                    int var24 = class179.method1246(var22, var23.field3864, arg3, 7 & var18, var23.field3859, var17 & 7, (byte) 82) + arg6;
                    int var25 = class352.method2209(var23.field3859, var17 & 7, 1, var22, arg3, var23.field3864, 7 & var18) + arg2;
                    if (var24 > 0 && var25 > 0 && ~(super.field6002 + -1) < ~var24 && ~(super.field6001 + -1) < ~var25) {
                        class159 var26 = null;
                        if (!super.field6006) {
                            int var27 = arg9;
                            if ((class234.field3497[1][var24][var25] & 2) == 2) {
                                var27 = arg9 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg7[var27];
                            }
                        }
                        this.method2554(arg9, var13, var26, var24, (byte) -65, arg9, arg3 + var22 & 3, var21, -1, arg0, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[BI[Lue;Lqa;I)V")
    public final void method2559(int arg0, byte[] arg1, int arg2, class159[] arg3, class167 arg4, int arg5) {
        ++field6201;
        class519 var7 = new class519(arg1);
        if (arg5 != -31596) {
            this.method2555((int[]) null, -88, (class519) null, -5, (class167) null, -12, (byte) 0, -22, -23, -90, 33);
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method3078(32767);
            if (~var9 == -1) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method3033(11790);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = 63 & var10;
                int var13 = (4032 & var10) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method3072((byte) -122);
                int var16 = var15 >> 2;
                int var17 = var15 & 3;
                int var18 = arg2 + var13;
                int var19 = var12 - -arg0;
                if (~var18 < -1 && var19 > 0 && var18 < super.field6002 + -1 && super.field6001 + -1 > var19) {
                    class159 var20 = null;
                    if (!super.field6006) {
                        int var21 = var14;
                        if (~(class234.field3497[1][var18][var19] & 2) == -3) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg3[var21];
                        }
                    }
                    this.method2554(var14, var8, var20, var18, (byte) -57, var14, var17, var16, -1, arg4, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method2560(byte arg0) {
        field6191 = null;
        int var1 = -112 / ((-19 - arg0) / 49);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[IILqa;ILwn;)V")
    public final void method2561(int arg0, int[] arg1, int arg2, class167 arg3, int arg4, class519 arg5) {
        ++field6190;
        if (!super.field6006) {
            boolean var7 = false;
            if (arg1 != null) {
                arg1[0] = -1;
            }
            class414 var8 = null;
            while (true) {
                int var19;
                label314: do {
                    while (true) {
                        while (arg5.field7545.length > arg5.field7558) {
                            int var18 = arg5.method3072((byte) -121);
                            if (var18 != 0) {
                                if (~var18 == -2) {
                                    var19 = arg5.method3072((byte) -123);
                                    continue label314;
                                }
                                if (~var18 == -3) {
                                    if (var8 == null) {
                                        var8 = new class414();
                                    }
                                    var8.method2473(119, arg5);
                                } else if (~var18 == -129) {
                                    if (arg1 == null) {
                                        arg5.field7558 += 10;
                                    } else {
                                        arg1[0] = arg5.method3018(566990904);
                                        arg1[1] = arg5.method3044((byte) -125);
                                        arg1[2] = arg5.method3044((byte) -126);
                                        arg1[3] = arg5.method3044((byte) -87);
                                        arg1[4] = arg5.method3018(566990904);
                                    }
                                } else {
                                    if (~var18 != -130) {
                                        throw new IllegalStateException("");
                                    }
                                    if (super.field6012 == null) {
                                        super.field6012 = new byte[4][][];
                                    }
                                    var7 = true;
                                    for (int var28 = 0; var28 < 4; ++var28) {
                                        byte var29 = arg5.method3034((byte) -80);
                                        if (var29 == 0 && super.field6012[var28] != null) {
                                            int var30 = arg0;
                                            int var31 = arg0 + 64;
                                            int var32 = arg4;
                                            if (var31 < 0) {
                                                var31 = 0;
                                            } else if (var31 >= super.field6002) {
                                                var31 = super.field6002;
                                            }
                                            if (~arg0 <= -1) {
                                                if (arg0 >= super.field6002) {
                                                    var30 = super.field6002;
                                                }
                                            } else {
                                                var30 = 0;
                                            }
                                            int var33 = arg4 + 64;
                                            if (arg4 >= 0) {
                                                if (arg4 >= super.field6001) {
                                                    var32 = super.field6001;
                                                }
                                            } else {
                                                var32 = 0;
                                            }
                                            if (var33 < 0) {
                                                var33 = 0;
                                            } else if (var33 >= super.field6001) {
                                                var33 = super.field6001;
                                            }
                                            while (var31 > var30) {
                                                while (~var32 > ~var33) {
                                                    super.field6012[var28][var30][var32] = 0;
                                                    ++var32;
                                                }
                                                ++var30;
                                            }
                                        } else if (var29 != 1) {
                                            if (var29 == 2) {
                                                if (super.field6012[var28] == null) {
                                                    super.field6012[var28] = new byte[super.field6002 + 1][super.field6001 + 1];
                                                }
                                                if (var28 > 0) {
                                                    int var34 = arg0;
                                                    int var35 = arg0 - -64;
                                                    int var36 = arg4;
                                                    int var37 = arg4 + 64;
                                                    if (arg0 >= 0) {
                                                        if (~arg0 <= ~super.field6002) {
                                                            var34 = super.field6002;
                                                        }
                                                    } else {
                                                        var34 = 0;
                                                    }
                                                    if (~arg4 <= -1) {
                                                        if (~super.field6001 >= ~arg4) {
                                                            var36 = super.field6001;
                                                        }
                                                    } else {
                                                        var36 = 0;
                                                    }
                                                    if (var35 < 0) {
                                                        var35 = 0;
                                                    } else if (~var35 <= ~super.field6002) {
                                                        var35 = super.field6002;
                                                    }
                                                    if (~var37 <= -1) {
                                                        if (super.field6001 <= var37) {
                                                            var37 = super.field6001;
                                                        }
                                                    } else {
                                                        var37 = 0;
                                                    }
                                                    while (~var34 > ~var35) {
                                                        while (~var36 > ~var37) {
                                                            super.field6012[var28][var34][var36] = super.field6012[var28 + -1][var34][var36];
                                                            ++var36;
                                                        }
                                                        ++var34;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (super.field6012[var28] == null) {
                                                super.field6012[var28] = new byte[super.field6002 + 1][super.field6001 - -1];
                                            }
                                            for (int var38 = 0; var38 < 64; var38 += 4) {
                                                for (int var39 = 0; var39 < 64; var39 += 4) {
                                                    byte var40 = arg5.method3034((byte) 96);
                                                    for (int var41 = var38 - -arg0; var38 - -arg0 + 4 > var41; ++var41) {
                                                        for (int var42 = arg4 + var39; ~var42 > ~(arg4 + var39 + 4); ++var42) {
                                                            if (var41 >= 0 && var41 < super.field6002 && var42 >= 0 && ~var42 > ~super.field6001) {
                                                                super.field6012[var28][var41][var42] = var40;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class414(arg5);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; ~var9 > -9; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg0 >> 3) + var9;
                                    int var12 = (arg4 >> 3) + var10;
                                    if (~var11 <= -1 && ~(super.field6002 >> 3) < ~var11 && ~var12 <= -1 && ~(super.field6001 >> 3) < ~var12) {
                                        class541.method3179(var8, (byte) -90, var12, var11);
                                    }
                                }
                            }
                        }
                        if (arg2 != 0) {
                            field6195 = 42;
                        }
                        if (!var7 && super.field6012 != null) {
                            for (int var13 = 0; var13 < 4; ++var13) {
                                if (super.field6012[var13] != null) {
                                    for (int var14 = 0; var14 < 16; ++var14) {
                                        for (int var15 = 0; ~var15 > -17; ++var15) {
                                            int var16 = (arg0 >> 2) - -var14;
                                            int var17 = (arg4 >> 2) + var15;
                                            if (var16 >= 0 && var16 < 26 && var17 >= 0 && ~var17 > -27) {
                                                super.field6012[var13][var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                } while (var19 <= 0);
                for (int var20 = 0; var20 < var19; ++var20) {
                    class130 var21 = new class130(arg3, arg5, 0);
                    if (var21.field2027 == 31) {
                        class299 var22 = class163.field2468.method2419(2, arg5.method3018(arg2 + 566990904));
                        var21.method962(var22.field4458, var22.field4456, var22.field4464, var22.field4465, (byte) -47);
                    }
                    if (~arg3.method303() < -1) {
                        class369 var23 = var21.field2038;
                        int var24 = var23.method2264((byte) -105) + (arg0 << 7);
                        int var25 = (arg4 << 7) + var23.method2261((byte) 96);
                        int var26 = var24 >> 7;
                        int var27 = var25 >> 7;
                        if (var26 >= 0 && ~var27 <= -1 && ~super.field6002 < ~var26 && ~super.field6001 < ~var27) {
                            var23.method1507((byte) 96, var25, var24, super.field6029[var21.field2028][var26][var27] + -var23.method2262(6));
                            class526.method3119(var21);
                        }
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2562(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
