import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class539 extends class552 {

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    private int field7392;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "Lmu;")
    private static class459 field7391;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "()V", line = 4)
    public final void method2925() {
        field7391.method1921(0, this.field7392);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 7)
    public final void method2926(Component arg0) throws Exception {
        field7391.method1916(true, class59.field747, arg0, class169.field2422);
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "()V", line = 11)
    public static void method3030() {
        field7391 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lgba;I)V", line = 13)
    public class539(class388 arg0, int arg1) {
        field7391 = (class459) arg0.method2233(-14);
        this.field7392 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "()V", line = 18)
    public final void method2924() {
        field7391.method1919(0, this.field7392);
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()I", line = 21)
    public final int method2922() {
        return field7391.method1917(2, this.field7392);
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 24)
    public final void method2923(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field7391.method1920(this.field7392, arg0, 17656);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()V", line = 30)
    public final void method2921() {
        field7391.method1918(this.field7392, super.field7528);
    }
}
