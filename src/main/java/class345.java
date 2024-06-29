import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class345 extends class154 {

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "Lgr;")
    public static class460 field4639;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
    public static void method2134(byte arg0) {
        if (arg0 <= 0) {
            field4641 = -16;
        }
        field4639 = null;
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
    public class345() {
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(I)V")
    public class345(int arg0) {
        this.field4640 = arg0;
    }
}
