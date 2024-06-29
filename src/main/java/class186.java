import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class186 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "J")
    public static long field2444 = 0L;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Lpn;")
    public static class72 field2443 = new class72(21, 8);

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Lpn;")
    public static class72 field2446 = new class72(33, 8);

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field2445;

    static {
        new class40("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 10)
    public static void method1006(int arg0) {
        if (arg0 != 21) {
            method1006(118);
        }
        field2443 = null;
        field2446 = null;
    }
}
