import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class4 extends class82 {

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "Lqg;")
    private static class181 field54;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field54.method1230(this.field55, arg0, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method23(Component arg0) throws Exception {
        field54.method1231(24045, class106.field1920, class160.field2755, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method24() {
        field54.method1229(this.field55, -16604);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I")
    public final int method25() {
        return field54.method1233(true, this.field55);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "()V")
    public static void method26() {
        field54 = null;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()V")
    public final void method27() {
        field54.method1232(this.field55, super.field1488);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "()V")
    public final void method28() {
        field54.method1234(-10944, this.field55);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Ln;I)V")
    public class4(class138 arg0, int arg1) {
        field54 = arg0.method960((byte) -97);
        this.field55 = arg1;
    }
}
