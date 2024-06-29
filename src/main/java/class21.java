import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 extends class114 {

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "Ld;")
    private static class22 field375;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()I")
    public final int method138() {
        return field375.method157(-28168, this.field376);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
    public final void method139() {
        field375.method161(this.field376, super.field2658);
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "()V")
    public static void method140() {
        field375 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method141(Component arg0) throws Exception {
        field375.method159(class139.field3213, arg0, 11872, class56.field1311);
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "()V")
    public final void method142() {
        field375.method160(-28095, this.field376);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public final void method143(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field375.method158(this.field376, arg0, 68);
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()V")
    public final void method144() {
        field375.method162((byte) 103, this.field376);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ldc;I)V")
    public class21(class25 arg0, int arg1) {
        field375 = arg0.method177(-945);
        this.field376 = arg1;
    }
}
