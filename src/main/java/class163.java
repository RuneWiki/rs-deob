import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class163 extends class219 {

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "Lbd;")
    public static class162 field2883 = class17.method142(0, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field2882 = 0;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "Lbd;")
    private static class162 field2885 = class17.method142(0, "Loading textures )2 ");

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field2887 = -1;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "Z")
    public static boolean field2890 = false;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "Lbd;")
    public static class162 field2889 = class17.method142(0, "Fallen lassen");

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "Lbd;")
    public static class162 field2888 = field2885;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZIIIIIIIII)Z", line = 9)
    public static final boolean method1292(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2893++;
        if (class122.field2215.method293((byte) 25) == 2) {
            return class252.method1757(arg7, arg9, arg1, arg10, arg3, arg0, arg6, arg2, arg8, 119, arg4, arg5);
        } else if (class122.field2215.method293((byte) 25) <= 2) {
            return arg11 == 1 ? class62.method425(arg7, arg1, arg4, arg5, arg9, arg3, arg6, arg8, arg2, arg0, (byte) -127, arg10) : true;
        } else {
            return class201.method1504(arg1, arg3, arg9, arg0, arg8, arg2, class122.field2215.method293((byte) 25), 0, arg7, arg4, arg10, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)V", line = 30)
    public static void method1293(byte arg0) {
        field2889 = null;
        if (arg0 != 42) {
            method1294(12, (class94) null);
        }
        field2888 = null;
        field2885 = null;
        field2883 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILb;)V", line = 47)
    public static final void method1294(int arg0, class94 arg1) {
        field2891++;
        if (arg0 < 32) {
            method1294(70, (class94) null);
        }
        if (class224.field3748 != null) {
            try {
                class224.field3748.method1775((byte) 46, 0L);
                class224.field3748.method1781(-1, arg1.field1653, 24, arg1.field1681);
            } catch (Exception var3) {
            }
        }
        arg1.field1653 += 24;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)I", line = 69)
    private final int method1295(int arg0, int arg1, int arg2) {
        field2886++;
        int var4 = arg1 * 57 + arg0;
        if (arg2 != 4096) {
            field2888 = (class162) null;
        }
        int var5 = var4 << 1 ^ var4;
        return 4096 - (((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(ILb;)V", line = 92)
    public static final void method1296(int arg0, class94 arg1) {
        field2892++;
        if (arg0 != -15548 || arg1.field1681.length - arg1.field1653 < 1) {
            return;
        }
        int var2 = arg1.method756(915905888);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg1.field1681.length - arg1.field1653)) {
            return;
        }
        class39.field639 = arg1.method756(arg0 ^ 0xC9685E24);
        if (class39.field639 < 1) {
            class39.field639 = 1;
        } else if (class39.field639 > 4) {
            class39.field639 = 4;
        }
        class256.method1769(arg1.method756(915905888) == 1, 1);
        class45.field724 = arg1.method756(915905888) == 1;
        class267.field4461 = arg1.method756(915905888) == 1;
        class203.field3439 = arg1.method756(915905888) == 1;
        class261.field4362 = arg1.method756(arg0 + 915921436) == 1;
        class295.field4945 = arg1.method756(915905888) == 1;
        class247.field4090 = arg1.method756(915905888) == 1;
        class92.field1621 = arg1.method756(915905888) == 1;
        class291.field4906 = arg1.method756(arg0 ^ 0xC9685E24);
        if (class291.field4906 > 2) {
            class291.field4906 = 2;
        }
        if (var2 < 2) {
            class92.field1634 = arg1.method756(915905888) == 1;
            arg1.method756(915905888);
        } else {
            class92.field1634 = arg1.method756(915905888) == 1;
        }
        class27.field458 = arg1.method756(915905888) == 1;
        class259.field4317 = arg1.method756(915905888) == 1;
        class112.field2031 = arg1.method756(915905888);
        if (class112.field2031 > 2) {
            class112.field2031 = 2;
        }
        class156.field2746 = arg1.method756(915905888) == 1;
        class154.field2727 = arg1.method756(915905888);
        if (class154.field2727 > 127) {
            class154.field2727 = 127;
        }
        class135.field2413 = arg1.method756(915905888);
        class256.field4256 = arg1.method756(arg0 ^ 0xC9685E24);
        if (class256.field4256 > 127) {
            class256.field4256 = 127;
        }
        if (var2 >= 1) {
            class204.field3452 = arg1.method761((byte) 108);
            class138.field2465 = arg1.method761((byte) 108);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method756(915905888);
        }
        if (var2 >= 4) {
            arg1.method756(915905888);
        }
        if (var2 >= 5) {
            class220.field3674 = arg1.method747(false);
        }
        if (var2 >= 6) {
            class258.field4296 = arg1.method756(arg0 + 915921436);
        }
        if (var2 >= 7) {
            class25.field413 = arg1.method756(915905888) == 1;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)[I", line = 232)
    public final int[] method41(boolean arg0, int arg1) {
        field2884++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (!arg0) {
            method1293((byte) 5);
        }
        if (this.field3654.field4967) {
            int var4 = class53.field842[arg1];
            for (int var5 = 0; var5 < class128.field2326; var5++) {
                var3[var5] = this.method1295(class280.field4762[var5], var4, 4096) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 264)
    public class163() {
        super(0, true);
    }
}
