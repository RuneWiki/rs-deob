import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class212 extends class145 {

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    private int field3475;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "Log;")
    private static class41 field3476;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V", line = 3)
    public final void method1003(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field3476.method229(arg0, this.field3475, (byte) -100);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()I", line = 10)
    public final int method989() {
        return field3476.method226((byte) -40, this.field3475);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "()V", line = 13)
    public final void method999() {
        field3476.method225(this.field3475, -14081);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 17)
    public final void method990(Component arg0) throws Exception {
        field3476.method224((byte) 103, class62.field820, arg0, class218.field3549);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lcj;I)V", line = 19)
    public class212(class75 arg0, int arg1) {
        field3476 = arg0.method421((byte) -4);
        this.field3475 = arg1;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "()V", line = 24)
    public static void method1476() {
        field3476 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V", line = 27)
    public final void method988() {
        field3476.method228(this.field3475, -13546);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "()V", line = 30)
    public final void method1000() {
        field3476.method227(this.field3475, this.field2249);
    }
}
