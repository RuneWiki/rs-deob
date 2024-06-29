import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class63 extends class514 {

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    public int field1018;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
    public int field1017;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
    public static int field1016 = -1;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lpe;Lop;IIIIIIIIII)V", line = 4)
    public class63(class564 arg0, class172 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field1018 = arg10;
        this.field1017 = arg11;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)Lsq;", line = 18)
    public final class161 method448(byte arg0) {
        if (arg0 != 25) {
            this.method448((byte) 8);
        }
        field1019++;
        return class659.field9371;
    }
}
