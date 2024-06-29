import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class114 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "[I")
    public static int[] field1867 = new int[5];

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "Lafa;")
    public static class349 field1871;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Lwu;")
    public static class376 field1872;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIIIII)V")
    public static final void method952(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1868++;
        int var12 = -29 % ((arg6 - 62) / 39);
        if (!class435.method2502(arg11, (byte) -22)) {
            return;
        }
        if (class580.field7607[arg11] == null) {
            client.method1879(class747.field10393[arg11], -1, arg2, arg5, arg9, arg10, arg3, arg4, arg0, arg1, arg7, arg8);
        } else {
            client.method1879(class580.field7607[arg11], -1, arg2, arg5, arg9, arg10, arg3, arg4, arg0, arg1, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method953(String arg0, int arg1) {
        field1869++;
        if (arg1 != 5) {
            field1871 = null;
        }
        for (int var2 = 0; var2 < class761.field10588.length; var2++) {
            if (class761.field10588[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public static void method954(int arg0) {
        field1867 = null;
        field1872 = null;
        int var1 = 51 / ((70 - arg0) / 46);
        field1871 = null;
    }
}
