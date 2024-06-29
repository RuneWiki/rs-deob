import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class398 extends class189 {

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "Lus;")
    public class1 field6034;

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "I")
    public static int field6037 = 0;

    @OriginalMember(owner = "client!pu", name = "B", descriptor = "Lbj;")
    public static class162 field6040;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!pu", name = "C", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!pu", name = "A", descriptor = "Ls;")
    public static class186 field6039;

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "Lfj;")
    public static class470 field6038;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "[Lo;")
    public static class24[] field6036;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZ)V")
    public static final void method2466(int arg0, int arg1, boolean arg2) {
        field6035++;
        if (!arg2) {
            return;
        }
        class469 var3 = class360.field5288[arg0][arg1];
        if (var3 != null) {
            class258.field3957 = var3.field6955;
            class463.field6870 = var3.field6956;
            class146.field2451 = var3.field6959;
        }
        class75.method675((byte) 126);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public static void method2467(int arg0) {
        field6040 = null;
        field6036 = null;
        field6038 = null;
        field6039 = null;
        if (arg0 != 2) {
            field6036 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lus;)V")
    public class398(class1 arg0) {
        this.field6034 = arg0;
    }

    static {
        new class309("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field6040 = new class162(65, 2);
    }
}
