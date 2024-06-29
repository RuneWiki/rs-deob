import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class55 extends InputStream {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[I")
    public static int[] field998 = new int[14];

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!dl", name = "read", descriptor = "()I")
    public final int read() {
        class21.method220(0, 30000L);
        field997++;
        return -1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method511(int arg0) {
        field998 = null;
        int var1 = -104 / (arg0 / 51);
    }

    static {
        new class104(null, "geschickt werden.", null, null);
    }
}
