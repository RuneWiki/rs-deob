import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[Z")
    public static boolean[] field608 = new boolean[8];

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Lsc;")
    private static class128 field610 = class129.method1017(false, "Loaded config");

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lsc;")
    public static class128 field609 = field610;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lsc;")
    public static class128 field611 = class129.method1017(false, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lsb;")
    public static class127 field613 = new class127(4096);

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field615 = -1;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static void method243(boolean arg0) {
        field608 = null;
        if (arg0) {
            method243(false);
        }
        field611 = null;
        field613 = null;
        field609 = null;
        field610 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static final void method244(int arg0) {
        class29.field547.method919((byte) -104);
        if (arg0 != 8) {
            method243(true);
        }
        field614++;
    }
}
