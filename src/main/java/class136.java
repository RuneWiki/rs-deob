import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class136 extends class155 {

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    private int field2459;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "Lfh;")
    private static class101 field2460;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
    public final void method99() {
        field2460.method771(84, this.field2459);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public final void method101(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2460.method773(arg0, this.field2459, false);
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "()I")
    public final int method97() {
        return field2460.method772(106, this.field2459);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method98(Component arg0) throws Exception {
        field2460.method770(class265.field4606, arg0, (byte) -104, class60.field997);
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "()V")
    public static void method1046() {
        field2460 = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lrc;I)V")
    public class136(class9 arg0, int arg1) {
        field2460 = arg0.method40((byte) 35);
        this.field2459 = arg1;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "()V")
    public final void method96() {
        field2460.method768(this.field2459, (byte) -85);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()V")
    public final void method100() {
        field2460.method769(this.field2459, super.field2754);
    }
}
