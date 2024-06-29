import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class223 {

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    private int field26;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Lpe;")
    private static class85 field25;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "()V")
    public static void method42() {
        field25 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public final void method43(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field25.method570(false, arg0, this.field26);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()I")
    public final int method44() {
        return field25.method567(this.field26, 5262);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method45(Component arg0) throws Exception {
        field25.method568(arg0, class24.field323, class276.field4426, 104);
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "()V")
    public final void method46() {
        field25.method569(this.field26, super.field3330);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()V")
    public final void method47() {
        field25.method571(127, this.field26);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V")
    public final void method48() {
        field25.method572(this.field26, 7479);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lca;I)V")
    public class3(class83 arg0, int arg1) {
        field25 = arg0.method558(16);
        this.field26 = arg1;
    }
}
