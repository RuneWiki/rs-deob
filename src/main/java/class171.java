import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class171 {

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "Lcb;")
    public static class544 field2443;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V", line = 7)
    public static void method1300(byte arg0) {
        int var1 = -49 % ((-arg0 - 25) / 32);
        field2443 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(BII)Z", line = 18)
    public static final boolean method1301(byte arg0, int arg1, int arg2) {
        field2442++;
        int var3 = -40 / ((6 - arg0) / 63);
        return class530.method3081(arg1, (byte) 76, arg2) | (arg1 & 0x40000) != 0 || class339.method2177(arg1, arg2, false);
    }
}
