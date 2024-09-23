import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WWTUXVKR")
public class class57 extends class49 {

    @OriginalMember(owner = "WWTUXVKR", name = "i", descriptor = "Z")
    private boolean field1485 = true;

    @OriginalMember(owner = "WWTUXVKR", name = "k", descriptor = "I")
    public int field1487 = 1000;

    @OriginalMember(owner = "WWTUXVKR", name = "l", descriptor = "Z")
    public static boolean field1488;

    @OriginalMember(owner = "WWTUXVKR", name = "j", descriptor = "[LXEISCDXD;")
    public class59[] field1486;

    @OriginalMember(owner = "WWTUXVKR", name = "a", descriptor = "(IIIIIIIII)V")
    public void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class43 var10 = this.method54(true);
        if (var10 != null) {
            this.field1487 = var10.field1487;
            var10.method482(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "WWTUXVKR", name = "a", descriptor = "(Z)LPOJFANDE;")
    public class43 method54(boolean arg0) {
        if (!arg0) {
            this.field1485 = !this.field1485;
        }
        return null;
    }
}
