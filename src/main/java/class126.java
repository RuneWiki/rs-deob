import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class126 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Z")
    public static boolean field1918 = true;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field1917;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
    public static void method983(boolean arg0) {
        field1917 = null;
        if (arg0) {
            method983(true);
        }
    }
}
