import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class219 extends class173 {

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    private int field3785;

    @OriginalMember(owner = "client!kj", name = "eb", descriptor = "Lmb;")
    private static class140 field3786;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()V")
    public final void method1140() {
        field3786.method963(this.field3785, super.field3006);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1150(Component arg0) throws Exception {
        field3786.method966(class87.field1357, arg0, 30951, class247.field4280);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
    public final void method1142(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3786.method965(arg0, this.field3785, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "()V")
    public static void method1451() {
        field3786 = null;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "()V")
    public final void method1154() {
        field3786.method961(-112, this.field3785);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "()I")
    public final int method1145() {
        return field3786.method962(true, this.field3785);
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "()V")
    public final void method1152() {
        field3786.method964((byte) 55, this.field3785);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lgj;I)V")
    public class219(class239 arg0, int arg1) {
        field3786 = arg0.method1562((byte) 20);
        this.field3785 = arg1;
    }
}
