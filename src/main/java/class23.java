import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class23 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Ljd;")
    public static class408 field418;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lhb;")
    public static class250 field421;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lpi;")
    public static class340 field422;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "Lpi;")
    public static class340 field423;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Ldn;")
    public static class201 field417;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Z")
    public static final boolean method159(int arg0) {
        if (arg0 != 10) {
            field419 = 20;
        }
        field420++;
        if (class251.field3199) {
            try {
                if ((Boolean) class425.method2515(class172.field2221.field6139, "showingVideoAd", -27401)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method160(byte arg0) {
        field423 = null;
        field417 = null;
        field422 = null;
        int var1 = -8 % ((44 - arg0) / 37);
        field418 = null;
        field421 = null;
    }

    static {
        new class169("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        new class169("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field418 = new class408(9, 0, 4, 1);
        field421 = new class250(22, 7);
        field422 = new class340(94, -1);
        field423 = new class340(57, 12);
    }
}
