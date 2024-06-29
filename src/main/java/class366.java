import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class366 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "Lww;")
    public static class625 field5040 = new class625(0, -1);

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "Llu;")
    public static class610 field5041;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "Lada;")
    public static class144 field5042;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "Lvp;")
    public static class162 field5044;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "Lkda;")
    public static class328 field5043;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public static void method2200(int arg0) {
        field5042 = null;
        field5044 = null;
        if (arg0 != -22) {
            method2200(-86);
        }
        field5043 = null;
        field5040 = null;
        field5041 = null;
    }

    static {
        new class572("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field5041 = new class610(8, -1);
        field5042 = new class144(75, 0);
    }
}
