import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class315 extends class312 {

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "Ljava/lang/Object;")
    private Object field4951;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "[Lpea;")
    public static class675[] field4946 = new class675[14];

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lkw;Ljava/lang/Object;I)V", line = 3)
    public class315(class228 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field4951 = arg1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lpca;ZZII)V", line = 12)
    public static final void method2149(class665 arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field4950++;
        int var5 = arg0.field9411;
        int var6 = arg0.field9282;
        if (arg0.field9262 == 0) {
            arg0.field9411 = arg0.field9264;
        } else if (arg0.field9262 == 1) {
            arg0.field9411 = arg4 - arg0.field9264;
        } else if (arg0.field9262 == 2) {
            arg0.field9411 = arg0.field9264 * arg4 >> 14;
        }
        if (arg0.field9353 == 0) {
            arg0.field9282 = arg0.field9334;
        } else if (arg0.field9353 == 1) {
            arg0.field9282 = arg3 - arg0.field9334;
        } else if (arg0.field9353 == 2) {
            arg0.field9282 = arg0.field9334 * arg3 >> 14;
        }
        if (arg0.field9262 == 4) {
            arg0.field9411 = arg0.field9308 * arg0.field9282 / arg0.field9290;
        }
        if (arg0.field9353 == 4) {
            arg0.field9282 = arg0.field9411 * arg0.field9290 / arg0.field9308;
        }
        if (!arg1) {
            return;
        }
        if (class518.field7505 && (client.method1955(arg0).field919 != 0 || arg0.field9309 == 0)) {
            if (arg0.field9282 < 5 && arg0.field9411 < 5) {
                arg0.field9282 = 5;
                arg0.field9411 = 5;
            } else {
                if (arg0.field9282 <= 0) {
                    arg0.field9282 = 5;
                }
                if (arg0.field9411 <= 0) {
                    arg0.field9411 = 5;
                }
            }
        }
        if (class150.field2485 == arg0.field9343) {
            class107.field1736 = arg0;
        }
        if (arg2 && arg0.field9329 != null && arg0.field9411 != var5 || arg0.field9282 != var6) {
            class438 var7 = new class438();
            var7.field6677 = arg0;
            var7.field6684 = arg0.field9329;
            class539.field7865.method3463((byte) -87, var7);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(III)V", line = 95)
    public static final void method2150(int arg0, int arg1, int arg2) {
        class252 var3 = class454.field6818[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class200.method1554(var3.field4029);
        class200.method1554(var3.field4019);
        if (var3.field4029 != null) {
            var3.field4029 = null;
        }
        if (var3.field4019 != null) {
            var3.field4019 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Z", line = 111)
    public final boolean method2136(int arg0) {
        field4953++;
        if (arg0 != -20065) {
            field4948 = -77;
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)V", line = 122)
    public static final void method2151(byte arg0) {
        field4954++;
        class52.field693 = 0;
        int var1 = -60 % ((47 - arg0) / 44);
        class307.field4831.method3474(22090);
        class307.field4831.method3463((byte) -87, class619.field8762);
        class52.field693++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V", line = 135)
    public static void method2152(boolean arg0) {
        field4946 = null;
        if (arg0) {
            field4947 = -57;
        }
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(B)V", line = 150)
    public static final void method2153(byte arg0) {
        if (arg0 > -85) {
            method2153((byte) 39);
        }
        class191.field3165 = false;
        field4952++;
        class211.method1601(-20030);
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 162)
    public final Object method2137(byte arg0) {
        field4949++;
        if (arg0 < 27) {
            this.field4951 = null;
        }
        return this.field4951;
    }
}
