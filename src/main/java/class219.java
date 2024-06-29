import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class219 extends class137 {

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    private int field3701;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "Loi;")
    private static class306 field3700;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "()V", line = 3)
    public static void method1546() {
        field3700 = null;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()V", line = 7)
    public final void method378() {
        field3700.method2122(-11947, this.field3701);
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()V", line = 10)
    public final void method381() {
        field3700.method2123(this.field3701, this.field2305);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()I", line = 13)
    public final int method377() {
        return field3700.method2126((byte) -68, this.field3701);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 17)
    public final void method379(Component arg0) throws Exception {
        field3700.method2124(class88.field1462, class92.field1584, 69, arg0);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()V", line = 20)
    public final void method380() {
        field3700.method2125((byte) -109, this.field3701);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lfk;I)V", line = 22)
    public class219(class40 arg0, int arg1) {
        field3700 = arg0.method251(-98);
        this.field3701 = arg1;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V", line = 27)
    public final void method376(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field3700.method2127(arg0, 12971, this.field3701);
    }
}
