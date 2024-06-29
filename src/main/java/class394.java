import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class class394 extends class200 {

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public int field5952;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "Lue;")
    public class154 field5951;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "Lrn;")
    public static class174 field5953 = new class174(45, 3);

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "Lan;")
    public static class20 field5954 = new class20(16);

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "Liv;")
    public static class64 field5955 = new class64(87, 12);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)Z")
    public abstract boolean method1266(byte arg0);

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1267(byte arg0);

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(B)V")
    public static void method2437(byte arg0) {
        field5954 = null;
        field5953 = null;
        int var1 = -127 % ((arg0 + 29) / 59);
        field5955 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)Liq;")
    public static final class429 method2438(int arg0, int arg1, int arg2) {
        if (class380.field5761[arg0][arg1][arg2] == null) {
            boolean var3 = class380.field5761[0][arg1][arg2] != null && class380.field5761[0][arg1][arg2].field6389 != null;
            if (var3 && arg0 >= class190.field2830 - 1) {
                return null;
            }
            class36.method379(arg0, arg1, arg2);
        }
        return class380.field5761[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lue;I)V")
    public class394(class154 arg0, int arg1) {
        this.field5952 = arg1;
        this.field5951 = arg0;
    }
}
