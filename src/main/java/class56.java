import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class56 {

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "Lfba;")
    public static class27 field712 = new class27(21, -1);

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "[[I")
    public static int[][] field713 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZZLjava/lang/Object;)[B", line = 9)
    public static final byte[] method388(boolean arg0, boolean arg1, Object arg2) {
        field710++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class758.method4206(var3, 19382) : var3;
        } else if (arg2 instanceof class734) {
            class734 var4 = (class734) arg2;
            return var4.method1952(-3427);
        } else if (arg0) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I[S)[S", line = 44)
    public static final short[] method389(int arg0, short[] arg1) {
        field711++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 1) {
            field713 = null;
        }
        short[] var2 = new short[arg1.length];
        class595.method3466(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Z)V", line = 61)
    public static void method390(boolean arg0) {
        field712 = null;
        if (arg0) {
            field713 = null;
        }
    }
}
