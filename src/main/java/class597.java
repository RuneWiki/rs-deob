import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class597 extends class679 {

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public int field8583;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public int field8585;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field8584;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V")
    public static final void method3531(int arg0, int arg1) {
        field8584++;
        if (arg0 > -64) {
            method3531(-35, 10);
        }
        class118 var2 = class126.method814(true, arg1, 14);
        var2.method778(27970);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)Lag;")
    public final class214 method210(int arg0) {
        if (arg0 != 7288) {
            this.field8585 = -6;
        }
        field8582++;
        return class749.field10433;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lvfa;Lrq;IIIIIIIII)V")
    public class597(class92 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field8583 = arg10;
        this.field8585 = arg9;
    }
}
