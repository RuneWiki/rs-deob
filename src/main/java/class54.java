import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VIVVOUFY")
public class class54 extends class6 {

    @OriginalMember(owner = "VIVVOUFY", name = "j", descriptor = "I")
    public int field1482 = 1000;

    @OriginalMember(owner = "VIVVOUFY", name = "k", descriptor = "Z")
    public static boolean field1483;

    @OriginalMember(owner = "VIVVOUFY", name = "i", descriptor = "[LNNJZYNNI;")
    public class34[] field1481;

    @OriginalMember(owner = "VIVVOUFY", name = "a", descriptor = "(IIIIIIIII)V")
    public void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class4 var10 = this.method181((byte) 1);
        if (var10 != null) {
            this.field1482 = var10.field1482;
            var10.method32(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "VIVVOUFY", name = "a", descriptor = "(B)LCCYECDYX;")
    public class4 method181(byte arg0) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return null;
    }
}
