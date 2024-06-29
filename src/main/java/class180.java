import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class180 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Ldm;")
    public class368 field2616;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[I")
    public int[] field2615;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/io/File;I)[B", line = 6)
    public static final byte[] method1219(File arg0, int arg1) {
        field2614++;
        if (arg1 != 256) {
            method1219(null, -24);
        }
        return class391.method2365((int) arg0.length(), arg0, 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BII)I", line = 20)
    public static final int method1220(byte arg0, int arg1, int arg2) {
        field2613++;
        if (arg0 == -17) {
            return arg1 == 4 || arg1 == 5 ? class352.field5015[arg2 & 0x3] : 256;
        } else {
            return -122;
        }
    }
}
