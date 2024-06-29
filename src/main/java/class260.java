import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class260 {

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Lnk;")
    public static class326 field4351;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Les;")
    public static class182 field4353;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public int field4349;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public int field4355;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Z")
    public boolean field4354;

    static {
        new class306("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        new class306("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field4351 = new class326(6, 7);
        field4353 = new class182();
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 19)
    public static void method1743(int arg0) {
        if (arg0 == -13041) {
            field4351 = null;
            field4353 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBII)V", line = 35)
    public static final void method1744(int arg0, byte arg1, int arg2, int arg3) {
        field4356++;
        int var4 = class510.field7403.field5087 * arg0 >> 8;
        if (var4 != 0 && arg3 != -1) {
            class264.method1763(1, class226.field3886, false, var4, arg3, 0);
            class151.field2419 = true;
        }
        if (arg1 <= 84) {
            method1745((byte) -68, 110);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)C", line = 56)
    public static final char method1745(byte arg0, int arg1) {
        field4352++;
        int var2 = arg1 & arg0;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class362.field5643[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
