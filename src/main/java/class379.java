import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class379 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lug;")
    private static class392 field5721 = new class392();

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static final void method2354(boolean arg0) {
        if (arg0) {
            method2354(true);
        }
        while (true) {
            class326 var1 = (class326) field5721.method2423(0);
            if (var1 == null) {
                return;
            }
            var1.field4950.method59();
            var1.method2090(-1);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILga;)V")
    public static final synchronized void method2355(int arg0, class276 arg1) {
        class326 var2 = new class326();
        var2.field4950 = arg1;
        field5721.method2417(-120, var2);
        if (arg0 != 4650) {
            method2354(false);
        }
    }
}
