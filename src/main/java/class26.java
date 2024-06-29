import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class26 extends class10 {

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    private final int field499;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    private final int field498;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    private final int field501;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    private final int field508;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "Lsb;")
    public static class98 field509 = class47.method368("k", 0);

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field503 = 0;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "[[S")
    public static short[][] field512 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Lsb;")
    private static class98 field502 = class47.method368("Please remove ", 0);

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Lsb;")
    public static class98 field494 = field502;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Lsb;")
    public static class98 field495 = field502;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "Llj;")
    public static class216 field511;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "Lih;")
    public static class252 field510;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "Ltg;")
    public static class75 field507;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZI)V")
    public final void method101(int arg0, boolean arg1, int arg2) {
        ++field500;
        int var4 = this.field499 * arg0 >> 12;
        int var5 = this.field501 * arg2 >> 12;
        int var6 = this.field508 * arg0 >> 12;
        int var7 = this.field498 * arg2 >> 12;
        if (arg1) {
            class142.method1059(0, var4, var6, var5, super.field211, var7);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(IZI)V")
    public final void method102(int arg0, boolean arg1, int arg2) {
        ++field506;
        if (arg1) {
            method266((byte) -117);
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)V")
    public static final void method266(byte arg0) {
        class264.field4628.method1565(-1);
        ++field496;
        if (arg0 >= -82) {
            field510 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static void method267(int arg0) {
        field502 = null;
        field507 = null;
        field511 = null;
        field510 = null;
        field495 = null;
        int var1 = 85 % ((-7 - arg0) / 39);
        field512 = null;
        field509 = null;
        field494 = null;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(IIIIII)V")
    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field499 = arg0;
        this.field498 = arg3;
        this.field501 = arg1;
        this.field508 = arg2;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
    public final void method94(int arg0, int arg1, int arg2) {
        ++field505;
        if (arg2 != -1) {
            field511 = null;
        }
    }
}
