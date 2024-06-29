import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class24 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lp;")
    public static class280 field433 = class18.method140((byte) -128, "null");

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Lhe;")
    public static class19 field434 = new class19(16);

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "[S")
    public static short[] field437 = new short[] { 23, 28, 22, 16, 15, 5, 51, 17 };

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field441 = 0;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lsb;")
    public static class221 field439 = new class221(64);

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field443 = 0;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Lp;")
    public static class280 field444 = class18.method140((byte) -123, "glissement:");

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)I")
    public static final int method178(int arg0, byte arg1) {
        int var2 = -105 / ((64 - arg1) / 48);
        field440++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ltg;Ltg;III)Ltd;")
    public static final class72 method179(class180 arg0, class180 arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 69) {
            method179((class180) null, (class180) null, -25, -29, 18);
        }
        field438++;
        return class90.method648(arg4, arg3, arg0, -41) ? class34.method284(-1475, arg1.method1258(arg3, arg4, (byte) 122)) : null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method180(int arg0) {
        field434 = null;
        if (arg0 == 7) {
            field433 = null;
            field437 = null;
            field444 = null;
            field439 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI)V")
    public static final void method181(boolean arg0, int arg1) {
        field436++;
        byte[][] var2 = class90.field1472;
        byte var3 = 4;
        for (int var4 = 0; var4 < var3; var4++) {
            class128.method884(-19552);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class40.field684[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3CD6724) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = (var8 & 0x3FFA) >> 3;
                            int var12 = (var8 & 0xFFCE06) >> 14;
                            int var13 = (var12 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < class3.field93.length; var14++) {
                                if (class3.field93[var14] == var13 && var2[var14] != null) {
                                    class128.method881((var12 & 0x7) * 8, var2[var14], var10, (var11 & 0x7) * 8, class183.field3211, -77, var6 * 8, arg0, var9, var5 * 8, var4);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class130.method900(var6 * 8, 8, (byte) -97, var5 * 8, var4, 8);
                    }
                }
            }
        }
        if (arg1 < 60) {
            field443 = 89;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static final void method182(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field442++;
        for (class155 var1 = (class155) class224.field3880.method651(12916); var1 != null; var1 = (class155) class224.field3880.method643(arg0 ^ 0xFFFFD4C5)) {
            if (var1.field2709 > 0) {
                var1.field2709--;
            }
            if (var1.field2709 != 0) {
                if (var1.field2711 > 0) {
                    var1.field2711--;
                }
                if (var1.field2711 == 0 && var1.field2702 >= 1 && var1.field2706 >= 1 && var1.field2702 <= 102 && var1.field2706 <= 102 && (var1.field2710 < 0 || class94.method667(var1.field2713, var1.field2710, -16784))) {
                    class59.method420(var1.field2707, var1.field2712, var1.field2716, var1.field2702, var1.field2713, var1.field2710, var1.field2706, -33);
                    var1.field2711 = -1;
                    if (var1.field2710 == var1.field2705 && var1.field2705 == -1) {
                        var1.method1146(26159);
                    } else if (var1.field2710 == var1.field2705 && var1.field2708 == var1.field2707 && var1.field2713 == var1.field2703) {
                        var1.method1146(26159);
                    }
                }
            } else if (var1.field2705 < 0 || class94.method667(var1.field2703, var1.field2705, arg0 ^ 0x418F)) {
                class59.method420(var1.field2708, var1.field2712, var1.field2716, var1.field2702, var1.field2703, var1.field2705, var1.field2706, 119);
                var1.method1146(arg0 + 26160);
            }
        }
    }
}
