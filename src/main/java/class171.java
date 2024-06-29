import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class171 extends class149 {

    @OriginalMember(owner = "client!im", name = "L", descriptor = "I")
    private int field2962;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "Lfl;")
    private static class215 field2963;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "()V", line = 3)
    public static void method1206() {
        field2963 = null;
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "()V", line = 6)
    public final void method1057() {
        field2963.method1511(this.field2962, this.field2619);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V", line = 9)
    public final void method1052(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field2963.method1509(arg0, 13834, this.field2962);
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "()V", line = 16)
    public final void method1048() {
        field2963.method1512((byte) -110, this.field2962);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "()V", line = 19)
    public final void method1047() {
        field2963.method1508(this.field2962, 21249);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 22)
    public final void method1054(Component arg0) throws Exception {
        field2963.method1507(class188.field3233, class63.field1213, arg0, -29636);
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lte;I)V", line = 24)
    public class171(class282 arg0, int arg1) {
        field2963 = arg0.method1951((byte) 96);
        this.field2962 = arg1;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "()I", line = 30)
    public final int method1053() {
        return field2963.method1510(this.field2962, (byte) 119);
    }
}
