import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class155 extends class163 {

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "J")
    public long field2765;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "Lke;")
    public static class256 field2766 = class316.method2202("null", 27626);

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static volatile int field2767 = 0;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Lke;")
    public static class256 field2768 = class316.method2202("(Z", 27626);

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2769;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)V", line = 13)
    public static final void method1155(int arg0, boolean arg1) {
        field2764++;
        class77 var2 = class156.method1158(10, arg1, arg0);
        var2.method586((byte) 98);
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V", line = 31)
    public class155() {
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(J)V", line = 38)
    public class155(long arg0) {
        this.field2765 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 47)
    public static void method1156(boolean arg0) {
        field2768 = null;
        if (!arg0) {
            method1155(36, false);
        }
        field2766 = null;
        field2769 = null;
    }
}
