import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class308 extends class475 {

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    public int field3930 = 99;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field3919 = new String[5];

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public static int field3926 = 0;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "[I")
    public static int[] field3928 = new int[32];

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "Lug;")
    public static class480 field3931 = new class480();

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "Lcea;")
    public static class180 field3934 = new class180("Loading JAGGL - ", "Lade JAGGL - ", "Chargement JAGGL - ", "Carregando JAGGL - ");

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    public static int field3933;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vk", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field3935;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z[B)Z")
    public static final boolean method1702(boolean arg0, byte[] arg1) {
        ++field3925;
        if (arg0) {
            method1711((byte) -86, 112);
        }
        class374 var2 = new class374(arg1);
        int var3 = var2.method2129(-113);
        if (var3 != 2) {
            return false;
        } else {
            boolean var4 = var2.method2129(-88) == 1;
            if (var4) {
                class564.method3291(var2, 0);
            }
            class253.method1436(var2, !arg0);
            return true;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIILqa;Lqt;I)V")
    public final void method1703(int arg0, int arg1, int arg2, int arg3, class206 arg4, class542 arg5, int arg6) {
        ++field3923;
        class269 var8 = null;
        if (arg3 == 0) {
            var8 = (class269) class19.method124(arg2, arg0, arg6);
        }
        if (arg3 == 1) {
            var8 = (class269) class31.method181(arg2, arg0, arg6);
        }
        if (arg3 == 2) {
            var8 = (class269) class198.method1072(arg2, arg0, arg6, field3935 != null ? field3935 : (field3935 = method1713("fp")));
        }
        if (~arg3 == -4) {
            var8 = (class269) class543.method3171(arg2, arg0, arg6);
        }
        if (var8 != null) {
            class437 var9 = class16.field126.method1759(false, var8.method342(arg1 ^ 2328));
            int var10 = var8.method337(true);
            int var11 = var8.method333((byte) 70);
            if (var9.method2540(0)) {
                class311.method1732(arg0, arg2, 576139591, var9, arg6);
            }
            if (var8.method332(87)) {
                var8.method336(false, arg4);
            }
            if (~arg3 != -1) {
                if (~arg3 != -2) {
                    if (arg3 != 2) {
                        if (arg3 == 3) {
                            class31 var12 = class543.method3171(arg2, arg0, arg6);
                            if (var12 instanceof class550) {
                                ((class550) var12).field8079 = null;
                            } else {
                                class29.method161(arg2, arg0, arg6);
                            }
                            if (~var9.field6000 == -2) {
                                arg5.method3168(8772, arg0, arg6);
                            }
                        }
                    } else {
                        class598 var13 = class198.method1072(arg2, arg0, arg6, field3935 != null ? field3935 : (field3935 = method1713("fp")));
                        if (var13 instanceof class79 && ~var13.field8653 == ~arg0 && var13.field8650 == arg6) {
                            ((class79) var13).field921 = null;
                        } else {
                            class507.method2914(arg2, arg0, arg6, field3935 != null ? field3935 : (field3935 = method1713("fp")));
                        }
                        if (~var9.field6000 != -1 && var9.field5982 + arg0 < super.field6680 && ~(var9.field5982 + arg6) > ~super.field6673 && var9.field5945 + arg0 < super.field6680 && super.field6673 > var9.field5945 + arg6) {
                            arg5.method3169(var9.field5982, arg0, !var9.field6015, var11, var9.field5979, var9.field5945, -1, arg6);
                        }
                    }
                } else {
                    class56 var14 = class31.method181(arg2, arg0, arg6);
                    if (var14 instanceof class574) {
                        ((class574) var14).field8385 = null;
                    } else {
                        class314.method1743(arg2, arg0, arg6);
                    }
                }
            } else {
                class241 var15 = class19.method124(arg2, arg0, arg6);
                if (!(var15 instanceof class58)) {
                    class129.method734(arg2, arg0, arg6);
                } else {
                    ((class58) var15).field549 = null;
                }
                if (var9.field6000 != 0) {
                    arg5.method3163(var11, var9.field5979, var10, arg0, arg6, (byte) -33, !var9.field6015);
                }
            }
        }
        if (arg1 != -1) {
            field3931 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIILqt;IBLqa;II)V")
    public final void method1704(int arg0, int arg1, int arg2, int arg3, int arg4, class542 arg5, int arg6, byte arg7, class206 arg8, int arg9, int arg10) {
        ++field3929;
        if (class565.field8299.method3590(class529.field7429, -2) || class566.method3298(arg3, arg0, class13.field104, (byte) -121, arg4)) {
            if (arg2 < this.field3930) {
                this.field3930 = arg2;
            }
            class437 var12 = class16.field126.method1759(false, arg6);
            if (!arg8.method1100() || !class565.field8299.field2183 || !var12.field5964) {
                int var13;
                int var14;
                if (arg10 != 1 && ~arg10 != -4) {
                    var13 = var12.field5982;
                    var14 = var12.field5945;
                } else {
                    var14 = var12.field5982;
                    var13 = var12.field5945;
                }
                int var15;
                int var16;
                if (super.field6680 < arg3 + var13) {
                    var15 = arg3;
                    var16 = arg3 + 1;
                } else {
                    var15 = arg3 - -(var13 >> 1);
                    var16 = (var13 + 1 >> 1) + arg3;
                }
                int var17;
                int var18;
                if (arg4 + var14 > super.field6673) {
                    var17 = arg4;
                    var18 = arg4 + 1;
                } else {
                    var17 = (var14 >> 1) + arg4;
                    var18 = (var14 + 1 >> 1) + arg4;
                }
                class174 var19 = class128.field1574[arg0];
                int var20 = var19.method855(var15, var17) + var19.method855(var16, var17) + var19.method855(var15, var18) - -var19.method855(var16, var18) >> 2;
                int var21 = (arg3 << 7) + (var13 << 6);
                int var22 = (arg4 << 7) - -(var14 << 6);
                boolean var23 = class184.field2231 && !super.field6677 && var12.field5955;
                if (var12.method2540(0)) {
                    class131.method736((byte) -91, arg3, (class459) null, (class545) null, var12, arg4, arg10, arg2);
                }
                boolean var24 = arg1 == -1 && ~var12.field5969 == 0 && var12.field5976 == null && var12.field6004 == null && !var12.field6011;
                if (!class398.field5249 || (!class330.method1858((byte) -58, arg9) || ~var12.field5983 == -2) && (!class103.method615(arg9, 123) || ~var12.field5983 != -1)) {
                    if (~arg9 == -23) {
                        if (class565.field8299.field2187 || var12.field5972 != 0 || var12.field6000 == 1 || var12.field6014) {
                            class31 var26;
                            if (var24) {
                                class529 var25 = new class529(arg8, var12, arg0, var21, var20, var22, super.field6677, arg10, var23);
                                var26 = var25;
                                if (var25.method332(116)) {
                                    var25.method341(arg8, false);
                                }
                            } else {
                                var26 = new class59(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg10, arg1);
                            }
                            class31 var27 = class543.method3171(arg2, arg3, arg4);
                            if (!(var27 instanceof class550)) {
                                class385.method2222(arg2, arg3, arg4, var26);
                            } else {
                                ((class550) var27).field8079 = var26;
                            }
                            if (~var12.field6000 == -2 && arg5 != null) {
                                arg5.method3167(arg3, arg4, (byte) -49);
                            }
                        }
                    } else if (~arg9 != -11 && ~arg9 != -12) {
                        if (arg7 >= -100) {
                            field3933 = 79;
                        }
                        if ((~arg9 > -13 || ~arg9 < -18) && (arg9 < 18 || ~arg9 < -22)) {
                            if (~arg9 == -1) {
                                int var31 = var12.field5983;
                                if (class194.field2353 && var12.field5983 == -1) {
                                    var31 = 1;
                                }
                                class241 var33;
                                if (var24) {
                                    class556 var32 = new class556(arg8, var12, arg0, var21, var20, var22, super.field6677, arg9, arg10, var23);
                                    var33 = var32;
                                    if (var32.method332(117)) {
                                        var32.method341(arg8, false);
                                    }
                                } else {
                                    var33 = new class479(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg9, arg10, arg1);
                                }
                                class241 var34 = class19.method124(arg2, arg3, arg4);
                                if (!(var34 instanceof class58)) {
                                    class367.method2058(arg2, arg3, arg4, var33, (class241) null);
                                } else {
                                    ((class58) var34).field549 = var33;
                                }
                                if (class184.field2231) {
                                    if (arg10 == 0) {
                                        if (var12.field6023) {
                                            var19.method841(arg3, arg4, 50);
                                            var19.method841(arg3, arg4 + 1, 50);
                                        }
                                        if (~var31 == -2 && !super.field6677) {
                                            super.field6661[arg2][arg3][arg4] = (byte) class42.method223(super.field6661[arg2][arg3][arg4], 1);
                                        }
                                    } else if (~arg10 == -2) {
                                        if (var12.field6023) {
                                            var19.method841(arg3, arg4 + 1, 50);
                                            var19.method841(arg3 + 1, arg4 + 1, 50);
                                        }
                                        if (~var31 == -2 && !super.field6677) {
                                            super.field6661[arg2][arg3][arg4 + 1] = (byte) class42.method223(super.field6661[arg2][arg3][arg4 + 1], 2);
                                        }
                                    } else if (arg10 != 2) {
                                        if (~arg10 == -4) {
                                            if (var12.field6023) {
                                                var19.method841(arg3, arg4, 50);
                                                var19.method841(arg3 + 1, arg4, 50);
                                            }
                                            if (~var31 == -2 && !super.field6677) {
                                                super.field6661[arg2][arg3][arg4] = (byte) class42.method223(super.field6661[arg2][arg3][arg4], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field6023) {
                                            var19.method841(arg3 + 1, arg4, 50);
                                            var19.method841(arg3 + 1, arg4 - -1, 50);
                                        }
                                        if (~var31 == -2 && !super.field6677) {
                                            super.field6661[arg2][arg3 + 1][arg4] = (byte) class42.method223(super.field6661[arg2][arg3 + 1][arg4], 1);
                                        }
                                    }
                                }
                                if (~var12.field6000 != -1 && arg5 != null) {
                                    arg5.method3166(var12.field5979, arg3, (byte) -80, !var12.field6015, arg4, arg10, arg9);
                                }
                                if (~var12.field6028 != -17) {
                                    class430.method2491(arg2, arg3, arg4, var12.field6028);
                                }
                            } else if (~arg9 == -2) {
                                class241 var35;
                                if (!var24) {
                                    var35 = new class479(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg9, arg10, arg1);
                                } else {
                                    class556 var36 = new class556(arg8, var12, arg0, var21, var20, var22, super.field6677, arg9, arg10, var23);
                                    var35 = var36;
                                    if (var36.method332(78)) {
                                        var36.method341(arg8, false);
                                    }
                                }
                                class241 var37 = class19.method124(arg2, arg3, arg4);
                                if (!(var37 instanceof class58)) {
                                    class367.method2058(arg2, arg3, arg4, var35, (class241) null);
                                } else {
                                    ((class58) var37).field549 = var35;
                                }
                                if (var12.field6023 && class184.field2231) {
                                    if (arg10 == 0) {
                                        var19.method841(arg3, arg4 + 1, 50);
                                    } else if (~arg10 == -2) {
                                        var19.method841(arg3 + 1, arg4 + 1, 50);
                                    } else if (arg10 != 2) {
                                        if (~arg10 == -4) {
                                            var19.method841(arg3, arg4, 50);
                                        }
                                    } else {
                                        var19.method841(arg3 + 1, arg4, 50);
                                    }
                                }
                                if (var12.field6000 != 0 && arg5 != null) {
                                    arg5.method3166(var12.field5979, arg3, (byte) -80, !var12.field6015, arg4, arg10, arg9);
                                }
                            } else if (arg9 == 2) {
                                int var38 = 3 & arg10 + 1;
                                class241 var41;
                                class241 var42;
                                if (var24) {
                                    class556 var39 = new class556(arg8, var12, arg0, var21, var20, var22, super.field6677, arg9, arg10 + 4, var23);
                                    class556 var40 = new class556(arg8, var12, arg0, var21, var20, var22, super.field6677, arg9, var38, var23);
                                    if (var39.method332(-57)) {
                                        var39.method341(arg8, false);
                                    }
                                    var41 = var39;
                                    if (var40.method332(54)) {
                                        var40.method341(arg8, false);
                                    }
                                    var42 = var40;
                                } else {
                                    var41 = new class479(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg9, arg10 + 4, arg1);
                                    var42 = new class479(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg9, var38, arg1);
                                }
                                class367.method2058(arg2, arg3, arg4, var41, var42);
                                if (~var12.field5983 == -2 && class184.field2231 && !super.field6677) {
                                    if (arg10 != 0) {
                                        if (~arg10 != -2) {
                                            if (~arg10 == -3) {
                                                super.field6661[arg2][arg3 + 1][arg4] = (byte) class42.method223(super.field6661[arg2][arg3 + 1][arg4], 1);
                                                super.field6661[arg2][arg3][arg4] = (byte) class42.method223(super.field6661[arg2][arg3][arg4], 2);
                                            } else if (~arg10 == -4) {
                                                super.field6661[arg2][arg3][arg4] = (byte) class42.method223(super.field6661[arg2][arg3][arg4], 2);
                                                super.field6661[arg2][arg3][arg4] = (byte) class42.method223(super.field6661[arg2][arg3][arg4], 1);
                                            }
                                        } else {
                                            super.field6661[arg2][arg3][arg4 + 1] = (byte) class42.method223(super.field6661[arg2][arg3][arg4 + 1], 2);
                                            super.field6661[arg2][arg3 + 1][arg4] = (byte) class42.method223(super.field6661[arg2][arg3 + 1][arg4], 1);
                                        }
                                    } else {
                                        super.field6661[arg2][arg3][arg4] = (byte) class42.method223(super.field6661[arg2][arg3][arg4], 1);
                                        super.field6661[arg2][arg3][arg4 + 1] = (byte) class42.method223(super.field6661[arg2][arg3][arg4 + 1], 2);
                                    }
                                }
                                if (var12.field6000 != 0 && arg5 != null) {
                                    arg5.method3166(var12.field5979, arg3, (byte) -80, !var12.field6015, arg4, arg10, arg9);
                                }
                                if (~var12.field6028 != -17) {
                                    class430.method2491(arg2, arg3, arg4, var12.field6028);
                                }
                            } else if (~arg9 == -4) {
                                class241 var43;
                                if (!var24) {
                                    var43 = new class479(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg9, arg10, arg1);
                                } else {
                                    class556 var44 = new class556(arg8, var12, arg0, var21, var20, var22, super.field6677, arg9, arg10, var23);
                                    if (var44.method332(-57)) {
                                        var44.method341(arg8, false);
                                    }
                                    var43 = var44;
                                }
                                class241 var45 = class19.method124(arg2, arg3, arg4);
                                if (var45 instanceof class58) {
                                    ((class58) var45).field549 = var43;
                                } else {
                                    class367.method2058(arg2, arg3, arg4, var43, (class241) null);
                                }
                                if (var12.field6023 && class184.field2231) {
                                    if (~arg10 != -1) {
                                        if (~arg10 != -2) {
                                            if (arg10 == 2) {
                                                var19.method841(arg3 + 1, arg4, 50);
                                            } else if (arg10 == 3) {
                                                var19.method841(arg3, arg4, 50);
                                            }
                                        } else {
                                            var19.method841(arg3 + 1, arg4 + 1, 50);
                                        }
                                    } else {
                                        var19.method841(arg3, arg4 + 1, 50);
                                    }
                                }
                                if (var12.field6000 != 0 && arg5 != null) {
                                    arg5.method3166(var12.field5979, arg3, (byte) -80, !var12.field6015, arg4, arg10, arg9);
                                }
                            } else if (arg9 == 9) {
                                class598 var46;
                                if (!var24) {
                                    var46 = new class473(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg3, arg3 + var13 + -1, arg4, arg4 + var14 + -1, arg9, arg10, arg1);
                                } else {
                                    class638 var47 = new class638(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg3, arg3, arg4, arg4, arg9, arg10, var23);
                                    if (var47.method332(-55)) {
                                        var47.method341(arg8, false);
                                    }
                                    var46 = var47;
                                }
                                class598 var48 = class198.method1072(arg2, arg3, arg4, field3935 != null ? field3935 : (field3935 = method1713("fp")));
                                if (var48 instanceof class79 && var48.field8653 == arg3 && var48.field8650 == arg4) {
                                    ((class79) var48).field921 = var46;
                                } else {
                                    class380.method2203(var46, false);
                                }
                                if (~var12.field6000 != -1 && arg5 != null) {
                                    arg5.method3160(var13, arg4, (byte) -48, !var12.field6015, var14, arg3, var12.field5979);
                                }
                                if (~var12.field6028 != -17) {
                                    class430.method2491(arg2, arg3, arg4, var12.field6028);
                                }
                            } else if (~arg9 == -5) {
                                class56 var49;
                                if (!var24) {
                                    var49 = new class365(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, 0, 0, 0, arg9, arg10, arg1);
                                } else {
                                    class551 var50 = new class551(arg8, var12, arg0, var21, var20, var22, super.field6677, 0, 0, 0, arg9, arg10);
                                    var49 = var50;
                                    if (var50.method332(83)) {
                                        var50.method341(arg8, false);
                                    }
                                }
                                class56 var51 = class31.method181(arg2, arg3, arg4);
                                if (!(var51 instanceof class574)) {
                                    class96.method595(arg2, arg3, arg4, var49, (class56) null);
                                } else {
                                    ((class574) var51).field8385 = var49;
                                }
                            } else if (arg9 == 5) {
                                int var52 = 17;
                                class269 var53 = (class269) class19.method124(arg2, arg3, arg4);
                                if (var53 != null) {
                                    var52 = class16.field126.method1759(false, var53.method342(-2329)).field6028 - -1;
                                }
                                class56 var55;
                                if (var24) {
                                    class551 var54 = new class551(arg8, var12, arg0, var21, var20, var22, super.field6677, 0, class32.field249[arg10] * var52, class395.field5215[arg10] * var52, arg9, arg10);
                                    if (var54.method332(73)) {
                                        var54.method341(arg8, false);
                                    }
                                    var55 = var54;
                                } else {
                                    var55 = new class365(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, 0, class32.field249[arg10] * var52, class395.field5215[arg10] * var52, arg9, arg10, arg1);
                                }
                                class56 var56 = class31.method181(arg2, arg3, arg4);
                                if (var56 instanceof class574) {
                                    ((class574) var56).field8385 = var55;
                                } else {
                                    class96.method595(arg2, arg3, arg4, var55, (class56) null);
                                }
                            } else if (arg9 == 6) {
                                int var57 = 9;
                                class269 var58 = (class269) class19.method124(arg2, arg3, arg4);
                                if (var58 != null) {
                                    var57 = 1 + class16.field126.method1759(false, var58.method342(-2329)).field6028 / 2;
                                }
                                class56 var60;
                                if (var24) {
                                    class551 var59 = new class551(arg8, var12, arg0, var21, var20, var22, super.field6677, arg10, class32.field249[arg10] * var57, class395.field5215[arg10] * var57, arg9, arg10 + 4);
                                    var60 = var59;
                                    if (var59.method332(-90)) {
                                        var59.method341(arg8, false);
                                    }
                                } else {
                                    var60 = new class365(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg10, class66.field639[arg10] * var57, class533.field7499[arg10] * var57, arg9, arg10 + 4, arg1);
                                }
                                class56 var61 = class31.method181(arg2, arg3, arg4);
                                if (!(var61 instanceof class574)) {
                                    class96.method595(arg2, arg3, arg4, var60, (class56) null);
                                } else {
                                    ((class574) var61).field8385 = var60;
                                }
                            } else if (~arg9 == -8) {
                                int var62 = arg10 + 2 & 3;
                                class56 var63;
                                if (!var24) {
                                    var63 = new class365(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, var62, 0, 0, arg9, var62 - -4, arg1);
                                } else {
                                    class551 var64 = new class551(arg8, var12, arg0, var21, var20, var22, super.field6677, var62, 0, 0, arg9, var62 + 4);
                                    var63 = var64;
                                    if (var64.method332(-102)) {
                                        var64.method341(arg8, false);
                                    }
                                }
                                class56 var65 = class31.method181(arg2, arg3, arg4);
                                if (!(var65 instanceof class574)) {
                                    class96.method595(arg2, arg3, arg4, var63, (class56) null);
                                } else {
                                    ((class574) var65).field8385 = var63;
                                }
                            } else if (arg9 == 8) {
                                int var66 = 3 & arg10 + 2;
                                int var67 = 9;
                                class269 var68 = (class269) class19.method124(arg2, arg3, arg4);
                                if (var68 != null) {
                                    var67 = 1 + class16.field126.method1759(false, var68.method342(-2329)).field6028 / 2;
                                }
                                class56 var70;
                                class56 var72;
                                if (!var24) {
                                    class365 var69 = new class365(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg10, class66.field639[arg10] * var67, class533.field7499[arg10] * var67, arg9, arg10 + 4, arg1);
                                    var70 = var69;
                                    class365 var71 = new class365(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg10, 0, 0, arg9, var66 + 4, arg1);
                                    var72 = var71;
                                } else {
                                    class551 var73 = new class551(arg8, var12, arg0, var21, var20, var22, super.field6677, arg10, class66.field639[arg10] * var67, class533.field7499[arg10] * var67, arg9, arg10 + 4);
                                    class551 var74 = new class551(arg8, var12, arg0, var21, var20, var22, super.field6677, arg10, 0, 0, arg9, var66 + 4);
                                    if (var73.method332(-108)) {
                                        var73.method341(arg8, false);
                                    }
                                    var72 = var74;
                                    if (var74.method332(51)) {
                                        var74.method341(arg8, false);
                                    }
                                    var70 = var73;
                                }
                                class96.method595(arg2, arg3, arg4, var70, var72);
                            }
                        } else {
                            class598 var28;
                            if (!var24) {
                                var28 = new class473(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg3, arg3 - -var13 - 1, arg4, arg4 - (-var14 - -1), arg9, arg10, arg1);
                            } else {
                                class638 var29 = new class638(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg3, arg3 + -1 + var13, arg4, arg4 + var14 - 1, arg9, arg10, var23);
                                if (var29.method332(72)) {
                                    var29.method341(arg8, false);
                                }
                                var28 = var29;
                            }
                            class598 var30 = class198.method1072(arg2, arg3, arg4, field3935 != null ? field3935 : (field3935 = method1713("fp")));
                            if (var30 instanceof class79 && var30.field8653 == arg3 && var30.field8650 == arg4) {
                                ((class79) var30).field921 = var28;
                            } else {
                                class380.method2203(var28, false);
                            }
                            if (class184.field2231 && !super.field6677 && ~arg9 <= -13 && ~arg9 >= -18 && ~arg9 != -14 && arg2 > 0 && ~var12.field5983 != -1) {
                                super.field6661[arg2][arg3][arg4] = (byte) class42.method223(super.field6661[arg2][arg3][arg4], 4);
                            }
                            if (~var12.field6000 != -1 && arg5 != null) {
                                arg5.method3160(var13, arg4, (byte) -75, !var12.field6015, var14, arg3, var12.field5979);
                            }
                        }
                    } else {
                        class638 var75 = null;
                        int var76;
                        class598 var77;
                        if (!var24) {
                            var76 = 15;
                            var77 = new class473(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg3, arg3 + var13 + -1, arg4, arg4 - -var14 - 1, arg9, arg10, arg1);
                        } else {
                            class638 var78 = new class638(arg8, var12, arg2, arg0, var21, var20, var22, super.field6677, arg3, arg3 + var13 + -1, arg4, arg4 + var14 + -1, arg9, arg10, var23);
                            var76 = var78.method3654(-122);
                            var77 = var78;
                            var75 = var78;
                        }
                        class598 var79 = class198.method1072(arg2, arg3, arg4, field3935 != null ? field3935 : (field3935 = method1713("fp")));
                        boolean var80 = false;
                        if (var79 instanceof class79 && ~var79.field8653 == ~arg3 && ~var79.field8650 == ~arg4) {
                            ((class79) var79).field921 = var77;
                            var80 = true;
                        }
                        if (var80 || class380.method2203(var77, false)) {
                            if (var75 != null && var75.method332(-62)) {
                                var75.method341(arg8, false);
                            }
                            if (var12.field6023 && class184.field2231) {
                                if (var76 > 30) {
                                    var76 = 30;
                                }
                                for (int var81 = 0; ~var13 <= ~var81; ++var81) {
                                    for (int var82 = 0; ~var82 >= ~var14; ++var82) {
                                        var19.method841(arg3 + var81, arg4 - -var82, var76);
                                    }
                                }
                            }
                        }
                        if (~var12.field6000 != -1 && arg5 != null) {
                            arg5.method3160(var13, arg4, (byte) -45, !var12.field6015, var14, arg3, var12.field5979);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI[ILos;ILqa;)V")
    public final void method1705(byte arg0, int arg1, int[] arg2, class374 arg3, int arg4, class206 arg5) {
        ++field3921;
        if (!super.field6677) {
            boolean var7 = false;
            class310 var8 = null;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            while (true) {
                while (true) {
                    while (true) {
                        while (~arg3.field4966 > ~arg3.field4929.length) {
                            int var19 = arg3.method2129(-65);
                            if (~var19 != -1) {
                                if (var19 != 1) {
                                    if (var19 == 2) {
                                        if (var8 == null) {
                                            var8 = new class310();
                                        }
                                        var8.method1717(arg3, (byte) -15);
                                    } else if (var19 == 128) {
                                        if (arg2 != null) {
                                            arg2[0] = arg3.method2136(false);
                                            arg2[1] = arg3.method2089(true);
                                            arg2[2] = arg3.method2089(true);
                                            arg2[3] = arg3.method2089(true);
                                            arg2[4] = arg3.method2136(false);
                                        } else {
                                            arg3.field4966 += 10;
                                        }
                                    } else {
                                        if (~var19 != -130) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field6682 == null) {
                                            super.field6682 = new byte[4][][];
                                        }
                                        for (int var20 = 0; var20 < 4; ++var20) {
                                            byte var21 = arg3.method2124(126);
                                            if (~var21 == -1 && super.field6682[var20] != null) {
                                                int var22 = arg1;
                                                int var23 = arg1 - -64;
                                                int var24 = arg4;
                                                int var25 = arg4 + 64;
                                                if (var23 < 0) {
                                                    var23 = 0;
                                                } else if (var23 >= super.field6680) {
                                                    var23 = super.field6680;
                                                }
                                                if (arg1 < 0) {
                                                    var22 = 0;
                                                } else if (super.field6680 <= arg1) {
                                                    var22 = super.field6680;
                                                }
                                                if (arg4 >= 0) {
                                                    if (~super.field6673 >= ~arg4) {
                                                        var24 = super.field6673;
                                                    }
                                                } else {
                                                    var24 = 0;
                                                }
                                                if (~var25 > -1) {
                                                    var25 = 0;
                                                } else if (~super.field6673 >= ~var25) {
                                                    var25 = super.field6673;
                                                }
                                                while (~var23 < ~var22) {
                                                    while (~var24 > ~var25) {
                                                        super.field6682[var20][var22][var24] = 0;
                                                        ++var24;
                                                    }
                                                    ++var22;
                                                }
                                            } else if (~var21 != -2) {
                                                if (~var21 == -3) {
                                                    if (super.field6682[var20] == null) {
                                                        super.field6682[var20] = new byte[super.field6680 - -1][super.field6673 + 1];
                                                    }
                                                    if (~var20 < -1) {
                                                        int var26 = arg1;
                                                        int var27 = arg1 + 64;
                                                        int var28 = arg4;
                                                        if (arg4 < 0) {
                                                            var28 = 0;
                                                        } else if (arg4 >= super.field6673) {
                                                            var28 = super.field6673;
                                                        }
                                                        if (arg1 < 0) {
                                                            var26 = 0;
                                                        } else if (arg1 >= super.field6680) {
                                                            var26 = super.field6680;
                                                        }
                                                        int var29 = arg4 + 64;
                                                        if (var27 >= 0) {
                                                            if (super.field6680 <= var27) {
                                                                var27 = super.field6680;
                                                            }
                                                        } else {
                                                            var27 = 0;
                                                        }
                                                        if (~var29 <= -1) {
                                                            if (~super.field6673 >= ~var29) {
                                                                var29 = super.field6673;
                                                            }
                                                        } else {
                                                            var29 = 0;
                                                        }
                                                        while (var27 > var26) {
                                                            while (~var28 > ~var29) {
                                                                super.field6682[var20][var26][var28] = super.field6682[var20 + -1][var26][var28];
                                                                ++var28;
                                                            }
                                                            ++var26;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (super.field6682[var20] == null) {
                                                    super.field6682[var20] = new byte[super.field6680 + 1][super.field6673 + 1];
                                                }
                                                for (int var30 = 0; ~var30 > -65; var30 += 4) {
                                                    for (int var31 = 0; ~var31 > -65; var31 += 4) {
                                                        byte var32 = arg3.method2124(97);
                                                        for (int var33 = var30 - -arg1; ~var33 > ~(arg1 + var30 + 4); ++var33) {
                                                            for (int var34 = arg4 + var31; ~(var31 + 4 - -arg4) < ~var34; ++var34) {
                                                                if (var33 >= 0 && var33 < super.field6680 && ~var34 <= -1 && ~super.field6673 < ~var34) {
                                                                    super.field6682[var20][var33][var34] = var32;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        var7 = true;
                                    }
                                } else {
                                    int var35 = arg3.method2129(-109);
                                    if (~var35 < -1) {
                                        for (int var36 = 0; var35 > var36; ++var36) {
                                            class328 var37 = new class328(arg5, arg3, 0);
                                            if (var37.field4267 == 31) {
                                                class524 var38 = class76.field887.method2242(arg3.method2136(false), true);
                                                var37.method1846(var38.field7343, var38.field7338, -61, var38.field7345, var38.field7339);
                                            }
                                            if (arg5.method1122() > 0) {
                                                class469 var39 = var37.field4282;
                                                int var40 = var39.method2731((byte) -96) + (arg1 << 7);
                                                int var41 = (arg4 << 7) + var39.method2737((byte) -86);
                                                int var42 = var40 >> 7;
                                                int var43 = var41 >> 7;
                                                if (var42 >= 0 && ~var43 <= -1 && super.field6680 > var42 && ~var43 > ~super.field6673) {
                                                    var39.method509(super.field6681[var37.field4274][var42][var43] + -var39.method2730(-1), -1, var40, var41);
                                                    class159.method873(var37);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new class310(arg3);
                            }
                        }
                        if (var8 != null) {
                            for (int var9 = 0; ~var9 > -9; ++var9) {
                                for (int var10 = 0; var10 < 8; ++var10) {
                                    int var11 = (arg1 >> 3) - -var9;
                                    int var12 = (arg4 >> 3) - -var10;
                                    if (~var11 <= -1 && var11 < super.field6680 >> 3 && ~var12 <= -1 && var12 < super.field6673 >> 3) {
                                        class498.method2881(var11, false, var8, var12);
                                    }
                                }
                            }
                        }
                        int var13 = 86 / ((68 - arg0) / 56);
                        if (!var7 && super.field6682 != null) {
                            for (int var14 = 0; ~var14 > -5; ++var14) {
                                if (super.field6682[var14] != null) {
                                    for (int var15 = 0; var15 < 16; ++var15) {
                                        for (int var16 = 0; ~var16 > -17; ++var16) {
                                            int var17 = (arg1 >> 2) + var15;
                                            int var18 = (arg4 >> 2) + var16;
                                            if (~var17 <= -1 && var17 < 26 && var18 >= 0 && var18 < 26) {
                                                super.field6682[var14][var17][var18] = 0;
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

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([Lqt;I[BLqa;II)V")
    public final void method1706(class542[] arg0, int arg1, byte[] arg2, class206 arg3, int arg4, int arg5) {
        ++field3924;
        class374 var7 = new class374(arg2);
        int var8 = -1;
        if (arg5 <= -108) {
            while (true) {
                int var9 = var7.method2141(25315);
                if (var9 == 0) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method2122(false);
                    if (~var11 == -1) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = var10 & 63;
                    int var13 = 63 & var10 >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method2129(-89);
                    int var16 = var15 >> 2;
                    int var17 = var15 & 3;
                    int var18 = arg4 + var13;
                    int var19 = arg1 + var12;
                    if (~var18 < -1 && ~var19 < -1 && ~var18 > ~(super.field6680 + -1) && ~var19 > ~(super.field6673 + -1)) {
                        class542 var20 = null;
                        if (!super.field6677) {
                            int var21 = var14;
                            if (~(class330.field4304[1][var18][var19] & 2) == -3) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg0[var21];
                            }
                        }
                        this.method1704(var14, -1, var14, var18, var19, var20, var8, (byte) -116, arg3, var16, var17);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
    public static void method1707(int arg0) {
        field3928 = null;
        field3934 = null;
        field3919 = null;
        field3931 = null;
        if (arg0 != -128) {
            field3919 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static final void method1708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        ++field3932;
        if (class128.field1574 != null) {
            class463 var14 = null;
            if (arg9 >= 0) {
                int var15 = arg9 + -1;
                class415 var16 = (class415) class309.field3938.method2645((long) var15, (byte) -128);
                if (var16 != null) {
                    var14 = var16.field5390;
                }
            } else {
                int var17 = -arg9 + -1;
                if (class82.field1003 != var17) {
                    var14 = class459.field6329[var17];
                } else {
                    var14 = class103.field1265;
                }
            }
            if (var14 != null) {
                class437 var18 = class16.field126.method1759(false, arg8);
                int var19;
                int var20;
                if (~arg13 != -2 && arg13 != 3) {
                    var19 = var18.field5945;
                    var20 = var18.field5982;
                } else {
                    var20 = var18.field5945;
                    var19 = var18.field5982;
                }
                int var21 = (var20 >> 1) + arg11;
                int var22 = arg11 - -(var20 + 1 >> 1);
                int var23 = 74 / ((-53 - arg7) / 48);
                int var24 = arg3 - -(var19 >> 1);
                int var25 = (var19 + 1 >> 1) + arg3;
                class174 var26 = class128.field1574[arg4];
                int var27 = var26.method855(var21, var24) - -var26.method855(var22, var24) - (-var26.method855(var21, var25) + -var26.method855(var22, var25)) >> 2;
                class434 var28 = new class434();
                var28.field5899 = arg11;
                var28.field5887 = class335.field4358 - -arg10;
                var28.field5882 = arg13;
                var28.field5898 = var14.field8660;
                var28.field5895 = arg6;
                var28.field5889 = arg3;
                var28.field5892 = class335.field4358 + arg5;
                var28.field5879 = arg8;
                if (arg12 > arg1) {
                    int var29 = arg12;
                    arg12 = arg1;
                    arg1 = var29;
                }
                var28.field5897 = arg11 + arg12;
                if (~arg2 > ~arg0) {
                    int var30 = arg0;
                    arg0 = arg2;
                    arg2 = var30;
                }
                var28.field5890 = arg11 - -arg1;
                var28.field5880 = (var28.field5889 << 7) + (var19 << 6);
                var28.field5886 = var27;
                var28.field5894 = arg2 + arg3;
                var28.field5891 = arg0 + arg3;
                var28.field5888 = (var28.field5899 << 7) + (var20 << 6);
                class276.field3637.method1040(var28, -107);
                var14.field6484 = var28;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(IIIZ)V")
    public class308(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class106.field1298, class299.field3844);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIILqa;I[BI[Lqt;II)V")
    public final void method1709(int arg0, int arg1, int arg2, int arg3, class206 arg4, int arg5, byte[] arg6, int arg7, class542[] arg8, int arg9, int arg10) {
        ++field3920;
        class374 var12 = new class374(arg6);
        if (arg10 != -26692) {
            field3919 = null;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method2141(25315);
            if (~var14 == -1) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method2122(false);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = var15 & 63;
                int var18 = (4047 & var15) >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method2129(-91);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (~arg0 == ~var19 && ~arg5 >= ~var18 && ~var18 > ~(arg5 - -8) && arg2 <= var17 && ~var17 > ~(arg2 + 8)) {
                    class437 var23 = class16.field126.method1759(false, var13);
                    int var24 = arg7 - -class260.method1464(7 & var17, var22, arg1, var18 & 7, var23.field5982, -116, var23.field5945);
                    int var25 = arg3 + class51.method283(arg10 ^ -20740, var22, var23.field5945, arg1, var23.field5982, 7 & var18, var17 & 7);
                    if (var24 > 0 && ~var25 < -1 && ~(super.field6680 - 1) < ~var24 && ~(super.field6673 + -1) < ~var25) {
                        class542 var26 = null;
                        if (!super.field6677) {
                            int var27 = arg9;
                            if ((class330.field4304[1][var24][var25] & 2) == 2) {
                                var27 = arg9 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg8[var27];
                            }
                        }
                        this.method1704(arg9, -1, arg9, var24, var25, var26, var13, (byte) -117, arg4, var21, 3 & arg1 + var22);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILqa;III[IIIIILos;)V")
    public final void method1710(int arg0, class206 arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, class374 arg10) {
        ++field3918;
        if (!super.field6677) {
            boolean var12 = false;
            class310 var13 = null;
            if (arg5 != null) {
                arg5[0] = -1;
            }
            int var14 = (arg7 & 7) * 8;
            if (arg9 == 1) {
                int var15 = (7 & arg6) * 8;
                while (true) {
                    int var21;
                    label242: do {
                        while (true) {
                            while (~arg10.field4929.length < ~arg10.field4966) {
                                int var20 = arg10.method2129(-70);
                                if (~var20 != -1) {
                                    if (~var20 == -2) {
                                        var21 = arg10.method2129(-106);
                                        continue label242;
                                    }
                                    if (var20 == 2) {
                                        if (var13 == null) {
                                            var13 = new class310();
                                        }
                                        var13.method1717(arg10, (byte) -15);
                                    } else if (~var20 == -129) {
                                        if (arg5 == null) {
                                            arg10.field4966 += 10;
                                        } else {
                                            arg5[0] = arg10.method2136(false);
                                            arg5[1] = arg10.method2089(true);
                                            arg5[2] = arg10.method2089(true);
                                            arg5[3] = arg10.method2089(true);
                                            arg5[4] = arg10.method2136(false);
                                        }
                                    } else {
                                        if (~var20 != -130) {
                                            throw new IllegalStateException("");
                                        }
                                        if (super.field6682 == null) {
                                            super.field6682 = new byte[4][][];
                                        }
                                        for (int var32 = 0; var32 < 4; ++var32) {
                                            byte var33 = arg10.method2124(-123);
                                            if (~var33 == -1 && super.field6682[arg8] != null) {
                                                if (arg2 >= var32) {
                                                    int var34 = arg0;
                                                    int var35 = arg0 + 7;
                                                    int var36 = arg4;
                                                    if (arg4 >= 0) {
                                                        if (arg4 >= super.field6673) {
                                                            var36 = super.field6673;
                                                        }
                                                    } else {
                                                        var36 = 0;
                                                    }
                                                    if (var35 >= 0) {
                                                        if (~var35 <= ~super.field6680) {
                                                            var35 = super.field6680;
                                                        }
                                                    } else {
                                                        var35 = 0;
                                                    }
                                                    int var37 = arg4 + 7;
                                                    if (~arg0 > -1) {
                                                        var34 = 0;
                                                    } else if (super.field6680 <= arg0) {
                                                        var34 = super.field6680;
                                                    }
                                                    if (~var37 > -1) {
                                                        var37 = 0;
                                                    } else if (var37 >= super.field6673) {
                                                        var37 = super.field6673;
                                                    }
                                                    while (~var35 < ~var34) {
                                                        while (var37 > var36) {
                                                            super.field6682[arg8][var34][var36] = 0;
                                                            ++var36;
                                                        }
                                                        ++var34;
                                                    }
                                                }
                                            } else if (var33 == 1) {
                                                if (super.field6682[arg8] == null) {
                                                    super.field6682[arg8] = new byte[super.field6680 + 1][super.field6673 - -1];
                                                }
                                                for (int var38 = 0; var38 < 64; var38 += 4) {
                                                    for (int var39 = 0; var39 < 64; var39 += 4) {
                                                        byte var40 = arg10.method2124(-13);
                                                        if (~var32 >= ~arg2) {
                                                            for (int var41 = var38; ~(var38 + 4) < ~var41; ++var41) {
                                                                for (int var42 = var39; ~var42 > ~(var39 + 4); ++var42) {
                                                                    if (var14 <= var41 && ~var41 > ~(var14 + 8) && var15 <= var42 && var15 < var15 + 8) {
                                                                        int var43 = class209.method1203(arg3, var41 & 7, 7 & var42, 0) + arg0;
                                                                        int var44 = arg4 - -class182.method996(7, 7 & var42, 7 & var41, arg3);
                                                                        if (var43 >= 0 && var43 < super.field6680 && ~var44 <= -1 && ~var44 > ~super.field6673) {
                                                                            super.field6682[arg8][var43][var44] = var40;
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
                                    var13 = new class310(arg10);
                                }
                            }
                            if (var13 != null) {
                                class498.method2881(arg0 >> 3, false, var13, arg4 >> 3);
                            }
                            if (!var12 && super.field6682 != null && super.field6682[arg8] != null) {
                                int var16 = arg0 + 7;
                                int var17 = arg4 + 7;
                                for (int var18 = arg0; ~var18 > ~var16; ++var18) {
                                    for (int var19 = arg4; var17 > var19; ++var19) {
                                        super.field6682[arg8][var18][var19] = 0;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    } while (~var21 >= -1);
                    for (int var22 = 0; ~var22 > ~var21; ++var22) {
                        class328 var23 = new class328(arg1, arg10, 0);
                        if (var23.field4267 == 31) {
                            class524 var24 = class76.field887.method2242(arg10.method2136(false), true);
                            var23.method1846(var24.field7343, var24.field7338, 70, var24.field7345, var24.field7339);
                        }
                        if (~arg1.method1122() < -1) {
                            class469 var25 = var23.field4282;
                            int var26 = var25.method2731((byte) -96) >> 7;
                            int var27 = var25.method2737((byte) -86) >> 7;
                            if (var23.field4274 == arg2 && var14 <= var26 && ~(var14 + 8) < ~var26 && var27 >= var15 && var27 < var15 + 8) {
                                int var28 = class297.method1656(1023 & var25.method2737((byte) -86), (byte) 125, 1023 & var25.method2731((byte) -96), arg3) + (arg0 << 7);
                                int var29 = var28 >> 7;
                                int var30 = class550.method3221((byte) 87, var25.method2731((byte) -96) & 1023, var25.method2737((byte) -86) & 1023, arg3) + (arg4 << 7);
                                int var31 = var30 >> 7;
                                if (var29 >= 0 && var31 >= 0 && ~super.field6680 < ~var29 && ~super.field6673 < ~var31) {
                                    var25.method509(super.field6681[arg2][var29][var31] + -var25.method2730(-1), arg9 + -2, var28, var30);
                                    class159.method873(var23);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)I")
    public static final int method1711(byte arg0, int arg1) {
        ++field3922;
        int var2 = arg1 >>> 1;
        if (arg0 != -66) {
            method1702(false, (byte[]) null);
        }
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLqa;)V")
    public final void method1712(byte arg0, class206 arg1) {
        class89.method531(arg1);
        ++field3927;
        if (super.field6670 > 1) {
            for (int var3 = 0; super.field6680 > var3; ++var3) {
                for (int var4 = 0; super.field6673 > var4; ++var4) {
                    if (~(2 & class330.field4304[1][var3][var4]) == -3) {
                        class327.method1799(var3, var4);
                    }
                }
            }
        }
        for (int var5 = 0; super.field6670 > var5; ++var5) {
            for (int var6 = 0; ~super.field6673 <= ~var6; ++var6) {
                for (int var7 = 0; var7 <= super.field6680; ++var7) {
                    if (~(1 & super.field6661[var5][var7][var6]) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (~super.field6673 < ~var9 && (1 & super.field6661[var5][var7][var9 + 1]) != 0) {
                            ++var9;
                        }
                        while (var8 > 0 && ~(super.field6661[var5][var7][var8 - 1] & 1) != -1) {
                            --var8;
                        }
                        label171: while (var10 > 0) {
                            for (int var12 = var8; ~var12 >= ~var9; ++var12) {
                                if (~(super.field6661[var10 + -1][var7][var12] & 1) == -1) {
                                    break label171;
                                }
                            }
                            --var10;
                        }
                        label160: while (var11 < 3) {
                            for (int var13 = var8; var9 >= var13; ++var13) {
                                if ((super.field6661[var11 + 1][var7][var13] & 1) == 0) {
                                    break label160;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (-var8 + 1 + var9) * (-var10 + 1 + var11);
                        if (var14 >= 2) {
                            short var15 = 240;
                            int var16 = super.field6681[var11][var7][var8] - var15;
                            int var17 = super.field6681[var10][var7][var8];
                            class391.method2252(1, var7 << 7, var7 << 7, var8 << 7, (var9 << 7) - -128, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; ~var19 >= ~var9; ++var19) {
                                    super.field6661[var18][var7][var19] = (byte) class288.method1624(super.field6661[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if (~(super.field6661[var5][var7][var6] & 2) != -1) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var21 > ~super.field6680 && (super.field6661[var5][var21 + 1][var6] & 2) != 0) {
                            ++var21;
                        }
                        while (~var20 < -1 && (super.field6661[var5][var20 + -1][var6] & 2) != 0) {
                            --var20;
                        }
                        int var23 = var5;
                        label224: while (var22 > 0) {
                            for (int var24 = var20; var24 <= var21; ++var24) {
                                if ((2 & super.field6661[var22 + -1][var24][var6]) == 0) {
                                    break label224;
                                }
                            }
                            --var22;
                        }
                        label213: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; ++var25) {
                                if (~(super.field6661[var23 + 1][var25][var6] & 2) == -1) {
                                    break label213;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (var23 - -1 + -var22) * (-var20 + var21 + 1);
                        if (var26 >= 2) {
                            short var27 = 240;
                            int var28 = super.field6681[var23][var20][var6] + -var27;
                            int var29 = super.field6681[var22][var20][var6];
                            class391.method2252(2, var20 << 7, (var21 << 7) - -128, var6 << 7, var6 << 7, var28, var29);
                            for (int var30 = var22; var30 <= var23; ++var30) {
                                for (int var31 = var20; var31 <= var21; ++var31) {
                                    super.field6661[var30][var31][var6] = (byte) class288.method1624(super.field6661[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if ((4 & super.field6661[var5][var7][var6]) != 0) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; ~var34 < -1 && ~(super.field6661[var5][var7][var34 - 1] & 4) != -1; --var34) {
                        }
                        int var35;
                        for (var35 = var6; ~super.field6673 < ~var35 && ~(super.field6661[var5][var7][var35 + 1] & 4) != -1; ++var35) {
                        }
                        label278: while (~var32 < -1) {
                            for (int var36 = var34; ~var35 <= ~var36; ++var36) {
                                if (~(super.field6661[var5][var32 + -1][var36] & 4) == -1) {
                                    break label278;
                                }
                            }
                            --var32;
                        }
                        label267: while (~super.field6680 < ~var33) {
                            for (int var37 = var34; ~var37 >= ~var35; ++var37) {
                                if (~(super.field6661[var5][var33 - -1][var37] & 4) == -1) {
                                    break label267;
                                }
                            }
                            ++var33;
                        }
                        if ((-var32 + var33 + 1) * (-var34 + var35 + 1) >= 4) {
                            int var38 = super.field6681[var5][var32][var34];
                            class391.method2252(4, var32 << 7, (var33 << 7) + 128, var34 << 7, (var35 << 7) - -128, var38, var38);
                            for (int var39 = var32; var33 >= var39; ++var39) {
                                for (int var40 = var34; ~var40 >= ~var35; ++var40) {
                                    super.field6661[var5][var39][var40] = (byte) class288.method1624(super.field6661[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field6661 = null;
        if (arg0 < 59) {
            field3926 = 85;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1713(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
