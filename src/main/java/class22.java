import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IWSGBTLV")
public class class22 extends class10 {

    @OriginalMember(owner = "IWSGBTLV", name = "i", descriptor = "I")
    private int field942 = -33;

    @OriginalMember(owner = "IWSGBTLV", name = "l", descriptor = "I")
    public int field945 = 1000;

    @OriginalMember(owner = "IWSGBTLV", name = "j", descriptor = "I")
    private static int field943 = -132;

    @OriginalMember(owner = "IWSGBTLV", name = "m", descriptor = "Z")
    public static boolean field946;

    @OriginalMember(owner = "IWSGBTLV", name = "k", descriptor = "[LRXUUDUNX;")
    public class47[] field944;

    @OriginalMember(owner = "IWSGBTLV", name = "a", descriptor = "(IIIIIIIII)V")
    public void method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class3 var10 = this.method40(field943);
        if (var10 != null) {
            this.field945 = var10.field945;
            var10.method33(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "IWSGBTLV", name = "a", descriptor = "(I)LCADBNSXE;")
    public class3 method40(int arg0) {
        while (arg0 >= 0) {
            this.field942 = 458;
        }
        return null;
    }
}
