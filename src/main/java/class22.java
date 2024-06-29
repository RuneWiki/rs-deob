import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class22 {

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "[[[B")
    public static byte[][][] field333;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 4)
    public static void method142(int arg0) {
        if (arg0 != 1977377160) {
            field333 = null;
        }
        field333 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)I", line = 20)
    public static final int method143(int arg0, boolean arg1) {
        field332++;
        if (arg1) {
            field333 = null;
        }
        return arg0 >>> 8;
    }
}
