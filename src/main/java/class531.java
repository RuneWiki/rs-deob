import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class531 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Llu;")
    public static class610 field7930;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public int field7925;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public int field7927;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public int field7928;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field7929;

    static {
        new class572("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field7930 = new class610(66, 8);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 3)
    public static void method3207(int arg0) {
        int var1 = 84 / ((-arg0 - 21) / 34);
        field7930 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z", line = 13)
    public static final boolean method3208(int arg0, int arg1, int arg2) {
        field7926++;
        if (arg2 < 12) {
            method3208(24, 76, 63);
        }
        return false;
    }
}
