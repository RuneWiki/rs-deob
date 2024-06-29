import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class257 {

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "[I")
    public static int[] field3795 = new int[4096];

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "Lbk;")
    public static class346 field3793 = class583.method3341(-11822);

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "[[[Ldf;")
    public static class370[][][] field3792;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V")
    public static final void method1701(int arg0, int arg1) {
        class254.field3763 = arg0;
        class459.field6560 = -1;
        field3794++;
        class459.field6560 = -1;
        if (arg1 != 37) {
            field3793 = null;
        }
        class628.method3597((byte) -105);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
    public static void method1702(byte arg0) {
        if (arg0 != 66) {
            field3793 = null;
        }
        field3795 = null;
        field3792 = null;
        field3793 = null;
    }
}
