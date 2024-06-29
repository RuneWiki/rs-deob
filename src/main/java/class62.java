import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class62 extends class452 {

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "Lv;")
    public class411 field759;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "Lr;")
    public static class124 field760;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILgo;IZLgo;)I", line = 7)
    public static final int method544(int arg0, class445 arg1, int arg2, boolean arg3, class445 arg4) {
        field762++;
        if (arg0 != 0) {
            field760 = null;
        }
        if (arg2 == 1) {
            int var5 = arg1.field4343;
            int var6 = arg4.field4343;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class313.method1995(class224.field3673, arg4.method2733(-1).field1272, arg1.method2733(-1).field1272, true);
        } else if (arg2 == 3) {
            if (arg1.field6532.equals("-")) {
                if (arg4.field6532.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field6532.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class313.method1995(class224.field3673, arg4.field6532, arg1.field6532, true);
            }
        } else if (arg2 == 4) {
            if (arg1.method1853(8)) {
                return arg4.method1853(8) ? 0 : 1;
            } else if (arg4.method1853(arg0 ^ 0x8)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg1.method1850(arg0 ^ 0x6)) {
                return arg4.method1850(6) ? 0 : 1;
            } else if (arg4.method1850(6)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg1.method1854((byte) -81)) {
                return arg4.method1854((byte) -81) ? 0 : 1;
            } else if (arg4.method1854((byte) -81)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 7) {
            if (arg1.method1856(true)) {
                return arg4.method1856(true) ? 0 : 1;
            } else if (arg4.method1856(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 8) {
            int var7 = arg1.field6537;
            int var8 = arg4.field6537;
            if (arg3) {
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
            return arg1.field6531 - arg4.field6531;
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lv;)V", line = 108)
    public class62(class411 arg0) {
        this.field759 = arg0;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V", line = 117)
    public static void method545(byte arg0) {
        if (arg0 != 47) {
            field760 = null;
        }
        field760 = null;
    }
}
