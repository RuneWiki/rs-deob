import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class472 {

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "[S")
    public static short[] field6574 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Z")
    public static boolean field6575 = false;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field6578 = -1;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lwv;")
    public static class26 field6579;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static void method2729(byte arg0) {
        field6579 = null;
        int var1 = 95 % ((arg0 - 79) / 45);
        field6574 = null;
    }
}
