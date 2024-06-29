import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class333 extends class453 {

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    private int field4776;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "Lbn;")
    private static class167 field4777;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public final void method1563(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4777.method818(79, this.field4776, arg0);
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "()V")
    public final void method1559() {
        field4777.method816(this.field4776, -18915);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()I")
    public final int method1564() {
        return field4777.method815(this.field4776, (byte) -69);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lkd;I)V")
    public class333(class355 arg0, int arg1) {
        field4777 = arg0.method2151(false);
        this.field4776 = arg1;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1562(Component arg0) throws Exception {
        field4777.method814(arg0, class137.field1664, class345.field4936, (byte) 53);
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "()V")
    public final void method1561() {
        field4777.method819(this.field4776, super.field6400);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "()V")
    public final void method1560() {
        field4777.method817(this.field4776, -10639);
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "()V")
    public static void method2019() {
        field4777 = null;
    }
}
