import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class153 {

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "Lifa;")
    public static class450 field1909 = new class450();

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "Ltca;")
    public static class185 field1907;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "[I")
    public static int[] field1906;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method1093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -23 % ((37 - arg0) / 43);
        if (arg4 >= class471.field6572 && class223.field2604 >= arg2 && arg3 >= class187.field2268 && arg1 <= class461.field6480) {
            if (arg5 == 1) {
                class701.method3972(arg1, arg2, arg4, arg3, arg6, (byte) 116);
            } else {
                class700.method3940(true, arg3, arg2, arg1, arg4, arg5, arg6);
            }
        } else if (arg5 == 1) {
            class550.method3226(arg4, arg3, arg2, arg6, 0, arg1);
        } else {
            class56.method496(arg3, arg1, arg2, arg6, true, arg4, arg5);
        }
        field1908++;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V", line = 35)
    public static void method1094(byte arg0) {
        int var1 = 81 / ((arg0 + 24) / 51);
        field1906 = null;
        field1907 = null;
        field1909 = null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)Z", line = 51)
    public static final boolean method1095(int arg0, int arg1) {
        if (arg0 <= 12) {
            return false;
        } else {
            field1910++;
            return arg1 >= 12 && arg1 <= 17;
        }
    }
}
