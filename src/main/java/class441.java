import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class441 extends class346 {

    @OriginalMember(owner = "client!mba", name = "I", descriptor = "I")
    private int field5996;

    @OriginalMember(owner = "client!mba", name = "J", descriptor = "Lke;")
    private static class623 field5997;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "()V", line = 3)
    public final void method1467() {
        field5997.method291(this.field5996, 16384);
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "()V", line = 7)
    public final void method1469() {
        field5997.method295(this.field5996, super.field4819);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "()I", line = 10)
    public final int method1464() {
        return field5997.method292(this.field5996, (byte) -9);
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)V", line = 13)
    public final void method1465(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field5997.method296(arg0, -61, this.field5996);
        }
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Ltd;I)V", line = 18)
    public class441(class477 arg0, int arg1) {
        field5997 = (class623) arg0.method2845(0);
        this.field5996 = arg1;
    }

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "()V", line = 24)
    public static void method2631() {
        field5997 = null;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 27)
    public final void method1466(Component arg0) throws Exception {
        field5997.method294(arg0, (byte) -64, class114.field1746, class488.field6898);
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "()V", line = 30)
    public final void method1468() {
        field5997.method293(108, this.field5996);
    }
}
