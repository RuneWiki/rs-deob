import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class121 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
    public static int[] field1380 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field1382 = 2;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lhq;")
    public static class365 field1383 = new class365(64);

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 5)
    public static void method801(boolean arg0) {
        if (arg0) {
            method801(true);
        }
        field1380 = null;
        field1383 = null;
    }
}
