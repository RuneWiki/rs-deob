import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class109 extends class5 {

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "[B")
    public byte[] field2733;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field2730 = 0;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field2731 = 1;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public static int field2732 = 0;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    public static int field2735 = -1;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "Lhb;")
    private static class44 field2737 = class102.method810(" has logged in)3", -28606);

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "[Lke;")
    public static class65[] field2742 = new class65[50];

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "Lhb;")
    public static class44 field2744 = field2737;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "Lhb;")
    public static class44 field2734 = class102.method810("Ung-Ultiger Benutzername", -28606);

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "Lhb;")
    public static class44 field2738 = class102.method810("@gre@", -28606);

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "Z")
    public static boolean field2741 = false;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "Lhb;")
    public static class44 field2736 = class102.method810("mapdots", -28606);

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lhb;")
    public static class44 field2743 = class102.method810("Benutzen Sie die (WPasswort -=ndern(W Option", -28606);

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "J")
    public static long field2739;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "Ltd;")
    public static class116 field2740;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V", line = 11)
    public static void method842(int arg0) {
        field2740 = null;
        if (arg0 != 50) {
            method842(-105);
        }
        field2743 = null;
        field2742 = null;
        field2744 = null;
        field2738 = null;
        field2737 = null;
        field2734 = null;
        field2736 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V", line = 44)
    public class109(byte[] arg0) {
        this.field2733 = arg0;
    }
}
