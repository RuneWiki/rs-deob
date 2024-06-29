import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class327 extends class248 {

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    private int field4500;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "Lhba;")
    private static class10 field4499;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()V")
    public final void method1567() {
        field4499.method45(this.field4500, super.field3565);
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "()V")
    public final void method1578() {
        field4499.method46(-17078, this.field4500);
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "()V")
    public static void method1956() {
        field4499 = null;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
    public final void method1574(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4499.method44(this.field4500, 17041, arg0);
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "()I")
    public final int method1579() {
        return field4499.method48(false, this.field4500);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "()V")
    public final void method1576() {
        field4499.method49(this.field4500, 72);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Llp;I)V")
    public class327(class331 arg0, int arg1) {
        field4499 = arg0.method2008((byte) -127);
        this.field4500 = arg1;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1573(Component arg0) throws Exception {
        field4499.method47((byte) 74, class103.field1505, arg0, class270.field3834);
    }
}
