import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class236 {

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Lvp;")
    private static class123 field3489 = new class123();

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method1600(boolean arg0) {
        while (true) {
            class300 var1 = (class300) field3489.method815(-120);
            if (var1 == null) {
                if (arg0) {
                    field3489 = null;
                    return;
                }
                return;
            }
            var1.field4259.method60();
            var1.method2049(-86);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILga;)V", line = 30)
    public static final synchronized void method1601(int arg0, class276 arg1) {
        class300 var2 = new class300();
        var2.field4259 = arg1;
        field3489.method809(var2, false);
        int var3 = -29 % ((46 - arg0) / 48);
    }
}
