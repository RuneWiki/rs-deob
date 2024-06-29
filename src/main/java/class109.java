import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class109 {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Ljava/lang/String;")
    public String field1475;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1477 = 0;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lbt;")
    public static class363 field1480 = new class363(64);

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lbt;")
    public static class363 field1482;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Ljn;")
    public static class409 field1483;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!hj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1476++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class109(String arg0, int arg1) {
        this.field1478 = arg1;
        this.field1475 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
    public static void method776(boolean arg0) {
        field1482 = null;
        field1480 = null;
        if (arg0) {
            field1483 = null;
        }
    }

    static {
        new class409("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field1482 = new class363(10);
        field1483 = new class409("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");
    }
}
