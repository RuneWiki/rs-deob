import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class152 {

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "Z")
    public static boolean field2301 = false;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)I", line = 8)
    public static final int method1113(int arg0, int arg1) {
        field2302++;
        if (arg1 != -1114009241) {
            method1113(92, 24);
        }
        return arg0 >>> 7;
    }
}
