import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class564 extends class337 {

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    private int field8078;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "Ltba;")
    private static class647 field8079;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "()V")
    public static void method3213() {
        field8079 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method2073(Component arg0) throws Exception {
        field8079.method3725(class604.field8591, -17052, class641.field9295, arg0);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()V")
    public final void method2065() {
        field8079.method3723(this.field8078, true);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "()V")
    public final void method2070() {
        field8079.method3720(this.field8078, -991);
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "()V")
    public final void method2077() {
        field8079.method3722(this.field8078, super.field4821);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public final void method2066(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field8079.method3721(arg0, this.field8078, 6117);
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "()I")
    public final int method2075() {
        return field8079.method3724(8703, this.field8078);
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lae;I)V")
    public class564(class40 arg0, int arg1) {
        field8079 = arg0.method369(127);
        this.field8078 = arg1;
    }
}
