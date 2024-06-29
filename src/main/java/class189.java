import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class189 {

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "Leba;")
    public static class550 field2622 = new class550(36, 20);

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "[B")
    public byte[] field2621;

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "[I")
    public static int[] field2627;

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "[S")
    public short[] field2624;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "[S")
    public short[] field2625;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "[S")
    public short[] field2626;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
    public static void method1248(byte arg0) {
        if (arg0 >= -79) {
            method1248((byte) 48);
        }
        field2622 = null;
        field2627 = null;
    }
}
