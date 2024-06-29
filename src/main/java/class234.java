import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class234 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field3605 = 0;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[I")
    public static int[] field3607 = new int[2500];

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[Lre;")
    public static class130[] field3610 = new class130[8];

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field3609 = 0;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method1587(int arg0) {
        field3606++;
        class231.field3576.method940(arg0 + 103);
        if (arg0 != 0) {
            field3607 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method1588(int arg0) {
        if (arg0 == 22822) {
            field3607 = null;
            field3610 = null;
        }
    }
}
