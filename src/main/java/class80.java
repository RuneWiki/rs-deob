import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class80 extends class234 {

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "Lmd;")
    private static class213 field1604;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method540(Component arg0) throws Exception {
        field1604.method1447(arg0, class198.field3580, (byte) 44, class137.field2526);
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "()V")
    public final void method541() {
        field1604.method1449((byte) -70, this.field1603);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "()V")
    public final void method542() {
        field1604.method1444(this.field1603, -24515);
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "()V")
    public static void method543() {
        field1604 = null;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
    public final void method544(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1604.method1448(arg0, this.field1603, 33);
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Ltj;I)V")
    public class80(class262 arg0, int arg1) {
        field1604 = arg0.method1732(false);
        this.field1603 = arg1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "()I")
    public final int method545() {
        return field1604.method1446(23550, this.field1603);
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "()V")
    public final void method546() {
        field1604.method1445(this.field1603, super.field4085);
    }
}
