import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class51 {

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public static int field731 = 0;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "Ljd;")
    public static class624 field729 = new class624("LIVE", 0);

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "[I")
    public static int[] field732 = new int[5];

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
    public static void method410(byte arg0) {
        field729 = null;
        field732 = null;
        if (arg0 != 75) {
            method410((byte) -73);
        }
    }
}
