import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class219 extends class218 {

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    private int field3436;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "Lkd;")
    private static class70 field3435;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()I")
    public final int method588() {
        return field3435.method458(this.field3436, -3763);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()V")
    public final void method593() {
        field3435.method461(-13237, this.field3436);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method590(Component arg0) throws Exception {
        field3435.method457(15005, arg0, class189.field2953, class197.field3105);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()V")
    public final void method592() {
        field3435.method459(false, this.field3436);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    public final void method589(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3435.method460((byte) 91, this.field3436, arg0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "()V")
    public static void method1537() {
        field3435 = null;
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()V")
    public final void method591() {
        field3435.method462(this.field3436, super.field3414);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lmd;I)V")
    public class219(class239 arg0, int arg1) {
        field3435 = arg0.method1670(false);
        this.field3436 = arg1;
    }
}
