import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class771 {

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "[[I")
    public static int[][] field10641 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "[S")
    public static short[] field10640 = new short[256];

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field10638;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Liv;")
    public static class635 field10639;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
    public static final void method4260(int arg0) {
        if (arg0 == -606) {
            class351.field4967 = new class665();
            field10638++;
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
    public static void method4261(int arg0) {
        field10640 = null;
        field10641 = null;
        if (arg0 != 256) {
            field10641 = null;
        }
        field10639 = null;
    }
}
