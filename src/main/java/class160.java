import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class160 {

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field2668 = 0;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2669 = "Started 3d Library";

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Ltb;")
    public class184 field2667;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "[Lcj;")
    public static class74[] field2666;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBII)I")
    public static final int method1090(int arg0, byte arg1, int arg2, int arg3) {
        field2670++;
        if (arg1 != 16) {
            field2669 = null;
        }
        if (arg0 < arg3) {
            return arg3;
        } else if (arg0 > arg2) {
            return arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method1091(byte arg0) {
        field2666 = null;
        if (arg0 < -8) {
            field2669 = null;
        }
    }
}
