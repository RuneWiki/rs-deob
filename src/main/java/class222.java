import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class222 {

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field3637 = 0;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field3638 = 0;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILul;)V", line = 5)
    public static final void method1592(int arg0, class406 arg1) {
        if (arg0 <= 3) {
            field3637 = 70;
        }
        class89.field1278 = arg1;
        field3639++;
    }
}
