import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public abstract class class498 extends class383 {

    @OriginalMember(owner = "client!iba", name = "w", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!iba", name = "x", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!iba", name = "y", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!iba", name = "z", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!iba", name = "A", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!iba", name = "B", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!iba", name = "C", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!iba", name = "D", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I[Leq;)I", line = 5)
    public final int method479(int arg0, class670[] arg1) {
        if (arg0 != -26355) {
            this.method170(108);
        }
        ++field7207;
        return this.method2199(super.field5179 >> class559.field7984, super.field5176 >> class559.field7984, arg1, -53);
    }

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "(B)Z", line = 16)
    public final boolean method483(byte arg0) {
        if (arg0 <= 101) {
            return false;
        } else {
            ++field7203;
            class245 var2 = class319.method1819(super.field5166, super.field5179 >> class559.field7984, super.field5176 >> class559.field7984);
            return var2 != null && var2.field3029.field8629 ? class504.method2895(super.field5179 >> class559.field7984, 12532, super.field5166, super.field5176 >> class559.field7984, var2.field3029.method179(3370) - -this.method179(3370)) : class64.method349(-121, super.field5179 >> class559.field7984, super.field5166, super.field5176 >> class559.field7984);
        }
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(B)Z", line = 33)
    public final boolean method183(byte arg0) {
        int var2 = 6 % ((arg0 - 12) / 62);
        ++field7209;
        return false;
    }

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "(I)Z", line = 43)
    public final boolean method481(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field7204;
            return class475.field6837[(super.field5179 >> class559.field7984) + -class309.field3830 + class460.field6544][(super.field5176 >> class559.field7984) - (class379.field5139 - class460.field6544)];
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lsp;B)V", line = 54)
    public static final void method2873(class677 arg0, byte arg1) {
        if (~arg0.field9487 != 0) {
            class257 var2 = class265.field3301.method3043(arg0.field9487, -8191);
            if (var2 != null && var2.field3218 != null) {
                label401: {
                    ++arg0.field9423;
                    if (~arg0.field9502 > ~var2.field3218.length && ~var2.field3235[arg0.field9502] > ~arg0.field9423) {
                        arg0.field9423 = 1;
                        ++arg0.field9503;
                        ++arg0.field9502;
                        class635.method3570((byte) -101, class362.field4859 == arg0, arg0.field5179, var2, arg0.field5166, arg0.field5176, arg0.field9502);
                    }
                    if (~var2.field3218.length >= ~arg0.field9502) {
                        arg0.field9502 = 0;
                        arg0.field9423 = 0;
                        if (arg0.field9473) {
                            arg0.field9487 = arg0.method3737((byte) 49).method3055(0);
                            if (arg0.field9487 == -1) {
                                arg0.field9473 = false;
                                break label401;
                            }
                            var2 = class265.field3301.method3043(arg0.field9487, -8191);
                        }
                        class635.method3570((byte) -102, class362.field4859 == arg0, arg0.field5179, var2, arg0.field5166, arg0.field5176, arg0.field9502);
                    }
                    arg0.field9503 = arg0.field9502 - -1;
                    if (arg0.field9503 >= var2.field3218.length) {
                        arg0.field9503 = 0;
                    }
                }
            } else {
                arg0.field9473 = false;
                arg0.field9487 = -1;
            }
        }
        ++field7206;
        if (~arg0.field9504 != 0 && ~arg0.field9420 >= ~class678.field9539) {
            class681 var3 = class63.field654.method2191(false, arg0.field9504);
            int var4 = var3.field9611;
            if (var4 != -1) {
                label403: {
                    class257 var5 = class265.field3301.method3043(var4, arg1 ^ -8099);
                    if (var3.field9596) {
                        if (~var5.field3231 != -4) {
                            if (~var5.field3231 == -2 && ~arg0.field9516 < -1 && arg0.field9479 <= class678.field9539 && arg0.field9506 < class678.field9539) {
                                arg0.field9420 = class678.field9539 - -1;
                                break label403;
                            }
                        } else if (arg0.field9516 > 0 && arg0.field9479 <= class678.field9539 && ~arg0.field9506 > ~class678.field9539) {
                            arg0.field9504 = -1;
                            break label403;
                        }
                    }
                    if (var5 != null && var5.field3218 != null) {
                        if (~arg0.field9501 > -1) {
                            arg0.field9501 = 0;
                            class635.method3570((byte) -66, class362.field4859 == arg0, arg0.field5179, var5, arg0.field5166, arg0.field5176, 0);
                        }
                        ++arg0.field9431;
                        if (~arg0.field9501 > ~var5.field3218.length && ~var5.field3235[arg0.field9501] > ~arg0.field9431) {
                            arg0.field9431 = 1;
                            ++arg0.field9501;
                            class635.method3570((byte) -124, class362.field4859 == arg0, arg0.field5179, var5, arg0.field5166, arg0.field5176, arg0.field9501);
                        }
                        if (~arg0.field9501 <= ~var5.field3218.length) {
                            if (var3.field9596) {
                                arg0.field9501 -= var5.field3205;
                                ++arg0.field9438;
                                if (~var5.field3223 < ~arg0.field9438) {
                                    if (arg0.field9501 >= 0 && ~arg0.field9501 > ~var5.field3218.length) {
                                        class635.method3570((byte) -71, class362.field4859 == arg0, arg0.field5179, var5, arg0.field5166, arg0.field5176, arg0.field9501);
                                    } else {
                                        arg0.field9504 = -1;
                                    }
                                } else {
                                    arg0.field9504 = -1;
                                }
                            } else {
                                arg0.field9504 = -1;
                            }
                        }
                        arg0.field9468 = arg0.field9501 + 1;
                        if (~arg0.field9468 <= ~var5.field3218.length) {
                            if (var3.field9596) {
                                arg0.field9468 -= var5.field3205;
                                if (var5.field3223 > arg0.field9438 + 1) {
                                    if (~arg0.field9468 > -1 || arg0.field9468 >= var5.field3218.length) {
                                        arg0.field9468 = -1;
                                    }
                                } else {
                                    arg0.field9468 = -1;
                                }
                            } else {
                                arg0.field9468 = -1;
                            }
                        }
                    } else {
                        arg0.field9504 = -1;
                    }
                }
            } else {
                arg0.field9504 = -1;
            }
        }
        if (arg0.field9447 != -1 && class678.field9539 >= arg0.field9429) {
            class681 var6 = class63.field654.method2191(false, arg0.field9447);
            int var7 = var6.field9611;
            if (~var7 != 0) {
                label406: {
                    class257 var8 = class265.field3301.method3043(var7, -8191);
                    if (var6.field9596) {
                        if (~var8.field3231 == -4) {
                            if (arg0.field9516 > 0 && ~arg0.field9479 >= ~class678.field9539 && arg0.field9506 < class678.field9539) {
                                arg0.field9447 = -1;
                                break label406;
                            }
                        } else if (~var8.field3231 == -2 && arg0.field9516 > 0 && ~arg0.field9479 >= ~class678.field9539 && class678.field9539 > arg0.field9506) {
                            arg0.field9429 = class678.field9539 + 1;
                            break label406;
                        }
                    }
                    if (var8 != null && var8.field3218 != null) {
                        if (~arg0.field9416 > -1) {
                            arg0.field9416 = 0;
                            class635.method3570((byte) -81, class362.field4859 == arg0, arg0.field5179, var8, arg0.field5166, arg0.field5176, 0);
                        }
                        ++arg0.field9498;
                        if (~var8.field3218.length < ~arg0.field9416 && arg0.field9498 > var8.field3235[arg0.field9416]) {
                            ++arg0.field9416;
                            arg0.field9498 = 1;
                            class635.method3570((byte) -111, class362.field4859 == arg0, arg0.field5179, var8, arg0.field5166, arg0.field5176, arg0.field9416);
                        }
                        if (~var8.field3218.length >= ~arg0.field9416) {
                            if (var6.field9596) {
                                arg0.field9416 -= var8.field3205;
                                ++arg0.field9484;
                                if (~arg0.field9484 > ~var8.field3223) {
                                    if (~arg0.field9416 <= -1 && arg0.field9416 < var8.field3218.length) {
                                        class635.method3570((byte) -97, class362.field4859 == arg0, arg0.field5179, var8, arg0.field5166, arg0.field5176, arg0.field9416);
                                    } else {
                                        arg0.field9447 = -1;
                                    }
                                } else {
                                    arg0.field9447 = -1;
                                }
                            } else {
                                arg0.field9447 = -1;
                            }
                        }
                        arg0.field9440 = arg0.field9416 - -1;
                        if (var8.field3218.length <= arg0.field9440) {
                            if (var6.field9596) {
                                arg0.field9440 -= var8.field3205;
                                if (~(arg0.field9484 + 1) <= ~var8.field3223) {
                                    arg0.field9440 = -1;
                                } else if (~arg0.field9440 > -1 || ~arg0.field9440 <= ~var8.field3218.length) {
                                    arg0.field9440 = -1;
                                }
                            } else {
                                arg0.field9440 = -1;
                            }
                        }
                    } else {
                        arg0.field9447 = -1;
                    }
                }
            } else {
                arg0.field9447 = -1;
            }
        }
        if (~arg0.field9455 != 0 && arg0.field9482 <= 1) {
            class257 var9 = class265.field3301.method3043(arg0.field9455, -8191);
            if (var9.field3231 != 3) {
                if (~var9.field3231 == -2 && ~arg0.field9516 < -1 && arg0.field9479 <= class678.field9539 && arg0.field9506 < class678.field9539) {
                    arg0.field9482 = 2;
                }
            } else if (arg0.field9516 > 0 && ~arg0.field9479 >= ~class678.field9539 && arg0.field9506 < class678.field9539) {
                arg0.field9455 = -1;
                arg0.field9466 = null;
            }
        }
        if (~arg0.field9455 != 0 && arg0.field9482 == 0) {
            class257 var10 = class265.field3301.method3043(arg0.field9455, arg1 + -8283);
            if (var10 != null && var10.field3218 != null) {
                ++arg0.field9442;
                if (arg0.field9435 < var10.field3218.length && ~arg0.field9442 < ~var10.field3235[arg0.field9435]) {
                    arg0.field9442 = 1;
                    ++arg0.field9435;
                    class635.method3570((byte) -123, class362.field4859 == arg0, arg0.field5179, var10, arg0.field5166, arg0.field5176, arg0.field9435);
                }
                if (~var10.field3218.length >= ~arg0.field9435) {
                    ++arg0.field9424;
                    arg0.field9435 -= var10.field3205;
                    if (~arg0.field9424 <= ~var10.field3223) {
                        arg0.field9466 = null;
                        arg0.field9455 = -1;
                    } else if (arg0.field9435 >= 0 && ~var10.field3218.length < ~arg0.field9435) {
                        class635.method3570((byte) -68, class362.field4859 == arg0, arg0.field5179, var10, arg0.field5166, arg0.field5176, arg0.field9435);
                    } else {
                        arg0.field9455 = -1;
                        arg0.field9466 = null;
                    }
                }
                arg0.field9421 = arg0.field9435 + 1;
                if (~arg0.field9421 <= ~var10.field3218.length) {
                    arg0.field9421 -= var10.field3205;
                    if (~(arg0.field9424 + 1) <= ~var10.field3223) {
                        arg0.field9421 = -1;
                    } else if (arg0.field9421 < 0 || var10.field3218.length <= arg0.field9421) {
                        arg0.field9421 = -1;
                    }
                }
            } else {
                arg0.field9455 = -1;
                arg0.field9466 = null;
            }
        }
        if (arg0.field9482 > 0) {
            --arg0.field9482;
        }
        if (arg1 != 92) {
            method2873((class677) null, (byte) -33);
        }
        for (int var11 = 0; var11 < arg0.field9483.length; ++var11) {
            class2 var12 = arg0.field9483[var11];
            if (var12 != null) {
                if (var12.field13 > 0) {
                    --var12.field13;
                } else {
                    class257 var13 = class265.field3301.method3043(var12.field12, -8191);
                    if (var13 != null && var13.field3218 != null) {
                        ++var12.field9;
                        if (~var13.field3218.length < ~var12.field8 && var12.field9 > var13.field3235[var12.field8]) {
                            ++var12.field8;
                            var12.field9 = 1;
                            class635.method3570((byte) -97, class362.field4859 == arg0, arg0.field5179, var13, arg0.field5166, arg0.field5176, var12.field8);
                        }
                        if (~var13.field3218.length >= ~var12.field8) {
                            ++var12.field14;
                            var12.field8 -= var13.field3205;
                            if (~var12.field14 > ~var13.field3223) {
                                if (var12.field8 >= 0 && var12.field8 < var13.field3218.length) {
                                    class635.method3570((byte) -93, class362.field4859 == arg0, arg0.field5179, var13, arg0.field5166, arg0.field5176, var12.field8);
                                } else {
                                    arg0.field9483[var11] = null;
                                }
                            } else {
                                arg0.field9483[var11] = null;
                            }
                        }
                        var12.field10 = var12.field8 + 1;
                        if (~var13.field3218.length >= ~var12.field10) {
                            var12.field10 -= var13.field3205;
                            if (var12.field14 - -1 < var13.field3223) {
                                if (~var12.field10 > -1 || var12.field10 >= var13.field3218.length) {
                                    var12.field10 = -1;
                                }
                            } else {
                                var12.field10 = -1;
                            }
                        }
                    } else {
                        arg0.field9483[var11] = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIILrb;Lr;Z)V", line = 487)
    public final void method184(int arg0, int arg1, int arg2, int arg3, class383 arg4, class564 arg5, boolean arg6) {
        ++field7205;
        if (arg2 == 2) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "(I)V", line = 501)
    public final void method170(int arg0) {
        if (arg0 >= 20) {
            ++field7202;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIILr;)V", line = 514)
    public static final void method2874(int arg0, int arg1, int arg2, class564 arg3) {
        if (arg0 == 3) {
            ++field7208;
            class185.field2107 = arg3;
            class266.field3308 = new class390[arg2][arg1];
            if (class361.field4842 != null) {
                class258.field3245 = class301.method1746(class361.field4842[0], class361.field4842[2], class361.field4842[4], (byte) -24, class361.field4842[1], class361.field4842[3], class361.field4842[5]);
            }
            class662.field9282 = new class390();
            class272.method1599((byte) 62);
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(IIIII)V", line = 531)
    public class498(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field5179 = arg0;
        super.field5166 = (byte) arg3;
        super.field5169 = (byte) arg4;
        super.field5178 = arg1;
        super.field5176 = arg2;
    }
}
