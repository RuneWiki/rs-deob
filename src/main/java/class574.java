import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class574 extends class633 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[Lej;")
    public class108[] field8184;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "F")
    public static float field8188 = 0.0F;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Ljo;")
    public static class307 field8186 = new class307("", 17);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field8185;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static void method3371(byte arg0) {
        field8186 = null;
        if (arg0 > -20) {
            method3372((byte) 0);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "([Lej;)V")
    public class574(class108[] arg0) {
        this.field8184 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public static final void method3372(byte arg0) {
        class257.method1823(0);
        field8185++;
        if (arg0 < 18) {
            field8186 = null;
        }
    }
}
