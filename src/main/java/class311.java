import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class311 extends class651 {

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    private int field4088;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Lpea;")
    private static class727 field4087;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V", line = 3)
    public final void method314() {
        field4087.method2907(3069, this.field4088);
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()I", line = 6)
    public final int method310() {
        return field4087.method2906((byte) 100, this.field4088);
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()V", line = 9)
    public final void method312() {
        field4087.method2904(this.field4088, super.field9051);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public final void method315(Component arg0) throws Exception {
        field4087.method2903(class541.field7490, class360.field4662, arg0, 92);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()V", line = 15)
    public final void method313() {
        field4087.method2908(true, this.field4088);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 18)
    public final void method311(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4087.method2905(this.field4088, true, arg0);
        }
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "()V", line = 25)
    public static void method1862() {
        field4087 = null;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lqg;I)V", line = 28)
    public class311(class465 arg0, int arg1) {
        field4087 = (class727) arg0.method2646((byte) -63);
        this.field4088 = arg1;
    }
}
