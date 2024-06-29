import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class456 extends InputStream {

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "Ljo;")
    public static class307 field6842 = new class307("", 13);

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "Lri;")
    public static class97 field6845;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)V")
    public static void method2865(boolean arg0) {
        if (!arg0) {
            field6845 = null;
            field6842 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "read", descriptor = "()I")
    public final int read() {
        class549.method3313(30000L, 125);
        field6844++;
        return -1;
    }
}
