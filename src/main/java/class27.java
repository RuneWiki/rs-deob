import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class27 extends class86 {

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field310 = 1;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Ljava/lang/String;")
    public static String field312 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[[I")
    public static int[][] field318 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Z")
    public static boolean field313 = true;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Lfh;")
    public static class140 field317;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Lr;")
    public class27 field314;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Lr;")
    public class27 field316;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 4)
    public static void method180(int arg0) {
        field318 = (int[][]) null;
        int var1 = 35 / ((arg0 + 25) / 35);
        field312 = null;
        field317 = null;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V", line = 34)
    public final void method181(int arg0) {
        field315++;
        if (arg0 != 13) {
            field317 = (class140) null;
        }
        if (this.field316 != null) {
            this.field316.field314 = this.field314;
            this.field314.field316 = this.field316;
            this.field314 = null;
            this.field316 = null;
        }
    }
}
