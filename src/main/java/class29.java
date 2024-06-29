import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class29 extends class176 {

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "Lfq;")
    private static class83 field325;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()V", line = 4)
    public final void method179() {
        field325.method517(this.field324, super.field2043);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 8)
    public final void method180(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field325.method514(arg0, (byte) -125, this.field324);
        }
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "()V", line = 14)
    public static void method181() {
        field325 = null;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "()V", line = 17)
    public final void method182() {
        field325.method518(this.field324, -12773);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lnh;I)V", line = 19)
    public class29(class441 arg0, int arg1) {
        field325 = arg0.method2726(-101);
        this.field324 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "()V", line = 24)
    public final void method183() {
        field325.method519((byte) -84, this.field324);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()I", line = 27)
    public final int method184() {
        return field325.method515(this.field324, 121);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 30)
    public final void method185(Component arg0) throws Exception {
        field325.method516(arg0, class255.field3311, class247.field3267, -30996);
    }
}
