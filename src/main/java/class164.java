import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class164 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Z")
    public static boolean field2632 = true;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field2634 = 0;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
    public static int[] field2633 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Z")
    public static boolean field2631 = true;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 25)
    public static void method1147(int arg0) {
        field2633 = null;
        if (arg0 != -21277) {
            field2634 = -22;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Lac;", line = 45)
    public static final class130 method1148(int arg0, int arg1, int arg2) {
        class127 var3 = class92.field1424[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class130 var4 = var3.field1986;
            var3.field1986 = null;
            return var4;
        }
    }
}
