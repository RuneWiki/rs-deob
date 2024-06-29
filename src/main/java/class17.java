import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class17 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Lg;")
    public static class470 field217;

    static {
        new class40("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field216 = 0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 12)
    public static void method110(int arg0) {
        if (arg0 != -17196) {
            field217 = null;
        }
        field217 = null;
    }
}
