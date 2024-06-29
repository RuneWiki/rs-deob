import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class460 {

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "Leba;")
    public static class550 field6021 = new class550(32, 6);

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "Ltt;")
    public static class338 field6023 = new class338(5, 4);

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field6026 = -1;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field6025 = 0;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "Leba;")
    public static class550 field6024 = new class550(21, 0);

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public static final void method2574(int arg0) {
        field6022++;
        class323.field4357.method2172(arg0 - 15144);
        if (arg0 != 32) {
            method2574(-107);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
    public static void method2575(byte arg0) {
        if (arg0 != 74) {
            field6025 = -91;
        }
        field6023 = null;
        field6024 = null;
        field6021 = null;
    }
}
