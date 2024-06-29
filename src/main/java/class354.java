import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class354 {

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "Liv;")
    public static class64 field5410;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field5409;

    static {
        new class342("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field5411 = 0;
        field5410 = new class64(106, 0);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)Z", line = 7)
    public static final boolean method2243(int arg0, int arg1) {
        field5409++;
        if (arg0 == 0) {
            return (-arg1 & arg1) == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 23)
    public static void method2244(int arg0) {
        field5410 = null;
        if (arg0 != 0) {
            method2244(75);
        }
    }
}
