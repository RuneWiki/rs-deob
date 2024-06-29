import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class48 {

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
    public static int[] field647 = new int[128];

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Z")
    public static boolean field644 = false;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field645 = "";

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[C")
    public static char[] field648 = new char[128];

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field643 = 0;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "[I")
    public static int[] field646 = new int[2];

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[[B")
    public static byte[][] field640 = new byte[250][];

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Luj;")
    public static class158 field637;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Z")
    public static boolean field638;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "[[B")
    public static byte[][] field649;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIZ)Ljava/lang/String;", line = 4)
    public static final String method383(boolean arg0, int arg1, boolean arg2) {
        field641++;
        if (arg2 && arg1 >= 0) {
            return arg0 ? (String) null : class93.method673(arg1, 10, -1556668830, arg2);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 26)
    public static void method384(int arg0) {
        field637 = null;
        field640 = (byte[][]) null;
        field648 = null;
        field646 = null;
        field645 = null;
        if (arg0 == -9077) {
            field649 = (byte[][]) null;
            field647 = null;
        }
    }
}
