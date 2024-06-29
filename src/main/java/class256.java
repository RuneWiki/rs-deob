import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class256 extends class513 {

    @OriginalMember(owner = "client!za", name = "k", descriptor = "Lqk;")
    public static class148 field3511 = new class148(7, -2);

    @OriginalMember(owner = "client!za", name = "l", descriptor = "Lqk;")
    public static class148 field3512 = new class148(40, 10);

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V", line = 3)
    public static void method1600(int arg0) {
        if (arg0 != 6880) {
            field3512 = null;
        }
        field3511 = null;
        field3512 = null;
    }
}
