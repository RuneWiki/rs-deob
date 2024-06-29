import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class204 {

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3240 = 0;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[S")
    public static short[] field3242 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[S")
    public static short[] field3239 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3243 = "Drop";

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field3246 = 0;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3245 = "purple:";

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3244 = 0;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "[I")
    public static int[] field3247 = new int[4];

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Llb;")
    public static class211 field3237;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 19)
    public static void method1468(int arg0) {
        field3243 = null;
        field3245 = null;
        if (arg0 != -3) {
            method1468(29);
        }
        field3239 = null;
        field3242 = null;
        field3247 = null;
        field3237 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII)I", line = 39)
    public static final int method1469(int arg0, int arg1, int arg2, int arg3) {
        field3241++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (arg0 <= 49) {
            return -95;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }
}
