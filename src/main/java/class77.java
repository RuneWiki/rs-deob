import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class77 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Z")
    public static boolean field1445 = false;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lid;")
    public static class149 field1444 = class60.method382("gr-Un:", (byte) 39);

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field1447 = 64;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lve;")
    public static class189 field1443 = new class189(4);

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lid;")
    private static class149 field1450 = class60.method382("You can(Wt add yourself to your own friend list)3", (byte) 17);

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lid;")
    public static class149 field1451 = field1450;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lpb;")
    public static class127 field1449;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Ldj;")
    public static class187 field1448;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method590(byte arg0) {
        field1450 = null;
        field1451 = null;
        field1443 = null;
        if (arg0 != 101) {
            method590((byte) 78);
        }
        field1448 = null;
        field1449 = null;
        field1444 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static final void method591(int arg0) {
        if (~class107.field1845 == arg0) {
            class50.method329(arg0 ^ 0x2CDA, 25);
        }
        field1446++;
    }
}
