import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class271 {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field3428 = 1;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Z")
    public static boolean field3429 = false;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field3430 = 0;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method1559(int arg0, int arg1, int arg2) {
        field3425++;
        if (arg0 < 19) {
            field3430 = -32;
        }
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z", line = 19)
    public static final boolean method1560(int arg0) {
        if (arg0 == 18403) {
            field3427++;
            return class504.field6675 >= 1;
        } else {
            return false;
        }
    }
}
