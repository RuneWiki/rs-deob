import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class192 {

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public int field2536 = 0;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public int field2540 = 0;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Z")
    private boolean field2543 = false;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field2529 = -1;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public int field2531;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public int field2533;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public int field2535;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public int field2539;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    private int field2542;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "J")
    public long field2534;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BLrt;)V")
    public final void method1159(byte arg0, class194 arg1) {
        if (arg0 > -31) {
            this.method1161((byte) 116);
        }
        while (true) {
            int var3 = arg1.method1177(255);
            if (var3 == 0) {
                field2538++;
                return;
            }
            this.method1160(var3, arg1, -445);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILrt;I)V")
    private final void method1160(int arg0, class194 arg1, int arg2) {
        if (arg2 != -445) {
            return;
        }
        if (arg0 == 1) {
            this.field2542 = arg1.method1220(-126);
        } else if (arg0 == 2) {
            arg1.method1177(255);
        } else if (arg0 == 3) {
            this.field2539 = arg1.method1178(-230315992);
            this.field2530 = arg1.method1178(-230315992);
            this.field2531 = arg1.method1178(-230315992);
        } else if (arg0 == 4) {
            this.field2544 = arg1.method1177(255);
            this.field2528 = arg1.method1178(arg2 - 230315547);
        } else if (arg0 == 6) {
            this.field2535 = arg1.method1177(arg2 + 700);
        } else if (arg0 == 8) {
            this.field2536 = 1;
        } else if (arg0 == 9) {
            this.field2540 = 1;
        } else if (arg0 == 10) {
            this.field2543 = true;
        }
        field2532++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
    public final void method1161(byte arg0) {
        field2537++;
        this.field2533 = class605.field8858[this.field2542 << 3];
        int var2 = 77 / ((-arg0 - 1) / 47);
        this.field2526 = (int) Math.sqrt((double) (this.field2531 * this.field2531 + this.field2539 * this.field2539 + this.field2530 * this.field2530));
        if (this.field2528 == 0) {
            this.field2528 = 1;
        }
        if (this.field2544 == 0) {
            this.field2534 = 2147483647L;
        } else if (this.field2544 == 1) {
            this.field2534 = (this.field2526 * 8 / this.field2528);
            this.field2534 *= this.field2534;
        } else if (this.field2544 == 2) {
            this.field2534 = (this.field2526 * 8 / this.field2528);
        }
        if (this.field2543) {
            this.field2526 *= -1;
        }
    }
}
