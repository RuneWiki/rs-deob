import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class108 extends class358 {

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "Lfp;")
    public static class323 field1307;

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Ldp;Lfv;IIIIIIIIIIIIII)V", line = 6)
    public class108(class3 arg0, class120 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field1308 = arg15;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)Lg;", line = 15)
    public final class153 method769(boolean arg0) {
        field1309++;
        return arg0 ? null : class513.field7320;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V", line = 28)
    public static void method770(byte arg0) {
        if (arg0 > -94) {
            field1307 = null;
        }
        field1307 = null;
    }
}
