import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class158 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Lsg;")
    public static class162 field2885 = new class162();

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2888 = -1;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2890 = 0;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Ljh;")
    public static class284 field2884;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Lsj;")
    public static class49 field2887;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "[I")
    public static int[] field2889;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "[[I")
    public static int[][] field2886;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public static void method1099(boolean arg0) {
        field2887 = null;
        field2885 = null;
        if (!arg0) {
            field2884 = null;
        }
        field2889 = null;
        field2886 = null;
        field2884 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZI)I")
    public static final int method1100(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2889 = null;
        }
        field2883++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }
}
