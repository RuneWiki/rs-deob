import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public abstract class class63 extends class287 {

    @OriginalMember(owner = "client!in", name = "B", descriptor = "Z")
    public volatile boolean field846 = true;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "Lgca;")
    public static class209 field842 = new class209(4);

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "Z")
    public boolean field843;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "Z")
    public boolean field844;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIZ)I", line = 4)
    public static final int method402(int arg0, int arg1, int arg2, boolean arg3) {
        field841++;
        class344 var4 = class70.method444(arg2, arg3, Integer.MIN_VALUE);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else if (arg1 > -73) {
            return -122;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field4391.length; var6++) {
                if (var4.field4392[var6] == arg0) {
                    var5 += var4.field4391[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIIILha;Lkp;II)V", line = 37)
    public static final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class545 arg8, class480 arg9, int arg10, int arg11) {
        if (arg11 != 10960) {
            return;
        }
        if (arg5 > arg0 && arg0 + arg2 > arg5 && arg4 > (arg10 - 13) && arg4 < arg10 + 3) {
            arg6 = arg7;
        }
        field838++;
        String var12 = class71.method451((byte) -17, arg9);
        class743.field10354.method2437(0, arg0 + 3, var12, class298.field3904, arg10, -88, arg6, class200.field2888);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 54)
    public static final void method405(int arg0) {
        class383.field5378 = arg0;
        for (int var1 = 0; var1 < class485.field6556; var1++) {
            for (int var2 = 0; var2 < class314.field4059; var2++) {
                if (class352.field4549[arg0][var1][var2] == null) {
                    class352.field4549[arg0][var1][var2] = new class38(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "h", descriptor = "(I)Lfl;", line = 80)
    public static final class520 method407(int arg0) {
        field840++;
        if (arg0 != 2793) {
            method409(false, 0.9471822663371442D);
        }
        return class531.field7428;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(B)V", line = 95)
    public static void method408(byte arg0) {
        field842 = null;
        if (arg0 != 86) {
            method405(-2);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZD)V", line = 105)
    public static final void method409(boolean arg0, double arg1) {
        field839++;
        class76.field1051.method864(class19.field237);
        class76.field1051.method851(0, 0, (int) arg1);
        class410.field5731.method2068(class76.field1051);
        if (!arg0) {
            field842 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)V", line = 123)
    public static final void method410(int arg0, int arg1) {
        field845++;
        int var2 = class245.field3409 - class651.field9209;
        if (var2 >= 100) {
            class665.field9377 = 1;
            class374.field5167 = -1;
            class13.field180 = -1;
            return;
        }
        int var3 = (int) class223.field3131;
        if (var3 < class652.field9224 >> 8) {
            var3 = class652.field9224 >> 8;
        }
        if (class400.field5549[4] && class692.field9687[4] + 128 > var3) {
            var3 = class692.field9687[4] + 128;
        }
        int var4 = (int) class403.field5597 + class97.field1409 & 0x3FFF;
        if (arg0 != -1) {
            field842 = null;
        }
        class590.method3504(class128.field1755, var4, var3, (byte) 124, class595.field8572, class438.method2628(class473.field6483.field9490, class392.field5459, class473.field6483.field9489, (byte) -71) - 200, arg1, (var3 >> 3) * 3 + 600 << 2);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class235.field3250 = (int) ((float) (class235.field3250 - class223.field3130) * var5 + (float) class223.field3130);
        class403.field5594 = (int) ((float) (class403.field5594 - class593.field8554) * var5 + (float) class593.field8554);
        class24.field266 = (int) ((float) (class24.field266 - class382.field5359) * var5 + (float) class382.field5359);
        class57.field798 = (int) ((float) (class57.field798 - class705.field9812) * var5 + (float) class705.field9812);
        int var6 = class645.field9148 - class741.field10330;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class645.field9148 = (int) ((float) var6 * var5 + (float) class741.field10330);
        class645.field9148 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)I")
    public abstract int method404(byte arg0);

    @OriginalMember(owner = "client!in", name = "g", descriptor = "(I)[B")
    public abstract byte[] method406(int arg0);
}
