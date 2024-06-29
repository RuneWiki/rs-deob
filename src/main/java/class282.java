import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class282 extends class258 {

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    private int field4482;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "Lti;")
    private static class138 field4483;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public final void method1598(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4483.method972(arg0, this.field4482, 77);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()V")
    public final void method1599() {
        field4483.method971(this.field4482, -14748);
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()I")
    public final int method1596() {
        return field4483.method976((byte) 20, this.field4482);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lvb;I)V")
    public class282(class131 arg0, int arg1) {
        field4483 = arg0.method915(-105);
        this.field4482 = arg1;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
    public final void method1594() {
        field4483.method975(this.field4482, super.field4207);
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "()V")
    public static void method1836() {
        field4483 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1597(Component arg0) throws Exception {
        field4483.method973(arg0, class81.field1478, -2896, class74.field1215);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()V")
    public final void method1595() {
        field4483.method974(this.field4482, (byte) -36);
    }
}
