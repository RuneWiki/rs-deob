import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DPCHFTTD")
public class class6 extends class37 {

    @OriginalMember(owner = "DPCHFTTD", name = "j", descriptor = "I")
    public int field639 = 1000;

    @OriginalMember(owner = "DPCHFTTD", name = "h", descriptor = "I")
    private int field637;

    @OriginalMember(owner = "DPCHFTTD", name = "k", descriptor = "Z")
    public static boolean field640;

    @OriginalMember(owner = "DPCHFTTD", name = "i", descriptor = "[LHVGPBOTR;")
    public class21[] field638;

    @OriginalMember(owner = "DPCHFTTD", name = "a", descriptor = "(IIIIIIIII)V")
    public void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var10 = this.method221((byte) -43);
        if (var10 != null) {
            this.field639 = var10.field639;
            var10.method220(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "DPCHFTTD", name = "a", descriptor = "(B)LGEUHTGZJ;")
    public class17 method221(byte arg0) {
        if (arg0 != -43) {
            this.field637 = 50;
        }
        return null;
    }
}
