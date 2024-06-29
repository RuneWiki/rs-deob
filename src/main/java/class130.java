import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class130 extends class31 {

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    private int field3101;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "Lid;")
    private static class60 field3100;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "()V")
    public static void method1063() {
        field3100 = null;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "()V")
    public final void method272() {
        field3100.method459(this.field3101, super.field703);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V")
    public final void method256() {
        field3100.method462(this.field3101, -3432);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method270(Component arg0) throws Exception {
        field3100.method461(arg0, class19.field387, class5.field89, (byte) 125);
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "()V")
    public final void method265() {
        field3100.method457(-96, this.field3101);
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ld;I)V")
    public class130(class22 arg0, int arg1) {
        field3100 = arg0.method183(2708);
        this.field3101 = arg1;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3100.method458(arg0, this.field3101, 30344);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()I")
    public final int method257() {
        return field3100.method460(this.field3101, -4579);
    }
}
