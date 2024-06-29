import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class437 extends class223 {

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    private int field6495;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "Led;")
    private static class501 field6496;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "()I")
    public final int method1490() {
        return field6496.method3021(this.field6495, 122);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
    public final void method1487() {
        field6496.method3017(this.field6495, true);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "()V")
    public final void method1495() {
        field6496.method3018(this.field6495, super.field3481);
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "()V")
    public static void method2613() {
        field6496 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1488(Component arg0) throws Exception {
        field6496.method3016(class200.field3254, arg0, true, class315.field4754);
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Llt;I)V")
    public class437(class480 arg0, int arg1) {
        field6496 = arg0.method2870(0);
        this.field6495 = arg1;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()V")
    public final void method1489() {
        field6496.method3020(this.field6495, 739);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public final void method1497(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field6496.method3019((byte) -108, this.field6495, arg0);
        }
    }
}
