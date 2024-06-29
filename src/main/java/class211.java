import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class211 extends Exception {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZB)V", line = 11)
    public static final void method1386(boolean arg0, byte arg1) {
        if (arg1 >= -16) {
            return;
        }
        for (class572 var2 = (class572) class240.field3451.method1270((byte) -25); var2 != null; var2 = (class572) class240.field3451.method1282(0)) {
            if (var2.field7702 != null) {
                class135.field1907.method3309(var2.field7702);
                var2.field7702 = null;
            }
            if (var2.field7704 != null) {
                class135.field1907.method3309(var2.field7704);
                var2.field7704 = null;
            }
            var2.method2971(1);
        }
        field3101++;
        if (!arg0) {
            return;
        }
        for (class572 var3 = (class572) class572.field7692.method1270((byte) -25); var3 != null; var3 = (class572) class572.field7692.method1282(0)) {
            if (var3.field7702 != null) {
                class135.field1907.method3309(var3.field7702);
                var3.field7702 = null;
            }
            var3.method2971(1);
        }
        for (class572 var4 = (class572) class231.field3288.method2066(false); var4 != null; var4 = (class572) class231.field3288.method2062(-19704)) {
            if (var4.field7702 != null) {
                class135.field1907.method3309(var4.field7702);
                var4.field7702 = null;
            }
            var4.method2971(1);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V", line = 80)
    public static final void method1387() {
        class383.method2208(1, class552.field7467);
    }
}
