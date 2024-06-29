import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class407 {

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "F")
    public static float field5236;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "[[[Lqs;")
    public static class565[][][] field5237;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)Z")
    public static final boolean method2284(int arg0, int arg1, int arg2) {
        field5238++;
        int var3 = 67 / ((-arg0 - 62) / 55);
        if (arg1 >= 0 && arg2 >= 0 && arg1 < class234.field3033[1].length && arg2 < class234.field3033[1][arg1].length) {
            return (class234.field3033[1][arg1][arg2] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public static void method2285(int arg0) {
        if (arg0 != 27323) {
            field5237 = null;
        }
        field5237 = null;
    }
}
