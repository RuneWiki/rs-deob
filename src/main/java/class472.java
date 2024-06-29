import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class472 extends class499 {

    @OriginalMember(owner = "client!t", name = "r", descriptor = "S")
    public short field6897;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "[[I")
    public static int[][] field6894 = new int[128][128];

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Luf;")
    public static class310 field6898 = new class310(55, 0);

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lf;")
    public static class529 field6901;

    // $FF: synthetic field
    @OriginalMember(owner = "client!t", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field6902;

    // $FF: synthetic method
    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2783(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BLtf;)V", line = 5)
    public static final void method2778(byte arg0, class192 arg1) {
        field6895++;
        class129 var2 = (class129) class453.field6620.method979((byte) 28, (long) arg1.field297);
        if (var2 != null) {
            if (var2.field1766 != null) {
                class189.field2623.method942(var2.field1766);
                var2.field1766 = null;
            }
            var2.method2946(-109);
        }
        int var3 = -15 % ((39 - arg0) / 60);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)V", line = 33)
    public static final void method2779(boolean arg0, int arg1) {
        field6893++;
        if (arg0) {
            method2781(-90);
        }
        class163 var2 = class271.method1546(arg1, 1, true);
        var2.method1010(1504);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IBI)I", line = 51)
    public static final int method2780(int arg0, byte arg1, int arg2) {
        field6899++;
        if (arg1 <= 126) {
            field6901 = null;
        }
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 74)
    public static void method2781(int arg0) {
        field6901 = null;
        field6898 = null;
        field6894 = null;
        if (arg0 > -12) {
            method2778((byte) 75, null);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIII)V", line = 93)
    public static final void method2782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 2) {
            method2778((byte) -68, null);
        }
        field6896++;
        if (arg5 < 0 || arg1 < 0 || (class442.field6435 - 1) <= arg5 || (class232.field3217 - 1) <= arg1) {
            return;
        }
        if (class385.field5410 == null) {
            return;
        }
        if (arg7 != 0) {
            if (arg7 == 1) {
                class55 var8 = (class55) class503.method2956(arg0, arg5, arg1);
                if (var8 != null) {
                    if (var8 instanceof class511) {
                        ((class511) var8).field7508.method1170(arg3, true);
                        return;
                    }
                    int var9 = var8.method354((byte) 122);
                    if (arg6 != 4 && arg6 != 5) {
                        if (arg6 == 6) {
                            class151.method955(arg0, arg5, 4, var9, arg1, arg4 + 4, (byte) -6, arg3, arg7);
                            return;
                        }
                        if (arg6 == 7) {
                            class151.method955(arg0, arg5, 4, var9, arg1, (arg4 + 2 & 0x3) + 4, (byte) -6, arg3, arg7);
                        } else if (arg6 == 8) {
                            class151.method955(arg0, arg5, 4, var9, arg1, arg4 + 4, (byte) -6, arg3, arg7);
                            class151.method955(arg0, arg5, 4, var9, arg1, (arg4 + 2 & 0x3) + 4, (byte) -6, arg3, arg7);
                            return;
                        }
                        return;
                    }
                    class151.method955(arg0, arg5, 4, var9, arg1, arg4, (byte) -6, arg3, arg7);
                    return;
                }
            } else if (arg7 == 2) {
                class55 var11 = (class55) class490.method2876(arg0, arg5, arg1, field6902 == null ? (field6902 = method2783("jv")) : field6902);
                if (var11 == null) {
                    return;
                }
                if (arg6 == 11) {
                    arg6 = 10;
                }
                if (var11 instanceof class158) {
                    ((class158) var11).field2256.method1170(arg3, true);
                    return;
                }
                class151.method955(arg0, arg5, arg6, var11.method354((byte) 127), arg1, arg4, (byte) -6, arg3, arg7);
            } else if (arg7 == 3) {
                class55 var10 = (class55) class391.method2240(arg0, arg5, arg1);
                if (var10 != null) {
                    if (!(var10 instanceof class496)) {
                        class151.method955(arg0, arg5, arg6, var10.method354((byte) -9), arg1, arg4, (byte) -6, arg3, arg7);
                        return;
                    }
                    ((class496) var10).field7310.method1170(arg3, true);
                    return;
                }
            }
            return;
        }
        class55 var12 = (class55) class195.method1184(arg0, arg5, arg1);
        class55 var13 = (class55) class190.method1146(arg0, arg5, arg1);
        if (var12 != null && arg6 != 2) {
            if (var12 instanceof class268) {
                ((class268) var12).field3673.method1170(arg3, true);
            } else {
                class151.method955(arg0, arg5, arg6, var12.method354((byte) 126), arg1, arg4, (byte) -6, arg3, arg7);
            }
        }
        if (var13 == null) {
            return;
        }
        if (var13 instanceof class268) {
            ((class268) var13).field3673.method1170(arg3, true);
            return;
        }
        class151.method955(arg0, arg5, arg6, var13.method354((byte) 123), arg1, arg4, (byte) -6, arg3, arg7);
        return;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V", line = 211)
    public class472() {
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(S)V", line = 213)
    public class472(short arg0) {
        this.field6897 = arg0;
    }
}
