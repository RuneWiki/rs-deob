import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class316 extends class291 {

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    private int field4495;

    @OriginalMember(owner = "client!ur", name = "D", descriptor = "Lie;")
    private static class4 field4494;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "()V", line = 3)
    public final void method486() {
        field4494.method34(-24945, this.field4495);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "()V", line = 6)
    public final void method490() {
        field4494.method37(this.field4495, (byte) 16);
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "()V", line = 9)
    public final void method488() {
        field4494.method35(this.field4495, super.field4183);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public final void method489(Component arg0) throws Exception {
        field4494.method36(class233.field3158, arg0, class134.field1882, (byte) 81);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "()I", line = 16)
    public final int method491() {
        return field4494.method38(this.field4495, 27713);
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "()V", line = 19)
    public static void method1973() {
        field4494 = null;
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V", line = 22)
    public final void method487(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4494.method39(this.field4495, (byte) -2, arg0);
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lam;I)V", line = 28)
    public class316(class378 arg0, int arg1) {
        field4494 = arg0.method2392(false);
        this.field4495 = arg1;
    }
}
