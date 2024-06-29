import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class410 extends class88 {

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "Luk;")
    public class296 field5613;

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "Lsv;")
    public static class570 field5614 = new class570(49, 8);

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field5617;

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "[[[Lq;")
    public static class172[][][] field5618;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V", line = 3)
    public static void method2414(int arg0) {
        field5614 = null;
        field5617 = null;
        if (arg0 == -21409) {
            field5618 = null;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(III)V", line = 16)
    public static final void method2415(int arg0, int arg1, int arg2) {
        if (arg2 != 6406) {
            field5614 = null;
        }
        field5615++;
        if (class17.field185 == 1) {
            class701.method3931(arg1, arg0, true, class409.field5612);
        } else if (class17.field185 == 2) {
            if (class593.field8489) {
                class448.method2650(-11241, class87.method771(-2) + arg0, class45.method342(false) + arg1);
            } else {
                class448.method2650(-11241, arg0, arg1);
            }
        }
        class409.field5612 = null;
        class17.field185 = 0;
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Llea;II[B)V", line = 42)
    public class410(class573 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5613 = class119.method1047(arg0, false, arg1, 6406, 32515, arg2, 6406, arg3);
        this.field5613.method2952(false, false, false);
    }
}
