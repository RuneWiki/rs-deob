import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class499 extends class24 {

    @OriginalMember(owner = "client!eaa", name = "I", descriptor = "I")
    private int field7031;

    @OriginalMember(owner = "client!eaa", name = "H", descriptor = "Lqe;")
    private static class466 field7030;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V", line = 3)
    public final void method115(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field7030.method2445(arg0, this.field7031, 103);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "()I", line = 9)
    public final int method112() {
        return field7030.method2448(this.field7031, -2089);
    }

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "()V", line = 12)
    public final void method119() {
        field7030.method2446(this.field7031, super.field223);
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "()V", line = 15)
    public final void method118() {
        field7030.method2447((byte) -53, this.field7031);
    }

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "()V", line = 19)
    public static void method2968() {
        field7030 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 22)
    public final void method114(Component arg0) throws Exception {
        field7030.method2450(class277.field3387, arg0, (byte) -29, class54.field556);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "()V", line = 25)
    public final void method105() {
        field7030.method2449(67, this.field7031);
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lgh;I)V", line = 28)
    public class499(class546 arg0, int arg1) {
        field7030 = (class466) arg0.method3211(0);
        this.field7031 = arg1;
    }
}
