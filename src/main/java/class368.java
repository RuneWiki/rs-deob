import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class368 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "[[[B")
    public static byte[][][] field5193;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method2368(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class154.field2161 <= arg0 - arg2 && class233.field3350 >= (arg0 + arg2) && arg1 - arg2 >= class290.field4058 && (arg1 + arg2) <= class442.field6212) {
            class109.method770((byte) -126, arg1, arg4, arg0, arg2);
        } else {
            class160.method1061(arg4, arg1, arg2, (byte) -69, arg0);
        }
        field5190++;
        if (arg3 != 0) {
            method2368(45, -124, 59, -71, 125);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 23)
    public static void method2369(int arg0) {
        field5193 = null;
        if (arg0 != -5166) {
            field5191 = 125;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 39)
    public static final void method2370(int arg0) {
        class364.field5137 = -1;
        class165.field2293 = 0;
        class188.field2596 = 0;
        class390.field5593 = -3;
        class399.field5700 = false;
        int var1 = 30 % ((-arg0 - 40) / 60);
        field5192++;
        class279.field3918 = 0;
        class99.field1374 = 1;
    }
}
