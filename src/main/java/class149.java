import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class149 extends class39 {

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    private int field2522;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "La;")
    private static class46 field2521;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public final void method259(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2521.method316(arg0, (byte) -26, this.field2522);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()V")
    public final void method256() {
        field2521.method319((byte) -125, this.field2522);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()V")
    public final void method261() {
        field2521.method321(118, this.field2522);
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "()I")
    public final int method266() {
        return field2521.method318(this.field2522, -4354);
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "()V")
    public final void method267() {
        field2521.method320(this.field2522, super.field611);
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "()V")
    public static void method974() {
        field2521 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method258(Component arg0) throws Exception {
        field2521.method317(class256.field4568, arg0, 26221, class159.field2706);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lb;I)V")
    public class149(class81 arg0, int arg1) {
        field2521 = arg0.method560((byte) 75);
        this.field2522 = arg1;
    }
}
