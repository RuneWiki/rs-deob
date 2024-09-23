import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XHDBBLMT")
public class class66 extends class8 {

    @OriginalMember(owner = "XHDBBLMT", name = "i", descriptor = "I")
    public int field1489 = 1000;

    @OriginalMember(owner = "XHDBBLMT", name = "j", descriptor = "Z")
    public static boolean field1490;

    @OriginalMember(owner = "XHDBBLMT", name = "h", descriptor = "[LTOHSQGHN;")
    public class56[] field1488;

    @OriginalMember(owner = "XHDBBLMT", name = "a", descriptor = "(IIIIIIIII)V")
    public void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class31 var10 = this.method28(0);
        if (var10 != null) {
            this.field1489 = var10.field1489;
            var10.method361(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "XHDBBLMT", name = "a", descriptor = "(I)LKBEXSZSN;")
    public class31 method28(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return null;
    }
}
