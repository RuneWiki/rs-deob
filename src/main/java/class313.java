import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class313 {

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public int field4569;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
    public int[] field4563;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[I")
    public int[] field4566;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "Lfaa;")
    public static class273 field4564 = new class273();

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "[Loaa;")
    public static class509[] field4568 = new class509[50];

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field4570 = 0;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field4571 = 0;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lgp;")
    public static class561 field4567;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method1940(byte arg0) {
        field4568 = null;
        field4564 = null;
        field4567 = null;
        if (arg0 != -53) {
            field4564 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
    public class313(int arg0) {
        this.field4569 = arg0;
        this.field4563 = new int[this.field4569];
        this.field4566 = new int[this.field4569];
    }
}
