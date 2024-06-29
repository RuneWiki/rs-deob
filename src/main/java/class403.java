import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class403 {

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field5720 = 0;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[I")
    public static int[] field5724;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lnq;")
    public static class268 field5723;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[[B")
    public static byte[][] field5718;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Lgi;")
    public static final class405 method2528(byte arg0) {
        field5716++;
        return arg0 >= -39 ? null : class354.field4829;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static void method2529(byte arg0) {
        field5718 = null;
        if (arg0 < 45) {
            field5715 = -113;
        }
        field5723 = null;
        field5724 = null;
    }

    static {
        new class442("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field5724 = new int[] { 1, 2, 4, 8 };
    }
}
