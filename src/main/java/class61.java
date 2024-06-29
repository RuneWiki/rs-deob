import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class61 extends class60 {

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    private int field1125;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "Lad;")
    private static class251 field1126;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method439(Component arg0) throws Exception {
        field1126.method1756(arg0, class286.field5020, true, class275.field4822);
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "()I")
    public final int method451() {
        return field1126.method1757(this.field1125, (byte) 109);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
    public final void method440() {
        field1126.method1761(85, this.field1125);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()V")
    public final void method447() {
        field1126.method1758((byte) -83, this.field1125);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()V")
    public final void method446() {
        field1126.method1759(this.field1125, super.field1100);
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "()V")
    public static void method453() {
        field1126 = null;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lwc;I)V")
    public class61(class229 arg0, int arg1) {
        field1126 = arg0.method1632((byte) -114);
        this.field1125 = arg1;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public final void method438(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1126.method1760(11446, this.field1125, arg0);
        }
    }
}
