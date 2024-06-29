import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class230 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lfc;")
    public static class235 field3280 = new class235(16, 12);

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "[[I")
    public static int[][] field3281 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lfc;")
    public static class235 field3282 = new class235(20, -1);

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Luc;")
    public static class27 field3283 = new class27(9, 15);

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "F")
    public static float field3285;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Lso;")
    public static class432 field3284;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZZ)V")
    public static final void method1459(boolean arg0, boolean arg1) {
        if (arg0) {
            field3279++;
            class485.field6724.method1853(-1472, arg1 || class630.field8790 != null && class630.field8790.method408());
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static void method1460(byte arg0) {
        field3281 = null;
        field3280 = null;
        field3284 = null;
        field3283 = null;
        field3282 = null;
        if (arg0 > -9) {
            field3280 = null;
        }
    }
}
