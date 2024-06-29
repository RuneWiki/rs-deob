import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class274 extends class190 {

    @OriginalMember(owner = "client!cq", name = "X", descriptor = "I")
    private int field3966;

    @OriginalMember(owner = "client!cq", name = "Y", descriptor = "Lsb;")
    private static class160 field3967;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "()V")
    public final void method1288() {
        field3967.method1160(this.field3966, -117);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public final void method1290(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3967.method1162(false, this.field3966, arg0);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "()V")
    public final void method1285() {
        field3967.method1159(this.field3966, 10049);
    }

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "()V")
    public static void method1864() {
        field3967 = null;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lml;I)V")
    public class274(class219 arg0, int arg1) {
        field3967 = arg0.method1526(2);
        this.field3966 = arg1;
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "()V")
    public final void method1289() {
        field3967.method1157(this.field3966, super.field2727);
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "()I")
    public final int method1286() {
        return field3967.method1161(this.field3966, -7945);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1287(Component arg0) throws Exception {
        field3967.method1158(class46.field615, class246.field3671, arg0, 31142);
    }
}
