import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class528 {

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "Z")
    public static boolean field7834 = false;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "[Z")
    public static boolean[] field7836 = new boolean[200];

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "[I")
    public static int[] field7838 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V", line = 19)
    public static void method3119(byte arg0) {
        if (arg0 >= 99) {
            field7836 = null;
            field7838 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)Lada;", line = 32)
    public static final class258 method3120(int arg0, int arg1) {
        field7835++;
        return arg0 <= arg1 && arg1 < 100 ? class493.field7445[arg1] : null;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZII)Ljava/lang/String;", line = 45)
    public static final String method3121(boolean arg0, int arg1, int arg2) {
        field7837++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else {
            if (!arg0) {
                method3121(true, -116, -47);
            }
            if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }
}
