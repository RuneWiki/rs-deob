import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class160 extends class381 {

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lgk;")
    public class330 field2361;

    static {
        new class304("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lbo;II[B)V", line = 12)
    public class160(class511 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2361 = class449.method2571(6406, arg3, arg0, arg1, 6406, -2182, arg2, false);
        this.field2361.method1831(true, false, false);
    }
}
