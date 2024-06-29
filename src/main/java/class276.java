import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class276 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field4284 = -1;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field4285 = -1;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4286 = null;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4287 = "Loading fonts - ";

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 9)
    public static void method1916(int arg0) {
        field4286 = null;
        if (arg0 == -1) {
            field4287 = null;
        }
    }
}
