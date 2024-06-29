import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class539 extends class529 {

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "J")
    public long field7885;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "[I")
    public static int[] field7883;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Lss;")
    public static class213 field7886;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method3189(int arg0) {
        field7886 = null;
        if (arg0 == 3) {
            field7883 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class539() {
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(J)V")
    public class539(long arg0) {
        this.field7885 = arg0;
    }

    static {
        new class213("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field7883 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
        field7886 = new class213("white:", "weiss:", "blanc:", "branco:");
    }
}
