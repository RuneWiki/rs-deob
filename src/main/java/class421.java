import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class421 extends class406 {

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "[B")
    public byte[] field6012;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Liq;")
    public static class362 field6011;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "[I")
    public static int[] field6015;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lse;")
    public static class138 field6016;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "[[[B")
    public static byte[][][] field6018;

    static {
        new class362("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field6011 = new class362("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");
        field6015 = new int[] { 0, -1, 0, 1 };
        field6016 = new class138(64);
        field6017 = 0;
        new class362("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;JIIB)V", line = 14)
    public static final void method2660(int arg0, String arg1, int arg2, String arg3, long arg4, int arg5, int arg6, byte arg7) {
        field6013++;
        if (class435.field6270 || class208.field2958 >= 500) {
            return;
        }
        int var9 = arg2 == -1 ? class297.field4161 : arg2;
        if (arg7 <= 24) {
            method2660(-95, (String) null, 21, (String) null, -17L, -87, -39, (byte) 123);
        }
        class302 var10 = new class302(arg3, arg1, var9, arg6, arg4, arg0, arg5);
        class393.field5547.method509((byte) 120, var10);
        class208.field2958++;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 32)
    public static void method2661(int arg0) {
        field6016 = null;
        field6018 = null;
        field6011 = null;
        if (arg0 != -31235) {
            method2660(-1, (String) null, -53, (String) null, 29L, 94, 72, (byte) -101);
        }
        field6015 = null;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([B)V", line = 50)
    public class421(byte[] arg0) {
        this.field6012 = arg0;
    }
}
