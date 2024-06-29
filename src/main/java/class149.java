import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class149 {

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public int field2378 = -1;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "Lgf;")
    public static class256 field2382 = new class256();

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field2386 = 0;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public int field2376;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public int field2377;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "[I")
    public static int[] field2384;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZII)I")
    public static final int method1067(boolean arg0, int arg1, int arg2) {
        field2379++;
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg0 ? (arg1 & 0xFF80) + var3 : 48;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static void method1068(int arg0) {
        field2384 = null;
        if (arg0 != -412321977) {
            field2384 = null;
        }
        field2382 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)I")
    public static final int method1069(int arg0, int arg1) {
        field2381++;
        if (arg1 != 31156) {
            method1067(false, 107, 122);
        }
        return arg0 & 0xFF;
    }
}
