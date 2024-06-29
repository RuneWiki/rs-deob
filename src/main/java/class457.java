import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class457 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field6710 = 1339;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Luu;")
    public static class188 field6711 = null;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field6713 = 104;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZILkf;ZLkf;)I", line = 3)
    public static final int method2752(boolean arg0, int arg1, class166 arg2, boolean arg3, class166 arg4) {
        if (arg3) {
            method2753(55);
        }
        field6712++;
        if (arg1 == 1) {
            int var5 = arg2.field2013;
            int var6 = arg4.field2013;
            if (!arg0) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class17.method134(-39, arg4.method1172(-14839).field3409, arg2.method1172(-14839).field3409, class377.field5585);
        } else if (arg1 == 3) {
            if (arg2.field2351.equals("-")) {
                if (arg4.field2351.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field2351.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class17.method134(117, arg4.field2351, arg2.field2351, class377.field5585);
            }
        } else if (arg1 == 4) {
            if (arg2.method1059(false)) {
                return arg4.method1059(false) ? 0 : 1;
            } else if (arg4.method1059(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 5) {
            if (arg2.method1060(16563)) {
                return arg4.method1060(16563) ? 0 : 1;
            } else if (arg4.method1060(16563)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 6) {
            if (arg2.method1062(512)) {
                return arg4.method1062(512) ? 0 : 1;
            } else if (arg4.method1062(512)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 7) {
            if (arg2.method1061((byte) -92)) {
                return arg4.method1061((byte) -92) ? 0 : 1;
            } else if (arg4.method1061((byte) -92)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 8) {
            int var7 = arg2.field2360;
            int var8 = arg4.field2360;
            if (arg0) {
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
            return arg2.field2350 - arg4.field2350;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 101)
    public static void method2753(int arg0) {
        field6711 = null;
        if (arg0 != 1) {
            method2754(-14, 121, 10);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z", line = 121)
    public static final boolean method2754(int arg0, int arg1, int arg2) {
        int var3 = -124 / ((-arg1 - 73) / 49);
        field6709++;
        return false;
    }
}
