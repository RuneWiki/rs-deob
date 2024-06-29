import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class25 {

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "[[S")
    public static short[][] field333 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "[I")
    public static int[] field328 = new int[5];

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "Lir;")
    public class25 field329;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "Lir;")
    public class25 field334;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "[I")
    public static int[] field332;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public final void method118(int arg0) {
        field330++;
        if (this.field329 == null) {
            return;
        }
        this.field329.field334 = this.field334;
        this.field334.field329 = this.field329;
        this.field334 = null;
        this.field329 = null;
        if (arg0 != -30545) {
            method119((byte) 123);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
    public static void method119(byte arg0) {
        field332 = null;
        field328 = null;
        field333 = null;
        if (arg0 >= -88) {
            method120(false, -108, null, (byte) -110, null);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZILjava/lang/String;BLjava/lang/String;)V")
    public static final void method120(boolean arg0, int arg1, String arg2, byte arg3, String arg4) {
        if (arg3 != 93) {
            method120(false, 83, null, (byte) -92, null);
        }
        field331++;
        class482.method2728(arg0, -1, (byte) -50, arg4, arg1, arg2, true);
    }
}
