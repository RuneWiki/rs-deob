import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class173 {

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public int field2668 = -1;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field2658 = 0;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field2671 = 0;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public int field2662;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public int field2667;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Lub;")
    public static class92 field2657;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2659;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IS)Z")
    public static final boolean method1238(int arg0, short arg1) {
        field2669++;
        if (arg1 == 20 || arg1 == 37 || arg1 == 15 || arg1 == 22 || arg1 == 3 || arg1 == 58 || arg1 == 35 || arg1 == 8) {
            return true;
        } else if (arg1 == 49 || arg1 == 38 || arg1 == 1001 || arg1 == 1003) {
            return true;
        } else {
            if (arg0 != -23) {
                field2671 = -124;
            }
            if (arg1 == 39 || arg1 == 26 || arg1 == 47 || arg1 == 48 || arg1 == 6) {
                return true;
            } else {
                return arg1 == 19 || arg1 == 13 || arg1 == 7 || arg1 == 17 || arg1 == 46 || arg1 == 10;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1239(int arg0) {
        if (arg0 == -14346) {
            field2659 = null;
            field2657 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI[III)V")
    public static final void method1240(byte arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field2673++;
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        arg4--;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg2[var7] = arg3;
            int var8 = var7 + 1;
            arg2[var8] = arg3;
            int var9 = var8 + 1;
            arg2[var9] = arg3;
            int var10 = var9 + 1;
            arg2[var10] = arg3;
            int var11 = var10 + 1;
            arg2[var11] = arg3;
            int var12 = var11 + 1;
            arg2[var12] = arg3;
            int var13 = var12 + 1;
            arg2[var13] = arg3;
            arg4 = var13 + 1;
            arg2[arg4] = arg3;
        }
        while (arg4 < var6) {
            arg4++;
            arg2[arg4] = arg3;
        }
        if (arg0 > -46) {
            field2660 = -81;
        }
    }
}
