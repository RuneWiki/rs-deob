import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class33 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field827 = 0;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[[[B")
    public static byte[][][] field830 = new byte[4][104][104];

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field828 = 0;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lr;")
    private static class118 field833 = class153.method1136(98, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lr;")
    public static class118 field836 = class153.method1136(105, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static volatile int field837 = 0;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lr;")
    public static class118 field829 = field833;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field835 = 0;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lr;")
    private static class118 field838 = class153.method1136(99, "Use");

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lr;")
    public static class118 field834 = field838;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lpa;")
    public static class105 field826 = new class105(8);

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field841 = 127;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field843 = -1;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Z")
    public static boolean field844 = false;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field842 = 0;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Ljava/lang/String;")
    public static String field839;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static void method279(boolean arg0) {
        if (arg0) {
            field834 = null;
        }
        field830 = null;
        field833 = null;
        field839 = null;
        field838 = null;
        field826 = null;
        field834 = null;
        field836 = null;
        field829 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lj;")
    public static final class62 method280(Throwable arg0, String arg1) {
        field831++;
        class62 var2;
        if (arg0 instanceof class62) {
            var2 = (class62) arg0;
            var2.field1431 = var2.field1431 + ' ' + arg1;
        } else {
            var2 = new class62(arg0, arg1);
        }
        return var2;
    }
}
