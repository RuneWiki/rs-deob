import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public abstract class class785 {

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "Llja;")
    public static class744 field10834 = new class744(81, 8);

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
    public static int field10836 = 0;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "Llja;")
    public static class744 field10835 = new class744(65, 3);

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "I")
    public static int field10837;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V", line = 9)
    public static void method4349(int arg0) {
        field10835 = null;
        field10834 = null;
        if (arg0 != 65) {
            field10834 = null;
        }
    }
}
