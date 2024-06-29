import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class53 {

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "Lkfa;")
    public static class407 field773 = new class407();

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "Lus;")
    public static class328 field779 = new class328(13, 8);

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "Z")
    public boolean field778;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
    public static void method434(int arg0) {
        if (arg0 != -14891) {
            method435(53, 36, null, true, null);
        }
        field779 = null;
        field773 = null;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IILjaa;ZLjaa;)I")
    public static final int method435(int arg0, int arg1, class266 arg2, boolean arg3, class266 arg4) {
        field775++;
        if (arg0 == 1) {
            int var5 = arg2.field8464;
            int var6 = arg4.field8464;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return class327.method1936((byte) -53, arg4.method1604(-30874).field9165, class416.field5920, arg2.method1604(-30874).field9165);
        } else if (arg0 == 3) {
            if (arg2.field3362.equals("-")) {
                if (arg4.field3362.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field3362.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class327.method1936((byte) -53, arg4.field3362, class416.field5920, arg2.field3362);
            }
        } else if (arg0 == 4) {
            if (arg2.method3348((byte) -117)) {
                return arg4.method3348((byte) -114) ? 0 : 1;
            } else if (arg4.method3348((byte) -97)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 != 5) {
            if (arg1 >= -89) {
                field779 = null;
            }
            if (arg0 == 6) {
                if (arg2.method3346(-118)) {
                    return arg4.method3346(-122) ? 0 : 1;
                } else if (arg4.method3346(-127)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 7) {
                if (arg2.method3345(-89)) {
                    return arg4.method3345(122) ? 0 : 1;
                } else if (arg4.method3345(-80)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 8) {
                int var7 = arg2.field3374;
                int var8 = arg4.field3374;
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
                return arg2.field3375 - arg4.field3375;
            }
        } else if (arg2.method3344(true)) {
            return arg4.method3344(true) ? 0 : 1;
        } else if (arg4.method3344(true)) {
            return -1;
        } else {
            return 0;
        }
    }
}
