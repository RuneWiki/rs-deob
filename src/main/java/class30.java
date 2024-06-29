import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class30 {

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Z")
    public static boolean field427 = false;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Ltt;")
    public static class338 field428 = new class338(57, 3);

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)Z", line = 12)
    public static final boolean method188(int arg0, int arg1, int arg2) {
        field426++;
        if (arg0 <= 44) {
            return true;
        } else if (((arg1 & 0x10000) != 0 | class299.method1764((byte) -121, arg2, arg1)) || class692.method3903(-1, arg1, arg2)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class229.method1421(arg1, arg2, -1);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V", line = 32)
    public static void method189(boolean arg0) {
        if (!arg0) {
            method189(false);
        }
        field428 = null;
    }
}
