import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class566 extends class497 {

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public int field7986;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public int field7991;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public int field7989;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public int field7987;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public int field7990;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public int field7993;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBIIIII)Z", line = 8)
    public static final boolean method3242(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7988++;
        int var7 = arg3 + arg0;
        if (arg1 >= -42) {
            return false;
        }
        int var8 = arg2 + arg5;
        int var9 = arg4 + arg6;
        if (!class39.method350(var7, var9, var8, var9, arg3, var8, true, arg6, var8, arg3)) {
            return false;
        } else if (class39.method350(var7, arg6, var8, var9, arg3, var8, true, arg6, var8, var7)) {
            if (arg3 < class703.field9952) {
                if (!class39.method350(arg3, arg6, var8, var9, arg3, arg2, true, var9, var8, arg3)) {
                    return false;
                }
                if (!class39.method350(arg3, arg6, var8, arg6, arg3, arg2, true, var9, arg2, arg3)) {
                    return false;
                }
            } else if (!class39.method350(var7, arg6, var8, var9, var7, arg2, true, var9, var8, var7)) {
                return false;
            } else if (!class39.method350(var7, arg6, var8, arg6, var7, arg2, true, var9, arg2, var7)) {
                return false;
            }
            if (class33.field416 > arg6) {
                if (!class39.method350(var7, arg6, var8, arg6, arg3, arg2, true, arg6, var8, arg3)) {
                    return false;
                }
                if (!class39.method350(var7, arg6, var8, arg6, arg3, arg2, true, arg6, arg2, var7)) {
                    return false;
                }
            } else if (!class39.method350(var7, var9, var8, var9, arg3, arg2, true, var9, var8, arg3)) {
                return false;
            } else if (!class39.method350(var7, var9, var8, var9, arg3, arg2, true, var9, arg2, var7)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Loh;", line = 76)
    public class370 method640(int arg0) {
        field7992++;
        if (arg0 != 58) {
            this.method640(-89);
        }
        return class643.field8874;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lor;Lma;IIIIIIIIIIIII)V", line = 92)
    public class566(class594 arg0, class12 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7986 = arg12;
        this.field7991 = arg9;
        this.field7989 = arg10;
        this.field7987 = arg14;
        this.field7990 = arg11;
        this.field7993 = arg13;
    }
}
