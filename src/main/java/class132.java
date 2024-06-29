import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class132 extends class509 {

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    private int field2003;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "Ldh;")
    private static class253 field2002;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "()I", line = 3)
    public final int method956() {
        return field2002.method1521(false, this.field2003);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 6)
    public final void method957(Component arg0) throws Exception {
        field2002.method1516(class163.field2472, class506.field7397, arg0, -9624);
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "()V", line = 9)
    public static void method958() {
        field2002 = null;
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V", line = 12)
    public final void method959(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2002.method1519(this.field2003, arg0, true);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()V", line = 19)
    public final void method960() {
        field2002.method1520(true, this.field2003);
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "()V", line = 22)
    public final void method961() {
        field2002.method1517((byte) 125, this.field2003);
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lor;I)V", line = 25)
    public class132(class173 arg0, int arg1) {
        field2002 = arg0.method1187(0);
        this.field2003 = arg1;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "()V", line = 30)
    public final void method962() {
        field2002.method1518(this.field2003, super.field7430);
    }
}
