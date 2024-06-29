import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 extends class73 {

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lhj;")
    private static class69 field431 = class181.method1318("Loaded update list", (byte) -115);

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Lhj;")
    public static class69 field432 = field431;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "S")
    public static short field430 = 1;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "[[[I")
    public static int[][][] field429;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIILtk;Lqb;I)V")
    public static final void method171(int arg0, int arg1, int arg2, int arg3, class50 arg4, class56 arg5, int arg6) {
        field428++;
        if (arg5 == null) {
            return;
        }
        if (arg6 <= 31) {
            field432 = null;
        }
        int var7 = client.field2812 + class179.field3257 & 0x7FF;
        int var8 = arg1 * arg1 + arg2 * arg2;
        int var9 = Math.max(arg4.field798 / 2, arg4.field727 / 2) + 10;
        if (var8 > (var9 * var9)) {
            return;
        }
        int var10 = class178.field3247[var7];
        int var11 = class178.field3232[var7];
        int var12 = var11 * 256 / (class59.field1080 + 256);
        int var13 = var10 * 256 / (class59.field1080 + 256);
        int var14 = arg2 * var12 - arg1 * var13 >> 16;
        int var15 = arg1 * var12 + arg2 * var13 >> 16;
        ((class264) arg5).method1829(arg4.field798 / 2 + arg0 + var15 - (arg5.field1009 / 2), arg3 - -(arg4.field727 / 2) + -(arg5.field1014 / 2) + -var14, arg4.field800, arg4.field760);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static void method172(byte arg0) {
        field431 = null;
        if (arg0 < 113) {
            field432 = null;
        }
        field429 = null;
        field432 = null;
    }
}
