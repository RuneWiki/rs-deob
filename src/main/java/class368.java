import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class368 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    private static int field4761 = 0;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Z")
    private static boolean field4762 = false;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lws;")
    private static class333 field4760 = new class333();

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
    public static final synchronized void method2142(int arg0, boolean arg1) {
        if (arg0 != 0) {
            field4762 = false;
        }
        field4762 = arg1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static final synchronized void method2143(int arg0) {
        field4761--;
        if (arg0 != -20832) {
            method2142(78, true);
        }
        if (field4761 == 0) {
            method2144((byte) 74);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static final synchronized void method2144(byte arg0) {
        while (true) {
            class198 var1 = (class198) field4760.method1906(79);
            if (var1 == null) {
                if (arg0 < 68) {
                    field4760 = null;
                    return;
                }
                return;
            }
            var1.field2324.method57(true);
            var1.method1566(-76);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static final synchronized void method2145(int arg0) {
        field4761++;
        if (arg0 != 0) {
            method2144((byte) 45);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLg;)V")
    public static final synchronized void method2146(byte arg0, class145 arg1) {
        if (arg0 != -99 || field4762) {
            return;
        }
        if (field4761 <= 0) {
            arg1.method57(false);
        } else {
            class198 var2 = new class198();
            var2.field2324 = arg1;
            field4760.method1904(var2, -25);
        }
    }
}
