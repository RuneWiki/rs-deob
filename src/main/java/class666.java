import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class666 {

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "[I")
    public static int[] field9305 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "[Li;")
    public static class274[] field9303;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V", line = 5)
    public static final void method3693(int arg0) {
        field9304++;
        int var1 = 63 % ((69 - arg0) / 35);
        class661.field9266 = 0;
        class694.field9730.method3438(16);
        class188.field2148 = false;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V", line = 17)
    public static void method3694(byte arg0) {
        if (arg0 != -78) {
            field9303 = null;
        }
        field9303 = null;
        field9305 = null;
    }
}
