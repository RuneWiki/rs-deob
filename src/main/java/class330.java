import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class330 {

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "Lmt;")
    public static class419 field4770 = new class419(12, 0, 1, 0);

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public static int field4772 = 7000;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field4773 = field4772;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!wt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4771++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public static void method2079(int arg0) {
        field4770 = null;
        if (arg0 > -86) {
            field4770 = null;
        }
    }
}
