import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class256 extends class140 {

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    private int field4551;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "Lqi;")
    private static class126 field4550;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method689(Component arg0) throws Exception {
        field4550.method986(26109, arg0, class55.field1011, class157.field2804);
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "()V")
    public static void method1796() {
        field4550 = null;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "()V")
    public final void method687() {
        field4550.method985((byte) 126, this.field4551);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
    public final void method688() {
        field4550.method988(this.field4551, super.field2493);
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "()V")
    public final void method686() {
        field4550.method989((byte) 8, this.field4551);
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "()I")
    public final int method690() {
        return field4550.method984(this.field4551, -73);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lfh;I)V")
    public class256(class129 arg0, int arg1) {
        field4550 = arg0.method1013(true);
        this.field4551 = arg1;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
    public final void method685(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4550.method987(arg0, false, this.field4551);
        }
    }
}
