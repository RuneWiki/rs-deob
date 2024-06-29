import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class261 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[[I")
    public static int[][] field3834 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lea;")
    public static class395 field3836;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)I")
    public static final int method1751(int arg0, boolean arg1) {
        field3835++;
        if (arg1) {
            field3836 = null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static void method1752(byte arg0) {
        field3834 = null;
        int var1 = 32 / ((arg0 - 8) / 39);
        field3836 = null;
    }
}
