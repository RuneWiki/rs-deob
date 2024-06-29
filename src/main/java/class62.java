import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class62 extends class134 {

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "Lgb;")
    private static class44 field1652;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method545(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1652.method372(this.field1653, 3601, arg0);
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "()I")
    public final int method546() {
        return field1652.method374((byte) -93, this.field1653);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()V")
    public final void method547() {
        field1652.method376(this.field1653, super.field3265);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "()V")
    public static void method548() {
        field1652 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
    public final void method549() {
        field1652.method377(this.field1653, (byte) -97);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method550() {
        field1652.method375((byte) -104, this.field1653);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lhb;I)V")
    public class62(class50 arg0, int arg1) {
        field1652 = arg0.method421(69);
        this.field1653 = arg1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method551(Component arg0) throws Exception {
        field1652.method373(arg0, class130.field3203, -112, class33.field792);
    }
}
