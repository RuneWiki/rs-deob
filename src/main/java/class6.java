import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class165 {

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Lrh;")
    private static class186 field102;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "()V")
    public final void method35() {
        field102.method1154(this.field103, (byte) 56);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method36(Component arg0) throws Exception {
        field102.method1155(arg0, class204.field3624, class149.field2668, (byte) -82);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()V")
    public final void method37() {
        field102.method1157(this.field103, super.field2983);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()I")
    public final int method38() {
        return field102.method1152(this.field103, -25500);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
    public final void method39(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field102.method1156(arg0, this.field103, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "()V")
    public static void method40() {
        field102 = null;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lda;I)V")
    public class6(class35 arg0, int arg1) {
        field102 = arg0.method265((byte) -34);
        this.field103 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "()V")
    public final void method41() {
        field102.method1153(this.field103, -31812);
    }
}
