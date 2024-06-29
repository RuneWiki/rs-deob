import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XBYIDFVN")
public class class67 extends class37 {

    @OriginalMember(owner = "client!XBYIDFVN", name = "h", descriptor = "I")
    private int field1693 = 650;

    @OriginalMember(owner = "client!XBYIDFVN", name = "j", descriptor = "I")
    public int field1695 = 1000;

    @OriginalMember(owner = "client!XBYIDFVN", name = "k", descriptor = "Z")
    public static boolean field1696;

    @OriginalMember(owner = "client!XBYIDFVN", name = "i", descriptor = "[LRSYMRWPZ;")
    public class54[] field1694;

    @OriginalMember(owner = "client!XBYIDFVN", name = "a", descriptor = "(IIIIIIIII)V")
    public void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class42 var10 = this.method3((byte) 6);
        if (var10 != null) {
            this.field1695 = var10.field1695;
            var10.method436(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!XBYIDFVN", name = "a", descriptor = "(B)LPDVZPZLT;")
    public class42 method3(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.field1693 = -202;
        }
        return null;
    }
}
