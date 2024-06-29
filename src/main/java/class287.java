import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class287 {

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "Lmu;")
    public static class303 field3999 = new class303(118, -2);

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "Lma;")
    public static class12 field4000;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)V")
    public static void method1875(boolean arg0) {
        field3999 = null;
        if (!arg0) {
            field3999 = null;
        }
        field4000 = null;
    }

    @OriginalMember(owner = "client!ria", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3998++;
        throw new IllegalStateException();
    }
}
