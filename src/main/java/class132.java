import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class132 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lub;")
    private static class18 field1726 = new class18();

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static final synchronized void method920(int arg0) {
        if (arg0 != -12966) {
            return;
        }
        while (true) {
            class37 var1 = (class37) field1726.method158(-24557);
            if (var1 == null) {
                return;
            }
            var1.field487.method120();
            var1.method2165(16225);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ld;Z)V")
    public static final synchronized void method921(class103 arg0, boolean arg1) {
        class37 var2 = new class37();
        if (!arg1) {
            var2.field487 = arg0;
            field1726.method163(var2, 0);
        }
    }
}
