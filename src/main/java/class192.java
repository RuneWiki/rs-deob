import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class192 extends class210 {

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    private int field3734;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "Lkf;")
    private static class102 field3735;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "()V")
    public final void method415() {
        field3735.method631(6941, this.field3734);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public final void method420(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3735.method632(arg0, (byte) 114, this.field3734);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()V")
    public final void method419() {
        field3735.method635((byte) -45, this.field3734);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
    public final void method416() {
        field3735.method633(this.field3734, super.field4041);
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lpf;I)V")
    public class192(class147 arg0, int arg1) {
        field3735 = arg0.method902((byte) 38);
        this.field3734 = arg1;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "()V")
    public static void method1226() {
        field3735 = null;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "()I")
    public final int method417() {
        return field3735.method630(this.field3734, true);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method418(Component arg0) throws Exception {
        field3735.method634(18561, class210.field4018, class120.field2167, arg0);
    }
}
