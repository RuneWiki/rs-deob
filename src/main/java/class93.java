import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class93 {

    @OriginalMember(owner = "client!er", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1052 = new String[100];

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1051;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V")
    public static void method587(boolean arg0) {
        field1052 = null;
        field1051 = null;
        if (arg0) {
            field1051 = null;
        }
    }
}
