import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class435 extends class593 {

    @OriginalMember(owner = "client!en", name = "g", descriptor = "Log;")
    public class98 field6382;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2588(int arg0, int arg1, int arg2) {
        field6381++;
        return arg2 > -57 ? false : class563.method3210(arg1, -44, arg0) & class408.method2477(arg1, arg0, (byte) 103);
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljj;II[B)V", line = 16)
    public class435(class66 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6382 = class5.method12(6406, 6406, arg0, arg2, true, false, arg3, arg1);
        this.field6382.method2163(88, false, false);
    }
}
