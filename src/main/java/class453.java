import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class453 extends class416 {

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public int field6188 = 0;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public static int field6192 = -1;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "Luu;")
    public static class289 field6187;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "[I")
    public static int[] field6186;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "[I")
    public static int[] field6189;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBLee;)V", line = 6)
    private final void method2576(int arg0, byte arg1, class677 arg2) {
        field6185++;
        if (arg1 == -45 && arg0 == 2) {
            this.field6188 = arg2.method3807(-1);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 22)
    public static void method2577(int arg0) {
        field6187 = null;
        field6186 = null;
        if (arg0 != -27627) {
            method2577(120);
        }
        field6189 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILwu;Z)Lhu;", line = 38)
    public static final class133 method2578(int arg0, class376 arg1, boolean arg2) {
        field6190++;
        class133 var3 = (class133) class276.field3848.method552(4, (long) arg0);
        if (var3 == null) {
            if (class535.field7047) {
                var3 = class341.field4807.method415(class720.method4037(arg1, arg0), true);
            } else {
                var3 = class367.method2166(-76, arg1.method2226(-1, arg0));
            }
            class276.field3848.method556((byte) 0, (long) arg0, var3);
        }
        if (!arg2) {
            field6192 = -90;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lee;B)V", line = 61)
    public final void method2579(class677 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method3821((byte) -40);
            if (var3 == 0) {
                if (arg1 <= 113) {
                    return;
                }
                field6191++;
                return;
            }
            this.method2576(var3, (byte) -45, arg0);
        }
    }
}
