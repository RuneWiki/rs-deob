import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BBIXHJOC")
public class class2 extends class20 {

    @OriginalMember(owner = "BBIXHJOC", name = "i", descriptor = "I")
    private int field4 = 5;

    @OriginalMember(owner = "BBIXHJOC", name = "k", descriptor = "I")
    public int field6 = 1000;

    @OriginalMember(owner = "BBIXHJOC", name = "h", descriptor = "I")
    private static int field3 = 5;

    @OriginalMember(owner = "BBIXHJOC", name = "l", descriptor = "Z")
    public static boolean field7;

    @OriginalMember(owner = "BBIXHJOC", name = "j", descriptor = "[LSWCSHRND;")
    public class55[] field5;

    @OriginalMember(owner = "BBIXHJOC", name = "a", descriptor = "(IIIIIIIII)V")
    public void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var10 = this.method2(field3);
        if (var10 != null) {
            this.field6 = var10.field6;
            var10.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "BBIXHJOC", name = "a", descriptor = "(I)LJLNSJQDR;")
    public class26 method2(int arg0) {
        if (arg0 < this.field4 || arg0 > this.field4) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return null;
    }
}
