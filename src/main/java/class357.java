import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class357 extends class257 {

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    private int field4971;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "Lqn;")
    private static class46 field4972;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "()V", line = 3)
    public final void method1456() {
        field4972.method485(-22464, this.field4971);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 7)
    public final void method1454(Component arg0) throws Exception {
        field4972.method483(arg0, class241.field3572, true, class405.field6017);
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "()V", line = 10)
    public static void method2151() {
        field4972 = null;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Let;I)V", line = 12)
    public class357(class419 arg0, int arg1) {
        field4972 = arg0.method2557(18);
        this.field4971 = arg1;
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "()V", line = 17)
    public final void method1455() {
        field4972.method484(26264, this.field4971);
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "()V", line = 21)
    public final void method1452() {
        field4972.method488(this.field4971, super.field3777);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "()I", line = 24)
    public final int method1453() {
        return field4972.method486(this.field4971, 25371);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V", line = 27)
    public final void method1451(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4972.method487((byte) 89, arg0, this.field4971);
        }
    }
}
