import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XPEMEMUL")
public class class63 extends class14 {

    @OriginalMember(owner = "XPEMEMUL", name = "j", descriptor = "I")
    public int field1593 = 1000;

    @OriginalMember(owner = "XPEMEMUL", name = "k", descriptor = "Z")
    public static boolean field1594;

    @OriginalMember(owner = "XPEMEMUL", name = "i", descriptor = "[LXKISFGSQ;")
    public class61[] field1592;

    @OriginalMember(owner = "XPEMEMUL", name = "a", descriptor = "(IIIIIIIII)V")
    public void method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class35 var10 = this.method11(8);
        if (var10 != null) {
            this.field1593 = var10.field1593;
            var10.method400(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "XPEMEMUL", name = "a", descriptor = "(I)LKPUOCBCE;")
    public class35 method11(int arg0) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        return null;
    }
}
