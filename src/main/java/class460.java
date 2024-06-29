import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class460 {

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "[I")
    public static int[] field6692 = new int[1000];

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Luq;")
    public static class114 field6696;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[Ll;")
    public static class16[] field6697;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Lwt;")
    public static final class205 method2787(int arg0, byte arg1) {
        int var2 = 76 % ((arg1 - 84) / 32);
        field6693++;
        if (arg0 == 0) {
            if ((double) class7.field91 == 3.0D) {
                return class262.field4018;
            }
            if ((double) class7.field91 == 4.0D) {
                return class497.field7148;
            }
            if ((double) class7.field91 == 6.0D) {
                return class181.field2718;
            }
            if ((double) class7.field91 >= 8.0D) {
                return class266.field4074;
            }
        } else if (arg0 == 1) {
            if ((double) class7.field91 == 3.0D) {
                return class181.field2718;
            }
            if ((double) class7.field91 == 4.0D) {
                return class266.field4074;
            }
            if ((double) class7.field91 == 6.0D) {
                return class487.field7008;
            }
            if ((double) class7.field91 >= 8.0D) {
                return class514.field7473;
            }
        } else if (arg0 == 2) {
            if ((double) class7.field91 == 3.0D) {
                return class487.field7008;
            }
            if ((double) class7.field91 == 4.0D) {
                return class514.field7473;
            }
            if ((double) class7.field91 == 6.0D) {
                return class298.field4533;
            }
            if ((double) class7.field91 >= 8.0D) {
                return class217.field3577;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method2788(int arg0) {
        field6696 = null;
        field6692 = null;
        field6697 = null;
        if (arg0 != 0) {
            field6697 = null;
        }
    }

    static {
        new class234("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        new class234(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field6696 = null;
    }
}
