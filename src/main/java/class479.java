import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class479 extends InputStream {

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "Laba;")
    public static class140 field6647;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
    public static void method2852(byte arg0) {
        if (arg0 < -39) {
            field6647 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "read", descriptor = "()I")
    public final int read() {
        field6646++;
        class730.method4066((byte) -45, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)V")
    public static final void method2853(boolean arg0) {
        field6644++;
        class493.field6788.method314(-2);
        if (!arg0) {
            field6645 = 62;
        }
    }
}
