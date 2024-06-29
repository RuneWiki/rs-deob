import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class125 extends class64 {

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field1873 = -2;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lut;Lgi;IIIIIIIIIIIIII)V", line = 15)
    public class125(class109 arg0, class630 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field1875 = arg15;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Lrw;", line = 23)
    public final class703 method351(byte arg0) {
        if (arg0 < 73) {
            field1873 = 14;
        }
        field1874++;
        return class548.field7699;
    }
}
