import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class262 extends class55 {

    @OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
    private int field3682;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "Lpv;")
    private static class50 field3681;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "()V", line = 3)
    public final void method399() {
        field3681.method382(this.field3682, -101);
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "()V", line = 6)
    public static void method1693() {
        field3681 = null;
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "()I", line = 9)
    public final int method411() {
        return field3681.method378((byte) 21, this.field3682);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public final void method397(Component arg0) throws Exception {
        field3681.method377(class56.field818, class103.field1483, arg0, (byte) -41);
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V", line = 16)
    public final void method405(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3681.method379(arg0, this.field3682, -14395);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "()V", line = 22)
    public final void method398() {
        field3681.method380(this.field3682, super.field785);
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "()V", line = 25)
    public final void method400() {
        field3681.method381(this.field3682, 100);
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Ldq;I)V", line = 28)
    public class262(class500 arg0, int arg1) {
        field3681 = arg0.method2984(false);
        this.field3682 = arg1;
    }
}
