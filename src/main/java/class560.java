import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class560 {

    @OriginalMember(owner = "client!via", name = "b", descriptor = "Lap;")
    public static class474 field7956 = new class474("LIVE", 0);

    @OriginalMember(owner = "client!via", name = "a", descriptor = "I")
    public static int field7955;

    @OriginalMember(owner = "client!via", name = "c", descriptor = "J")
    public static long field7957;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method3283(int arg0, int arg1, int arg2) {
        if (arg2 == -8225) {
            field7955++;
            return (arg0 & 0x10) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V", line = 17)
    public static void method3284(byte arg0) {
        field7956 = null;
        if (arg0 != 105) {
            method3284((byte) -34);
        }
    }
}
