import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class176 {

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public int field3378 = -1;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "[I")
    public static int[] field3373 = new int[50];

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3379 = 0;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lai;")
    private static class10 field3375 = class44.method278("Take", 127);

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field3380 = 0;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lai;")
    public static class10 field3368 = field3375;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Ldb;")
    public static class32 field3374 = new class32(4096);

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Loa;")
    public class128 field3370;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lae;")
    public static class6 field3372;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "[I")
    public int[] field3377;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[Lai;")
    public class10[] field3371;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method1148(byte arg0) {
        field3372 = null;
        field3375 = null;
        field3373 = null;
        field3374 = null;
        if (arg0 == 89) {
            field3368 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
    public static final void method1149(byte arg0) {
        field3369++;
        if (arg0 >= -88) {
            field3373 = null;
        }
        if (class188.field3593 != null) {
            class188.field3593.method552(-5034);
            class188.field3593 = null;
        }
        class149.method1023(-31984);
        class36.field560.method562();
        for (int var1 = 0; var1 < 4; var1++) {
            class58.field1022[var1].method660((byte) 127);
        }
        System.gc();
        class142.method959((byte) 22, 2);
        class61.field1040 = false;
        class106.field1966 = -1;
        class5.method13(-8);
        class111.method710(126, 10);
    }
}
