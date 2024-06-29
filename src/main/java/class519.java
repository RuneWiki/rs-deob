import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class519 extends RuntimeException {

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "Ljava/lang/String;")
    public String field7713;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field7711;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "Lqp;")
    public static class586 field7714 = new class586(50, 2);

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "B")
    public static byte field7715;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "Ldd;")
    public static class166 field7716;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
    public static void method3079(byte arg0) {
        field7716 = null;
        if (arg0 < 118) {
            field7714 = null;
        }
        field7714 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IBLwca;)Ljava/lang/String;")
    public static final String method3080(int arg0, byte arg1, class311 arg2) {
        if (arg1 != 78) {
            return null;
        }
        field7712++;
        if (!client.method3619(arg2).method3522((byte) 35, arg0) && arg2.field4651 == null) {
            return null;
        } else if (arg2.field4567 == null || arg0 >= arg2.field4567.length || arg2.field4567[arg0] == null || arg2.field4567[arg0].trim().length() == 0) {
            return class220.field3252 ? "Hidden-" + arg0 : null;
        } else {
            return arg2.field4567[arg0];
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class519(Throwable arg0, String arg1) {
        this.field7713 = arg1;
        this.field7711 = arg0;
    }

    static {
        new class487("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        new class487("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
    }
}
