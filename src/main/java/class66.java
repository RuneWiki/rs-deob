import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XEUTUWWF")
public class class66 extends class36 {

    @OriginalMember(owner = "XEUTUWWF", name = "j", descriptor = "I")
    public int field1628 = 1000;

    @OriginalMember(owner = "XEUTUWWF", name = "k", descriptor = "Z")
    public static boolean field1629;

    @OriginalMember(owner = "XEUTUWWF", name = "i", descriptor = "[LNLCFOCQC;")
    public class38[] field1627;

    @OriginalMember(owner = "XEUTUWWF", name = "a", descriptor = "(IIIIIIIII)V")
    public void method439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class55 var10 = this.method175((byte) 5);
        if (var10 != null) {
            this.field1628 = var10.field1628;
            var10.method439(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "XEUTUWWF", name = "a", descriptor = "(B)LSNMMQNPZ;")
    public class55 method175(byte arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return null;
    }
}
