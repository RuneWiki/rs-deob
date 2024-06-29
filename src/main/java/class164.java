import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class164 extends class450 {

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "Lhda;")
    public static class752 field2487 = new class752(103, 0);

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "Lkaa;")
    public static class47 field2492 = new class47(9, -1);

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!tba", name = "r", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "Lhu;")
    public static class133 field2491;

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "Lha;")
    public static class59 field2494;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V", line = 3)
    public final void method73(byte arg0) {
        ++field2484;
        if (super.field6171.method1671(7108) == class628.field8355) {
            if (super.field6171.method1672(0)) {
                super.field6170 = 0;
            }
        } else {
            super.field6170 = 1;
        }
        if (~super.field6170 != -1 && super.field6170 != 1) {
            super.field6170 = this.method68(false);
        }
        if (arg0 != 98) {
            this.method1180(-30);
        }
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lup;)V", line = 24)
    public class164(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)I", line = 27)
    public final int method68(boolean arg0) {
        ++field2485;
        if (arg0) {
            field2492 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIZI)V", line = 38)
    public static final void method1178(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg0 << 3;
        int var5 = arg1 << 3;
        ++field2488;
        int var6 = arg3 << 3;
        class578.field7586 = (float) var5;
        if (~class278.field3898 == -3) {
            class22.field400 = var6;
            class372.field5175 = var4;
            class332.field4729 = var5;
        }
        class547.field7230 = (float) var4;
        class614.method3341(-47);
        class616.field8238 = true;
        if (arg2) {
            method1183(65, 6);
        }
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(Z)V", line = 63)
    public static void method1179(boolean arg0) {
        if (arg0) {
            method1178(65, -123, true, -44);
        }
        field2494 = null;
        field2487 = null;
        field2492 = null;
        field2491 = null;
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)Z", line = 76)
    public final boolean method1180(int arg0) {
        ++field2489;
        if (super.field6171.method1672(0)) {
            return false;
        } else {
            if (arg0 != 260) {
                field2492 = null;
            }
            return super.field6171.method1671(7108) == class628.field8355;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lee;I)V", line = 94)
    public static final void method1181(class677 arg0, int arg1) {
        ++field2490;
        if (arg1 != -1) {
            method1179(false);
        }
        for (int var2 = 0; var2 < class517.field6907; ++var2) {
            int var3 = arg0.method3790((byte) 22);
            int var4 = arg0.method3807(-1);
            if (~var4 == -65536) {
                var4 = -1;
            }
            if (class82.field989[var3] != null) {
                class82.field989[var3].field6203 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)I", line = 124)
    public final int method75(int arg0, int arg1) {
        ++field2486;
        if (super.field6171.method1672(arg0)) {
            return 3;
        } else if (super.field6171.method1671(arg0 + 7108) == class628.field8355) {
            if (~arg1 == -1) {
                if (super.field6171.field3884.method2464(true) == 1) {
                    return 2;
                }
                if (super.field6171.field3868.method1851(true) == 1) {
                    return 2;
                }
                if (super.field6171.field3915.method574(true) > 0) {
                    return 2;
                }
            }
            return 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZI)V", line = 157)
    public final void method67(boolean arg0, int arg1) {
        ++field2493;
        if (!arg0) {
            field2487 = null;
        }
        super.field6170 = arg1;
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(Z)I", line = 175)
    public final int method1182(boolean arg0) {
        if (!arg0) {
            return 21;
        } else {
            ++field2496;
            return super.field6170;
        }
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(ILup;)V", line = 187)
    public class164(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(II)Lon;", line = 196)
    public static final class340 method1183(int arg0, int arg1) {
        ++field2495;
        if (~arg0 == -1) {
            if ((double) class744.field10349 == 3.0D) {
                return class607.field7987;
            }
            if ((double) class744.field10349 == 4.0D) {
                return class141.field2264;
            }
            if ((double) class744.field10349 == 6.0D) {
                return class565.field7435;
            }
            if ((double) class744.field10349 >= 8.0D) {
                return class668.field9129;
            }
        } else if (arg0 != 1) {
            if (arg0 == 2) {
                if ((double) class744.field10349 == 3.0D) {
                    return class410.field5685;
                }
                if ((double) class744.field10349 == 4.0D) {
                    return class363.field5115;
                }
                if ((double) class744.field10349 == 6.0D) {
                    return class288.field4082;
                }
                if ((double) class744.field10349 >= 8.0D) {
                    return class127.field2094;
                }
            }
        } else {
            if ((double) class744.field10349 == 3.0D) {
                return class565.field7435;
            }
            if ((double) class744.field10349 == 4.0D) {
                return class668.field9129;
            }
            if ((double) class744.field10349 == 6.0D) {
                return class410.field5685;
            }
            if ((double) class744.field10349 >= 8.0D) {
                return class363.field5115;
            }
        }
        int var2 = 4 / ((arg1 - -12) / 32);
        return null;
    }
}
