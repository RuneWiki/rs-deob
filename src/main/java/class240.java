import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class240 {

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "Lpaa;")
    public static class712 field3352 = null;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)Z")
    public static final boolean method1531(int arg0, int arg1, int arg2) {
        field3350++;
        if (arg1 != -22036) {
            field3352 = null;
        }
        return (arg0 & 0xC580) != 0;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V")
    public static void method1532(byte arg0) {
        if (arg0 >= -36) {
            method1532((byte) -125);
        }
        field3352 = null;
    }
}
