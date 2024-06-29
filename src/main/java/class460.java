import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class460 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public int field6559;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "Lrg;")
    public class667 field6562;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "[I")
    public static int[] field6560;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "[I")
    public int[] field6561;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public static void method2728(int arg0) {
        field6560 = null;
        if (arg0 <= 72) {
            method2728(89);
        }
    }
}
