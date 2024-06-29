import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 {

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field139 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "[I")
    public static int[] field144 = new int[6];

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "Lbg;")
    public static class310 field143 = new class310(22, -1);

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field142;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
    public static void method62(boolean arg0) {
        field144 = null;
        field139 = null;
        if (!arg0) {
            field139 = null;
        }
        field143 = null;
        field142 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZI)Z")
    public static final boolean method63(boolean arg0, int arg1) {
        if (arg0) {
            field142 = null;
        }
        field141++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([II[J)V")
    public static final void method64(int[] arg0, int arg1, long[] arg2) {
        class463.method2762(arg0, 1, arg2.length - 1, arg2, 0);
        field140++;
        if (arg1 != -1) {
            method64(null, -85, null);
        }
    }
}
