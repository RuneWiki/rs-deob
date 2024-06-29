import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class111 extends class149 {

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    private int field2612;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "Lwe;")
    private static class154 field2613;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()I")
    public final int method432() {
        return field2613.method1225(70, this.field2612);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method431(Component arg0) throws Exception {
        field2613.method1223(false, class82.field1873, arg0, class82.field1879);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
    public final void method436() {
        field2613.method1224(true, this.field2612);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
    public final void method435(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field2613.method1226(arg0, this.field2612, -32717);
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "()V")
    public final void method434() {
        field2613.method1227(this.field2612, super.field3681);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "()V")
    public final void method433() {
        field2613.method1228((byte) -28, this.field2612);
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "()V")
    public static void method830() {
        field2613 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lu;I)V")
    public class111(class137 arg0, int arg1) {
        field2613 = arg0.method1073(-106);
        this.field2612 = arg1;
    }
}
