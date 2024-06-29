import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class471 {

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field6866 = -1;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "[[I")
    public static int[][] field6867 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6865++;
        int var9 = -77 % ((-arg2 - 77) / 46);
        class31.field316[class44.field480++] = new class417(arg3, arg6, arg0, arg8, arg8, arg0, arg5, arg4, arg4, arg5, arg1, arg1, arg7, arg7);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method2849(int arg0) {
        field6867 = null;
        if (arg0 >= -11) {
            method2849(114);
        }
    }
}
