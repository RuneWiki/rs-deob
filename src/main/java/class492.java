import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class492 {

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "Lgd;")
    public class224 field7181 = new class224();

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "Z")
    public boolean field7189 = false;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "Luj;")
    public static class259 field7182 = new class259();

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "[I")
    public static int[] field7187;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public int field7183;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public int field7185;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "Lf;")
    public static class528 field7188;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "[I")
    public static int[] field7184;

    static {
        new class180("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field7187 = new int[8];
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 14)
    public static void method2941(int arg0) {
        if (arg0 != 211) {
            method2941(-15);
        }
        field7188 = null;
        field7187 = null;
        field7182 = null;
        field7184 = null;
    }
}
