import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class720 extends class248 {

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Lsia;")
    public static class732 field9793 = new class732();

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "[I")
    public static int[] field9796 = new int[1000];

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "F")
    public static float field9797;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)V", line = 4)
    public static final void method4002(int arg0, int arg1) {
        field9795++;
        class594 var2 = class692.method3869(arg1, (byte) 105, 12);
        var2.method3383(-16058);
        if (arg0 >= -59) {
            method4004((byte) -108);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 18)
    public static final void method4003(int arg0) {
        field9794++;
        if (arg0 == 12) {
            class227.method1598(false);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 29)
    public static void method4004(byte arg0) {
        field9796 = null;
        int var1 = -3 / ((arg0 - 3) / 54);
        field9793 = null;
    }
}
