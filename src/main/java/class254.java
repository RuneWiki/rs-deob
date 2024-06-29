import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class254 extends class65 {

    @OriginalMember(owner = "client!za", name = "k", descriptor = "[Llk;")
    public static class249[] field4020 = new class249[14];

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!za", name = "n", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!za", name = "p", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!za", name = "o", descriptor = "Lwq;")
    public static class676 field4024;

    // $FF: synthetic field
    @OriginalMember(owner = "client!za", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field4026;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(BI)I")
    public static final int method1721(byte arg0, int arg1) {
        field4023++;
        if (arg0 != -9) {
            field4020 = null;
        }
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V")
    public static void method1722(byte arg0) {
        field4020 = null;
        if (arg0 != -65) {
            field4020 = null;
        }
        field4024 = null;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(III)Z")
    public static final boolean method1723(int arg0, int arg1, int arg2) {
        if (arg1 != 28510) {
            method1724(99, null);
        }
        field4021++;
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(ILrw;)V")
    public static final void method1724(int arg0, class248 arg1) {
        if (arg0 != -18620) {
            field4024 = null;
        }
        field4025++;
        if (class488.field7062 == null) {
            return;
        }
        class523 var2 = null;
        if (arg1.field3967 == 0) {
            var2 = (class523) class486.method2948(arg1.field3965, arg1.field3971, arg1.field3964);
        }
        if (arg1.field3967 == 1) {
            var2 = (class523) class55.method521(arg1.field3965, arg1.field3971, arg1.field3964);
        }
        if (arg1.field3967 == 2) {
            var2 = (class523) class140.method1093(arg1.field3965, arg1.field3971, arg1.field3964, field4026 == null ? (field4026 = method1726("tw")) : field4026);
        }
        if (arg1.field3967 == 3) {
            var2 = (class523) class558.method3243(arg1.field3965, arg1.field3971, arg1.field3964);
        }
        if (var2 == null) {
            arg1.field3969 = 0;
            arg1.field3976 = 0;
            arg1.field3968 = -1;
        } else {
            arg1.field3968 = var2.method87(2836);
            arg1.field3976 = var2.method85((byte) -72);
            arg1.field3969 = var2.method98(-12194);
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIZI)V")
    public static final void method1725(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4022++;
        if (arg3) {
            return;
        }
        int var5 = class486.field7031;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class486.field7031 = 2;
            class613.field8647 = arg1;
            class750.field10457 = arg2;
            class79.field1155 = arg4;
            class428.field6276 = arg0;
        } else if (var5 == 2) {
            if (arg4 > class79.field1155) {
                class79.field1155 = arg4;
            }
            if (class613.field8647 > arg1) {
                class613.field8647 = arg1;
            }
            if (arg2 > class750.field10457) {
                class750.field10457 = arg2;
            }
            if (class428.field6276 > arg0) {
                class428.field6276 = arg0;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1726(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
