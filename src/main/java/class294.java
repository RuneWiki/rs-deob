import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class294 {

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIJZIZLjava/lang/String;Ljava/lang/String;III)V", line = 13)
    public static final void method1898(int arg0, int arg1, long arg2, boolean arg3, int arg4, boolean arg5, String arg6, String arg7, int arg8, int arg9, int arg10) {
        field4357++;
        if (!class455.field6680 && class12.field201 < 500) {
            int var12 = arg0 == arg4 ? class479.field7008 : arg4;
            class32 var13 = new class32(arg6, arg7, var12, arg10, arg9, arg2, arg1, arg8, arg5, arg3);
            class96.field1395.method1958(var13, 0);
            class12.field201++;
        }
    }
}
