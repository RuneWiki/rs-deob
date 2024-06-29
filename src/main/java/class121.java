import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class121 extends class168 {

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    private int field1740;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "Li;")
    private static class257 field1741;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "()V")
    public final void method677() {
        field1741.method1731(this.field1740, (byte) -67);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Llj;I)V")
    public class121(class205 arg0, int arg1) {
        field1741 = arg0.method1399(false);
        this.field1740 = arg1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
    public final void method679() {
        field1741.method1730(this.field1740, (byte) 22);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "()V")
    public final void method682() {
        field1741.method1729(this.field1740, super.field2826);
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "()I")
    public final int method681() {
        return field1741.method1727(this.field1740, 80);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method680(Component arg0) throws Exception {
        field1741.method1728(arg0, class165.field2715, class216.field3884, (byte) 83);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method678(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1741.method1732(arg0, this.field1740, 21321);
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "()V")
    public static void method748() {
        field1741 = null;
    }
}
