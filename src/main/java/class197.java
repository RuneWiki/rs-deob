import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class197 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2813 = 0;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[I")
    public static int[] field2815 = new int[14];

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZII)V")
    public static final void method1238(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field2814++;
            class267.field3700 = new byte[arg0][arg2][arg3];
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1239(int arg0) {
        field2815 = null;
        if (arg0 != 0) {
            method1239(-89);
        }
    }
}
