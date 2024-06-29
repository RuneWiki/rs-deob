import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class533 extends class388 {

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public int field7775;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Lha;")
    public static class543 field7776;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)Z")
    public abstract boolean method2837(int arg0);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method2838(byte arg0);

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I)V")
    public class533(int arg0) {
        this.field7775 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
    public static void method3232(int arg0) {
        if (arg0 < -36) {
            field7776 = null;
        }
    }
}
