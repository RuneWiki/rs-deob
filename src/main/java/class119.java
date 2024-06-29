import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class119 extends class174 {

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    private int field2627;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "Lgf;")
    private static class66 field2626;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2626.method540(arg0, (byte) -102, this.field2627);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()V")
    public final void method849() {
        field2626.method539(this.field2627, super.field3527);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "()I")
    public final int method850() {
        return field2626.method541(this.field2627, (byte) -33);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
    public final void method851() {
        field2626.method543(49, this.field2627);
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "()V")
    public static void method852() {
        field2626 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method853(Component arg0) throws Exception {
        field2626.method538(arg0, -55, class109.field2419, class150.field3136);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()V")
    public final void method854() {
        field2626.method542(this.field2627, (byte) 89);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Le;I)V")
    public class119(class41 arg0, int arg1) {
        field2626 = arg0.method385(true);
        this.field2627 = arg1;
    }
}
