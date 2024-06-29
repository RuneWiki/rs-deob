import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public abstract class class727 {

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "I")
    public static int field10107;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIIIIIII)V", line = 3)
    public static final void method4048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field10107++;
        if (arg5 >= 1 && arg0 >= 1 && class597.field8132 - 2 >= arg5 && arg0 <= class628.field8800 - 2) {
            int var9 = arg8;
            if (arg8 < 3 && class74.method661(arg5, arg0, 1)) {
                var9 = arg8 + 1;
            }
            if (class712.field9959.field1320.method4251(49) == 0 && !class349.method2202(arg0, arg5, class387.field5634, false, var9)) {
                return;
            }
            if (class626.field8501 == null) {
                return;
            }
            class556.field7502.method1437(class514.field7038[arg8], arg5, class379.field5542, arg0, (byte) -102, arg7, arg8);
            if (arg3 >= 0) {
                int var10 = class712.field9959.field1287.method1486(68);
                class712.field9959.method735(1, class712.field9959.field1287, 103);
                class556.field7502.method1444(class379.field5542, arg3, var9, arg1, true, arg0, arg6, arg2, arg8, arg5, class514.field7038[arg8]);
                class712.field9959.method735(var10, class712.field9959.field1287, arg4 + 118);
            }
        }
        if (arg4 == -1) {
            ;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)Z", line = 52)
    public static final boolean method4049(int arg0, int arg1, int arg2) {
        if (arg2 == 55) {
            field10106++;
            return (arg0 & 0x37) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
    public abstract void method3027(int arg0);

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(III[B)V")
    public abstract void method3024(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)Z")
    public abstract boolean method3025(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
    public abstract void method3029(int arg0);

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II[BI)I")
    public abstract int method3028(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;
}
