import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class200 extends class258 {

    @OriginalMember(owner = "client!be", name = "F", descriptor = "I")
    private int field2532;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "Lrl;")
    private static class690 field2533;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V", line = 3)
    public final void method1206(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2533.method1127(false, arg0, this.field2532);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()V", line = 9)
    public final void method1207() {
        field2533.method1124(this.field2532, 127);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V", line = 12)
    public final void method1208() {
        field2533.method1125(-123, this.field2532);
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "()V", line = 16)
    public static void method1209() {
        field2533 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()I", line = 19)
    public final int method1210() {
        return field2533.method1123(116, this.field2532);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lrj;I)V", line = 21)
    public class200(class648 arg0, int arg1) {
        field2533 = (class690) arg0.method3637((byte) -117);
        this.field2532 = arg1;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "()V", line = 26)
    public final void method1211() {
        field2533.method1126(this.field2532, super.field3146);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 29)
    public final void method1212(Component arg0) throws Exception {
        field2533.method1128(arg0, class392.field4942, class382.field4824, -1);
    }
}
