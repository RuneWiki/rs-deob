import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class445 extends class19 {

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "I")
    private int field6390;

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "Lmf;")
    private static class239 field6391;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method97(Component arg0) throws Exception {
        field6391.method1633(14566, class217.field3062, class313.field4484, arg0);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "()V")
    public final void method96() {
        field6391.method1635(this.field6390, -27096);
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "()V")
    public final void method94() {
        field6391.method1637(this.field6390, super.field219);
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "()I")
    public final int method98() {
        return field6391.method1636(this.field6390, (byte) -39);
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "()V")
    public static void method2771() {
        field6391 = null;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lrd;I)V")
    public class445(class185 arg0, int arg1) {
        field6391 = arg0.method1259(-59);
        this.field6390 = arg1;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
    public final void method95(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field6391.method1638(this.field6390, arg0, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "()V")
    public final void method99() {
        field6391.method1634(-128, this.field6390);
    }
}
