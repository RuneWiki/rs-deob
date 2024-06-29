import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class439 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field6072 = 0;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILns;I)V", line = 11)
    public static final void method2633(int arg0, class654 arg1, int arg2) {
        field6070++;
        if (arg2 != 0) {
            field6071 = 43;
        }
        if (arg1.field9173 == null) {
            return;
        }
        int var3 = arg1.field9173[arg0 + 1];
        if (arg1.field9150 == var3) {
            return;
        }
        arg1.field9168 = 0;
        arg1.field9216 = arg1.field9215;
        arg1.field9203 = 0;
        arg1.field9150 = var3;
        arg1.field9117 = 1;
        arg1.field9123 = 0;
        if (arg1.field9150 != -1) {
            class538.method3196(arg1, arg1.field9203, true, class571.field8029.method3695(arg1.field9150, (byte) -116));
            return;
        }
    }
}
