import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class21 extends class74 {

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "Lqe;")
    private static class100 field345;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()V")
    public final void method184() {
        field345.method774(this.field346, super.field1127);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public final void method185(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field345.method769(this.field346, arg0, 11093);
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "()V")
    public final void method186() {
        field345.method772(this.field346, 110);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()I")
    public final int method187() {
        return field345.method771((byte) -92, this.field346);
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "()V")
    public final void method188() {
        field345.method773(false, this.field346);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method189(Component arg0) throws Exception {
        field345.method770(class174.field2695, -29348, class259.field4107, arg0);
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "()V")
    public static void method190() {
        field345 = null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lvd;I)V")
    public class21(class4 arg0, int arg1) {
        field345 = arg0.method35(-103);
        this.field346 = arg1;
    }
}
