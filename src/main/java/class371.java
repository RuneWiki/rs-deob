import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public abstract class class371 extends class132 {

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
    public int field5020;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "Ldv;")
    public static class566 field5021 = new class566(30, 0);

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)Z")
    public abstract boolean method1023(byte arg0);

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
    public static final void method2212(int arg0) {
        field5019++;
        class380.method2248(arg0 - 122, false);
        if (~class329.field4404 <= arg0 && class329.field4404 != 0) {
            class452.method2658(7, class329.field4404);
            class329.field4404 = -1;
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(B)V")
    public static void method2213(byte arg0) {
        field5021 = null;
        if (arg0 != 104) {
            method2212(-55);
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1024(int arg0);

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I)V")
    public class371(int arg0) {
        this.field5020 = arg0;
    }
}
