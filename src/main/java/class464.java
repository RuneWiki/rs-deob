import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class464 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Z")
    public static boolean field6727;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Ltq;")
    public static class426 field6728;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Lgn;")
    public static class475 field6729;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Z")
    public static boolean field6730;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static void method2721(int arg0) {
        if (arg0 == 47) {
            field6729 = null;
            field6728 = null;
        }
    }

    static {
        new class194("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field6727 = false;
        field6728 = new class426(9, 3);
        field6729 = new class475(47, 3);
        field6730 = false;
    }
}
