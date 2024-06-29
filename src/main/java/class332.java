import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class332 extends class351 {

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    private int field4421;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "Lpl;")
    private static class446 field4422;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "()I", line = 3)
    public final int method719() {
        return field4422.method2762(8169, this.field4421);
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Llh;I)V", line = 6)
    public class332(class450 arg0, int arg1) {
        field4422 = arg0.method2784(19);
        this.field4421 = arg1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 11)
    public final void method718(Component arg0) throws Exception {
        field4422.method2758(class67.field689, -3775, arg0, class432.field6338);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "()V", line = 15)
    public final void method717() {
        field4422.method2760(this.field4421, 120);
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "()V", line = 18)
    public static void method1895() {
        field4422 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()V", line = 21)
    public final void method720() {
        field4422.method2761(this.field4421, true);
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "()V", line = 24)
    public final void method721() {
        field4422.method2763(this.field4421, super.field4904);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 27)
    public final void method722(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4422.method2759(this.field4421, true, arg0);
        }
    }
}
