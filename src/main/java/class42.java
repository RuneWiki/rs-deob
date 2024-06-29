import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class42 extends class318 {

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public int field622 = -1;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field619 = 0;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field621 = 0;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public int field620;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Ljava/lang/String;")
    public String field617;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Ljava/lang/String;")
    public String field618;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;II)V")
    public static final void method284(String arg0, byte arg1, String arg2, String arg3, int arg4, int arg5) {
        class190.method1178(arg3, arg5, (String) null, arg1 + -26921, arg0, arg4, -1, arg2);
        if (arg1 != 97) {
            field621 = 107;
        }
        ++field615;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Lka;")
    public final class303 method285(byte arg0) {
        if (arg0 <= 25) {
            this.field617 = null;
        }
        ++field616;
        return class345.field5015[super.field4617];
    }

    static {
        new class326("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }
}
