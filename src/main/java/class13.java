import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class13 extends class22 {

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "Ldh;")
    private static class138 field196;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()V", line = 3)
    public final void method94() {
        field196.method999(this.field195, this.field349);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V", line = 6)
    public final void method95(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field196.method1002(arg0, (byte) 65, this.field195);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 14)
    public final void method96(Component arg0) throws Exception {
        field196.method1000(class156.field2337, class220.field3413, -14251, arg0);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "()I", line = 17)
    public final int method97() {
        return field196.method1001((byte) 106, this.field195);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V", line = 20)
    public final void method98() {
        field196.method998(this.field195, -20645);
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "()V", line = 23)
    public static void method99() {
        field196 = null;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "()V", line = 26)
    public final void method100() {
        field196.method1003(this.field195, -28178);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lki;I)V", line = 28)
    public class13(class180 arg0, int arg1) {
        field196 = arg0.method1289(12210);
        this.field195 = arg1;
    }
}
