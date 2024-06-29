import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class334 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "[F")
    public static float[] field4949 = new float[4];

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "[[I")
    public static int[][] field4951 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Z")
    public static boolean field4952 = false;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Lpu;")
    public static class522 field4954;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field4950;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 7)
    public static void method2105(int arg0) {
        field4951 = null;
        if (arg0 != 9) {
            field4949 = null;
        }
        field4954 = null;
        field4949 = null;
        field4950 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Z", line = 28)
    public static final boolean method2106(int arg0, int arg1, int arg2) {
        field4953++;
        if (arg0 < 90) {
            field4952 = true;
        }
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }
}
