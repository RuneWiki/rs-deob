import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class612 {

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field8619 = 0;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "[I")
    public static int[] field8621 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lsb;")
    public static class305 field8620 = new class305(20, 1);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static void method3411(boolean arg0) {
        field8620 = null;
        if (arg0) {
            field8621 = null;
        }
    }
}
