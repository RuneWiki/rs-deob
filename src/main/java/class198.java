import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class198 {

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "[I")
    public static int[] field2555 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "F")
    public static float field2556;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "Lmu;")
    public class198 field2552;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "Lmu;")
    public class198 field2553;

    static {
        new class305("From", "Von:", "De", "De");
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V", line = 5)
    public static void method1238(int arg0) {
        field2555 = null;
        if (arg0 != 2) {
            method1238(55);
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V", line = 18)
    public final void method1239(int arg0) {
        field2554++;
        if (arg0 > 26 && this.field2552 != null) {
            this.field2552.field2553 = this.field2553;
            this.field2553.field2552 = this.field2552;
            this.field2553 = null;
            this.field2552 = null;
        }
    }
}
