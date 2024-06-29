import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class338 {

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field5055 = 0;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "[S")
    public static short[] field5057 = new short[] { 58, 25, 16, 6, 8, 21, 47, 59 };

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public int field5053;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public int field5054;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field5056;

    static {
        new class423("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field5058 = -1;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)[Lwa;", line = 3)
    public static final class418[] method2089(byte arg0) {
        field5052++;
        if (arg0 <= 21) {
            field5055 = 23;
        }
        return new class418[] { class147.field2379, class286.field4343, class169.field2626 };
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 18)
    public static void method2090(boolean arg0) {
        if (!arg0) {
            field5055 = 116;
        }
        field5057 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)V", line = 35)
    public static final void method2091(byte arg0, int arg1) {
        field5056++;
        if (class64.field1061 == null) {
            class64.field1061 = new byte[4][class150.field2422][class21.field272];
        }
        for (int var2 = arg1; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class150.field2422; var3++) {
                for (int var4 = 0; var4 < class21.field272; var4++) {
                    class64.field1061[var2][var3][var4] = arg0;
                }
            }
        }
    }
}
