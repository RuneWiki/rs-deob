import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class30 extends class156 {

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "Lfa;")
    private static class159 field336;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()I", line = 3)
    public final int method198() {
        return field336.method1089(this.field337, (byte) -122);
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "()V", line = 6)
    public static void method199() {
        field336 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 9)
    public final void method200(Component arg0) throws Exception {
        field336.method1087(class40.field540, class368.field5405, arg0, -116);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 13)
    public final void method201(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field336.method1091(this.field337, arg0, (byte) -44);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()V", line = 19)
    public final void method202() {
        field336.method1092(100, this.field337);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lod;I)V", line = 22)
    public class30(class352 arg0, int arg1) {
        field336 = arg0.method2210(true);
        this.field337 = arg1;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()V", line = 27)
    public final void method203() {
        field336.method1090(this.field337, super.field2319);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V", line = 30)
    public final void method204() {
        field336.method1088((byte) 114, this.field337);
    }
}
