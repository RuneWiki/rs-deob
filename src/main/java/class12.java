import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DVAULXJA")
public class class12 extends class64 {

    @OriginalMember(owner = "client!DVAULXJA", name = "j", descriptor = "Z")
    private boolean field678 = true;

    @OriginalMember(owner = "client!DVAULXJA", name = "l", descriptor = "I")
    public int field680 = 1000;

    @OriginalMember(owner = "client!DVAULXJA", name = "m", descriptor = "Z")
    public static boolean field681;

    @OriginalMember(owner = "client!DVAULXJA", name = "k", descriptor = "[LKQUEOHKL;")
    public class27[] field679;

    @OriginalMember(owner = "client!DVAULXJA", name = "a", descriptor = "(IIIIIIIII)V")
    public void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class18 var10 = this.method24(0);
        if (var10 != null) {
            this.field680 = var10.field680;
            var10.method202(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!DVAULXJA", name = "a", descriptor = "(I)LIEHKDFMR;")
    public class18 method24(int arg0) {
        if (arg0 != 0) {
            this.field678 = !this.field678;
        }
        return null;
    }
}
