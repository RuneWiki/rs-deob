import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class342 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lvr;")
    private static class306 field5385 = new class306();

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lga;B)V", line = 3)
    public static final synchronized void method2198(class47 arg0, byte arg1) {
        class489 var2 = new class489();
        var2.field7163 = arg0;
        field5385.method1958(var2, arg1 + 50);
        if (arg1 != -50) {
            method2198(null, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 16)
    public static final void method2199(boolean arg0) {
        while (true) {
            class489 var1 = (class489) field5385.method1962(0);
            if (var1 == null) {
                if (!arg0) {
                    field5385 = null;
                    return;
                }
                return;
            }
            var1.field7163.method218();
            var1.method2785((byte) -120);
        }
    }
}
