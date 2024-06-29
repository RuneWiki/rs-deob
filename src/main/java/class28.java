import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class28 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field341 = class465.method2644(1600, 4);

    @OriginalMember(owner = "client!o", name = "c", descriptor = "[I")
    public static int[] field343 = new int[1];

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method153(int arg0) {
        if (arg0 == 1) {
            field343 = null;
        }
    }
}
