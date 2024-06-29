import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TFGCPINZ")
public class class56 extends class26 {

    @OriginalMember(owner = "client!TFGCPINZ", name = "k", descriptor = "I")
    public int field1525 = 1000;

    @OriginalMember(owner = "client!TFGCPINZ", name = "l", descriptor = "Z")
    public static boolean field1526;

    @OriginalMember(owner = "client!TFGCPINZ", name = "j", descriptor = "[LUJXOWZEU;")
    public class59[] field1524;

    @OriginalMember(owner = "client!TFGCPINZ", name = "a", descriptor = "(IIIIIIIII)V")
    public void method322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class29 var10 = this.method214((byte) 7);
        if (var10 != null) {
            this.field1525 = var10.field1525;
            var10.method322(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!TFGCPINZ", name = "a", descriptor = "(B)LJJMVUSJJ;")
    public class29 method214(byte arg0) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        return null;
    }
}
