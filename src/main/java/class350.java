import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class350 extends class49 {

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public int field5335 = 99;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "Lsh;")
    public static class472 field5333 = new class472(45, 2);

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "Lbm;")
    public static class204 field5344 = new class204("WIP", 2);

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "Ldp;")
    public static class319 field5345;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jb", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field5346;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2166(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILre;I[ILtq;)V", line = 4)
    public final void method2156(int arg0, int arg1, class446 arg2, int arg3, int[] arg4, class63 arg5) {
        ++field5342;
        if (!super.field713) {
            boolean var7 = false;
            if (arg0 != 0) {
                method2158(119, 6, (byte[]) null);
            }
            if (arg4 != null) {
                arg4[0] = -1;
            }
            class484 var8 = null;
            while (true) {
                while (arg2.field6315 < arg2.field6316.length) {
                    int var18 = arg2.method2628(49152);
                    if (var18 == 0) {
                        var8 = new class484(arg2);
                    } else if (var18 == 1) {
                        int var34 = arg2.method2628(arg0 + 49152);
                        if (~var34 < -1) {
                            for (int var35 = 0; var35 < var34; ++var35) {
                                class212 var36 = new class212(arg2);
                                if (var36.field3184 == 31) {
                                    class197 var37 = class81.field1144.method2439(arg2.method2631(2530), 55);
                                    var36.method1427(var37.field2964, var37.field2965, var37.field2968, var37.field2970, (byte) 109);
                                }
                                var36.field3414 += arg3 << 7;
                                var36.field3413 += arg1 << 7;
                                int var38 = var36.field3414 >> 7;
                                int var39 = var36.field3413 >> 7;
                                if (~var38 <= -1 && var39 >= 0 && var38 < super.field710 && var39 < super.field700) {
                                    var36.field3416 = super.field719[var36.field3188][var38][var39] + -var36.field3416;
                                    if (~arg5.method524() < -1) {
                                        class63.method497(var36);
                                    }
                                }
                            }
                        }
                    } else if (var18 == 2) {
                        if (var8 == null) {
                            var8 = new class484();
                        }
                        var8.method2828(-76, arg2);
                    } else if (~var18 == -129) {
                        if (arg4 != null) {
                            arg4[0] = arg2.method2631(2530);
                            arg4[1] = arg2.method2634(123);
                            arg4[2] = arg2.method2634(-56);
                            arg4[3] = arg2.method2634(122);
                            arg4[4] = arg2.method2631(arg0 + 2530);
                        } else {
                            arg2.field6315 += 10;
                        }
                    } else {
                        if (~var18 != -130) {
                            throw new IllegalStateException((String) null);
                        }
                        if (super.field708 == null) {
                            super.field708 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var19 = 0; ~var19 > -5; ++var19) {
                            byte var20 = arg2.method2642(true);
                            if (~var20 == -1 && super.field708[var19] != null) {
                                int var21 = arg3;
                                int var22 = arg3 + 64;
                                int var23 = arg1;
                                if (~arg3 <= -1) {
                                    if (~super.field710 >= ~arg3) {
                                        var21 = super.field710;
                                    }
                                } else {
                                    var21 = 0;
                                }
                                if (arg1 >= 0) {
                                    if (arg1 >= super.field700) {
                                        var23 = super.field700;
                                    }
                                } else {
                                    var23 = 0;
                                }
                                if (~var22 > -1) {
                                    var22 = 0;
                                } else if (~var22 <= ~super.field710) {
                                    var22 = super.field710;
                                }
                                int var24 = arg1 + 64;
                                if (var24 >= 0) {
                                    if (var24 >= super.field700) {
                                        var24 = super.field700;
                                    }
                                } else {
                                    var24 = 0;
                                }
                                while (var21 < var22) {
                                    while (var23 < var24) {
                                        super.field708[var19][var21][var23] = 0;
                                        ++var23;
                                    }
                                    ++var21;
                                }
                            } else if (~var20 != -2) {
                                if (~var20 == -3) {
                                    if (super.field708[var19] == null) {
                                        super.field708[var19] = new byte[super.field710 + 1][super.field700 + 1];
                                    }
                                    if (var19 > 0) {
                                        int var25 = arg3;
                                        int var26 = arg3 + 64;
                                        int var27 = arg1;
                                        if (~arg1 <= -1) {
                                            if (~super.field700 >= ~arg1) {
                                                var27 = super.field700;
                                            }
                                        } else {
                                            var27 = 0;
                                        }
                                        if (var26 >= 0) {
                                            if (var26 >= super.field710) {
                                                var26 = super.field710;
                                            }
                                        } else {
                                            var26 = 0;
                                        }
                                        int var28 = arg1 + 64;
                                        if (~arg3 <= -1) {
                                            if (~arg3 <= ~super.field710) {
                                                var25 = super.field710;
                                            }
                                        } else {
                                            var25 = 0;
                                        }
                                        if (~var28 > -1) {
                                            var28 = 0;
                                        } else if (~var28 <= ~super.field700) {
                                            var28 = super.field700;
                                        }
                                        while (~var26 < ~var25) {
                                            while (~var27 > ~var28) {
                                                super.field708[var19][var25][var27] = super.field708[var19 + -1][var25][var27];
                                                ++var27;
                                            }
                                            ++var25;
                                        }
                                    }
                                }
                            } else {
                                if (super.field708[var19] == null) {
                                    super.field708[var19] = new byte[super.field710 + 1][super.field700 - -1];
                                }
                                for (int var29 = 0; var29 < 64; var29 += 4) {
                                    for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                        byte var31 = arg2.method2642(true);
                                        for (int var32 = var29 - -arg3; ~(arg3 + 4 + var29) < ~var32; ++var32) {
                                            for (int var33 = arg1 + var30; ~var33 > ~(arg1 + var30 + 4); ++var33) {
                                                if (~var32 <= -1 && ~super.field710 < ~var32 && var33 >= 0 && var33 < super.field700) {
                                                    super.field708[var19][var32][var33] = var31;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; var9 < 8; ++var9) {
                        for (int var10 = 0; ~var10 > -9; ++var10) {
                            int var11 = (arg3 >> 3) + var9;
                            int var12 = (arg1 >> 3) - -var10;
                            if (~var11 <= -1 && var11 < super.field710 >> 3 && ~var12 <= -1 && ~var12 > ~(super.field700 >> 3)) {
                                class96.method751(var11, var12, (byte) 72, var8);
                            }
                        }
                    }
                }
                if (!var7 && super.field708 != null) {
                    for (int var13 = 0; var13 < 4; ++var13) {
                        if (super.field708[var13] != null) {
                            for (int var14 = 0; ~var14 > -17; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg3 >> 2) + var14;
                                    int var17 = (arg1 >> 2) - -var15;
                                    if (~var16 <= -1 && ~var16 > -27 && ~var17 <= -1 && var17 < 26) {
                                        super.field708[var13][var16][var17] = 0;
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

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILtf;IIILtq;III)V", line = 366)
    public final void method2157(int arg0, int arg1, int arg2, class491 arg3, int arg4, int arg5, int arg6, class63 arg7, int arg8, int arg9, int arg10) {
        ++field5340;
        if (class337.field5038.method2209(class170.field2424, -76) || class103.method775(class314.field4722, arg9, arg8, arg10, 2)) {
            if (~arg10 > ~this.field5335) {
                this.field5335 = arg10;
            }
            class271 var12 = class206.field3124.method338((byte) 107, arg2);
            if (~class170.field2424 != -2 || !var12.field4063) {
                int var13;
                int var14;
                if (arg1 != 1 && ~arg1 != -4) {
                    var13 = var12.field4048;
                    var14 = var12.field4014;
                } else {
                    var14 = var12.field4048;
                    var13 = var12.field4014;
                }
                int var15;
                int var16;
                if (arg9 + var14 > super.field710) {
                    var15 = arg9 - -1;
                    var16 = arg9;
                } else {
                    var16 = (var14 >> 1) + arg9;
                    var15 = arg9 - -(var14 + 1 >> 1);
                }
                int var17;
                int var18;
                if (~super.field700 > ~(arg8 + var13)) {
                    var17 = arg8;
                    var18 = arg8 - -1;
                } else {
                    var18 = arg8 - -(var13 + 1 >> 1);
                    var17 = arg8 - -(var13 >> 1);
                }
                class48 var19 = class479.field6745[arg6];
                int var20 = var19.method199(var16, var17) + var19.method199(var15, var17) - -var19.method199(var16, var18) - -var19.method199(var15, var18) >> 2;
                int var21 = 65 / ((45 - arg0) / 33);
                int var22 = (arg9 << 7) + (var14 << 6);
                int var23 = (arg8 << 7) - -(var13 << 6);
                boolean var24 = class144.field2044 && !super.field713 && var12.field4054;
                if (var12.method1771(-15964)) {
                    class356.method2192(var12, (class257) null, arg10, (class349) null, arg1, arg8, arg9, (byte) -117);
                }
                boolean var25 = ~arg4 == 0 && ~var12.field4024 == 0 && var12.field4031 == null && var12.field4015 == null && !var12.field4034;
                if (!class485.field6817 || ~var12.field4036 == -2) {
                    if (arg5 == 22) {
                        if (class337.field5038.field3937 || ~var12.field4053 != -1 || ~var12.field4069 == -2 || var12.field4045) {
                            class47 var27;
                            if (var25) {
                                class439 var26 = new class439(arg7, var12, arg6, var22, var20, var23, super.field713, arg1, var24);
                                if (var26.method254(true)) {
                                    var26.method256((byte) 82, arg7);
                                }
                                var27 = var26;
                            } else {
                                var27 = new class29(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg1, arg4);
                            }
                            class47 var28 = class487.method2848(arg10, arg9, arg8);
                            if (var28 instanceof class109) {
                                ((class109) var28).field1527 = var27;
                            } else {
                                class100.method773(arg10, arg9, arg8, var27);
                            }
                            if (var12.field4069 == 1 && arg3 != null) {
                                arg3.method2877(arg9, 1, arg8);
                            }
                        }
                    } else if (~arg5 != -11 && arg5 != 11) {
                        if (~arg5 <= -13 && arg5 <= 17 || ~arg5 <= -19 && arg5 <= 21) {
                            class305 var29;
                            if (!var25) {
                                var29 = new class129(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg9, arg9 + var14 + -1, arg8, var13 + -1 + arg8, arg5, arg1, arg4);
                            } else {
                                class327 var30 = new class327(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg9, var14 + -1 + arg9, arg8, arg8 + -1 + var13, arg5, arg1, var24);
                                if (var30.method254(true)) {
                                    var30.method256((byte) 82, arg7);
                                }
                                var29 = var30;
                            }
                            class305 var31 = class390.method2350(arg10, arg9, arg8, field5346 != null ? field5346 : (field5346 = method2166("ki")));
                            if (var31 instanceof class307 && var31.field4542 == arg9 && ~var31.field4547 == ~arg8) {
                                ((class307) var31).field4584 = var29;
                            } else {
                                class204.method1394(var29, false);
                            }
                            if (class144.field2044 && !super.field713 && ~arg5 <= -13 && ~arg5 >= -18 && ~arg5 != -14 && arg10 > 0 && var12.field4036 != 0) {
                                super.field718[arg10][arg9][arg8] = (byte) class347.method2139(super.field718[arg10][arg9][arg8], 4);
                            }
                            if (var12.field4069 != 0 && arg3 != null) {
                                arg3.method2872(arg9, !var12.field4047, var13, false, arg8, var14, var12.field4010);
                            }
                        } else if (arg5 == 0) {
                            int var32 = var12.field4036;
                            if (class147.field2087 && var12.field4036 == -1) {
                                var32 = 1;
                            }
                            class100 var33;
                            if (!var25) {
                                var33 = new class37(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg5, arg1, arg4);
                            } else {
                                class44 var34 = new class44(arg7, var12, arg6, var22, var20, var23, super.field713, arg5, arg1, var24);
                                if (var34.method254(true)) {
                                    var34.method256((byte) 82, arg7);
                                }
                                var33 = var34;
                            }
                            class100 var35 = class147.method1006(arg10, arg9, arg8);
                            if (!(var35 instanceof class463)) {
                                class157.method1074(arg10, arg9, arg8, var33, (class100) null);
                            } else {
                                ((class463) var35).field6534 = var33;
                            }
                            if (class144.field2044) {
                                if (arg1 != 0) {
                                    if (~arg1 != -2) {
                                        if (~arg1 == -3) {
                                            if (var12.field4075) {
                                                var19.method198(arg9 + 1, arg8, 50);
                                                var19.method198(arg9 - -1, arg8 + 1, 50);
                                            }
                                            if (var32 == 1 && !super.field713) {
                                                super.field718[arg10][arg9 - -1][arg8] = (byte) class347.method2139(super.field718[arg10][arg9 - -1][arg8], 1);
                                            }
                                        } else if (~arg1 == -4) {
                                            if (var12.field4075) {
                                                var19.method198(arg9, arg8, 50);
                                                var19.method198(arg9 + 1, arg8, 50);
                                            }
                                            if (~var32 == -2 && !super.field713) {
                                                super.field718[arg10][arg9][arg8] = (byte) class347.method2139(super.field718[arg10][arg9][arg8], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field4075) {
                                            var19.method198(arg9, arg8 + 1, 50);
                                            var19.method198(arg9 + 1, arg8 - -1, 50);
                                        }
                                        if (~var32 == -2 && !super.field713) {
                                            super.field718[arg10][arg9][arg8 + 1] = (byte) class347.method2139(super.field718[arg10][arg9][arg8 + 1], 2);
                                        }
                                    }
                                } else {
                                    if (var12.field4075) {
                                        var19.method198(arg9, arg8, 50);
                                        var19.method198(arg9, arg8 + 1, 50);
                                    }
                                    if (~var32 == -2 && !super.field713) {
                                        super.field718[arg10][arg9][arg8] = (byte) class347.method2139(super.field718[arg10][arg9][arg8], 1);
                                    }
                                }
                            }
                            if (var12.field4069 != 0 && arg3 != null) {
                                arg3.method2868(var12.field4010, -114, arg9, arg5, !var12.field4047, arg8, arg1);
                            }
                            if (var12.field4026 != 16) {
                                class400.method2400(arg10, arg9, arg8, var12.field4026);
                            }
                        } else if (arg5 == 1) {
                            class100 var36;
                            if (!var25) {
                                var36 = new class37(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg5, arg1, arg4);
                            } else {
                                class44 var37 = new class44(arg7, var12, arg6, var22, var20, var23, super.field713, arg5, arg1, var24);
                                var36 = var37;
                                if (var37.method254(true)) {
                                    var37.method256((byte) 82, arg7);
                                }
                            }
                            class100 var38 = class147.method1006(arg10, arg9, arg8);
                            if (!(var38 instanceof class463)) {
                                class157.method1074(arg10, arg9, arg8, var36, (class100) null);
                            } else {
                                ((class463) var38).field6534 = var36;
                            }
                            if (var12.field4075 && class144.field2044) {
                                if (~arg1 != -1) {
                                    if (arg1 == 1) {
                                        var19.method198(arg9 + 1, arg8 + 1, 50);
                                    } else if (~arg1 == -3) {
                                        var19.method198(arg9 - -1, arg8, 50);
                                    } else if (~arg1 == -4) {
                                        var19.method198(arg9, arg8, 50);
                                    }
                                } else {
                                    var19.method198(arg9, arg8 + 1, 50);
                                }
                            }
                            if (~var12.field4069 != -1 && arg3 != null) {
                                arg3.method2868(var12.field4010, -116, arg9, arg5, !var12.field4047, arg8, arg1);
                            }
                        } else if (~arg5 == -3) {
                            int var39 = 3 & arg1 + 1;
                            class100 var42;
                            class100 var43;
                            if (var25) {
                                class44 var40 = new class44(arg7, var12, arg6, var22, var20, var23, super.field713, arg5, arg1 - -4, var24);
                                class44 var41 = new class44(arg7, var12, arg6, var22, var20, var23, super.field713, arg5, var39, var24);
                                if (var40.method254(true)) {
                                    var40.method256((byte) 82, arg7);
                                }
                                var42 = var40;
                                var43 = var41;
                                if (var41.method254(true)) {
                                    var41.method256((byte) 82, arg7);
                                }
                            } else {
                                var42 = new class37(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg5, arg1 + 4, arg4);
                                var43 = new class37(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg5, var39, arg4);
                            }
                            class157.method1074(arg10, arg9, arg8, var42, var43);
                            if (var12.field4036 == 1 && class144.field2044 && !super.field713) {
                                if (~arg1 == -1) {
                                    super.field718[arg10][arg9][arg8] = (byte) class347.method2139(super.field718[arg10][arg9][arg8], 1);
                                    super.field718[arg10][arg9][arg8 + 1] = (byte) class347.method2139(super.field718[arg10][arg9][arg8 + 1], 2);
                                } else if (~arg1 == -2) {
                                    super.field718[arg10][arg9][arg8 - -1] = (byte) class347.method2139(super.field718[arg10][arg9][arg8 - -1], 2);
                                    super.field718[arg10][arg9 - -1][arg8] = (byte) class347.method2139(super.field718[arg10][arg9 - -1][arg8], 1);
                                } else if (arg1 != 2) {
                                    if (~arg1 == -4) {
                                        super.field718[arg10][arg9][arg8] = (byte) class347.method2139(super.field718[arg10][arg9][arg8], 2);
                                        super.field718[arg10][arg9][arg8] = (byte) class347.method2139(super.field718[arg10][arg9][arg8], 1);
                                    }
                                } else {
                                    super.field718[arg10][arg9 - -1][arg8] = (byte) class347.method2139(super.field718[arg10][arg9 - -1][arg8], 1);
                                    super.field718[arg10][arg9][arg8] = (byte) class347.method2139(super.field718[arg10][arg9][arg8], 2);
                                }
                            }
                            if (~var12.field4069 != -1 && arg3 != null) {
                                arg3.method2868(var12.field4010, -114, arg9, arg5, !var12.field4047, arg8, arg1);
                            }
                            if (~var12.field4026 != -17) {
                                class400.method2400(arg10, arg9, arg8, var12.field4026);
                            }
                        } else if (arg5 == 3) {
                            class100 var45;
                            if (var25) {
                                class44 var44 = new class44(arg7, var12, arg6, var22, var20, var23, super.field713, arg5, arg1, var24);
                                if (var44.method254(true)) {
                                    var44.method256((byte) 82, arg7);
                                }
                                var45 = var44;
                            } else {
                                var45 = new class37(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg5, arg1, arg4);
                            }
                            class100 var46 = class147.method1006(arg10, arg9, arg8);
                            if (var46 instanceof class463) {
                                ((class463) var46).field6534 = var45;
                            } else {
                                class157.method1074(arg10, arg9, arg8, var45, (class100) null);
                            }
                            if (var12.field4075 && class144.field2044) {
                                if (arg1 == 0) {
                                    var19.method198(arg9, arg8 + 1, 50);
                                } else if (arg1 == 1) {
                                    var19.method198(arg9 - -1, arg8 - -1, 50);
                                } else if (arg1 == 2) {
                                    var19.method198(arg9 + 1, arg8, 50);
                                } else if (arg1 == 3) {
                                    var19.method198(arg9, arg8, 50);
                                }
                            }
                            if (~var12.field4069 != -1 && arg3 != null) {
                                arg3.method2868(var12.field4010, -122, arg9, arg5, !var12.field4047, arg8, arg1);
                            }
                        } else if (~arg5 == -10) {
                            class305 var48;
                            if (var25) {
                                class327 var47 = new class327(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg9, arg9, arg8, arg8, arg5, arg1, var24);
                                var48 = var47;
                                if (var47.method254(true)) {
                                    var47.method256((byte) 82, arg7);
                                }
                            } else {
                                var48 = new class129(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg9, arg9 - (-var14 - -1), arg8, arg8 - -var13 + -1, arg5, arg1, arg4);
                            }
                            class305 var49 = class390.method2350(arg10, arg9, arg8, field5346 != null ? field5346 : (field5346 = method2166("ki")));
                            if (var49 instanceof class307 && ~var49.field4542 == ~arg9 && var49.field4547 == arg8) {
                                ((class307) var49).field4584 = var48;
                            } else {
                                class204.method1394(var48, false);
                            }
                            if (~var12.field4069 != -1 && arg3 != null) {
                                arg3.method2872(arg9, !var12.field4047, var13, false, arg8, var14, var12.field4010);
                            }
                            if (~var12.field4026 != -17) {
                                class400.method2400(arg10, arg9, arg8, var12.field4026);
                            }
                        } else if (arg5 == 4) {
                            class287 var51;
                            if (var25) {
                                class36 var50 = new class36(arg7, var12, arg6, var22, var20, var23, super.field713, 0, 0, 0, arg5, arg1);
                                var51 = var50;
                                if (var50.method254(true)) {
                                    var50.method256((byte) 82, arg7);
                                }
                            } else {
                                var51 = new class228(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, 0, 0, 0, arg5, arg1, arg4);
                            }
                            class287 var52 = class115.method826(arg10, arg9, arg8);
                            if (var52 instanceof class282) {
                                ((class282) var52).field4259 = var51;
                            } else {
                                class124.method869(arg10, arg9, arg8, var51, (class287) null);
                            }
                        } else if (~arg5 == -6) {
                            int var53 = 16;
                            class218 var54 = (class218) class147.method1006(arg10, arg9, arg8);
                            if (var54 != null) {
                                var53 = class206.field3124.method338((byte) 118, var54.method257(false)).field4026;
                            }
                            class287 var56;
                            if (var25) {
                                class36 var55 = new class36(arg7, var12, arg6, var22, var20, var23, super.field713, 0, class70.field948[arg1] * var53, class203.field3092[arg1] * var53, arg5, arg1);
                                var56 = var55;
                                if (var55.method254(true)) {
                                    var55.method256((byte) 82, arg7);
                                }
                            } else {
                                var56 = new class228(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, 0, class70.field948[arg1] * var53, class203.field3092[arg1] * var53, arg5, arg1, arg4);
                            }
                            class287 var57 = class115.method826(arg10, arg9, arg8);
                            if (var57 instanceof class282) {
                                ((class282) var57).field4259 = var56;
                            } else {
                                class124.method869(arg10, arg9, arg8, var56, (class287) null);
                            }
                        } else if (arg5 == 6) {
                            int var58 = 8;
                            class218 var59 = (class218) class147.method1006(arg10, arg9, arg8);
                            if (var59 != null) {
                                var58 = class206.field3124.method338((byte) 123, var59.method257(false)).field4026 / 2;
                            }
                            class287 var61;
                            if (var25) {
                                class36 var60 = new class36(arg7, var12, arg6, var22, var20, var23, super.field713, arg1, class70.field948[arg1] * var58, class203.field3092[arg1] * var58, arg5, arg1 + 4);
                                if (var60.method254(true)) {
                                    var60.method256((byte) 82, arg7);
                                }
                                var61 = var60;
                            } else {
                                var61 = new class228(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg1, class305.field4553[arg1] * var58, class317.field4756[arg1] * var58, arg5, arg1 + 4, arg4);
                            }
                            class287 var62 = class115.method826(arg10, arg9, arg8);
                            if (var62 instanceof class282) {
                                ((class282) var62).field4259 = var61;
                            } else {
                                class124.method869(arg10, arg9, arg8, var61, (class287) null);
                            }
                        } else if (arg5 == 7) {
                            int var63 = arg1 + 2 & 3;
                            class287 var65;
                            if (var25) {
                                class36 var64 = new class36(arg7, var12, arg6, var22, var20, var23, super.field713, var63, 0, 0, arg5, var63 - -4);
                                if (var64.method254(true)) {
                                    var64.method256((byte) 82, arg7);
                                }
                                var65 = var64;
                            } else {
                                var65 = new class228(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, var63, 0, 0, arg5, var63 + 4, arg4);
                            }
                            class287 var66 = class115.method826(arg10, arg9, arg8);
                            if (!(var66 instanceof class282)) {
                                class124.method869(arg10, arg9, arg8, var65, (class287) null);
                            } else {
                                ((class282) var66).field4259 = var65;
                            }
                        } else if (~arg5 == -9) {
                            int var67 = arg1 + 2 & 3;
                            int var68 = 8;
                            class218 var69 = (class218) class147.method1006(arg10, arg9, arg8);
                            if (var69 != null) {
                                var68 = class206.field3124.method338((byte) 97, var69.method257(false)).field4026 / 2;
                            }
                            class287 var72;
                            class287 var73;
                            if (var25) {
                                class36 var70 = new class36(arg7, var12, arg6, var22, var20, var23, super.field713, arg1, class305.field4553[arg1] * var68, class317.field4756[arg1] * var68, arg5, arg1 + 4);
                                class36 var71 = new class36(arg7, var12, arg6, var22, var20, var23, super.field713, arg1, 0, 0, arg5, var67 + 4);
                                if (var70.method254(true)) {
                                    var70.method256((byte) 82, arg7);
                                }
                                var72 = var71;
                                var73 = var70;
                                if (var71.method254(true)) {
                                    var71.method256((byte) 82, arg7);
                                }
                            } else {
                                class228 var74 = new class228(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg1, class305.field4553[arg1] * var68, class317.field4756[arg1] * var68, arg5, arg1 - -4, arg4);
                                var73 = var74;
                                class228 var75 = new class228(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg1, 0, 0, arg5, var67 + 4, arg4);
                                var72 = var75;
                            }
                            class124.method869(arg10, arg9, arg8, var73, var72);
                        }
                    } else {
                        class327 var76 = null;
                        class305 var77;
                        int var78;
                        if (!var25) {
                            var77 = new class129(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg9, arg9 - -var14 + -1, arg8, arg8 + var13 + -1, arg5, arg1, arg4);
                            var78 = 15;
                        } else {
                            class327 var79 = new class327(arg7, var12, arg10, arg6, var22, var20, var23, super.field713, arg9, arg9 - 1 + var14, arg8, arg8 + var13 + -1, arg5, arg1, var24);
                            var78 = var79.method2009((byte) 116);
                            var77 = var79;
                            var76 = var79;
                        }
                        class305 var80 = class390.method2350(arg10, arg9, arg8, field5346 != null ? field5346 : (field5346 = method2166("ki")));
                        boolean var81 = false;
                        if (var80 instanceof class307 && ~var80.field4542 == ~arg9 && ~var80.field4547 == ~arg8) {
                            var81 = true;
                            ((class307) var80).field4584 = var77;
                        }
                        if (var81 || class204.method1394(var77, false)) {
                            if (var76 != null && var76.method254(true)) {
                                var76.method256((byte) 82, arg7);
                            }
                            if (var12.field4075 && class144.field2044) {
                                if (~var78 < -31) {
                                    var78 = 30;
                                }
                                for (int var82 = 0; var82 <= var14; ++var82) {
                                    for (int var83 = 0; ~var13 <= ~var83; ++var83) {
                                        var19.method198(arg9 + var82, arg8 + var83, var78);
                                    }
                                }
                            }
                        }
                        if (var12.field4069 != 0 && arg3 != null) {
                            arg3.method2872(arg9, !var12.field4047, var13, false, arg8, var14, var12.field4010);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[B)I", line = 1077)
    public static final int method2158(int arg0, int arg1, byte[] arg2) {
        if (arg0 <= 48) {
            return -123;
        } else {
            ++field5341;
            return class57.method414(-101, 0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ltq;IIIIILtf;)V", line = 1090)
    public final void method2159(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class491 arg6) {
        ++field5337;
        class218 var8 = null;
        if (arg5 == 0) {
            var8 = (class218) class147.method1006(arg2, arg1, arg3);
        }
        if (arg5 == 1) {
            var8 = (class218) class115.method826(arg2, arg1, arg3);
        }
        if (arg5 == 2) {
            var8 = (class218) class390.method2350(arg2, arg1, arg3, field5346 != null ? field5346 : (field5346 = method2166("ki")));
        }
        if (arg5 == 3) {
            var8 = (class218) class487.method2848(arg2, arg1, arg3);
        }
        if (arg4 == 2615) {
            if (var8 != null) {
                class271 var9 = class206.field3124.method338((byte) 123, var8.method257(false));
                int var10 = var8.method250((byte) -127);
                int var11 = var8.method244((byte) -71);
                if (var9.method1771(-15964)) {
                    class425.method2505(arg3, var9, arg2, 66, arg1);
                }
                if (var8.method254(true)) {
                    var8.method258(arg0, -22360);
                }
                if (arg5 == 0) {
                    class100 var12 = class147.method1006(arg2, arg1, arg3);
                    if (!(var12 instanceof class463)) {
                        class465.method2734(arg2, arg1, arg3);
                    } else {
                        ((class463) var12).field6534 = null;
                    }
                    if (~var9.field4069 != -1) {
                        arg6.method2873(var11, arg1, -3, arg3, var10, var9.field4010, !var9.field4047);
                        return;
                    }
                    return;
                }
                if (~arg5 == -2) {
                    class287 var13 = class115.method826(arg2, arg1, arg3);
                    if (!(var13 instanceof class282)) {
                        class186.method1284(arg2, arg1, arg3);
                        return;
                    }
                    ((class282) var13).field4259 = null;
                    return;
                }
                if (~arg5 == -3) {
                    class305 var14 = class390.method2350(arg2, arg1, arg3, field5346 != null ? field5346 : (field5346 = method2166("ki")));
                    if (var14 instanceof class307 && var14.field4542 == arg1 && var14.field4547 == arg3) {
                        ((class307) var14).field4584 = null;
                    } else {
                        class433.method2535(arg2, arg1, arg3, field5346 != null ? field5346 : (field5346 = method2166("ki")));
                    }
                    if (var9.field4069 != 0 && super.field710 > var9.field4014 + arg1 && super.field700 > var9.field4014 + arg3 && arg1 - -var9.field4048 < super.field710 && super.field700 > var9.field4048 + arg3) {
                        arg6.method2864(arg1, var9.field4010, var9.field4014, arg3, var9.field4048, var11, (byte) -61, !var9.field4047);
                        return;
                    }
                    return;
                }
                if (~arg5 == -4) {
                    class47 var15 = class487.method2848(arg2, arg1, arg3);
                    if (var15 instanceof class109) {
                        ((class109) var15).field1527 = null;
                    } else {
                        class370.method2294(arg2, arg1, arg3);
                    }
                    if (~var9.field4069 == -2) {
                        arg6.method2863(arg3, -88, arg1);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILtq;[BI[Ltf;I)V", line = 1201)
    public final void method2160(int arg0, class63 arg1, byte[] arg2, int arg3, class491[] arg4, int arg5) {
        ++field5338;
        class446 var7 = new class446(arg2);
        int var8 = -1;
        while (true) {
            int var9 = var7.method2609((byte) -61);
            if (~var9 == -1) {
                int var22 = 15 % ((arg5 - -64) / 53);
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2635(72);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = (var10 & 4069) >> 6;
                int var14 = var10 >> 12;
                int var15 = var7.method2628(49152);
                int var16 = var15 >> 2;
                int var17 = 3 & var15;
                int var18 = arg0 + var13;
                int var19 = var12 - -arg3;
                if (var18 > 0 && var19 > 0 && var18 < super.field710 - 1 && super.field700 + -1 > var19) {
                    class491 var20 = null;
                    if (!super.field713) {
                        int var21 = var14;
                        if ((class246.field3532[1][var18][var19] & 2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (~var21 <= -1) {
                            var20 = arg4[var21];
                        }
                    }
                    this.method2157(-7, var17, var8, var20, -1, var16, var14, arg1, var19, var18, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[Ltf;IIII[BLtq;III)V", line = 1274)
    public final void method2161(int arg0, class491[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, class63 arg7, int arg8, int arg9, int arg10) {
        ++field5343;
        class446 var12 = new class446(arg6);
        int var13 = -1;
        while (true) {
            int var14 = var12.method2609((byte) -71);
            if (~var14 == -1) {
                if (arg2 <= 54) {
                    field5333 = null;
                    return;
                }
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2635(17);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4045 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2628(49152);
                int var21 = var20 >> 2;
                int var22 = 3 & var20;
                if (~arg3 == ~var19 && ~var18 <= ~arg9 && ~(arg9 + 8) < ~var18 && arg0 <= var17 && var17 < arg0 + 8) {
                    class271 var23 = class206.field3124.method338((byte) 121, var13);
                    int var24 = class162.method1095(var17 & 7, (byte) -99, arg5, var23.field4048, 7 & var18, var22, var23.field4014) + arg8;
                    int var25 = class216.method1440((byte) 37, var23.field4048, arg5, var22, var23.field4014, var17 & 7, var18 & 7) + arg10;
                    if (var24 > 0 && ~var25 < -1 && ~var24 > ~(super.field710 + -1) && ~var25 > ~(super.field700 + -1)) {
                        class491 var26 = null;
                        if (!super.field713) {
                            int var27 = arg4;
                            if ((2 & class246.field3532[1][var24][var25]) == 2) {
                                var27 = arg4 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg1[var27];
                            }
                        }
                        this.method2157(-84, arg5 + var22 & 3, var13, var26, -1, var21, arg4, arg7, var25, var24, arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ltq;I)V", line = 1357)
    public final void method2162(class63 arg0, int arg1) {
        ++field5334;
        if (arg1 == 4921) {
            class216.method1437(arg0);
            if (super.field698 > 1) {
                for (int var3 = 0; var3 < super.field710; ++var3) {
                    for (int var4 = 0; super.field700 > var4; ++var4) {
                        if (~(class246.field3532[1][var3][var4] & 2) == -3) {
                            class121.method853(var3, var4);
                        }
                    }
                }
            }
            for (int var5 = 0; ~var5 > ~super.field698; ++var5) {
                for (int var6 = 0; ~var6 >= ~super.field700; ++var6) {
                    for (int var7 = 0; var7 <= super.field710; ++var7) {
                        if ((super.field718[var5][var7][var6] & 1) != 0) {
                            int var8 = var6;
                            int var9 = var6;
                            int var10 = var5;
                            while (var8 > 0 && (1 & super.field718[var5][var7][var8 - 1]) != 0) {
                                --var8;
                            }
                            int var11 = var5;
                            while (~super.field700 < ~var9 && ~(1 & super.field718[var5][var7][var9 + 1]) != -1) {
                                ++var9;
                            }
                            label171: while (~var10 < -1) {
                                for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                    if (~(super.field718[var10 + -1][var7][var12] & 1) == -1) {
                                        break label171;
                                    }
                                }
                                --var10;
                            }
                            label160: while (var11 < 3) {
                                for (int var13 = var8; ~var9 <= ~var13; ++var13) {
                                    if (~(super.field718[var11 + 1][var7][var13] & 1) == -1) {
                                        break label160;
                                    }
                                }
                                ++var11;
                            }
                            int var14 = (var11 - -1 + -var10) * (-var8 + var9 + 1);
                            if (var14 >= 2) {
                                short var15 = 240;
                                int var16 = super.field719[var11][var7][var8] + -var15;
                                int var17 = super.field719[var10][var7][var8];
                                class253.method1605(1, var7 * 128, var7 * 128, var8 * 128, var9 * 128 + 128, var16, var17);
                                for (int var18 = var10; ~var18 >= ~var11; ++var18) {
                                    for (int var19 = var8; var9 >= var19; ++var19) {
                                        super.field718[var18][var7][var19] = (byte) class412.method2463(super.field718[var18][var7][var19], -2);
                                    }
                                }
                            }
                        }
                        if (~(super.field718[var5][var7][var6] & 2) != -1) {
                            int var20 = var7;
                            int var21 = var7;
                            int var22 = var5;
                            while (~var20 < -1 && ~(super.field718[var5][var20 + -1][var6] & 2) != -1) {
                                --var20;
                            }
                            while (super.field710 > var21 && ~(2 & super.field718[var5][var21 - -1][var6]) != -1) {
                                ++var21;
                            }
                            int var23 = var5;
                            label225: while (~var22 < -1) {
                                for (int var24 = var20; var21 >= var24; ++var24) {
                                    if (~(2 & super.field718[var22 + -1][var24][var6]) == -1) {
                                        break label225;
                                    }
                                }
                                --var22;
                            }
                            label214: while (~var23 > -4) {
                                for (int var25 = var20; ~var25 >= ~var21; ++var25) {
                                    if (~(super.field718[var23 + 1][var25][var6] & 2) == -1) {
                                        break label214;
                                    }
                                }
                                ++var23;
                            }
                            int var26 = (-var22 + var23 - -1) * (-var20 + 1 + var21);
                            if (~var26 <= -3) {
                                short var27 = 240;
                                int var28 = super.field719[var23][var20][var6] - var27;
                                int var29 = super.field719[var22][var20][var6];
                                class253.method1605(2, var20 * 128, var21 * 128 + 128, var6 * 128, var6 * 128, var28, var29);
                                for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                    for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                        super.field718[var30][var31][var6] = (byte) class412.method2463(super.field718[var30][var31][var6], -3);
                                    }
                                }
                            }
                        }
                        if ((4 & super.field718[var5][var7][var6]) != 0) {
                            int var32 = var7;
                            int var33 = var7;
                            int var34;
                            for (var34 = var6; ~var34 < -1 && (4 & super.field718[var5][var7][var34 + -1]) != 0; --var34) {
                            }
                            int var35;
                            for (var35 = var6; ~super.field700 < ~var35 && (4 & super.field718[var5][var7][var35 - -1]) != 0; ++var35) {
                            }
                            label279: while (~var32 < -1) {
                                for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                    if (~(4 & super.field718[var5][var32 + -1][var36]) == -1) {
                                        break label279;
                                    }
                                }
                                --var32;
                            }
                            label268: while (super.field710 > var33) {
                                for (int var37 = var34; var35 >= var37; ++var37) {
                                    if (~(super.field718[var5][var33 + 1][var37] & 4) == -1) {
                                        break label268;
                                    }
                                }
                                ++var33;
                            }
                            if ((var33 - var32 - -1) * (-var34 + var35 + 1) >= 4) {
                                int var38 = super.field719[var5][var32][var34];
                                class253.method1605(4, var32 * 128, var33 * 128 + 128, var34 * 128, var35 * 128 + 128, var38, var38);
                                for (int var39 = var32; var39 <= var33; ++var39) {
                                    for (int var40 = var34; var35 >= var40; ++var40) {
                                        super.field718[var5][var39][var40] = (byte) class412.method2463(super.field718[var5][var39][var40], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            super.field718 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 1652)
    public static final void method2163(int arg0) {
        ++field5336;
        if (!class170.field2422) {
            if (arg0 != 30646) {
                field5333 = null;
            }
            class170.field2422 = true;
            class380.field5645 = true;
            if (class337.field5038.field3942) {
                class384.field5682 = (float) (-128 & (int) class384.field5682 + 191);
            } else {
                class266.field3955 += (24.0F - class266.field3955) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIZ)V", line = 1676)
    public class350(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class463.field6540, class352.field5364);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 1679)
    public static void method2164(boolean arg0) {
        field5333 = null;
        field5344 = null;
        if (!arg0) {
            field5345 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIILtq;IIIILre;[I)V", line = 1697)
    public final void method2165(int arg0, int arg1, int arg2, int arg3, class63 arg4, int arg5, int arg6, int arg7, int arg8, class446 arg9, int[] arg10) {
        ++field5339;
        if (arg0 <= -72) {
            if (!super.field713) {
                boolean var12 = false;
                class484 var13 = null;
                if (arg10 != null) {
                    arg10[0] = -1;
                }
                int var14 = (arg7 & 7) * 8;
                int var15 = (7 & arg6) * 8;
                while (true) {
                    while (arg9.field6316.length > arg9.field6315) {
                        int var20 = arg9.method2628(49152);
                        if (var20 == 0) {
                            var13 = new class484(arg9);
                        } else if (var20 == 1) {
                            int var21 = arg9.method2628(49152);
                            if (~var21 < -1) {
                                for (int var22 = 0; var22 < var21; ++var22) {
                                    class212 var23 = new class212(arg9);
                                    if (~var23.field3184 == -32) {
                                        class197 var24 = class81.field1144.method2439(arg9.method2631(2530), -126);
                                        var23.method1427(var24.field2964, var24.field2965, var24.field2968, var24.field2970, (byte) 109);
                                    }
                                    int var25 = var23.field3414 >> 7;
                                    int var26 = var23.field3413 >> 7;
                                    if (var23.field3188 == arg2 && var25 >= var14 && var25 < var14 - -8 && ~var26 <= ~var15 && var15 + 8 > var26) {
                                        int var27 = (arg3 << 7) + class317.method1954(125, arg8, var23.field3413 & 1023, var23.field3414 & 1023);
                                        int var28 = (arg1 << 7) - -class362.method2232(arg8, var23.field3413 & 1023, 1, 1023 & var23.field3414);
                                        var23.field3413 = var28;
                                        var23.field3414 = var27;
                                        int var29 = var23.field3414 >> 7;
                                        int var30 = var23.field3413 >> 7;
                                        if (var29 >= 0 && ~var30 <= -1 && ~var29 > ~super.field710 && super.field700 > var30) {
                                            var23.field3416 = super.field719[arg2][var29][var30] + -var23.field3416;
                                            if (arg4.method524() > 0) {
                                                class63.method497(var23);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (~var20 == -3) {
                            if (var13 == null) {
                                var13 = new class484();
                            }
                            var13.method2828(122, arg9);
                        } else if (var20 == 128) {
                            if (arg10 == null) {
                                arg9.field6315 += 10;
                            } else {
                                arg10[0] = arg9.method2631(2530);
                                arg10[1] = arg9.method2634(2);
                                arg10[2] = arg9.method2634(-81);
                                arg10[3] = arg9.method2634(-95);
                                arg10[4] = arg9.method2631(2530);
                            }
                        } else {
                            if (var20 != 129) {
                                throw new IllegalStateException("");
                            }
                            if (super.field708 == null) {
                                super.field708 = new byte[4][][];
                            }
                            for (int var31 = 0; var31 < 4; ++var31) {
                                byte var32 = arg9.method2642(true);
                                if (var32 == 0 && super.field708[arg5] != null) {
                                    if (~arg2 <= ~var31) {
                                        int var33 = arg3;
                                        int var34 = arg3 - -7;
                                        int var35 = arg1;
                                        if (~arg1 <= -1) {
                                            if (~super.field700 >= ~arg1) {
                                                var35 = super.field700;
                                            }
                                        } else {
                                            var35 = 0;
                                        }
                                        if (var34 >= 0) {
                                            if (super.field710 <= var34) {
                                                var34 = super.field710;
                                            }
                                        } else {
                                            var34 = 0;
                                        }
                                        int var36 = arg1 - -7;
                                        if (arg3 >= 0) {
                                            if (super.field710 <= arg3) {
                                                var33 = super.field710;
                                            }
                                        } else {
                                            var33 = 0;
                                        }
                                        if (~var36 <= -1) {
                                            if (var36 >= super.field700) {
                                                var36 = super.field700;
                                            }
                                        } else {
                                            var36 = 0;
                                        }
                                        while (~var34 < ~var33) {
                                            while (var35 < var36) {
                                                super.field708[arg5][var33][var35] = 0;
                                                ++var35;
                                            }
                                            ++var33;
                                        }
                                    }
                                } else if (~var32 == -2) {
                                    if (super.field708[arg5] == null) {
                                        super.field708[arg5] = new byte[super.field710 + 1][super.field700 + 1];
                                    }
                                    for (int var37 = 0; var37 < 64; var37 += 4) {
                                        for (int var38 = 0; var38 < 64; var38 += 4) {
                                            byte var39 = arg9.method2642(true);
                                            if (~arg2 <= ~var31) {
                                                for (int var40 = var37; ~(var37 - -4) < ~var40; ++var40) {
                                                    for (int var41 = var38; ~(var38 + 4) < ~var41; ++var41) {
                                                        if (~var14 >= ~var40 && ~(var14 - -8) < ~var40 && var41 >= var15 && ~var15 > ~(var15 - -8)) {
                                                            int var42 = arg3 - -class285.method1823(14277, 7 & var41, arg8, 7 & var40);
                                                            int var43 = class361.method2222((byte) 123, arg8, 7 & var40, 7 & var41) + arg1;
                                                            if (~var42 <= -1 && ~var42 > ~super.field710 && ~var43 <= -1 && ~super.field700 < ~var43) {
                                                                super.field708[arg5][var42][var43] = var39;
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
                        class96.method751(arg3 >> 3, arg1 >> 3, (byte) 46, var13);
                    }
                    if (!var12 && super.field708 != null && super.field708[arg5] != null) {
                        int var16 = arg3 + 7;
                        int var17 = arg1 + 7;
                        for (int var18 = arg3; var18 < var16; ++var18) {
                            for (int var19 = arg1; var17 > var19; ++var19) {
                                super.field708[arg5][var18][var19] = 0;
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
