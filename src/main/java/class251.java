import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class251 extends class133 {

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field4432 = 0;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "Z")
    public static boolean field4433 = false;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "J")
    public static long field4437 = 0L;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "Llk;")
    public static class232 field4436 = new class232(64);

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "Lsg;")
    public static class30 field4439 = class167.method1221((byte) 33, "::breakcon");

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "Llk;")
    public static class232 field4438 = new class232(64);

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public static int field4441 = 0;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "Lsg;")
    public static class30 field4440 = class167.method1221((byte) 33, "<col=ffb000>");

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    public static final void method1752(int arg0, int arg1) {
        field4435++;
        if (arg0 >= 125) {
            class68 var2 = class103.method830(arg1, 4, 12);
            var2.method610(2141640544);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILmc;I)Lgj;")
    public static final class192 method1753(int arg0, int arg1, class151 arg2, int arg3) {
        field4434++;
        return class224.method1608(arg1, arg3, arg2, arg0 ^ arg0) ? class174.method1282(true) : null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public static void method1754(byte arg0) {
        field4440 = null;
        field4438 = null;
        if (arg0 != 51) {
            field4438 = null;
        }
        field4436 = null;
        field4439 = null;
    }
}
