import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class390 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "Lwo;")
    private static class522 field5461 = new class522();

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public static final void method2236(int arg0) {
        while (true) {
            class494 var1 = (class494) field5461.method3071((byte) 35);
            if (var1 == null) {
                if (arg0 >= -64) {
                    method2237(true, null);
                    return;
                }
                return;
            }
            var1.field7288.method79();
            var1.method2946(-108);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZLga;)V")
    public static final synchronized void method2237(boolean arg0, class276 arg1) {
        if (!arg0) {
            method2237(true, null);
        }
        class494 var2 = new class494();
        var2.field7288 = arg1;
        field5461.method3070(var2, (byte) -121);
    }
}
