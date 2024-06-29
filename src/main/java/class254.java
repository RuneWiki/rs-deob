import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class254 extends class142 {

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "[I")
    public static int[] field3520 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "[Z")
    public static boolean[] field3519 = new boolean[200];

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "I")
    public static int field3521 = 0;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "I")
    public int field3526;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "Ljt;")
    public class87 field3523;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "[Lkn;")
    public class631[] field3525;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(I)V")
    public static void method1582(int arg0) {
        field3519 = null;
        field3520 = null;
        if (arg0 != -7916) {
            field3519 = null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IILqa;B)Z")
    public final boolean method1583(int arg0, int arg1, class207 arg2, byte arg3) {
        if (arg3 <= 110) {
            return false;
        }
        field3524++;
        if (this.field3525 != null) {
            for (int var5 = 0; var5 < this.field3525.length; var5++) {
                if (this.field3525[var5].method3673(arg0, arg1) && this.field3523.method488(arg2, arg0, arg1, 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
