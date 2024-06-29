import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class179 {

    @OriginalMember(owner = "client!to", name = "K", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "Lee;")
    private static class480 field101;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "()V")
    public static void method51() {
        field101 = null;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "()V")
    public final void method52() {
        field101.method2935(this.field102, 27521);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method53(Component arg0) throws Exception {
        field101.method2932(23315, class286.field3762, arg0, class495.field7227);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public final void method54(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field101.method2936((byte) 108, this.field102, arg0);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "()V")
    public final void method55() {
        field101.method2933(this.field102, (byte) -77);
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "()I")
    public final int method56() {
        return field101.method2934((byte) 2, this.field102);
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "()V")
    public final void method57() {
        field101.method2931(this.field102, super.field2328);
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lfq;I)V")
    public class8(class137 arg0, int arg1) {
        field101 = arg0.method856(0);
        this.field102 = arg1;
    }
}
