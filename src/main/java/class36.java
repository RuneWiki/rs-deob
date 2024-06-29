import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class36 extends class531 {

    @OriginalMember(owner = "client!it", name = "H", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!it", name = "G", descriptor = "Lsea;")
    private static class283 field456;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "()V")
    public static void method193() {
        field456 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "()V")
    public final void method194() {
        field456.method1078(this.field457, super.field7360);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public final void method195(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field456.method1079(this.field457, arg0, -12765);
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "()V")
    public final void method196() {
        field456.method1076(this.field457, true);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method197(Component arg0) throws Exception {
        field456.method1081(class718.field9998, -112, arg0, class644.field8627);
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "()I")
    public final int method198() {
        return field456.method1080(this.field457, true);
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "()V")
    public final void method199() {
        field456.method1077(9380, this.field457);
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lrp;I)V")
    public class36(class135 arg0, int arg1) {
        field456 = (class283) arg0.method861(-1);
        this.field457 = arg1;
    }
}
