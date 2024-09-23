import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UPHLHIWQ")
public class class62 extends class40 {

    @OriginalMember(owner = "UPHLHIWQ", name = "j", descriptor = "I")
    public int field1520 = 1000;

    @OriginalMember(owner = "UPHLHIWQ", name = "k", descriptor = "Z")
    public static boolean field1521;

    @OriginalMember(owner = "UPHLHIWQ", name = "i", descriptor = "[LICFMSSJN;")
    public class25[] field1519;

    @OriginalMember(owner = "UPHLHIWQ", name = "a", descriptor = "(IIIIIIIII)V")
    public void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class45 var10 = this.method196(27243);
        if (var10 != null) {
            this.field1520 = var10.field1520;
            var10.method431(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "UPHLHIWQ", name = "a", descriptor = "(I)LPSGMMDJS;")
    public class45 method196(int arg0) {
        if (arg0 != 27243) {
            throw new NullPointerException();
        }
        return null;
    }
}
