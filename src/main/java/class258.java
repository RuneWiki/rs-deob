import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class258 extends class224 {

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    private int field4239;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "Lfe;")
    private static class261 field4238;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "()V")
    public final void method290() {
        field4238.method1834((byte) 102, this.field4239);
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "()V")
    public final void method286() {
        field4238.method1833(this.field4239, false);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method288(Component arg0) throws Exception {
        field4238.method1830(class28.field329, (byte) 111, arg0, class216.field3439);
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    public final void method289(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4238.method1829(this.field4239, arg0, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "()I")
    public final int method287() {
        return field4238.method1832(21157, this.field4239);
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "()V")
    public static void method1821() {
        field4238 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()V")
    public final void method291() {
        field4238.method1831(this.field4239, super.field3588);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lbh;I)V")
    public class258(class7 arg0, int arg1) {
        field4238 = arg0.method49((byte) 90);
        this.field4239 = arg1;
    }
}
