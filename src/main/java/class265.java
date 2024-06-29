import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class265 extends class28 {

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    private int field3750;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "Lef;")
    private static class420 field3751;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()I")
    public final int method43() {
        return field3751.method2418(this.field3750, true);
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "()V")
    public static void method1748() {
        field3751 = null;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()V")
    public final void method44() {
        field3751.method2421(this.field3750, super.field304);
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public final void method41(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3751.method2419(arg0, 11695, this.field3750);
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "()V")
    public final void method40() {
        field3751.method2416(this.field3750, -128);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method42(Component arg0) throws Exception {
        field3751.method2420(class292.field4050, (byte) 64, arg0, class325.field4696);
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()V")
    public final void method45() {
        field3751.method2417((byte) -97, this.field3750);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ltq;I)V")
    public class265(class545 arg0, int arg1) {
        field3751 = (class420) arg0.method3175((byte) 21);
        this.field3750 = arg1;
    }
}
