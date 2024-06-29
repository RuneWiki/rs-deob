import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class61 extends class51 {

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "Lwf;")
    private static class204 field1544;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V")
    public final void method493() {
        field1544.method1349(this.field1543, 121);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public final void method492(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1544.method1350(-30581, arg0, this.field1543);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method507(Component arg0) throws Exception {
        field1544.method1352(arg0, class125.field2774, class124.field2762, (byte) -114);
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()V")
    public final void method496() {
        field1544.method1348(this.field1543, -86);
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "()V")
    public static void method562() {
        field1544 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()I")
    public final int method495() {
        return field1544.method1353(this.field1543, -105);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()V")
    public final void method502() {
        field1544.method1351(this.field1543, super.field1225);
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lqe;I)V")
    public class61(class149 arg0, int arg1) {
        field1544 = arg0.method1049((byte) 28);
        this.field1543 = arg1;
    }
}
