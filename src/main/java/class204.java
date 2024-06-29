import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class204 {

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "[I")
    public static int[] field2672;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Lbi;")
    public static class381 field2671;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "[S")
    public static short[] field2668;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static void method1337(int arg0) {
        if (arg0 != 0) {
            field2668 = null;
        }
        field2672 = null;
        field2671 = null;
        field2668 = null;
    }

    static {
        new class169("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field2672 = new int[1];
    }
}
