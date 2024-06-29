import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class236 {

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field3255 = -1;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Z")
    public static boolean field3257 = false;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3256 = "Please remove ";

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field3260 = 0;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field3261 = 0;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V", line = 8)
    public static final void method1279(byte arg0, int arg1) {
        field3259++;
        class40 var2 = class162.method872(arg1, (byte) 92, 5);
        if (arg0 < 67) {
            method1280(false, (byte) -58, (class156) null, 35, (class156) null);
        }
        var2.method193(-119);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZBLjj;ILjj;)I", line = 22)
    public static final int method1280(boolean arg0, byte arg1, class156 arg2, int arg3, class156 arg4) {
        field3254++;
        if (arg3 == 1) {
            int var5 = arg2.field3482;
            int var6 = arg4.field3482;
            if (!arg0) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class75.method424(arg4.method840(69).field3673, class85.field953, (byte) -43, arg2.method840(72).field3673);
        } else if (arg3 == 3) {
            if (arg2.field1981.equals("-")) {
                if (arg4.field1981.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field1981.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class75.method424(arg4.field1981, class85.field953, (byte) -43, arg2.field1981);
            }
        } else if (arg3 == 4) {
            if (arg2.method1435(true)) {
                return arg4.method1435(true) ? 0 : 1;
            } else if (arg4.method1435(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg2.method1436(false)) {
                return arg4.method1436(false) ? 0 : 1;
            } else if (arg4.method1436(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 6) {
            if (arg2.method1433(false)) {
                return arg4.method1433(false) ? 0 : 1;
            } else if (arg4.method1433(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 != 7) {
            if (arg1 != -21) {
                method1282((byte) 98);
            }
            if (arg3 != 8) {
                return arg2.field1975 - arg4.field1975;
            }
            int var7 = arg2.field1974;
            int var8 = arg4.field1974;
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
        } else if (arg2.method1430((byte) -88)) {
            return arg4.method1430((byte) -88) ? 0 : 1;
        } else if (arg4.method1430((byte) -88)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 120)
    public static void method1281(boolean arg0) {
        if (arg0) {
            field3256 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lir;", line = 150)
    public static final class216 method1282(byte arg0) {
        field3258++;
        if (class443.field6455 == null || class61.field626 == null) {
            return null;
        }
        class61.field626.method865(0, class443.field6455);
        if (arg0 <= 72) {
            field3256 = null;
        }
        class216 var1 = (class216) class61.field626.method861(19);
        if (var1 == null) {
            return null;
        } else {
            class228 var2 = class283.method1668(-103, var1.field2903);
            return var2 != null && var2.field3126 && var2.method1239((byte) -123) ? var1 : class342.method2004(47);
        }
    }
}
