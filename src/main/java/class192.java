import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class192 {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3297 = 500;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static volatile int field3292 = 0;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Lph;", line = 5)
    public static final class72 method1245(byte arg0) {
        field3298++;
        if (arg0 > -57) {
            field3296 = -28;
        }
        class72 var1 = (class72) class85.field1433.method106(false);
        if (var1 != null) {
            var1.method557((byte) -89);
            var1.method1168(4);
            return var1;
        }
        class72 var2;
        do {
            var2 = (class72) class284.field4850.method106(false);
            if (var2 == null) {
                return null;
            }
            if (var2.method485((byte) 111) > class216.method1426(255)) {
                return null;
            }
            var2.method557((byte) -89);
            var2.method1168(4);
        } while ((Long.MIN_VALUE & var2.field3034) == 0L);
        return var2;
    }
}
