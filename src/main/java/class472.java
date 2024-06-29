import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class472 {

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field6789 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
    public static int[] field6787 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/io/File;B)[B", line = 5)
    public static final byte[] method2775(File arg0, byte arg1) {
        int var2 = 71 % ((arg1 - 56) / 39);
        field6788++;
        return class325.method1941((int) arg0.length(), arg0, (byte) 127);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 19)
    public static void method2776(boolean arg0) {
        if (arg0) {
            method2775(null, (byte) 102);
        }
        field6787 = null;
    }
}
