import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public abstract class class622 {

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "[J")
    public static long[] field8998 = new long[100];

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "Z")
    public static boolean field9000;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "Lft;")
    public static class4 field8999;

    static {
        new class474("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field9000 = false;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 5)
    public static void method3572(int arg0) {
        field8999 = null;
        field8998 = null;
        if (arg0 < 59) {
            method3572(-45);
        }
    }
}
