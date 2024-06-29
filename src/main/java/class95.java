import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class95 extends class196 {

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "Lqg;")
    private static class144 field1595;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()I", line = 3)
    public final int method737() {
        return field1595.method1109(12499, this.field1596);
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "()V", line = 7)
    public static void method738() {
        field1595 = null;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 10)
    public final void method739(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field1595.method1107(this.field1596, arg0, -21829);
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "()V", line = 16)
    public final void method740() {
        field1595.method1111(30, this.field1596);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()V", line = 19)
    public final void method741() {
        field1595.method1110(this.field1596, this.field3134);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lna;I)V", line = 22)
    public class95(class145 arg0, int arg1) {
        field1595 = arg0.method1121(-99);
        this.field1596 = arg1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V", line = 27)
    public final void method742() {
        field1595.method1108(this.field1596, (byte) 79);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 30)
    public final void method743(Component arg0) throws Exception {
        field1595.method1106(-32081, class232.field3855, arg0, class227.field3788);
    }
}
