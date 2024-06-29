import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class115 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lcq;")
    public static class72 field1327 = new class72(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "F")
    public static float field1329;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 12)
    public static void method670(int arg0) {
        field1327 = null;
        if (arg0 != 32) {
            field1327 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZILnd;I)V", line = 26)
    public static final void method671(int arg0, boolean arg1, int arg2, class446 arg3, int arg4) {
        field1331++;
        for (class237 var5 = (class237) class314.field4232.method1690((byte) -122); var5 != null; var5 = (class237) class314.field4232.method1699((byte) 57)) {
            if (var5.field3123 == arg0 && (arg2 * 128) == var5.field3114 && (arg4 * 128) == var5.field3112 && var5.field3110.field6209 == arg3.field6209) {
                if (var5.field3116 != null) {
                    class352.field4781.method1866(var5.field3116);
                    var5.field3116 = null;
                }
                if (var5.field3108 != null) {
                    class352.field4781.method1866(var5.field3108);
                    var5.field3108 = null;
                }
                var5.method263(false);
                return;
            }
        }
        if (!arg1) {
            method670(75);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Laq;IIIIZ)V", line = 67)
    public static final void method672(class453[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 < 98) {
            return;
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class453 var7 = arg0[var6];
            if (var7 != null && var7.field6462 == arg4) {
                class14.method83(arg5, (byte) -80, arg2, arg3, var7);
                class106.method641(var7, arg3, 0, arg2);
                if (var7.field6345 > (var7.field6339 - var7.field6377)) {
                    var7.field6345 = var7.field6339 - var7.field6377;
                }
                if (var7.field6386 > (var7.field6417 - var7.field6432)) {
                    var7.field6386 = var7.field6417 - var7.field6432;
                }
                if (var7.field6345 < 0) {
                    var7.field6345 = 0;
                }
                if (var7.field6386 < 0) {
                    var7.field6386 = 0;
                }
                if (var7.field6383 == 0) {
                    class306.method1942(arg5, -1, var7);
                }
            }
        }
        field1330++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Laq;III)V", line = 114)
    public static final void method673(class453 arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 108) {
            return;
        }
        if (!class104.field1224) {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class308.method1959(arg0, false, var4);
                if (var8 != null) {
                    class300.method1908(class202.method1240(arg0, var4, (byte) -123), arg0.field6366, arg0.field6475, 672, (long) (var4 + 1), var8, arg0.field6364, 1010);
                    class398.field5398++;
                }
            }
            String var5 = class87.method540(45, arg0);
            if (var5 != null) {
                class413.field5678++;
                class300.method1908(arg0.field6455, arg0.field6366, arg0.field6475, 672, 0L, var5, arg0.field6364, 10);
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class308.method1959(arg0, false, var6);
                if (var7 != null) {
                    class398.field5398++;
                    class300.method1908(class202.method1240(arg0, var6, (byte) -46), arg0.field6366, arg0.field6475, 672, (long) (var6 + 1), var7, arg0.field6364, 58);
                }
            }
            if (client.method2696(arg0).method2260((byte) -61)) {
                if (arg0.field6433 == null) {
                    class300.method1908(-1, "", arg0.field6475, 672, 0L, class373.field5060.method434(class373.field5057, -8192), arg0.field6364, 2);
                } else {
                    class300.method1908(-1, "", arg0.field6475, 672, 0L, arg0.field6433, arg0.field6364, 2);
                }
                class146.field1723++;
            }
        } else if (client.method2696(arg0).method2263(true) && (class105.field1248 & 0x20) != 0) {
            class269.field3471++;
            class300.method1908(class272.field3513, class381.field5204 + " -> " + arg0.field6366, arg0.field6475, 672, 0L, class335.field4569, arg0.field6364, 57);
        }
        field1328++;
    }
}
