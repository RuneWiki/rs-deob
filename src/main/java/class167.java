import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class167 extends class485 {

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)Lfl;", line = 3)
    public final class103 method318(int arg0) {
        field2090++;
        return arg0 == -26207 ? class549.field7127 : null;
    }

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "(I)[Lffa;", line = 17)
    public static final class562[] method1156(int arg0) {
        if (arg0 <= 73) {
            return null;
        } else {
            field2092++;
            return new class562[] { class565.field7385, class258.field3483, class72.field980 };
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lffa;Loca;IIIIIIIIIIIIII)V", line = 30)
    public class167(class562 arg0, class573 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field2091 = arg15;
    }
}
