import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class37 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "Leh;")
    public static class246 field406 = new class246(2, 12);

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field408 = 0;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lmj;")
    public static class473 field407;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method208(byte arg0) {
        if (arg0 == 16) {
            field407 = null;
            field406 = null;
        }
    }
}
