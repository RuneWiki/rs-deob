import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class149 extends class160 {

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    private int field2665;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Lv;")
    private static class82 field2666;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()I", line = 3)
    public final int method1179() {
        return field2666.method744(101, this.field2665);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 6)
    public final void method1180(Component arg0) throws Exception {
        field2666.method747(arg0, class266.field4291, class26.field360, false);
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "()V", line = 9)
    public static void method1181() {
        field2666 = null;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()V", line = 12)
    public final void method1182() {
        field2666.method746((byte) -124, this.field2665);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 16)
    public final void method1183(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field2666.method748(-104, this.field2665, arg0);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()V", line = 23)
    public final void method1184() {
        field2666.method743(this.field2665, -13604);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lwe;I)V", line = 25)
    public class149(class59 arg0, int arg1) {
        field2666 = arg0.method538(-1);
        this.field2665 = arg1;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()V", line = 30)
    public final void method1185() {
        field2666.method745(this.field2665, this.field2818);
    }
}
