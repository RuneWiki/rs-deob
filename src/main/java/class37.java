import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class37 extends class57 {

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    private int field877;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "Lwd;")
    private static class154 field878;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public final void method281(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field878.method1197(arg0, this.field877, 21307);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lfe;I)V")
    public class37(class41 arg0, int arg1) {
        field878 = arg0.method302((byte) 89);
        this.field877 = arg1;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "()V")
    public static void method282() {
        field878 = null;
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "()V")
    public final void method283() {
        field878.method1196(this.field877, super.field1400);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "()V")
    public final void method284() {
        field878.method1198(this.field877, (byte) 90);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method285(Component arg0) throws Exception {
        field878.method1195(class8.field231, arg0, class144.field3371, (byte) 88);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()I")
    public final int method286() {
        return field878.method1194(this.field877, 14927);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()V")
    public final void method287() {
        field878.method1199(107, this.field877);
    }
}
