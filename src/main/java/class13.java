import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class13 extends class116 {

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Luf;")
    private static class205 field240;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()V")
    public final void method80() {
        field240.method1355(this.field241, super.field2238);
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "()V")
    public final void method81() {
        field240.method1354(this.field241, 13657);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()I")
    public final int method82() {
        return field240.method1353((byte) 123, this.field241);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "()V")
    public final void method83() {
        field240.method1356(this.field241, -9673);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public final void method84(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field240.method1357(12594, arg0, this.field241);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method85(Component arg0) throws Exception {
        field240.method1358(-116, class16.field290, arg0, class108.field2080);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lt;I)V")
    public class13(class189 arg0, int arg1) {
        field240 = arg0.method1252(0);
        this.field241 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "()V")
    public static void method86() {
        field240 = null;
    }
}
