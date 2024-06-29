import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class28 extends class111 {

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "Lhg;")
    private static class203 field529;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "()V")
    public final void method197() {
        field529.method1347(this.field528, false);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method198(Component arg0) throws Exception {
        field529.method1348(-8293, arg0, class174.field2547, class133.field1955);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()V")
    public final void method199() {
        field529.method1349(this.field528, super.field1698);
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "()V")
    public static void method200() {
        field529 = null;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
    public final void method201(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field529.method1352(true, arg0, this.field528);
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lgf;I)V")
    public class28(class26 arg0, int arg1) {
        field529 = arg0.method185((byte) 124);
        this.field528 = arg1;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "()V")
    public final void method202() {
        field529.method1350(this.field528, -14459);
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "()I")
    public final int method203() {
        return field529.method1351(this.field528, (byte) -102);
    }
}
