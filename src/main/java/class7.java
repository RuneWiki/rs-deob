import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class169 {

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "Lrb;")
    private static class155 field137;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
    public final void method45(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field137.method1040(this.field138, 5540, arg0);
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "()V")
    public static void method46() {
        field137 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()I")
    public final int method47() {
        return field137.method1042(this.field138, -94);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method48(Component arg0) throws Exception {
        field137.method1037(class161.field3075, arg0, (byte) 58, class139.field2713);
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "()V")
    public final void method49() {
        field137.method1041(this.field138, super.field3251);
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "()V")
    public final void method50() {
        field137.method1038(-18018, this.field138);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()V")
    public final void method51() {
        field137.method1039(this.field138, true);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lih;I)V")
    public class7(class80 arg0, int arg1) {
        field137 = arg0.method656(-69);
        this.field138 = arg1;
    }
}
