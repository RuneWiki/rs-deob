import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class275 extends class241 {

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "I")
    private int field4389;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "Lbi;")
    private static class214 field4390;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "()V")
    public final void method1426() {
        field4390.method1423(this.field4389, (byte) 14);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public final void method1424(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4390.method1419((byte) -97, arg0, this.field4389);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "()V")
    public final void method1425() {
        field4390.method1418(this.field4389, super.field3817);
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "()V")
    public static void method1861() {
        field4390 = null;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "()V")
    public final void method1429() {
        field4390.method1422(-117, this.field4389);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lne;I)V")
    public class275(class78 arg0, int arg1) {
        field4390 = arg0.method633(125);
        this.field4389 = arg1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1428(Component arg0) throws Exception {
        field4390.method1420(class23.field359, (byte) 112, arg0, class116.field1955);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "()I")
    public final int method1427() {
        return field4390.method1421(19936, this.field4389);
    }
}
