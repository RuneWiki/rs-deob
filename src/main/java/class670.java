import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class670 {

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "[I")
    public static int[] field9091 = new int[3];

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "Lbg;")
    public static class464 field9095 = new class464();

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "Lvfa;")
    public class670 field9093;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "Lvfa;")
    public class670 field9094;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "()V", line = 3)
    public static final void method3644() {
        class471.field6690 = class471.field6691;
    }

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "(B)V", line = 10)
    public static void method3645(byte arg0) {
        field9095 = null;
        field9091 = null;
        if (arg0 != -13) {
            method3644();
        }
    }

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "(B)V", line = 29)
    public final void method3646(byte arg0) {
        field9092++;
        if (arg0 >= -101) {
            method3644();
        }
        if (this.field9094 != null) {
            this.field9094.field9093 = this.field9093;
            this.field9093.field9094 = this.field9094;
            this.field9093 = null;
            this.field9094 = null;
        }
    }
}
