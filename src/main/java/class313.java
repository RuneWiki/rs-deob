import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class313 extends class76 {

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public int field4648;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lke;")
    public static class622 field4649 = new class622(2, -1);

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field4650 = 0;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method2038(int arg0) {
        field4649 = null;
        if (arg0 != 0) {
            field4650 = 46;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(I)V")
    public class313(int arg0) {
        this.field4648 = arg0;
    }
}
