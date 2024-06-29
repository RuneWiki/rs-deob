import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class177 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2785 = 0;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2786 = 1;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2783 = "Choose Option";

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lsc;")
    public class248 field2784;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method1261(int arg0) {
        if (arg0 == -30785) {
            field2783 = null;
        }
    }
}
