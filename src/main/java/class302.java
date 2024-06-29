import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class302 {

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "I")
    public static int field3610 = -1;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IB)V")
    public static final void method1758(int arg0, byte arg1) {
        if (arg1 != -41) {
            field3610 = 49;
        }
        class241.field2843 = arg0;
        field3609++;
    }
}
