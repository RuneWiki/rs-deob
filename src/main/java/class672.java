import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class672 extends class304 {

    @OriginalMember(owner = "client!bba", name = "I", descriptor = "I")
    private int field9320;

    @OriginalMember(owner = "client!bba", name = "J", descriptor = "Lmn;")
    private static class212 field9321;

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lufa;I)V")
    public class672(class140 arg0, int arg1) {
        field9321 = (class212) arg0.method1061(true);
        this.field9320 = arg1;
    }

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "()V")
    public static void method3688() {
        field9321 = null;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1788(Component arg0) throws Exception {
        field9321.method1365((byte) -75, class66.field901, arg0, class669.field9289);
    }

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "()V")
    public final void method1790() {
        field9321.method1366(this.field9320, super.field3978);
    }

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "()V")
    public final void method1798() {
        field9321.method1361(this.field9320, (byte) -26);
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "()I")
    public final int method1787() {
        return field9321.method1364(this.field9320, true);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "()V")
    public final void method1786() {
        field9321.method1363(-6142, this.field9320);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
    public final void method1784(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field9321.method1362(this.field9320, (byte) -84, arg0);
        }
    }
}
