import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class171 extends class175 {

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    private int field2717;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "Lal;")
    private static class232 field2718;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "()V")
    public final void method840() {
        field2718.method1625((byte) 112, this.field2717);
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "()V")
    public static void method1178() {
        field2718 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method837(Component arg0) throws Exception {
        field2718.method1629(arg0, (byte) 114, class133.field2128, class99.field1621);
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
    public final void method838(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2718.method1627(true, this.field2717, arg0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()V")
    public final void method841() {
        field2718.method1626(this.field2717, 27787);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lj;I)V")
    public class171(class165 arg0, int arg1) {
        field2718 = arg0.method1141(6);
        this.field2717 = arg1;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()V")
    public final void method836() {
        field2718.method1628(this.field2717, super.field2747);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()I")
    public final int method839() {
        return field2718.method1624(false, this.field2717);
    }
}
