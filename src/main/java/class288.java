import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class288 implements class318 {

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lla;")
    private class423 field3998;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Lbba;")
    public class548 field4005;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field3996 = 2;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field3993 = 0;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field4001 = 0;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "D")
    public static double field3994;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Ljp;")
    public static class468 field4000;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Ltd;")
    public class515 field3997;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZB)V")
    public void method678(boolean arg0, byte arg1) {
        if (arg0) {
            int var3 = this.field4005.field7959.method71(class758.field10546, (byte) 98, this.field3997.method784()) + this.field4005.field7961;
            int var4 = this.field4005.field7955.method995(this.field3997.method780(), class544.field7915, (byte) 45) + this.field4005.field7956;
            this.field3997.method3128(var3, var4);
        }
        field4004++;
        if (arg1 != -53) {
            this.method414((byte) 37);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILha;IIIILaj;IBII)V")
    public static final void method1829(int arg0, int arg1, class543 arg2, int arg3, int arg4, int arg5, int arg6, class194 arg7, int arg8, byte arg9, int arg10, int arg11) {
        int var12 = 106 % ((-arg9 - 67) / 54);
        field3999++;
        if (arg3 > arg5 && arg3 < arg5 + arg6 && arg11 - 13 < arg0 && arg0 < (arg11 + 3)) {
            arg1 = arg8;
        }
        String var13 = class228.method1588(arg7, -116);
        class193.field2838.method2421(class637.field9005, arg1, class42.field708, arg11, var13, arg5 + 3, 0, 0);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public final void method414(byte arg0) {
        field4002++;
        if (arg0 <= 126) {
            this.method678(true, (byte) -16);
        }
        this.field3997 = class181.method1279(this.field3998, 0, this.field4005.field7957);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    public static void method1830(byte arg0) {
        if (arg0 < 12) {
            method1831(63, null);
        }
        field4000 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILos;)V")
    public static final void method1831(int arg0, class170 arg1) {
        arg1.field2399 = false;
        field3995++;
        if (arg1.field2398 != null) {
            arg1.field2398.field8298 = 0;
        }
        for (class170 var2 = arg1.method1065(); var2 != null; var2 = arg1.method1086()) {
            method1831(arg0, var2);
        }
        if (arg0 != 0) {
            method1830((byte) 13);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Z")
    public final boolean method418(boolean arg0) {
        field4003++;
        if (!arg0) {
            this.method414((byte) -55);
        }
        return this.field3998.method2609(0, this.field4005.field7957);
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lla;Lbba;)V")
    public class288(class423 arg0, class548 arg1) {
        this.field3998 = arg0;
        this.field4005 = arg1;
    }
}
