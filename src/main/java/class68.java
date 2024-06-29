import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YPQKGFZW")
public class class68 extends class9 {

    @OriginalMember(owner = "client!YPQKGFZW", name = "j", descriptor = "I")
    public int field1679 = 1000;

    @OriginalMember(owner = "client!YPQKGFZW", name = "k", descriptor = "Z")
    public static boolean field1680;

    @OriginalMember(owner = "client!YPQKGFZW", name = "i", descriptor = "[LHNGTTWCU;")
    public class19[] field1678;

    @OriginalMember(owner = "client!YPQKGFZW", name = "a", descriptor = "(IIIIIIIII)V")
    public void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class28 var10 = this.method40((byte) 0);
        if (var10 != null) {
            this.field1679 = var10.field1679;
            var10.method352(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!YPQKGFZW", name = "a", descriptor = "(B)LKUGNQTGL;")
    public class28 method40(byte arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return null;
    }
}
