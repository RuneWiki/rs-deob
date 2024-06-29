import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class40 extends class632 {

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Lvg;")
    private static class78 field404;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "()V")
    public static void method206() {
        field404 = null;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "()V")
    public final void method207() {
        field404.method413(this.field403, super.field8895);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "()I")
    public final int method208() {
        return field404.method411(this.field403, 2);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "()V")
    public final void method209() {
        field404.method416(this.field403, 65535);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()V")
    public final void method210() {
        field404.method415((byte) 125, this.field403);
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lpi;I)V")
    public class40(class464 arg0, int arg1) {
        field404 = (class78) arg0.method2676((byte) 4);
        this.field403 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method211(Component arg0) throws Exception {
        field404.method412(arg0, class60.field614, 2, class224.field2776);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public final void method212(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field404.method414(65536, arg0, this.field403);
        }
    }
}
