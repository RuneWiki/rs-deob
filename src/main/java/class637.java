import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class637 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lvh;")
    public static class125 field9047 = new class125(47, 8);

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lr;")
    public static class98 field9048;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZZLvp;Lvp;I)I")
    public static final int method3593(boolean arg0, boolean arg1, class613 arg2, class613 arg3, int arg4) {
        field9049++;
        if (arg4 == 1) {
            int var5 = arg3.field7512;
            int var6 = arg2.field7512;
            if (!arg1) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class242.method1563(1, arg3.method3467(true).field3300, arg2.method3467(true).field3300, class238.field3511);
        } else if (arg4 != 3) {
            if (!arg0) {
                method3593(true, true, null, null, 91);
            }
            if (arg4 == 4) {
                if (arg3.method3014(40)) {
                    return arg2.method3014(98) ? 0 : 1;
                } else if (arg2.method3014(76)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 5) {
                if (arg3.method3015((byte) -76)) {
                    return arg2.method3015((byte) -101) ? 0 : 1;
                } else if (arg2.method3015((byte) -59)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 6) {
                if (arg3.method3016(true)) {
                    return arg2.method3016(true) ? 0 : 1;
                } else if (arg2.method3016(arg0)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 7) {
                if (arg3.method3018(97)) {
                    return arg2.method3018(101) ? 0 : 1;
                } else if (arg2.method3018(92)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 8) {
                int var7 = arg3.field8779;
                int var8 = arg2.field8779;
                if (arg1) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg3.field8776 - arg2.field8776;
            }
        } else if (arg3.field8777.equals("-")) {
            if (arg2.field8777.equals("-")) {
                return 0;
            } else if (arg1) {
                return -1;
            } else {
                return 1;
            }
        } else if (arg2.field8777.equals("-")) {
            return arg1 ? 1 : -1;
        } else {
            return class242.method1563(1, arg3.field8777, arg2.field8777, class238.field3511);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method3594(byte arg0) {
        if (arg0 < -12) {
            field9047 = null;
            field9048 = null;
        }
    }
}
