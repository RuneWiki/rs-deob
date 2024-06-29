import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class24 {

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field439 = 128;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field437 = 0;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field438 = -1;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Ltg;")
    public static class184 field443 = class135.method812("blaugr-Un:", 3);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method164(int arg0) {
        if (arg0 == 19897) {
            field443 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)J")
    public static final synchronized long method165(int arg0) {
        field435++;
        if (arg0 != 128) {
            field443 = null;
        }
        long var1 = System.currentTimeMillis();
        if (class155.field2775 > var1) {
            class176.field3336 += class155.field2775 - var1;
        }
        class155.field2775 = var1;
        return class176.field3336 + var1;
    }
}
