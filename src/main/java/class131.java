import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class131 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Laf;")
    public static class68 field2095 = new class68(32);

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[Lqi;")
    public static class129[] field2100 = new class129[14];

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[[I")
    public static int[][] field2101 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[[[B")
    public static byte[][][] field2096;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method926(int arg0) {
        field2095 = null;
        field2100 = null;
        field2096 = null;
        field2101 = null;
        if (arg0 <= 83) {
            field2095 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BC)Z")
    public static final boolean method927(byte arg0, char arg1) {
        if (arg0 <= 42) {
            return true;
        } else {
            field2097++;
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }
}
