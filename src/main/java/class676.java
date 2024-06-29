import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class676 extends class618 {

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[[I")
    public static int[][] field9624 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field9630 = 0;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "[[I")
    public static int[][] field9628 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Ljava/lang/Object;")
    public static Object field9627;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
    public static final int method3825(int arg0, int arg1) {
        field9629++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        if (arg1 < 106) {
            field9624 = null;
        }
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method3826(byte arg0) {
        field9627 = null;
        field9624 = null;
        int var1 = -71 % ((62 - arg0) / 43);
        field9628 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method3827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field9626++;
        int var7 = arg5 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg1;
            arg1 = var8;
        }
        if (arg6 != -32) {
            field9624 = null;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg2;
        } else if (var7 == 2) {
            return 1 + 7 - arg3 - arg0;
        } else {
            return 8 - arg1 - arg2;
        }
    }
}
