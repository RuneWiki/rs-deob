import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class130 extends class111 {

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    private int field2128;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "Lej;")
    private static class210 field2127;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 3)
    public final void method866(Component arg0) throws Exception {
        field2127.method1470(class151.field2393, 1570, class75.field1219, arg0);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "()V", line = 6)
    public final void method858() {
        field2127.method1472(this.field2128, (byte) 119);
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "()I", line = 9)
    public final int method864() {
        return field2127.method1468(this.field2128, (byte) -15);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "()V", line = 13)
    public final void method855() {
        field2127.method1469((byte) -57, this.field2128);
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V", line = 16)
    public final void method862(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field2127.method1471(17020, arg0, this.field2128);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lgi;I)V", line = 22)
    public class130(class285 arg0, int arg1) {
        field2127 = arg0.method1950(true);
        this.field2128 = arg1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()V", line = 27)
    public final void method851() {
        field2127.method1473(this.field2128, this.field1804);
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "()V", line = 30)
    public static void method960() {
        field2127 = null;
    }
}
