import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class103 extends class81 {

    @OriginalMember(owner = "client!of", name = "O", descriptor = "I")
    private int field2367;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "Laa;")
    private static class2 field2366;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "()V")
    public final void method286() {
        field2366.method4(this.field2367, super.field1804);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
    public final void method288() {
        field2366.method6((byte) 112, this.field2367);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method291(Component arg0) throws Exception {
        field2366.method5(class8.field194, arg0, class32.field782, -103);
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lkc;I)V")
    public class103(class72 arg0, int arg1) {
        field2366 = arg0.method585(0);
        this.field2367 = arg1;
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "()V")
    public static void method844() {
        field2366 = null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "()I")
    public final int method289() {
        return field2366.method7(-56, this.field2367);
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "()V")
    public final void method287() {
        field2366.method9(this.field2367, -106);
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
    public final void method290(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2366.method8(16630, arg0, this.field2367);
        }
    }
}
