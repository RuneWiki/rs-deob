import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class240 extends class59 {

    @OriginalMember(owner = "client!vr", name = "K", descriptor = "I")
    private int field3059;

    @OriginalMember(owner = "client!vr", name = "J", descriptor = "Lkaa;")
    private static class160 field3058;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "()V")
    public final void method328() {
        field3058.method874((byte) 112, this.field3059);
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "()V")
    public static void method1496() {
        field3058 = null;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "()I")
    public final int method331() {
        return field3058.method869(20848, this.field3059);
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "()V")
    public final void method342() {
        field3058.method873(this.field3059, super.field803);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public final void method330(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3058.method872(15256, arg0, this.field3059);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method327(Component arg0) throws Exception {
        field3058.method871(class10.field98, arg0, class85.field1155, (byte) 125);
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "()V")
    public final void method341() {
        field3058.method870(this.field3059, 32751);
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lgaa;I)V")
    public class240(class279 arg0, int arg1) {
        field3058 = arg0.method1740((byte) 51);
        this.field3059 = arg1;
    }
}
