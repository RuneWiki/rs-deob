import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class80 {

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public static int field1208 = 0;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "Z")
    public static boolean field1206 = false;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "Ljba;")
    public static class364 field1211;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dba", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field1212;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
    public static void method625(int arg0) {
        field1211 = null;
        if (arg0 != -5) {
            method628(-84, (byte) -93);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IILin;I)V")
    public static final void method626(int arg0, int arg1, class78 arg2, int arg3) {
        field1207++;
        if (arg2.field1029 == 0) {
            arg2.field1078 = arg2.field1018;
        } else if (arg2.field1029 == 1) {
            arg2.field1078 = (arg1 - arg2.field1104) / 2 + arg2.field1018;
        } else if (arg2.field1029 == 2) {
            arg2.field1078 = arg1 - arg2.field1104 - arg2.field1018;
        } else if (arg2.field1029 == 3) {
            arg2.field1078 = arg2.field1018 * arg1 >> 14;
        } else if (arg2.field1029 == 4) {
            arg2.field1078 = (arg2.field1018 * arg1 >> 14) + (arg1 - arg2.field1104) / 2;
        } else {
            arg2.field1078 = arg1 - (arg2.field1018 * arg1 >> 14) - arg2.field1104;
        }
        if (arg0 != -3159) {
            return;
        }
        if (arg2.field1169 == 0) {
            arg2.field1081 = arg2.field1135;
        } else if (arg2.field1169 == 1) {
            arg2.field1081 = (arg3 - arg2.field1050) / 2 + arg2.field1135;
        } else if (arg2.field1169 == 2) {
            arg2.field1081 = arg3 - arg2.field1135 - arg2.field1050;
        } else if (arg2.field1169 == 3) {
            arg2.field1081 = arg2.field1135 * arg3 >> 14;
        } else if (arg2.field1169 == 4) {
            arg2.field1081 = (arg2.field1135 * arg3 >> 14) + (arg3 - arg2.field1050) / 2;
        } else {
            arg2.field1081 = arg3 - arg2.field1050 - (arg2.field1135 * arg3 >> 14);
        }
        if (!class314.field4339 || client.method1679(arg2).field4217 == 0 && arg2.field1075 != 0) {
            return;
        }
        if (arg2.field1078 < 0) {
            arg2.field1078 = 0;
        } else if ((arg2.field1104 + arg2.field1078) > arg1) {
            arg2.field1078 = arg1 - arg2.field1104;
        }
        if (arg2.field1081 < 0) {
            arg2.field1081 = 0;
        } else if (arg3 < (arg2.field1081 + arg2.field1050)) {
            arg2.field1081 = arg3 - arg2.field1050;
            return;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILsd;)V")
    public static final void method627(int arg0, class81 arg1) {
        field1205++;
        if (class295.field4051 == null) {
            return;
        }
        class526 var2 = null;
        if (arg1.field1225 == 0) {
            var2 = (class526) class119.method848(arg1.field1227, arg1.field1219, arg1.field1220);
        }
        if (arg1.field1225 == 1) {
            var2 = (class526) class41.method365(arg1.field1227, arg1.field1219, arg1.field1220);
        }
        if (arg1.field1225 == 2) {
            var2 = (class526) class610.method3421(arg1.field1227, arg1.field1219, arg1.field1220, field1212 == null ? (field1212 = method629("kj")) : field1212);
        }
        if (arg1.field1225 == 3) {
            var2 = (class526) class423.method2445(arg1.field1227, arg1.field1219, arg1.field1220);
        }
        if (arg0 != -5) {
            method625(-54);
        }
        if (var2 == null) {
            arg1.field1224 = -1;
            arg1.field1226 = 0;
            arg1.field1217 = 0;
        } else {
            arg1.field1224 = var2.method211((byte) 107);
            arg1.field1226 = var2.method222(true);
            arg1.field1217 = var2.method213((byte) 70);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IB)V")
    public static final void method628(int arg0, byte arg1) {
        class279.field3826 = arg0;
        field1210++;
        class663 var2 = class466.field6416;
        synchronized (class466.field6416) {
            class466.field6416.method3749(7648);
        }
        class663 var3 = class457.field6346;
        synchronized (class457.field6346) {
            class457.field6346.method3749(7648);
            if (arg1 != -26) {
                field1206 = true;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method629(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
