import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class323 {

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field4678 = 0;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "Z")
    public static boolean field4680 = false;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Lgw;")
    public static class117 field4676;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method2008(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class538.field7879.field2185 = 0;
        field4681++;
        class538.field7879.method1072((byte) 102, class198.field2629.field6547);
        class538.field7879.method1072((byte) 102, arg4);
        class538.field7879.method1072((byte) 102, arg1);
        class538.field7879.method1114(arg2, 90);
        class538.field7879.method1114(arg0, 95);
        class290.field4252 = 0;
        class439.field6620 = arg3;
        class342.field5272 = -3;
        class351.field5430 = 1;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 25)
    public static void method2009(int arg0) {
        if (arg0 != 11077) {
            field4679 = 76;
        }
        field4676 = null;
    }
}
