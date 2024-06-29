import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class77 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public int field1808 = -1;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lad;")
    private static class5 field1807 = class88.method674("Login", 36);

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lad;")
    public static class5 field1816 = field1807;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field1821 = 0;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Lad;")
    private static class5 field1819 = class88.method674("Existing user", -122);

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Lad;")
    public static class5 field1810 = field1819;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lrd;")
    public static class106 field1817;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lga;")
    public class38 field1814;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lgb;")
    public static class39 field1813;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Z")
    public static boolean field1811;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "[I")
    public int[] field1818;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "[Lub;")
    public static class122[] field1812;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "[Lad;")
    public class5[] field1809;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "[[[B")
    public static byte[][][] field1815;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V", line = 5)
    public static void method598(boolean arg0) {
        field1816 = null;
        field1813 = null;
        if (!arg0) {
            field1810 = null;
        }
        field1819 = null;
        field1807 = null;
        field1812 = null;
        field1810 = null;
        field1817 = null;
        field1815 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V", line = 54)
    public static final void method599(int arg0, byte arg1) {
        field1806++;
        if (arg1 >= -8) {
            field1817 = null;
        }
        class32.method258(false, arg0);
    }
}
