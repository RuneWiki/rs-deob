import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class22 {

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "Z")
    public static boolean field338 = true;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(CZ)Z")
    public static final boolean method149(char arg0, boolean arg1) {
        if (arg1) {
            return false;
        } else {
            field337++;
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static final void method150(int arg0) {
        field336++;
        int var1 = -73 / ((arg0 + 16) / 40);
        class24.field382.method53(true);
        class247.field4056.method53(true);
        class229.field3855.method53(true);
    }
}
