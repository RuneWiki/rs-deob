import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ESLZGWKZ")
public class class18 extends class41 {

    @OriginalMember(owner = "ESLZGWKZ", name = "h", descriptor = "I")
    private int field787 = 581;

    @OriginalMember(owner = "ESLZGWKZ", name = "j", descriptor = "I")
    public int field789 = 1000;

    @OriginalMember(owner = "ESLZGWKZ", name = "k", descriptor = "Z")
    public static boolean field790;

    @OriginalMember(owner = "ESLZGWKZ", name = "i", descriptor = "[LPLSKXSKV;")
    public class49[] field788;

    @OriginalMember(owner = "ESLZGWKZ", name = "a", descriptor = "(IIIIIIIII)V")
    public void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class10 var10 = this.method159((byte) 5);
        if (var10 != null) {
            this.field789 = var10.field789;
            var10.method212(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "ESLZGWKZ", name = "a", descriptor = "(B)LDHUPIIUL;")
    public class10 method159(byte arg0) {
        if (arg0 != 5) {
            this.field787 = -495;
        }
        return null;
    }
}
