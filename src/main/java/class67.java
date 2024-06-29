import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class67 extends class246 {

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "Lsc;")
    private static class152 field950;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 3)
    public final void method528(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field950.method1106(arg0, this.field949, false);
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()I", line = 9)
    public final int method529() {
        return field950.method1108(this.field949, false);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 12)
    public final void method530(Component arg0) throws Exception {
        field950.method1107(arg0, class318.field5024, class157.field2427, (byte) 87);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()V", line = 15)
    public final void method531() {
        field950.method1109(this.field949, -18306);
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "()V", line = 18)
    public static void method532() {
        field950 = null;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()V", line = 21)
    public final void method533() {
        field950.method1110(this.field949, this.field3835);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V", line = 24)
    public final void method534() {
        field950.method1111(this.field949, 72);
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lvc;I)V", line = 28)
    public class67(class137 arg0, int arg1) {
        field950 = arg0.method1027((byte) -102);
        this.field949 = arg1;
    }
}
