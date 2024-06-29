import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class632 extends class470 {

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "I")
    private int field8758;

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "Ljd;")
    private static class244 field8759;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "()I", line = 3)
    public final int method2038() {
        return field8759.method1629(this.field8758, false);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "()V", line = 6)
    public final void method2037() {
        field8759.method1630(this.field8758, (byte) 59);
    }

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "()V", line = 9)
    public static void method3542() {
        field8759 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 13)
    public final void method2040(Component arg0) throws Exception {
        field8759.method1627(class137.field2352, 0, arg0, class55.field782);
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "()V", line = 16)
    public final void method2039() {
        field8759.method1628(this.field8758, super.field6358);
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "()V", line = 19)
    public final void method2041() {
        field8759.method1632(this.field8758, (byte) 37);
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Llu;I)V", line = 21)
    public class632(class742 arg0, int arg1) {
        field8759 = (class244) arg0.method4117((byte) -21);
        this.field8758 = arg1;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V", line = 27)
    public final void method2036(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field8759.method1631(this.field8758, -10628, arg0);
        }
    }
}
