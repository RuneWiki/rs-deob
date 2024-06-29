import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class319 {

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4290;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Lcq;")
    public static class72 field4289;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Z")
    public static boolean field4292;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "Lwo;")
    public static class285 field4287;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public static void method1994(byte arg0) {
        field4287 = null;
        field4289 = null;
        if (arg0 > 9) {
            field4290 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIIIB)V")
    public static final void method1995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field4288++;
        if (arg2 < 128 || arg5 < 128 || (class22.field232 * 128 - 256) < arg2 || ((class196.field2329 - 2) * 128) < arg5) {
            class242.field3234[0] = class242.field3234[1] = -1;
            return;
        }
        int var9 = class189.method1170(arg5, arg2, true, class43.field513) - arg3;
        if (arg8 >= -9) {
            return;
        }
        class179.field2092.method933(arg6, 0, 0);
        class267.field3454.method749(class179.field2092);
        class267.field3454.method718(arg2, var9, arg5, class242.field3234);
        class179.field2092.method933(-arg6, 0, 0);
        class267.field3454.method749(class179.field2092);
    }

    static {
        new class72("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field4290 = new String[100];
        field4291 = 0;
        field4289 = new class72("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");
        field4293 = 13156520;
        field4292 = true;
    }
}
