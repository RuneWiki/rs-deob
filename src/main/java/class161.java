import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class161 {

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "Z")
    private static boolean field2555 = false;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    private static int field2556 = 0;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "Lada;")
    private static class164 field2554 = new class164();

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V", line = 3)
    public static final synchronized void method1173(int arg0) {
        field2556--;
        if (field2556 == arg0) {
            method1174(false);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V", line = 17)
    public static final synchronized void method1174(boolean arg0) {
        if (arg0) {
            field2555 = false;
        }
        while (true) {
            class301 var1 = (class301) field2554.method1198((byte) 122);
            if (var1 == null) {
                return;
            }
            var1.field4253.method105(true);
            var1.method1304((byte) 7);
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V", line = 38)
    public static final synchronized void method1175(int arg0) {
        if (arg0 > -36) {
            field2555 = true;
        }
        field2556++;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Le;I)V", line = 52)
    public static final synchronized void method1176(class534 arg0, int arg1) {
        if (field2555 || arg1 != 0) {
            return;
        }
        if (field2556 > 0) {
            class301 var2 = new class301();
            var2.field4253 = arg0;
            field2554.method1203(var2, (byte) 94);
        } else {
            arg0.method105(false);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BZ)V", line = 79)
    public static final synchronized void method1177(byte arg0, boolean arg1) {
        if (arg0 == -99) {
            field2555 = arg1;
        }
    }
}
