import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class262 extends class295 {

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    private int field4040;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "Ljl;")
    private static class109 field4041;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
    public final void method1793() {
        field4041.method834(this.field4040, (byte) -127);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()V")
    public final void method1794() {
        field4041.method835(this.field4040, (byte) 66);
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "()V")
    public static void method1795() {
        field4041 = null;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "()I")
    public final int method1796() {
        return field4041.method833(this.field4040, false);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lca;I)V")
    public class262(class122 arg0, int arg1) {
        field4041 = arg0.method931((byte) -120);
        this.field4040 = arg1;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1797(Component arg0) throws Exception {
        field4041.method836((byte) 73, class91.field1459, class11.field128, arg0);
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "()V")
    public final void method1798() {
        field4041.method832(this.field4040, super.field4727);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public final void method1799(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4041.method831(this.field4040, arg0, (byte) -15);
        }
    }
}
