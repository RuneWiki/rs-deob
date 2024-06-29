import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class class662 {

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field8970 = 0;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "Lcga;")
    public static class449 field8972 = new class449(83, 7);

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static void method3685(byte arg0) {
        field8972 = null;
        if (arg0 >= -64) {
            method3685((byte) 127);
        }
    }
}
