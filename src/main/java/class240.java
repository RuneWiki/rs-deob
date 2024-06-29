import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class240 extends class657 {

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "Lmu;")
    public static class303 field3499 = new class303(21, -1);

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "[Z")
    public static boolean[] field3502 = new boolean[100];

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "[I")
    public static int[] field3497;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IZ)V", line = 5)
    public final void method735(int arg0, boolean arg1) {
        super.field9010.method4154(true, arg0 + -47145);
        ++field3504;
        if (arg0 != 15192) {
            method1667(26, 92, -76, -90, 76, -7, -18, -119, 33, false);
        }
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(B)V", line = 17)
    public static void method1666(byte arg0) {
        int var1 = 74 % ((72 - arg0) / 37);
        field3502 = null;
        field3499 = null;
        field3497 = null;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILdu;I)V", line = 28)
    public final void method736(int arg0, class357 arg1, int arg2) {
        if (arg2 != -16776) {
            field3499 = null;
        }
        super.field9010.method4097((byte) -105, arg1);
        ++field3498;
        super.field9010.method4144(true, arg0);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V", line = 41)
    public final void method728(byte arg0) {
        ++field3503;
        if (arg0 != 87) {
            this.method731(71);
        }
        super.field9010.method4154(false, arg0 + -32040);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZB)V", line = 55)
    public final void method734(boolean arg0, byte arg1) {
        ++field3501;
        if (arg1 != -103) {
            this.method736(-78, (class357) null, -100);
        }
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lwga;)V", line = 65)
    public class240(class745 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "(I)Z", line = 69)
    public final boolean method731(int arg0) {
        if (arg0 >= -57) {
            return true;
        } else {
            ++field3505;
            return true;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIIIIIZ)V", line = 82)
    public static final void method1667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (~class140.field2314 >= ~arg5 && ~arg5 >= ~class536.field7419 && ~arg4 <= ~class140.field2314 && class536.field7419 >= arg4 && arg6 >= class140.field2314 && ~class536.field7419 <= ~arg6 && ~arg8 <= ~class140.field2314 && ~arg8 >= ~class536.field7419 && ~class58.field1150 >= ~arg0 && ~arg0 >= ~class479.field6682 && ~class58.field1150 >= ~arg1 && ~arg1 >= ~class479.field6682 && ~arg7 <= ~class58.field1150 && arg7 <= class479.field6682 && ~arg3 <= ~class58.field1150 && ~class479.field6682 <= ~arg3) {
            class498.method2938(arg1, arg7, arg4, arg8, arg3, (byte) -1, arg6, arg0, arg2, arg5);
        } else {
            class693.method3872(arg2, arg6, arg5, arg1, arg4, arg7, arg8, arg0, 3, arg3);
        }
        if (!arg9) {
            method1667(37, -122, 69, -89, -8, -19, 89, 112, 12, false);
        }
        ++field3500;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)V", line = 102)
    public final void method730(int arg0, int arg1, int arg2) {
        if (arg0 != 10756) {
            field3499 = null;
        }
        ++field3496;
    }
}
