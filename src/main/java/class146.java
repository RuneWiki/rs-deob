import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class146 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lr;")
    public static class66 field2661 = class93.method641(43, "lila:");

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lr;")
    private static class66 field2665 = class93.method641(43, "Ok");

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lr;")
    public static class66 field2663 = field2665;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lsg;")
    public static class247 field2662;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[I")
    public static int[] field2668;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static final void method1005(int arg0) {
        if (arg0 <= 26) {
            method1005(55);
        }
        field2669++;
        class132.field2460.method1613((byte) 94);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method1006(int arg0) {
        field2665 = null;
        field2663 = null;
        field2668 = null;
        field2662 = null;
        field2661 = null;
        if (arg0 != 5756) {
            field2662 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
    public static final void method1007(int arg0, int arg1) {
        field2664++;
        if (class73.field1453 == arg1) {
            class7.field62.method288((byte) -114, arg0);
        } else {
            class248.field4334 = arg0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2667++;
        int var7 = arg5 + arg6;
        int var8 = arg4 - arg6;
        int var9 = arg5;
        if (arg1 != 16324) {
            return;
        }
        while (var7 > var9) {
            class194.method1266(arg2, (byte) -17, arg0, class15.field183[var9], arg3);
            var9++;
        }
        for (int var10 = arg4; var10 > var8; var10--) {
            class194.method1266(arg2, (byte) -17, arg0, class15.field183[var10], arg3);
        }
        int var11 = arg2 + arg6;
        int var12 = arg3 - arg6;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class15.field183[var13];
            class194.method1266(arg2, (byte) -17, arg0, var14, var11);
            class194.method1266(var12, (byte) -17, arg0, var14, arg3);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIBI)I")
    public static final int method1009(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2670++;
        if (arg3 == 25) {
            int var5 = 65536 - class123.field2326[arg0 * 1024 / arg4] >> 1;
            return ((65536 - var5) * arg1 >> 16) + (arg2 * var5 >> 16);
        } else {
            return -88;
        }
    }
}
