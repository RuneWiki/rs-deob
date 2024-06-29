import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class203 {

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lpia;")
    public static class94 field41 = new class94(20, -1);

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "F")
    public static float field43;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 13)
    public static void method23(byte arg0) {
        if (arg0 != 62) {
            field42 = -39;
        }
        field41 = null;
    }
}
