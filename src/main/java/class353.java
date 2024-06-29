import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class353 {

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "Lcu;")
    public static class206 field4813 = new class206(59, -1);

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
    public static void method2101(int arg0) {
        field4813 = null;
        if (arg0 != -49) {
            field4813 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(CI)Z")
    public static final boolean method2102(char arg0, int arg1) {
        if (arg1 != -49) {
            field4813 = null;
        }
        field4815++;
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }
}
