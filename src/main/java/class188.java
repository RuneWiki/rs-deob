import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class188 extends class152 {

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Lbd;")
    public class68 field2269;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "Ltf;")
    public static class312 field2271;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)I")
    public static final int method1244(int arg0, int arg1) {
        return class316.field3876 == null ? 0 : class316.field3876[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lbd;)V")
    public class188(class68 arg0) {
        this.field2269 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method1245(int arg0) {
        field2271 = null;
        if (arg0 != -620) {
            field2270 = -20;
        }
    }
}
