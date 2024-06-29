import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class583 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lvn;")
    public class315 field8165 = new class315();

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Lfha;")
    public static class382 field8164 = new class382(13, 16);

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[Lpga;")
    public static class535[] field8166 = null;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lfl;")
    public static class739 field8162;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 14)
    public static void method3256(int arg0) {
        if (arg0 > -30) {
            field8162 = null;
        }
        field8162 = null;
        field8166 = null;
        field8164 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I", line = 27)
    public static final int method3257(int arg0, int arg1, int arg2) {
        field8163++;
        int var3 = arg1 + (arg2 * 57);
        if (arg0 != 11348) {
            method3258((byte) 75, null);
        }
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLni;)V", line = 52)
    public static final void method3258(byte arg0, class522 arg1) {
        class495.field6741 = arg1;
        field8167++;
        if (arg0 <= 15) {
            method3256(-93);
        }
    }
}
