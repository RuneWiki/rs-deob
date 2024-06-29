import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class280 extends class493 {

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    private int field3587;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "Lgm;")
    private static class101 field3588;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()I")
    public final int method1() {
        return field3588.method681(this.field3587, -32);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lhs;I)V")
    public class280(class441 arg0, int arg1) {
        field3588 = arg0.method2621((byte) 38);
        this.field3587 = arg1;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "()V")
    public final void method5() {
        field3588.method680(25839, this.field3587);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()V")
    public final void method3() {
        field3588.method682(this.field3587, super.field7205);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
    public final void method2() {
        field3588.method684(this.field3587, 59);
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
    public final void method6(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3588.method685(arg0, this.field3587, 4379);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method4(Component arg0) throws Exception {
        field3588.method683(24172, class426.field5847, class414.field5502, arg0);
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "()V")
    public static void method1718() {
        field3588 = null;
    }
}
