import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class598 {

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public int field8633 = 128;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public int field8639 = 128;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public int field8629;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public int field8642;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field8634;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public int field8630;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
    public static boolean field8636 = false;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field8637 = 0;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field8632 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "F")
    public static float field8625;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "F")
    public static float field8626;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public int field8627;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public int field8628;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public int field8631;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field8635;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field8640;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public int field8641;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILlc;)V", line = 3)
    public final void method3458(int arg0, class598 arg1) {
        this.field8639 = arg1.field8639;
        if (arg0 != 128) {
            this.field8639 = -112;
        }
        this.field8629 = arg1.field8629;
        this.field8630 = arg1.field8630;
        field8640++;
        this.field8634 = arg1.field8634;
        this.field8633 = arg1.field8633;
        this.field8642 = arg1.field8642;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Llc;", line = 31)
    public final class598 method3459(byte arg0) {
        field8638++;
        return arg0 == 120 ? new class598(this.field8629, this.field8639, this.field8633, this.field8642, this.field8634, this.field8630) : null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V", line = 66)
    public class598(int arg0) {
        this.field8629 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIII)V", line = 73)
    private class598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8642 = arg3;
        this.field8633 = arg2;
        this.field8634 = arg4;
        this.field8639 = arg1;
        this.field8630 = arg5;
        this.field8629 = arg0;
    }
}
