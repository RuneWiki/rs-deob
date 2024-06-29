import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class159 extends class168 {

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
    private int field2759;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "Ldi;")
    private static class43 field2760;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "()I")
    public final int method638() {
        return field2760.method295(this.field2759, 15888);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method634(Component arg0) throws Exception {
        field2760.method294(-19374, class170.field2935, arg0, class158.field2748);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lvi;I)V")
    public class159(class229 arg0, int arg1) {
        field2760 = arg0.method1497((byte) 100);
        this.field2759 = arg1;
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "()V")
    public static void method1036() {
        field2760 = null;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public final void method635(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2760.method292((byte) -55, this.field2759, arg0);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
    public final void method637() {
        field2760.method296(-103, this.field2759);
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "()V")
    public final void method633() {
        field2760.method291(this.field2759, true);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
    public final void method636() {
        field2760.method293(this.field2759, super.field2889);
    }
}
