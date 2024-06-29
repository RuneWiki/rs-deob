import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class315 {

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "Liv;")
    public static class100 field4105 = new class100("LIVE", 0);

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lnd;I)V")
    public static final void method1869(class547 arg0, int arg1) {
        field4104++;
        class656.field9123 = arg0.method3161((byte) -92, "p11_full");
        class235.field3069 = arg0.method3161((byte) -108, "p12_full");
        if (arg1 < 41) {
            method1869(null, -119);
        }
        class469.field6293 = arg0.method3161((byte) -75, "b12_full");
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
    public static void method1870(int arg0) {
        field4105 = null;
        int var1 = 79 / ((43 - arg0) / 44);
    }
}
