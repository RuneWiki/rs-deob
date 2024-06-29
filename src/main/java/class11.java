import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 {

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "[I")
    public static int[] field83 = new int[25];

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "Lvj;")
    public static class373 field85 = new class373(110, 6);

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V", line = 3)
    public static final void method55(int arg0) {
        field82++;
        if (class165.field2028 != arg0 && class492.field6865.field2715 != -1) {
            class289.method1626(class492.field6865.field2713, class492.field6865.field2715, 106);
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V", line = 27)
    public static void method56(int arg0) {
        if (arg0 > -78) {
            field83 = null;
        }
        field83 = null;
        field85 = null;
    }
}
