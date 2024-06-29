import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class192 {

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "[I")
    public static int[] field2470 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Z")
    public static boolean field2468 = false;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public int field2467;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "Lbq;")
    public class192 field2469;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "Lns;")
    public class279 field2466;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "[Lo;")
    public static class24[] field2472;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
    public final void method1092(byte arg0) {
        field2471++;
        if (class493.field7219 >= 500) {
            return;
        }
        this.field2467 = 0;
        this.field2469 = class61.field705;
        if (arg0 == -86) {
            this.field2466 = null;
            class61.field705 = this;
            class493.field7219++;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
    public static void method1093(int arg0) {
        if (arg0 == 99) {
            field2472 = null;
            field2470 = null;
        }
    }
}
