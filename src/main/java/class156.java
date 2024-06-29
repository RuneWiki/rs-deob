import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class156 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lph;")
    public static class229 field2526 = class266.method1858(")1o", 0);

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Lph;")
    public static class229 field2530 = class266.method1858("Annuler", 0);

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "Lri;")
    public static class301 field2535 = null;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "Lph;")
    public static class229 field2538 = class266.method1858("scrollen:", 0);

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field2527 = -1;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field2540 = 0;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field2542 = 1;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Lph;")
    public static class229 field2544 = class266.method1858("::replacecanvas", 0);

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public int field2531;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public int field2533;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Lba;")
    public static class314 field2534;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lsi;")
    public static class66 field2528;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "Lsi;")
    public static class66 field2536;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)I", line = 25)
    public static final int method1122(int arg0, int arg1) {
        if (arg1 > -62) {
            return 75;
        } else {
            field2541++;
            return arg0 & 0x3FF;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 41)
    public static void method1123(byte arg0) {
        field2528 = null;
        field2544 = null;
        field2535 = null;
        field2530 = null;
        field2538 = null;
        field2536 = null;
        int var1 = 36 / ((-arg0 - 2) / 57);
        field2526 = null;
        field2534 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lhb;II)V", line = 58)
    private final void method1124(class164 arg0, int arg1, int arg2) {
        int var4 = 41 % ((arg2 - 44) / 56);
        if (arg1 == 1) {
            this.field2533 = arg0.method1161(true);
            this.field2531 = arg0.method1178(8);
            this.field2543 = arg0.method1178(8);
        }
        field2529++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lhb;I)V", line = 88)
    public final void method1125(class164 arg0, int arg1) {
        if (arg1 >= -27) {
            return;
        }
        while (true) {
            int var3 = arg0.method1178(8);
            if (var3 == 0) {
                field2532++;
                return;
            }
            this.method1124(arg0, var3, 126);
        }
    }
}
