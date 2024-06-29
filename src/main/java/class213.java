import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class213 extends class540 {

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "Z")
    public static boolean field2812 = false;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2816 = null;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "[I")
    public static int[] field2815;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I", line = 3)
    public static int method1409(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IIIIIF)V", line = 18)
    public class213(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(B)V", line = 21)
    public static void method1410(byte arg0) {
        int var1 = -121 / ((53 - arg0) / 38);
        field2816 = null;
        field2815 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBII)V", line = 33)
    public final void method1411(int arg0, byte arg1, int arg2, int arg3) {
        super.field7344 = arg2;
        super.field7342 = arg3;
        super.field7341 = arg0;
        ++field2813;
        if (arg1 != 24) {
            field2812 = true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(FB)V", line = 46)
    public final void method1412(float arg0, byte arg1) {
        super.field7348 = arg0;
        ++field2814;
        if (arg1 != -50) {
            this.method1411(-119, (byte) 107, -17, 8);
        }
    }
}
