import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class223 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field3011 = 0;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field3013 = -50;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[Lnd;")
    public static class502[] field3012;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)Z", line = 9)
    public static final boolean method1320(int arg0, int arg1, byte arg2) {
        field3010++;
        if (arg2 >= -9) {
            return true;
        } else {
            return (arg1 & 0x40000) != 0 | class343.method2197(82, arg0, arg1) || class489.method2970(true, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V", line = 20)
    public static void method1321(boolean arg0) {
        if (arg0) {
            field3012 = null;
        }
        field3012 = null;
    }
}
