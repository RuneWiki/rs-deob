import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class161 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[I")
    public static int[] field2528 = new int[6];

    @OriginalMember(owner = "client!se", name = "d", descriptor = "[I")
    public static int[] field2529 = new int[3];

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Llt;")
    public static class458 field2531;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static void method1034(boolean arg0) {
        field2528 = null;
        field2529 = null;
        field2531 = null;
        if (arg0) {
            field2530 = -62;
        }
    }

    static {
        new class423("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }
}
