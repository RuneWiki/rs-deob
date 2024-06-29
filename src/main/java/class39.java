import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 extends class92 {

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    private int field731;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "Ld;")
    private static class22 field730;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public final void method280(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field730.method192(-7332, this.field731, arg0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()V")
    public final void method281() {
        field730.method197(this.field731, super.field2078);
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "()V")
    public static void method282() {
        field730 = null;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lbb;I)V")
    public class39(class10 arg0, int arg1) {
        field730 = arg0.method81(-13684);
        this.field731 = arg1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method283(Component arg0) throws Exception {
        field730.method195(class49.field920, class73.field1624, arg0, 119);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()I")
    public final int method284() {
        return field730.method193(this.field731, -24209);
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "()V")
    public final void method285() {
        field730.method196(this.field731, -124);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "()V")
    public final void method286() {
        field730.method194(-9595, this.field731);
    }
}
