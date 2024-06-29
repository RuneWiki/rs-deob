import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class239 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "[I")
    public static int[] field3559 = new int[3];

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Lth;")
    public static class57 field3558 = new class57(64);

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field3562 = 0;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[Lmo;")
    public static class250[] field3563;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 7)
    public static final String method1765(String arg0, boolean arg1) {
        field3560++;
        String var2 = class227.method1690(32767, class248.method1827(false, arg0));
        if (var2 == null) {
            var2 = "";
        }
        if (!arg1) {
            method1767(-14, (class316) null, (class316) null, 109, 91, false, true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 22)
    public static void method1766(int arg0) {
        field3558 = null;
        field3563 = null;
        field3559 = null;
        if (arg0 != 0) {
            field3559 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILuo;Luo;IIZZ)I", line = 42)
    public static final int method1767(int arg0, class316 arg1, class316 arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field3561++;
        int var7 = class111.method847(arg0, -1, arg1, arg5, arg2);
        if (arg4 != 3) {
            field3563 = (class250[]) null;
        }
        if (var7 != 0) {
            return arg5 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class111.method847(arg3, -1, arg1, arg6, arg2);
            return arg6 ? -var8 : var8;
        }
    }
}
