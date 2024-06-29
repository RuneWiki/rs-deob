import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class549 extends class208 {

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    private int field7737;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Lfv;")
    private static class671 field7738;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "()V")
    public final void method573() {
        field7738.method3015((byte) -69, this.field7737);
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "()V")
    public static void method3131() {
        field7738 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
    public final void method574() {
        field7738.method3014(this.field7737, super.field2657);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()I")
    public final int method572() {
        return field7738.method3018(2, this.field7737);
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "()V")
    public final void method575() {
        field7738.method3017(57, this.field7737);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lnga;I)V")
    public class549(class256 arg0, int arg1) {
        field7738 = (class671) arg0.method1556((byte) 94);
        this.field7737 = arg1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method570(Component arg0) throws Exception {
        field7738.method3016(class48.field709, class554.field7780, 51, arg0);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public final void method571(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field7738.method3019(-30711, this.field7737, arg0);
        }
    }
}
