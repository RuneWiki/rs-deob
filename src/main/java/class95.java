import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class95 extends class5 {

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "Ltl;")
    private static class67 field1533;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "()I")
    public final int method69() {
        return field1533.method527(3295, this.field1532);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method72(Component arg0) throws Exception {
        field1533.method530(class234.field3622, arg0, class230.field3589, 29660);
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "()V")
    public final void method63() {
        field1533.method526((byte) 111, this.field1532);
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public final void method67(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1533.method528(arg0, 6984, this.field1532);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()V")
    public final void method54() {
        field1533.method525(this.field1532, super.field67);
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "()V")
    public static void method741() {
        field1533 = null;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lja;I)V")
    public class95(class59 arg0, int arg1) {
        field1533 = arg0.method466(951863312);
        this.field1532 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()V")
    public final void method60() {
        field1533.method529(this.field1532, 11769);
    }
}
