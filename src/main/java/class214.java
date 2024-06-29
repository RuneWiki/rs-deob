import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class214 {

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "S")
    public static short field2894 = 1;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lbo;III[IZ)Lgk;")
    public static final class330 method1346(class511 arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5) {
        field2895++;
        if (arg3 != 3553) {
            method1347((byte) 79, 70, -60);
        }
        if (!arg0.field7505 && (!class227.method1418((byte) -111, arg2) || !class227.method1418((byte) -110, arg1))) {
            return arg0.field7460 ? new class330(arg0, 34037, arg2, arg1, arg5, arg4) : new class330(arg0, arg2, arg1, class321.method1857((byte) 113, arg2), class321.method1857((byte) 113, arg1), arg4);
        } else {
            return new class330(arg0, 3553, arg2, arg1, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BII)Z")
    public static final boolean method1347(byte arg0, int arg1, int arg2) {
        if (arg0 != -128) {
            return true;
        }
        field2896++;
        if (((arg1 & 0x10000) != 0 | class425.method2447(arg1, arg2, (byte) 40)) || class461.method2623(arg2, (byte) -11, arg1)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class480.method2760(arg2, arg0 ^ 0xFFFFFFE7, arg1);
        }
    }
}
