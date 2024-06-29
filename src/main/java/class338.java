import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class338 extends class379 {

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    private int field4567;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "Lpn;")
    private static class635 field4566;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()V")
    public final void method2050() {
        field4566.method3688(this.field4567, super.field5088);
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "()V")
    public static void method2051() {
        field4566 = null;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()I")
    public final int method2052() {
        return field4566.method3689((byte) -32, this.field4567);
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public final void method2053(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4566.method3687(this.field4567, (byte) -120, arg0);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public final void method2054() {
        field4566.method3684(this.field4567, false);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ldj;I)V")
    public class338(class288 arg0, int arg1) {
        field4566 = arg0.method1838((byte) -119);
        this.field4567 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2055(Component arg0) throws Exception {
        field4566.method3685(class626.field9116, arg0, (byte) 52, class223.field3180);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
    public final void method2056() {
        field4566.method3686(this.field4567, -18276);
    }
}
