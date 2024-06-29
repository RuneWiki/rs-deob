import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class464 extends InputStream {

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "[I")
    public static int[] field6227;

    @OriginalMember(owner = "client!vq", name = "read", descriptor = "()I")
    public final int read() {
        class149.method1052(30000L, true);
        field6228++;
        return -1;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static void method2636(byte arg0) {
        if (arg0 != -6) {
            field6227 = null;
        }
        field6227 = null;
    }
}
