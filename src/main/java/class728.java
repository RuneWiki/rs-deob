import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class728 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field10209;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field10210;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Lwu;")
    public static class557 field10211;

    @OriginalMember(owner = "client!pf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10209++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method4064(int arg0) {
        if (arg0 != -2973) {
            method4064(54);
        }
        field10211 = null;
    }
}
