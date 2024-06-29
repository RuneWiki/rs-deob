import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class31 {

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field661 = 0;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Lsg;")
    public static class169 field668 = class165.method1060(")1p", 1536);

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lsg;")
    private static class169 field664 = class165.method1060("Please wait)3)3)3", 1536);

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Lsg;")
    public static class169 field659 = field664;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Lsg;")
    public static class169 field667 = class165.method1060("und die Schaltfl-=che (WSpielkonto erstellen(W am", 1536);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lqf;")
    public static class150 field652;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[B")
    public byte[] field653;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[B")
    public byte[] field660;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public static void method217(boolean arg0) {
        field667 = null;
        field664 = null;
        field652 = null;
        if (!arg0) {
            field668 = null;
            field659 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)I")
    public static final int method218(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field651++;
        if (arg1 == -1211022480) {
            int var5 = 65536 - class12.field283[arg0 * 1024 / arg3] >> 1;
            return ((65536 - var5) * arg4 >> 16) + (arg2 * var5 >> 16);
        } else {
            return -123;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II[IZ)I")
    public static final int method219(int arg0, int arg1, int[] arg2, boolean arg3) {
        field656++;
        if (arg3) {
            field667 = null;
        }
        return arg2[1] * arg0 + arg2[0] * arg1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
    public static final boolean method220(int arg0, int arg1) {
        if (arg0 == 1933798992) {
            field663++;
            return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
        } else {
            return true;
        }
    }
}
