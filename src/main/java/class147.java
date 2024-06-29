import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class147 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
    public static int[] field2130 = new int[8];

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[Ljba;")
    public static class418[] field2133 = new class418[100];

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Z")
    public static boolean field2132 = false;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)Z")
    public static final boolean method1033(byte arg0, int arg1, int arg2) {
        field2131++;
        int var3 = 18 / ((-arg0 - 55) / 49);
        return (class270.method1751(33, arg1, arg2) | class169.method1253(arg1, (byte) 106, arg2) | class611.method3550(arg1, -17362, arg2)) & class591.method3441(arg2, 71, arg1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1034(int arg0) {
        field2130 = null;
        if (arg0 != 8) {
            method1034(34);
        }
        field2133 = null;
    }
}
