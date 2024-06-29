import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public abstract class class155 extends class164 {

    @OriginalMember(owner = "client!tca", name = "v", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!tca", name = "t", descriptor = "Ljk;")
    public static class585 field1896 = new class585(76, -1);

    @OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
    public static int field1900 = 0;

    @OriginalMember(owner = "client!tca", name = "u", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!tca", name = "w", descriptor = "[Li;")
    public static class37[] field1899;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Z)Z")
    public abstract boolean method985(boolean arg0);

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "(I)V")
    public static void method986(int arg0) {
        field1896 = null;
        field1899 = null;
        if (arg0 != -32529) {
            field1897 = 111;
        }
    }

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method987(int arg0);

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(I)V")
    public class155(int arg0) {
        this.field1898 = arg0;
    }
}
