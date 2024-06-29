import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class236 extends class216 {

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field4102 = 0;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[I")
    public static int[] field4101 = new int[32];

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lhi;")
    public static class82 field4105 = class95.method664((byte) -126, "<col=ffff00>");

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lhi;")
    public static class82 field4104 = class95.method664((byte) -31, "p12_full");

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 7)
    public static void method1672(byte arg0) {
        field4105 = null;
        field4104 = null;
        field4101 = null;
        if (arg0 != 17) {
            field4105 = (class82) null;
        }
    }
}
