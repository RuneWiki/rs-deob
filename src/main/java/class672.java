import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class672 extends class161 {

    @OriginalMember(owner = "client!qo", name = "H", descriptor = "I")
    private int field8704;

    @OriginalMember(owner = "client!qo", name = "I", descriptor = "Ljo;")
    private static class22 field8705;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "()V")
    public final void method572() {
        field8705.method99(this.field8704, super.field2133);
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
    public final void method571(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field8705.method102(this.field8704, arg0, false);
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "()V")
    public final void method574() {
        field8705.method98(123, this.field8704);
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Loq;I)V")
    public class672(class775 arg0, int arg1) {
        field8705 = (class22) arg0.method4243(true);
        this.field8704 = arg1;
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "()V")
    public static void method3626() {
        field8705 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "()V")
    public final void method570() {
        field8705.method101(this.field8704, (byte) 121);
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "()I")
    public final int method569() {
        return field8705.method97(-123, this.field8704);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method573(Component arg0) throws Exception {
        field8705.method100(0, class654.field8426, arg0, class791.field10837);
    }
}
