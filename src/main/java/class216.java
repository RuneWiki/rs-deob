import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class216 extends class9 {

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
    private int field3722;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "Lhl;")
    private static class39 field3721;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "()V")
    public final void method90() {
        field3721.method311(this.field3722, (byte) -107);
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "()V")
    public final void method97() {
        field3721.method308(this.field3722, super.field214);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method91(Component arg0) throws Exception {
        field3721.method312(class204.field3549, arg0, class283.field4981, (byte) -85);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()I")
    public final int method84() {
        return field3721.method307(-16331, this.field3722);
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)V")
    public final void method95(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3721.method310(arg0, (byte) 4, this.field3722);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
    public final void method83() {
        field3721.method309(true, this.field3722);
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "()V")
    public static void method1451() {
        field3721 = null;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lug;I)V")
    public class216(class198 arg0, int arg1) {
        field3721 = arg0.method1357(0);
        this.field3722 = arg1;
    }
}
