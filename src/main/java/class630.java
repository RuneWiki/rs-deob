import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class630 extends class138 {

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    private int field8963;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "Lhb;")
    private static class502 field8964;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "()V", line = 3)
    public final void method1058() {
        field8964.method2996(this.field8963, false);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()V", line = 7)
    public final void method1050() {
        field8964.method2998(2, this.field8963);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V", line = 11)
    public final void method1048() {
        field8964.method2997(this.field8963, super.field2236);
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "()I", line = 14)
    public final int method1053() {
        return field8964.method2995(this.field8963, -102);
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "()V", line = 17)
    public static void method3560() {
        field8964 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 20)
    public final void method1056(Component arg0) throws Exception {
        field8964.method2994(arg0, class525.field7704, -18, class616.field8814);
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lwv;I)V", line = 22)
    public class630(class705 arg0, int arg1) {
        field8964 = (class502) arg0.method3958(19);
        this.field8963 = arg1;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 27)
    public final void method1049(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field8964.method2999((byte) -76, this.field8963, arg0);
        }
    }
}
