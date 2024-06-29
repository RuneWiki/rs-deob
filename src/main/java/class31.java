import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KCWTSCHR")
public class class31 extends class13 {

    @OriginalMember(owner = "client!KCWTSCHR", name = "j", descriptor = "I")
    public int field1025 = 1000;

    @OriginalMember(owner = "client!KCWTSCHR", name = "k", descriptor = "Z")
    public static boolean field1026;

    @OriginalMember(owner = "client!KCWTSCHR", name = "i", descriptor = "[LUSOVHGHC;")
    public class55[] field1024;

    @OriginalMember(owner = "client!KCWTSCHR", name = "a", descriptor = "(IIIIIIIII)V")
    public void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class65 var10 = this.method39((byte) 3);
        if (var10 != null) {
            this.field1025 = var10.field1025;
            var10.method330(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!KCWTSCHR", name = "a", descriptor = "(B)LXBVYIDUH;")
    public class65 method39(byte arg0) {
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        return null;
    }
}
