import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class458 extends class371 {

    @OriginalMember(owner = "client!h", name = "K", descriptor = "F")
    public static float field6653;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "Law;")
    public static class615 field6651;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "Lik;")
    public static class642 field6652;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 5)
    public class458() {
        super(0, true);
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V", line = 9)
    public static void method2737(int arg0) {
        field6651 = null;
        if (arg0 != -20158) {
            method2737(-3);
        }
        field6652 = null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(BI)[I", line = 20)
    public final int[] method79(byte arg0, int arg1) {
        if (arg0 > -80) {
            field6653 = 1.004439F;
        }
        field6654++;
        return class287.field4215;
    }
}
