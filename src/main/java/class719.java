import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class719 extends class542 {

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field10072 = -1;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "[Llu;")
    public static class710[] field10073 = new class710[50];

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    public static int field10074;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILka;IB)Ltb;", line = 14)
    public static final class397 method4012(int arg0, int arg1, class469 arg2, int arg3, byte arg4) {
        field10074++;
        if (arg4 == -108) {
            return arg2 == null ? null : new class397(arg0, arg3, arg1, arg2.method335(), arg2.method327(), arg2.method356(), arg2.method338(), arg2.method353(), arg2.method312(), arg2.method362());
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 30)
    public static void method4013(byte arg0) {
        if (arg0 != -97) {
            method4013((byte) -120);
        }
        field10073 = null;
    }
}
