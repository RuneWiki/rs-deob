import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class459 extends class601 {

    @OriginalMember(owner = "client!pea", name = "l", descriptor = "[I")
    public static int[] field6366 = new int[32];

    @OriginalMember(owner = "client!pea", name = "o", descriptor = "S")
    public static short field6369 = 256;

    @OriginalMember(owner = "client!pea", name = "m", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!pea", name = "n", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!pea", name = "p", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!pea", name = "q", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!pea", name = "r", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!pea", name = "s", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!pea", name = "u", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!pea", name = "v", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!pea", name = "t", descriptor = "[Loj;")
    public static class211[] field6374;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)I", line = 6)
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            this.method36(-22, (byte) 72);
        }
        ++field6370;
        return !super.field8137.method2156((byte) 123).method1935((byte) 123) ? 2 : 3;
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V", line = 18)
    public static void method2798(int arg0) {
        field6374 = null;
        if (arg0 == -23030) {
            field6366 = null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V", line = 30)
    public final void method41(byte arg0) {
        if (~super.field8131 > -2 || super.field8131 > 3) {
            super.field8131 = this.method45(8976);
        }
        int var2 = 73 / ((59 - arg0) / 33);
        ++field6375;
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lqea;)V", line = 42)
    public class459(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(ILqea;)V", line = 45)
    public class459(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(I)I", line = 52)
    public final int method2799(int arg0) {
        if (arg0 != 0) {
            this.method43(-22, 49);
        }
        ++field6371;
        return super.field8131;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIII)V", line = 71)
    public static final void method2800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 < 58) {
            method2801(92, 123, 31, (class755) null);
        }
        ++field6367;
        if (~class262.field3848 <= ~arg4 && ~class291.field4181 >= ~arg1) {
            boolean var6;
            if (arg5 < class607.field8185) {
                var6 = false;
                arg5 = class607.field8185;
            } else if (arg5 > class726.field10064) {
                arg5 = class726.field10064;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (~class607.field8185 >= ~arg2) {
                if (arg2 <= class726.field10064) {
                    var7 = true;
                } else {
                    arg2 = class726.field10064;
                    var7 = false;
                }
            } else {
                arg2 = class607.field8185;
                var7 = false;
            }
            if (arg4 < class291.field4181) {
                arg4 = class291.field4181;
            } else {
                class102.method675(arg0, -86, arg5, arg2, class538.field7454[arg4++]);
            }
            if (~class262.field3848 <= ~arg1) {
                class102.method675(arg0, -82, arg5, arg2, class538.field7454[arg1--]);
            } else {
                arg1 = class262.field3848;
            }
            if (var6 && var7) {
                for (int var8 = arg4; arg1 >= var8; ++var8) {
                    int[] var9 = class538.field7454[var8];
                    var9[arg5] = var9[arg2] = arg0;
                }
            } else {
                if (!var6) {
                    if (var7) {
                        for (int var10 = arg4; ~arg1 <= ~var10; ++var10) {
                            class538.field7454[var10][arg2] = arg0;
                        }
                        return;
                    }
                } else {
                    for (int var11 = arg4; ~var11 >= ~arg1; ++var11) {
                        class538.field7454[var11][arg5] = arg0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIILuv;)V", line = 177)
    public static final void method2801(int arg0, int arg1, int arg2, class755 arg3) {
        if (arg3.field10492 != 0) {
            if (arg3.field10492 != 1) {
                if (~arg3.field10492 == -3) {
                    arg3.field10443 = -arg3.field10393 + arg1 - arg3.field10429;
                } else if (arg3.field10492 != 3) {
                    if (arg3.field10492 == 4) {
                        arg3.field10443 = (arg3.field10429 * arg1 >> 14) + (-arg3.field10393 + arg1) / 2;
                    } else {
                        arg3.field10443 = -arg3.field10393 + arg1 + -(arg3.field10429 * arg1 >> 14);
                    }
                } else {
                    arg3.field10443 = arg3.field10429 * arg1 >> 14;
                }
            } else {
                arg3.field10443 = (-arg3.field10393 + arg1) / 2 + arg3.field10429;
            }
        } else {
            arg3.field10443 = arg3.field10429;
        }
        if (arg2 <= 47) {
            method2798(-115);
        }
        if (arg3.field10420 != 0) {
            if (arg3.field10420 == 1) {
                arg3.field10447 = (-arg3.field10501 + arg0) / 2 + arg3.field10489;
            } else if (arg3.field10420 != 2) {
                if (arg3.field10420 != 3) {
                    if (arg3.field10420 != 4) {
                        arg3.field10447 = -arg3.field10501 - (arg3.field10489 * arg0 >> 14) + arg0;
                    } else {
                        arg3.field10447 = (arg3.field10489 * arg0 >> 14) + (-arg3.field10501 + arg0) / 2;
                    }
                } else {
                    arg3.field10447 = arg3.field10489 * arg0 >> 14;
                }
            } else {
                arg3.field10447 = -arg3.field10489 + arg0 - arg3.field10501;
            }
        } else {
            arg3.field10447 = arg3.field10489;
        }
        ++field6376;
        if (class498.field6966) {
            if (client.method2738(arg3).field3970 != 0 || ~arg3.field10416 == -1) {
                if (arg3.field10443 >= 0) {
                    if (arg3.field10443 + arg3.field10393 > arg1) {
                        arg3.field10443 = -arg3.field10393 + arg1;
                    }
                } else {
                    arg3.field10443 = 0;
                }
                if (arg3.field10447 >= 0) {
                    if (arg0 < arg3.field10501 + arg3.field10447) {
                        arg3.field10447 = -arg3.field10501 + arg0;
                        return;
                    }
                } else {
                    arg3.field10447 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(II)V", line = 249)
    public final void method43(int arg0, int arg1) {
        int var3 = 115 / ((arg0 - 22) / 34);
        ++field6368;
        super.field8131 = arg1;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IB)I", line = 259)
    public final int method36(int arg0, byte arg1) {
        ++field6372;
        if (arg1 != 22) {
            method2800(-26, -26, 115, -7, 23, 59);
        }
        return 1;
    }
}
