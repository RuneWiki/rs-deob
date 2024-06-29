import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class475 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "Lwl;")
    private static class280 field6556 = new class280();

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZLga;)V")
    public static final synchronized void method2732(boolean arg0, class276 arg1) {
        if (arg0) {
            field6556 = null;
        }
        class263 var2 = new class263();
        var2.field3472 = arg1;
        field6556.method1666((byte) -123, var2);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static final void method2733(int arg0) {
        while (true) {
            class263 var1 = (class263) field6556.method1662((byte) 93);
            if (var1 == null) {
                if (arg0 != 19590) {
                    method2732(true, null);
                    return;
                }
                return;
            }
            var1.field3472.method109();
            var1.method300(false);
        }
    }
}
