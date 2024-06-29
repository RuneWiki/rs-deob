import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class175 {

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2803 = 0;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[Lnn;")
    public static class44[] field2802 = new class44[0];

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[[Z")
    public static boolean[][] field2804;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 7)
    public static void method1292(byte arg0) {
        if (arg0 > -11) {
            method1292((byte) 114);
        }
        field2804 = (boolean[][]) null;
        field2802 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)I", line = 39)
    public static final int method1293(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field2800++;
        if (arg2 == var4) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }
}
