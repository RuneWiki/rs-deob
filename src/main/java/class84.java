import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class84 extends class55 {

    @OriginalMember(owner = "client!hg", name = "N", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client!hg", name = "O", descriptor = "Lqd;")
    private static class178 field1529;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method412(Component arg0) throws Exception {
        field1529.method1275((byte) -94, class7.field99, arg0, class11.field161);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()V")
    public final void method408() {
        field1529.method1273((byte) 68, this.field1528);
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
    public final void method409(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1529.method1271((byte) -126, this.field1528, arg0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "()V")
    public final void method413() {
        field1529.method1276(-16511, this.field1528);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lqg;I)V")
    public class84(class181 arg0, int arg1) {
        field1529 = arg0.method1288((byte) -118);
        this.field1528 = arg1;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()V")
    public final void method400() {
        field1529.method1272(this.field1528, super.field1025);
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "()V")
    public static void method574() {
        field1529 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()I")
    public final int method398() {
        return field1529.method1274((byte) -17, this.field1528);
    }
}
