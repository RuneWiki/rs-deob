import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class269 {

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field3625 = 0;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lmg;")
    public static class530 field3623 = new class530();

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lka;")
    public static class473 field3626 = new class473(4);

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lkc;")
    public static class157 field3627 = new class157(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field3628 = 0;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method1580(boolean arg0, int arg1, int arg2) {
        field3624++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else {
            if (!arg0) {
                method1580(true, -127, 62);
            }
            return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method1581(byte arg0) {
        field3626 = null;
        field3627 = null;
        if (arg0 == -119) {
            field3623 = null;
        }
    }
}
