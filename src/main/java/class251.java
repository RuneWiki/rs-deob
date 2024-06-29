import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class251 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Ldq;")
    public static class493 field3211;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lhn;")
    public static class508 field3213;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Ll;")
    public static class16 field3212;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Ljava/awt/Font;")
    public static Font field3210;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method1522(int arg0) {
        field3210 = null;
        if (arg0 == 10) {
            field3213 = null;
            field3211 = null;
            field3212 = null;
        }
    }

    static {
        new class335("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field3211 = new class493(69, 10);
        field3214 = 0;
        field3213 = null;
    }
}
