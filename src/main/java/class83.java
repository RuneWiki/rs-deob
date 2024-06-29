import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class83 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Leh;")
    public static class47 field1772 = class195.method1282((byte) -4, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static volatile int field1769 = -1;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "[S")
    public static short[] field1774 = new short[] { 51, 25, 50, 18, 30, 31, 40, 8 };

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Leh;")
    public static class47 field1775 = class195.method1282((byte) -4, ":duelfriend:");

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Lpa;")
    public static class136 field1776 = new class136(64);

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "[I")
    public static int[] field1778 = new int[2000];

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Ljh;")
    public static class89 field1768;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public static void method695(boolean arg0) {
        field1772 = null;
        field1775 = null;
        if (!arg0) {
            field1768 = null;
            field1776 = null;
            field1774 = null;
            field1778 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method696(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1773++;
        if ((arg3 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 1 + 7 - arg5 - arg1;
        } else {
            int var9 = -58 % ((21 - arg0) / 46);
            return var8 == 2 ? 7 + 1 - arg6 - arg4 : arg5;
        }
    }
}
