import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class276 extends class690 {

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public int field3521;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public int field3522;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "Lpfa;")
    public static class275 field3526;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V", line = 5)
    public static void method1671(int arg0) {
        if (arg0 != 23450) {
            field3526 = null;
        }
        field3526 = null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Ljd;", line = 18)
    public final class216 method20(byte arg0) {
        field3527++;
        int var2 = 82 % ((-arg0 - 27) / 42);
        return class89.field1148;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)Lsaa;", line = 28)
    public static final class305 method1672(boolean arg0, int arg1) {
        field3524++;
        if (!arg0) {
            method1673(false, null);
        }
        return class245.field3162 && arg1 >= class592.field7946 && arg1 <= class163.field1921 ? class633.field8584[arg1 - class592.field7946] : null;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZLlh;)Z", line = 42)
    public static final boolean method1673(boolean arg0, class492 arg1) {
        field3525++;
        if (arg0) {
            return class50.field645 == arg1 || class16.field152 == arg1 || class295.field3761 == arg1 || class404.field5217 == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ltl;Lpd;IIIIIIIIII)V", line = 56)
    public class276(class580 arg0, class241 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3521 = arg10;
        this.field3522 = arg11;
    }
}
