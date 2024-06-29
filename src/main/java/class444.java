import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class444 extends class529 {

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    private int field6082;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "Lgea;")
    private static class642 field6081;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "()V")
    public final void method2401() {
        field6081.method835(0, this.field6082);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public final void method2402(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field6081.method836(this.field6082, (byte) 110, arg0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()V")
    public final void method2399() {
        field6081.method834(this.field6082, super.field7387);
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "()I")
    public final int method2403() {
        return field6081.method832(-7072, this.field6082);
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lmr;I)V")
    public class444(class613 arg0, int arg1) {
        field6081 = (class642) arg0.method3595((byte) -121);
        this.field6082 = arg1;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "()V")
    public static void method2652() {
        field6081 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2400(Component arg0) throws Exception {
        field6081.method833(-105, arg0, class379.field5336, class757.field10509);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()V")
    public final void method2398() {
        field6081.method831(this.field6082, (byte) 109);
    }
}
