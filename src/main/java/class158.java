import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class158 {

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public int field2516;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public int field2518;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public int field2519;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    public int field2525;

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lkt;B)Z")
    public final boolean method1162(class158 arg0, byte arg1) {
        field2523++;
        if (arg1 > -83) {
            return true;
        } else {
            return this.field2520 == arg0.field2520 && this.field2528 == arg0.field2528 && this.field2516 == arg0.field2516;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZI)I")
    public static final int method1163(int arg0, boolean arg1, int arg2) {
        field2524++;
        if (arg1) {
            int var3 = arg0 * 57 + arg2;
            int var4 = var3 << 13 ^ var3;
            int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return var5 >> 19 & 0xFF;
        } else {
            return 58;
        }
    }
}
