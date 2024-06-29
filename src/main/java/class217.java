import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class217 {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[[I")
    public static int[][] field3324 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[I")
    public static int[] field3328 = new int[5];

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[[[B")
    public static byte[][][] field3325;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "[[[I")
    public static int[][][] field3330;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V", line = 8)
    public static final void method1550(int arg0, int arg1) {
        field3327++;
        class188 var2 = class147.method1111(-52, arg1, 10);
        var2.method1393((byte) -96);
        if (arg0 != 1) {
            field3330 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 30)
    public static void method1551(int arg0) {
        field3325 = (byte[][][]) null;
        field3328 = null;
        field3324 = (int[][]) null;
        if (arg0 >= -35) {
            field3325 = (byte[][][]) ((byte[][][]) null);
        }
        field3330 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLsn;)Lsn;")
    public abstract class286 method203(boolean arg0, class286 arg1);
}
