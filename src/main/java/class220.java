import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class220 extends class100 {

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    private int field3958;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "Lej;")
    private static class132 field3959;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "()V")
    public static void method1509() {
        field3959 = null;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()I")
    public final int method385() {
        return field3959.method879(false, this.field3958);
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "()V")
    public final void method383() {
        field3959.method883(this.field3958, super.field1767);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method387(Component arg0) throws Exception {
        field3959.method882(class125.field2242, 25407, class51.field1080, arg0);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lve;I)V")
    public class220(class226 arg0, int arg1) {
        field3959 = arg0.method1530((byte) 114);
        this.field3958 = arg1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public final void method382(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3959.method884(this.field3958, arg0, true);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
    public final void method386() {
        field3959.method881(this.field3958, (byte) 82);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()V")
    public final void method384() {
        field3959.method880(this.field3958, (byte) 5);
    }
}
