import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class308 extends class128 {

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "Lqm;")
    public class255 field4903;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public static volatile int field4902 = 0;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "[I")
    public static int[] field4905 = new int[100];

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "Ljava/lang/String;")
    public static String field4904 = "Attack";

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public static int field4906 = 0;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 7)
    public static void method2133(byte arg0) {
        field4905 = null;
        field4904 = null;
        if (arg0 != 11) {
            field4904 = (String) null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lqm;)V", line = 17)
    public class308(class255 arg0) {
        this.field4903 = arg0;
    }
}
