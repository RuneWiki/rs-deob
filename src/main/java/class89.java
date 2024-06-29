import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 extends class75 {

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    private int field2103;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "Lca;")
    private static class16 field2102;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "()V")
    public final void method275() {
        field2102.method102(28418, this.field2103);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method278(Component arg0) throws Exception {
        field2102.method106(class125.field2990, class138.field3361, arg0, (byte) -28);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()I")
    public final int method280() {
        return field2102.method101(32319, this.field2103);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
    public final void method277() {
        field2102.method105(this.field2103, super.field1748);
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "()V")
    public final void method276() {
        field2102.method104((byte) -55, this.field2103);
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "()V")
    public static void method679() {
        field2102 = null;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lde;I)V")
    public class89(class27 arg0, int arg1) {
        field2102 = arg0.method222((byte) -75);
        this.field2103 = arg1;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public final void method279(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2102.method103((byte) -2, this.field2103, arg0);
        }
    }
}
