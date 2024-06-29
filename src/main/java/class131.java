import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class131 extends class435 {

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public int field2131 = 0;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public int field2136 = -1;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "[Lhc;")
    public static class284[] field2134 = new class284[100];

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public int field2127;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public int field2129;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public int field2130;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public int field2140;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZIIZI)I")
    public static final int method1022(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2137++;
        class569 var5 = class198.method1392(arg1, arg0, Integer.MIN_VALUE);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field8318.length; var7++) {
            if (var5.field8318[var7] >= 0 && var5.field8318[var7] < class430.field6132.field104) {
                class432 var8 = class430.field6132.method42(var5.field8318[var7], false);
                int var9 = var8.method2531(false, arg2, class237.field3504.method1554(false, arg2).field4922);
                if (arg3) {
                    var6 += var5.field8313[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        if (arg4 > -111) {
            method1023(-56);
        }
        return var6;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method1023(int arg0) {
        field2134 = null;
        if (arg0 != -20058) {
            field2134 = null;
        }
    }
}
