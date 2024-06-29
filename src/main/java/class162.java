import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class162 {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[S")
    public static short[] field2686 = new short[256];

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2687 = "red:";

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field2688 = -1;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field2690 = 0;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Ldl;")
    public static class46 field2689;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIZIII)V")
    public static final void method1098(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class126.field2210 = arg5;
        class277.field4432 = arg1;
        class87.field1552 = arg0;
        field2684++;
        class151.field2523 = arg4;
        class182.field2973 = arg2;
        if (arg6 != 100) {
            field2689 = null;
        }
        if (arg3 && class151.field2523 >= 100) {
            class56.field976 = class182.field2973 * 128 + 64;
            class237.field3904 = class277.field4432 * 128 + 64;
            class250.field4093 = class10.method68(true, class176.field2886, class237.field3904, class56.field976) - class126.field2210;
        }
        class241.field3970 = 2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method1099(byte arg0) {
        field2686 = null;
        field2687 = null;
        int var1 = 5 % ((-arg0 - 37) / 54);
        field2689 = null;
    }
}
