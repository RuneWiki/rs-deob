import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class356 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "[[I")
    public static int[][] field5175 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "F")
    public static float field5172;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lvh;")
    public static class403 field5173;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)V", line = 10)
    public static final void method2210(int arg0, int arg1) {
        if (arg0 != 2) {
            method2211(54);
        }
        field5176++;
        class19 var2 = class364.method2236(arg0 + 1248116638, arg1, 8);
        var2.method104(arg0 ^ 0x8);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 28)
    public static void method2211(int arg0) {
        field5175 = null;
        if (arg0 != -16136) {
            field5172 = 1.1494687F;
        }
        field5173 = null;
    }
}
