import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class394 extends class439 {

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public int field5819;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public int field5818;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "[I")
    public static int[] field5822;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "Lqa;")
    public static class162 field5821;

    static {
        new class180("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field5822 = new int[4096];
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V", line = 9)
    public static void method2462(byte arg0) {
        field5821 = null;
        field5822 = null;
        if (arg0 < 117) {
            method2463(103, -60);
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(II)V", line = 22)
    public class394(int arg0, int arg1) {
        this.field5819 = arg0;
        this.field5818 = arg1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)Z", line = 41)
    public static final boolean method2463(int arg0, int arg1) {
        field5820++;
        if (arg1 != 18633) {
            method2462((byte) -78);
        }
        return arg0 != 1 && arg0 != 7;
    }
}
