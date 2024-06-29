import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class59 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Loq;")
    public static class242 field688 = new class242("", 16);

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Loq;")
    public static class242 field689 = new class242("", 14);

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Z")
    public static boolean field690 = false;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method358(int arg0) {
        field689 = null;
        field688 = null;
        int var1 = 39 % ((29 - arg0) / 58);
    }

    static {
        new class305("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }
}
