import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class208 extends class719 {

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "Z")
    private boolean field2678 = false;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Luq;")
    public static class172 field2682;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIILqba;I)V", line = 3)
    public static final void method1358(boolean arg0, int arg1, int arg2, class425 arg3, int arg4) {
        ++field2672;
        class588 var5 = arg3.method2573(-1);
        if (arg0) {
            field2673 = 4;
        }
        int var6 = arg3.field6098 - arg3.field6109.field1854 & 16383;
        if (~arg4 != 0) {
            if (~arg3.field6149 == 0 || var6 < 10240 && ~var6 < -2049) {
                if (~var6 == -1 && ~arg3.field6172 >= -26) {
                    if (arg4 == 2 && var5.field8030 != -1) {
                        arg3.field6111 = var5.field8030;
                    } else if (arg4 == 0 && ~var5.field7989 != 0) {
                        arg3.field6111 = var5.field7989;
                    } else {
                        arg3.field6111 = var5.field8038;
                    }
                    arg3.field6128 = false;
                } else {
                    arg3.field6128 = false;
                    if (~arg4 == -3 && ~var5.field8030 != 0) {
                        if (~arg2 > -1 && ~var5.field8034 != 0) {
                            arg3.field6111 = var5.field8034;
                        } else if (arg2 > 0 && ~var5.field7991 != 0) {
                            arg3.field6111 = var5.field7991;
                        } else {
                            arg3.field6111 = var5.field8030;
                        }
                    } else if (~arg4 == -1 && ~var5.field7989 != 0) {
                        if (~arg2 > -1 && var5.field8021 != -1) {
                            arg3.field6111 = var5.field8021;
                        } else if (~arg2 < -1 && ~var5.field7995 != 0) {
                            arg3.field6111 = var5.field7995;
                        } else {
                            arg3.field6111 = var5.field7989;
                        }
                    } else if (~arg2 > -1 && ~var5.field7980 != 0) {
                        arg3.field6111 = var5.field7980;
                    } else if (~arg2 < -1 && var5.field8007 != -1) {
                        arg3.field6111 = var5.field8007;
                    } else {
                        arg3.field6111 = var5.field8038;
                    }
                }
            } else {
                int var7 = 16383 & class168.field2217[arg1] + -arg3.field6109.field1854;
                arg3.field6128 = false;
                if (~arg4 == -3 && ~var5.field8030 != 0) {
                    if (~var7 < -2049 && ~var7 >= -6145 && var5.field8008 != -1) {
                        arg3.field6111 = var5.field8008;
                    } else if (var7 >= 10240 && ~var7 > -14337 && ~var5.field8000 != 0) {
                        arg3.field6111 = var5.field8000;
                    } else if (~var7 < -6145 && var7 < 10240 && ~var5.field7992 != 0) {
                        arg3.field6111 = var5.field7992;
                    } else {
                        arg3.field6111 = var5.field8030;
                    }
                } else if (arg4 == 0 && ~var5.field7989 != 0) {
                    if (~var7 < -2049 && var7 <= 6144 && var5.field8018 != -1) {
                        arg3.field6111 = var5.field8018;
                    } else if (var7 >= 10240 && var7 < 14336 && var5.field8009 != -1) {
                        arg3.field6111 = var5.field8009;
                    } else if (var7 > 6144 && ~var7 > -10241 && var5.field7985 != -1) {
                        arg3.field6111 = var5.field7985;
                    } else {
                        arg3.field6111 = var5.field7989;
                    }
                } else if (var7 > 2048 && ~var7 >= -6145 && ~var5.field8027 != 0) {
                    arg3.field6111 = var5.field8027;
                } else if (~var7 <= -10241 && var7 < 14336 && var5.field8013 != -1) {
                    arg3.field6111 = var5.field8013;
                } else if (~var7 < -6145 && var7 < 10240 && var5.field8016 != -1) {
                    arg3.field6111 = var5.field8016;
                } else {
                    arg3.field6111 = var5.field8038;
                }
            }
        } else if (~var6 == -1 && arg3.field6172 <= 25) {
            if (!arg3.field6128 || !var5.method3300(119, arg3.field6111)) {
                arg3.field6111 = var5.method3302(89);
                arg3.field6128 = ~arg3.field6111 != 0;
            }
        } else {
            if (arg2 < 0 && var5.field8026 != -1) {
                arg3.field6111 = var5.field8026;
                arg3.field6128 = false;
            } else if (~arg2 < -1 && var5.field8035 != -1) {
                arg3.field6111 = var5.field8035;
            } else {
                arg3.field6111 = var5.field8038;
            }
            arg3.field6128 = false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V", line = 169)
    public static final void method1359(int arg0, int arg1, int arg2) {
        ++field2679;
        if (class422.method2542(123, arg1)) {
            if (arg0 == -13540) {
                class31.method174(arg2, class419.field6032[arg1], arg0 + 13417);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V", line = 184)
    public final void method220(int arg0) {
        if (arg0 == 23363) {
            ++field2681;
            if (this.field2678) {
                super.field9776.method3886(66, 1);
                super.field9776.method2765(arg0 + -23470, class96.field1374);
                super.field9776.method3911(22228, class291.field4152, class291.field4152);
                super.field9776.method3859(arg0 + -23241, 2, class64.field840);
                super.field9776.method3867((byte) 18, class790.field10851, 0);
                super.field9776.method3878((byte) 86);
                super.field9776.method3882(arg0 + -23363, (class352) null);
                super.field9776.method3886(arg0 ^ 23403, 0);
                this.field2678 = false;
            } else {
                super.field9776.method3867((byte) 18, class790.field10851, 0);
            }
            super.field9776.method3911(22228, class291.field4152, class291.field4152);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZZ)V", line = 213)
    public final void method225(boolean arg0, boolean arg1) {
        super.field9776.method3911(22228, class117.field1574, class291.field4152);
        ++field2680;
        if (!arg0) {
            this.method218((byte) -102);
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V", line = 225)
    public static void method1360(byte arg0) {
        if (arg0 <= -50) {
            field2682 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lee;)V", line = 238)
    public class208(class703 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Z", line = 242)
    public final boolean method218(byte arg0) {
        ++field2676;
        if (arg0 < 16) {
            this.method220(70);
        }
        return true;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V", line = 255)
    public final void method222(int arg0, boolean arg1) {
        ++field2677;
        class165 var3 = super.field9776.method3865(0);
        if (var3 != null && arg1) {
            super.field9776.method3886(86, 1);
            super.field9776.method3882(0, var3);
            super.field9776.method2765(-67, class489.field6822);
            super.field9776.method3886(35, 1);
            super.field9776.method3911(22228, class117.field1574, class328.field4644);
            super.field9776.method2812(2, false, class417.field6010, true, 0);
            super.field9776.method3867((byte) 18, class264.field3887, 0);
            class532 var4 = super.field9776.method3877(3);
            var4.method3085((byte) -91, super.field9776.method3897(0));
            super.field9776.method3883((byte) 70, class480.field6741);
            super.field9776.method3886(50, 0);
            this.field2678 = true;
        } else {
            super.field9776.method3867((byte) 18, class264.field3887, 0);
        }
        if (arg0 > -126) {
            this.field2678 = false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLb;I)V", line = 289)
    public final void method221(boolean arg0, class352 arg1, int arg2) {
        if (arg0) {
            ++field2674;
            super.field9776.method3882(0, arg1);
            super.field9776.method3871(0, arg2);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V", line = 301)
    public final void method219(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field2678 = true;
        }
        ++field2675;
    }
}
