import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class602 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field8365 = null;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field8367 = 0;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lcha;")
    public static class220 field8366 = new class220(3, 4);

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Lfa;")
    public static class237 field8368;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method3408(byte arg0) {
        field8365 = null;
        field8368 = null;
        if (arg0 != 98) {
            method3408((byte) -11);
        }
        field8366 = null;
    }
}
