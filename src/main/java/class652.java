import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class652 extends class234 {

    @OriginalMember(owner = "client!sfa", name = "L", descriptor = "I")
    private int field8818;

    @OriginalMember(owner = "client!sfa", name = "M", descriptor = "Lpk;")
    private static class185 field8819;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "()V", line = 3)
    public final void method1140() {
        field8819.method1225(this.field8818, super.field3293);
    }

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "()I", line = 6)
    public final int method1141() {
        return field8819.method1224(256, this.field8818);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 9)
    public final void method1144(Component arg0) throws Exception {
        field8819.method1222(class443.field6071, arg0, class79.field1234, (byte) 27);
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lii;I)V", line = 13)
    public class652(class519 arg0, int arg1) {
        field8819 = (class185) arg0.method2895(25150);
        this.field8818 = arg1;
    }

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)V", line = 18)
    public final void method1142(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field8819.method1223(92, arg0, this.field8818);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "()V", line = 24)
    public final void method1139() {
        field8819.method1226(true, this.field8818);
    }

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "()V", line = 27)
    public static void method3576() {
        field8819 = null;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "()V", line = 30)
    public final void method1143() {
        field8819.method1221(this.field8818, 0);
    }
}
