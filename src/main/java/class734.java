import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class734 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field10156 = -1;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lhda;")
    public static class752 field10157 = new class752(56, 5);

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lhda;")
    public static class752 field10158 = new class752(2, 4);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field10155;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field10159;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public abstract void method2307(byte arg0);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public abstract void method2310(int arg0);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static void method4105(int arg0) {
        field10158 = null;
        if (arg0 == 0) {
            field10157 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lrs;ILrs;ZI)I")
    public static final int method4106(class653 arg0, int arg1, class653 arg2, boolean arg3, int arg4) {
        field10159++;
        if (arg4 == 1) {
            int var5 = arg2.field6203;
            int var6 = arg0.field6203;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        }
        if (arg1 != -18646) {
            method4105(-10);
        }
        if (arg4 == 2) {
            return class392.method2319(arg2.method3555(3).field3085, class713.field9854, arg1 + 18646, arg0.method3555(3).field3085);
        } else if (arg4 == 3) {
            if (arg2.field8651.equals("-")) {
                if (arg0.field8651.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field8651.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class392.method2319(arg2.field8651, class713.field9854, 0, arg0.field8651);
            }
        } else if (arg4 == 4) {
            if (arg2.method2584(123)) {
                return arg0.method2584(arg1 ^ 0xFFFFB70F) ? 0 : 1;
            } else if (arg0.method2584(arg1 + 18746)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg2.method2583(0)) {
                return arg0.method2583(arg1 ^ 0xFFFFB72A) ? 0 : 1;
            } else if (arg0.method2583(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg2.method2582(true)) {
                return arg0.method2582(true) ? 0 : 1;
            } else if (arg0.method2582(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 7) {
            if (arg2.method2585(1)) {
                return arg0.method2585(arg1 ^ 0xFFFFB72B) ? 0 : 1;
            } else if (arg0.method2585(1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 8) {
            int var7 = arg2.field8656;
            int var8 = arg0.field8656;
            if (arg3) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
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
            return arg2.field8653 - arg0.field8653;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)Z")
    public abstract boolean method2313(boolean arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Ltda;")
    public abstract class638 method2316(int arg0);
}
