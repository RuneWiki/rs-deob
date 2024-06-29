import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class348 extends class66 {

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "Lsp;")
    public class589 field5577;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5576 = null;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method2351(int arg0) {
        field5576 = null;
        if (arg0 != 4642) {
            field5576 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lsp;)V")
    public class348(class589 arg0) {
        this.field5577 = arg0;
    }
}
