import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class312 {

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field4542 = 1;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field4540 = -1;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z")
    public static final boolean method1888(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field4540 = -26;
        }
        field4541++;
        return (arg2 & 0x400) != 0;
    }
}
