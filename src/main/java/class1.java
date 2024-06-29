import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {

    @OriginalMember(owner = "client!us", name = "a", descriptor = "Lar;")
    private static class479 field1 = new class479();

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ld;B)V")
    public static final synchronized void method1(class103 arg0, byte arg1) {
        class47 var2 = new class47();
        var2.field569 = arg0;
        field1.method2809(var2, 2);
        if (arg1 != -31) {
            field1 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public static final void method2(int arg0) {
        while (true) {
            class47 var1 = (class47) field1.method2816(true);
            if (var1 == null) {
                if (arg0 != -2757) {
                    method1(null, (byte) 32);
                    return;
                }
                return;
            }
            var1.field569.method66();
            var1.method1565(0);
        }
    }
}
