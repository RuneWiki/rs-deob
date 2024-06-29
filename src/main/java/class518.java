import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class518 {

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "[[I")
    public static int[][] field7620 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field7621 = 0;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "Lps;")
    public static class63 field7619 = new class63();

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIB)I")
    public static final int method3088(int arg0, int arg1, byte arg2) {
        field7618++;
        if (arg2 != 59) {
            return 106;
        }
        int var3 = class407.method2512(arg0 + 45365, 4, arg1 + 91923, true) + (class407.method2512(arg0 + 10294, 2, arg1 + 37821, true) - 128 >> 1) + (class407.method2512(arg0, 1, arg1, true) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIII)V")
    public static final void method3089(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 5) {
            return;
        }
        field7617++;
        if (arg0 >= class463.field6924 && class369.field5628 >= arg0) {
            int var5 = class33.method289(261104, class377.field5760, class49.field701, arg1);
            int var6 = class33.method289(261104, class377.field5760, class49.field701, arg4);
            class229.method1539((byte) 45, var5, arg0, var6, arg3);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
    public static void method3090(byte arg0) {
        field7619 = null;
        field7620 = null;
        if (arg0 <= 55) {
            field7619 = null;
        }
    }
}
