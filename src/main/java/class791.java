import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public abstract class class791 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "Lrh;")
    public static class275 field10852 = new class275(8, 0, 4, 1);

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field10853;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V", line = 10)
    public static void method4323(int arg0) {
        field10852 = null;
        if (arg0 > -113) {
            method4323(-94);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V", line = 20)
    public static final void method4324(byte arg0) {
        field10853++;
        if (class118.field1475 || arg0 < 94) {
            return;
        }
        class463.method2750(class358.field5208, false);
        if (class262.field3697 != null) {
            class463.method2750(class262.field3697, false);
        }
        class118.field1475 = true;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lvc;Z)Lvc;")
    public abstract class333 method1345(class333 arg0, boolean arg1);
}
