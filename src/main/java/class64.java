import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class class64 {

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field833 = 1;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "Lcn;")
    public static class329 field836;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "Lfd;")
    public static class338 field834;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)[B")
    public abstract byte[] method395(boolean arg0);

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    public static void method396(byte arg0) {
        field836 = null;
        field834 = null;
        if (arg0 >= -112) {
            field836 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([BB)V")
    public abstract void method397(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lb;B)V")
    public static final void method398(class201 arg0, byte arg1) {
        class452.field6288 = arg0;
        if (arg1 >= -34) {
            field833 = -18;
        }
        field832++;
    }

    static {
        new class326("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field835 = -50;
    }
}
