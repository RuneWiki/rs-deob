import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class11 {

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "client!sja", name = "c", descriptor = "Z")
    public static boolean field181 = false;

    @OriginalMember(owner = "client!sja", name = "d", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!sja", name = "b", descriptor = "Lgj;")
    public static class662 field180;

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(B)V", line = 11)
    public static void method68(byte arg0) {
        field180 = null;
        if (arg0 != 8) {
            method68((byte) -38);
        }
    }
}
