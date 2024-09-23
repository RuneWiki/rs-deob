import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LDWABQSV")
public class class28 extends class40 {

    @OriginalMember(owner = "LDWABQSV", name = "j", descriptor = "Z")
    private boolean field885 = false;

    @OriginalMember(owner = "LDWABQSV", name = "l", descriptor = "I")
    public int field887 = 1000;

    @OriginalMember(owner = "LDWABQSV", name = "m", descriptor = "Z")
    public static boolean field888;

    @OriginalMember(owner = "LDWABQSV", name = "k", descriptor = "[LEOYNCIUW;")
    public class11[] field886;

    @OriginalMember(owner = "LDWABQSV", name = "a", descriptor = "(IIIIIIIII)V")
    public void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class35 var10 = this.method206(9);
        if (var10 != null) {
            this.field887 = var10.field887;
            var10.method260(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "LDWABQSV", name = "a", descriptor = "(I)LNJPATAFL;")
    public class35 method206(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            this.field885 = !this.field885;
        }
        return null;
    }
}
