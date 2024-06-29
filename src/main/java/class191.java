import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class191 extends class264 {

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "S")
    public short field2669;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "Lvq;")
    public static class24 field2670;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "[I")
    public static int[] field2672;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    public static int field2671;

    static {
        new class409("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field2670 = new class24(31, 12);
        new class409("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field2672 = new int[14];
        field2673 = 20;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V", line = 6)
    public class191() {
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V", line = 14)
    public static void method1334(int arg0) {
        field2672 = null;
        field2670 = null;
        int var1 = 11 / ((arg0 - 50) / 45);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lnp;", line = 24)
    public static final class213 method1335(int arg0, int arg1) {
        field2668++;
        class363 var2 = class141.field1914;
        class213 var3;
        synchronized (class141.field1914) {
            var3 = (class213) class141.field1914.method2310((byte) -126, (long) arg1);
            if (var3 == null) {
                var3 = new class213(arg1);
                class141.field1914.method2299(true, var3, (long) arg1);
            }
        }
        synchronized (var3) {
            if (arg0 <= 10) {
                return null;
            } else if (var3.method1463((byte) 125)) {
                return var3;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(S)V", line = 50)
    public class191(short arg0) {
        this.field2669 = arg0;
    }
}
