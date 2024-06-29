import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class449 {

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field6350 = 0;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "[Lrp;")
    public static class256[] field6347;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public static void method2650(int arg0) {
        field6347 = null;
        if (arg0 != 0) {
            field6348 = 125;
        }
    }
}
