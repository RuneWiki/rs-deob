import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class15 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
    public static int[] field197 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field200 = 0;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
    public static int[] field202 = new int[4096];

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Ljd;")
    public static class95 field201;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method116(int arg0, int arg1) {
        field198++;
        return arg0 <= arg1 && class258.field3951.length > arg1 ? class258.field3951[arg1] : false;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 16)
    public static void method117(int arg0) {
        field202 = null;
        field197 = null;
        field201 = null;
        if (arg0 != 4) {
            field200 = -46;
        }
    }
}
