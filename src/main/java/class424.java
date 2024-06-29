import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class424 extends class332 {

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public int field5628;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Llja;")
    public static class744 field5626 = new class744(47, 8);

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "Llja;")
    public static class744 field5630 = new class744(90, 15);

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "Lbk;")
    public static class396 field5631 = new class396(0, -1);

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "Llja;")
    public static class744 field5634 = new class744(5, 3);

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)V")
    public static final void method2534(int arg0, int arg1) {
        if (arg0 < 46) {
            field5630 = null;
        }
        class506.field7198 = arg1;
        field5633++;
        class268.field3168 = 2;
        class571.method3312(class513.field7244, class513.field7244.equals(""), true, "", 80);
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V")
    public static void method2535(int arg0) {
        if (arg0 != 5) {
            field5630 = null;
        }
        field5631 = null;
        field5626 = null;
        field5630 = null;
        field5634 = null;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(ILps;Lft;III)V")
    public class424(int arg0, class105 arg1, class4 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field5628 = arg5;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BII)Z")
    public static final boolean method2536(byte arg0, int arg1, int arg2) {
        if (arg0 <= 119) {
            method2536((byte) -118, -79, 125);
        }
        field5629++;
        if (arg2 >= 1000 && arg1 < 1000) {
            return true;
        } else if (arg2 >= 1000 || arg1 >= 1000) {
            return arg2 >= 1000 && arg1 >= 1000;
        } else if (class783.method4340(81, arg1)) {
            return true;
        } else {
            return !class783.method4340(87, arg2);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Llf;")
    public final class251 method94(int arg0) {
        if (arg0 != 1024) {
            field5626 = null;
        }
        field5627++;
        return class491.field6846;
    }
}
