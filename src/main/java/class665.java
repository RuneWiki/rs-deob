import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class665 {

    @OriginalMember(owner = "client!et", name = "a", descriptor = "Lcq;")
    public static class273 field9440 = new class273(14, 0, 4, 1);

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "Lae;")
    public static class254 field9442;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V", line = 32)
    public static void method3736(int arg0) {
        field9442 = null;
        if (arg0 == 46) {
            field9440 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II)Z", line = 72)
    public static final boolean method3737(int arg0, int arg1) {
        field9441++;
        class426 var2 = (class426) class152.field2150.method1904(false);
        if (arg1 != -66) {
            field9442 = null;
        }
        while (var2 != null) {
            if (class160.method1140(false, var2.field6223) && ((long) arg0) == var2.field6231) {
                return true;
            }
            var2 = (class426) class152.field2150.method1901(98);
        }
        return false;
    }
}
