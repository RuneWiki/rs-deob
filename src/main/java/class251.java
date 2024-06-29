import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class251 extends class239 {

    @OriginalMember(owner = "client!jm", name = "S", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!jm", name = "T", descriptor = "Lnl;")
    private static class34 field3829;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)V", line = 4)
    public final void method806(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field3829.method205(arg0, this.field3828, (byte) 98);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 10)
    public final void method808(Component arg0) throws Exception {
        field3829.method203(class276.field4312, class177.field2566, false, arg0);
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "()V", line = 13)
    public static void method1835() {
        field3829 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "()V", line = 16)
    public final void method805() {
        field3829.method206(this.field3828, this.field3594);
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "()I", line = 19)
    public final int method804() {
        return field3829.method201(this.field3828, 9507);
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Ltk;I)V", line = 21)
    public class251(class265 arg0, int arg1) {
        field3829 = arg0.method1912((byte) 106);
        this.field3828 = arg1;
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "()V", line = 26)
    public final void method807() {
        field3829.method204(this.field3828, 31447);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "()V", line = 29)
    public final void method809() {
        field3829.method202(8603, this.field3828);
    }
}
