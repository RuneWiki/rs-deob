import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class216 extends class122 {

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    private int field2617;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "Lgj;")
    private static class578 field2616;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "()V", line = 4)
    public final void method619() {
        field2616.method2155(this.field2617, (byte) -122);
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "()V", line = 7)
    public static void method1285() {
        field2616 = null;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lpe;I)V", line = 10)
    public class216(class556 arg0, int arg1) {
        field2616 = (class578) arg0.method3142((byte) 11);
        this.field2617 = arg1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "()I", line = 15)
    public final int method617() {
        return field2616.method2158(this.field2617, (byte) 98);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V", line = 18)
    public final void method616(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2616.method2157(arg0, 15, this.field2617);
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "()V", line = 24)
    public final void method621() {
        field2616.method2156(this.field2617, true);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 27)
    public final void method620(Component arg0) throws Exception {
        field2616.method2153(class81.field856, arg0, 48000, class519.field7413);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "()V", line = 30)
    public final void method618() {
        field2616.method2154(this.field2617, super.field1388);
    }
}
