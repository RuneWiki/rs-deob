import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class194 extends class120 {

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    private int field3329;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "Lhj;")
    private static class126 field3328;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
    public final void method37() {
        field3328.method911(this.field3329, -10508);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()V")
    public final void method39() {
        field3328.method912(this.field3329, super.field2150);
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "()V")
    public static void method1269() {
        field3328 = null;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    public final void method36(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3328.method910(this.field3329, (byte) 110, arg0);
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ljk;I)V")
    public class194(class58 arg0, int arg1) {
        field3328 = arg0.method365(-27857);
        this.field3329 = arg1;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()V")
    public final void method40() {
        field3328.method913(this.field3329, 126);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method38(Component arg0) throws Exception {
        field3328.method909(class84.field1375, arg0, class110.field1946, 103);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()I")
    public final int method41() {
        return field3328.method914(this.field3329, true);
    }
}
