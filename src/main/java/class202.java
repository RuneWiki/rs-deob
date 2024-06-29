import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class202 {

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "Lbj;")
    public static class162 field3259 = new class162(27, 4);

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public static int field3261 = 0;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "[I")
    public static int[] field3264 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public int field3257;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "Lph;")
    public static class459 field3263;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "Z")
    public boolean field3260;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method1391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3262++;
        if ((arg1 + arg7) > arg4 && arg4 + arg6 > arg1) {
            if (arg0 != 25356) {
                field3261 = -101;
            }
            return arg2 + arg8 > arg3 && arg3 + arg5 > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
    public static void method1392(byte arg0) {
        field3259 = null;
        if (arg0 != 68) {
            field3264 = null;
        }
        field3263 = null;
        field3264 = null;
    }
}
