import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class12 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[Lke;")
    public static class354[] field153 = new class354[2048];

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "[B")
    public static byte[] field158 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Llf;")
    public static class130 field154;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIB)V", line = 13)
    public static final void method70(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 2) {
            method70(-123, 86, -43, 64, 82, (byte) -116);
        }
        field157++;
        if (arg3 == arg4) {
            class220.method1393(arg1, arg0, arg2, (byte) 120, arg4);
        } else if (class379.field5397 <= arg0 - arg4 && class43.field659 >= (arg0 + arg4) && arg1 - arg3 >= class300.field4164 && class398.field5827 >= (arg1 + arg3)) {
            class386.method2524(arg4, arg2, arg3, false, arg0, arg1);
        } else {
            class165.method1122(arg4, arg2, 104, arg0, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 37)
    public static void method71(byte arg0) {
        field158 = null;
        field153 = null;
        if (arg0 == 0) {
            field154 = null;
        }
    }
}
