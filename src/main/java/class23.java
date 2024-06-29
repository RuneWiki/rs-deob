import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 extends class53 {

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "Llb;")
    private static class78 field546;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
    public static void method156() {
        field546 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
    public final void method157() {
        field546.method669(this.field547, super.field1206);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method158(Component arg0) throws Exception {
        field546.method666((byte) 74, class43.field949, class1.field4, arg0);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
    public final void method159() {
        field546.method670(this.field547, 10489);
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()I")
    public final int method160() {
        return field546.method667((byte) -104, this.field547);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lwe;I)V")
    public class23(class147 arg0, int arg1) {
        field546 = arg0.method1194(false);
        this.field547 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
    public final void method161(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field546.method668(this.field547, (byte) 63, arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
    public final void method162() {
        field546.method665(true, this.field547);
    }
}
