import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class66 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Z")
    public static boolean field869 = false;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static volatile int field872 = 0;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "[I")
    public static int[] field868 = new int[100];

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "J")
    public static long field871 = 0L;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "J")
    public static long field866;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "[I")
    public static int[] field867;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIZ)V", line = 4)
    public static final void method448(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            return;
        }
        field874++;
        if (class206.field2952 <= arg0 - arg1 && class259.field3813 >= (arg0 + arg1) && class101.field1397 <= (arg2 - arg1) && (arg2 + arg1) <= class44.field536) {
            class127.method919(7, arg1, arg3, arg2, arg0);
        } else {
            class59.method404(arg2, arg1, arg0, false, arg3);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLkm;)V", line = 26)
    public static final void method449(boolean arg0, class133 arg1) {
        field865++;
        class272.field4081 = arg1;
        if (arg0) {
            method450(56);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 45)
    public static void method450(int arg0) {
        field868 = null;
        field867 = null;
        if (arg0 != 0) {
            field871 = 73L;
        }
    }
}
