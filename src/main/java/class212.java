import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class212 extends class97 {

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    private int field3241;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "Ldga;")
    private static class191 field3242;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method920(Component arg0) throws Exception {
        field3242.method1384(class238.field3527, arg0, class195.field3068, 75);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()V")
    public final void method915() {
        field3242.method1386(-123, this.field3241);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "()I")
    public final int method927() {
        return field3242.method1383(this.field3241, (byte) 103);
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "()V")
    public static void method1477() {
        field3242 = null;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "()V")
    public final void method923() {
        field3242.method1387(this.field3241, super.field1716);
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ln;I)V")
    public class212(class17 arg0, int arg1) {
        field3242 = (class191) arg0.method394(false);
        this.field3241 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public final void method921(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3242.method1385(98, this.field3241, arg0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "()V")
    public final void method928() {
        field3242.method1388(-61, this.field3241);
    }
}
