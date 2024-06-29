import java.awt.Canvas;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class220 extends InputStream {

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "[I")
    public static int[] field2667 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Ljda;")
    public static class207 field2668 = null;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2665 = -1;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2664;

    @OriginalMember(owner = "client!bj", name = "read", descriptor = "()I", line = 6)
    public final int read() {
        class370.method2025(-1, 30000L);
        field2669++;
        return -1;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 17)
    public static void method1291(byte arg0) {
        if (arg0 < 38) {
            method1291((byte) -108);
        }
        field2664 = null;
        field2668 = null;
        field2667 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)[Lida;", line = 40)
    public static final class215[] method1292(int arg0) {
        if (arg0 <= 43) {
            field2665 = 77;
        }
        field2663++;
        return new class215[] { class427.field5671, class224.field2836, class260.field3304 };
    }
}
