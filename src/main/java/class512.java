import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class512 extends class569 {

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "Lof;")
    public class9 field7421;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field7418 = 0;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZZZ)V")
    public static final void method3110(boolean arg0, boolean arg1, boolean arg2) {
        if (arg0) {
            class122.field1659--;
            if (class122.field1659 == 0) {
                class160.field2296 = null;
            }
        }
        if (arg2) {
            class254.field3667--;
            if (class254.field3667 == 0) {
                class519.field7479 = null;
            }
        }
        if (!arg1) {
            field7416++;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)Z")
    public static final boolean method3111(int arg0, int arg1) {
        field7423++;
        if (arg1 == -12047) {
            return arg0 == 47 || arg0 == 8 || arg0 == 13 || arg0 == 57 || arg0 == 22 || arg0 == 23 || arg0 == 25;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Lhha;")
    public static final class503 method3112(int arg0, int arg1, int arg2) {
        field7415++;
        class503 var3 = (class503) class17.field163.method4020((long) arg1 | (long) arg0 << 32, (byte) -126);
        if (var3 == null) {
            var3 = new class503(arg0, arg1);
            class17.field163.method4022(var3, 86, var3.field6188);
        }
        if (arg2 != 0) {
            method3110(false, false, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(III)V")
    public static final void method3113(int arg0, int arg1, int arg2) {
        field7420++;
        class503 var3 = method3112(12, arg1, 0);
        if (arg2 < 43) {
            field7419 = -35;
        }
        var3.method3075((byte) 53);
        var3.field7310 = arg0;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3114(String arg0, int arg1) {
        field7422++;
        return arg1 == 6406 ? arg0.length() + 2 : -27;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lkw;II[B)V")
    public class512(class346 arg0, int arg1, int arg2, byte[] arg3) {
        this.field7421 = class369.method2317(arg0, 34037, arg1, false, arg3, 6406, 6406, arg2);
        this.field7421.method1676(false, false, (byte) 121);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILqk;IZ)V")
    public static final void method3115(int arg0, class146 arg1, int arg2, boolean arg3) {
        if (arg3) {
            field7418 = 84;
        }
        class451.field6455 = arg1;
        class510.field7391 = arg2;
        class756.field10525 = arg0;
        field7417++;
    }
}
