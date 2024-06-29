import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class100 {

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field1394;

    static {
        new class169("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V", line = 13)
    public static final void method678(int arg0, int arg1) {
        if (arg0 >= -114) {
            return;
        }
        class335.field4295 = arg1;
        field1393++;
        class11 var2 = class65.field826;
        synchronized (class65.field826) {
            class65.field826.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V", line = 31)
    public static final void method679(int arg0) {
        if (class254.field3207 != null) {
            class254.field3207.method2947(-120);
        }
        field1394++;
        if (class531.field7820 != null) {
            class531.field7820.method2947(arg0 ^ 0x4031);
        }
        if (arg0 == 16384) {
            ;
        }
    }
}
