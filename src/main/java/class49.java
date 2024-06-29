import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class49 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field657 = 0;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Lnn;")
    public static class446 field660 = new class446(15, 6);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Ljj;")
    public static class398 field661 = new class398(27, -1);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method288(int arg0) {
        field660 = null;
        if (arg0 == -1) {
            field661 = null;
        }
    }
}
