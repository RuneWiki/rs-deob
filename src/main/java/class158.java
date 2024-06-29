import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class158 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field2770 = 2301979;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "[[I")
    public static int[][] field2774 = new int[104][104];

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Lclient;")
    public static client field2771;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "[Lmc;")
    public static class151[] field2776;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[Z")
    public static boolean[] field2775;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V")
    public static final void method1109(boolean arg0, int arg1) {
        field2772++;
        if (arg1 == 2301979 && arg0 != class99.field1669) {
            class99.field1669 = arg0;
            class41.method233(-3193);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method1110(int arg0) {
        if (arg0 > 89) {
            field2776 = null;
            field2774 = null;
            field2771 = null;
            field2775 = null;
        }
    }
}
