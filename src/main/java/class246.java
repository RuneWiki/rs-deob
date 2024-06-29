import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class246 {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lck;")
    public static class119 field3979 = class298.method1987((byte) 124, "solano");

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Lck;")
    public static class119 field3978 = class298.method1987((byte) 97, "hint_headicons");

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static volatile int field3980 = 0;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lck;")
    private static class119 field3982 = class298.method1987((byte) 65, "Loading config )2 ");

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lck;")
    public static class119 field3981 = field3982;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "[Lmd;")
    public static class88[] field3985;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIZFI)[I", line = 29)
    public static final int[] method1598(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float arg6, int arg7) {
        field3988++;
        int[] var8 = new int[arg4];
        class103 var9 = new class103();
        var9.field1564 = arg2;
        var9.field1565 = arg1;
        var9.field1562 = (int) (arg6 * 4096.0F);
        var9.field1580 = arg5;
        if (arg3 != -50) {
            field3979 = (class119) null;
        }
        var9.field1575 = arg7;
        var9.field1579 = arg0;
        var9.method14(2048879374);
        class273.method1806(arg4, (byte) 120, 1);
        var9.method676(-9, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lck;", line = 78)
    public static final class119 method1599(byte arg0) {
        field3977++;
        int var1 = -34 % ((arg0 - 24) / 45);
        class119 var2 = class154.field2468;
        if (class289.field4744 != 0) {
            var2 = class49.field757;
        }
        return class170.method1074(new class119[] { class243.field3905, var2, class183.field2898, class234.method1506(class65.field1022, (byte) -79), class138.field2216, class234.method1506(class54.field867, (byte) -79), class229.field3705 }, -85);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 107)
    public static void method1600(boolean arg0) {
        field3978 = null;
        field3982 = null;
        field3981 = null;
        field3979 = null;
        field3985 = null;
        if (!arg0) {
            method1600(true);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V", line = 128)
    public static final void method1601(byte arg0) {
        if (arg0 < 15) {
            return;
        }
        class129 var1 = (class129) class87.field1318.method995(1836596936);
        field3976++;
        while (var1 != null) {
            if (var1.field1973 == -1) {
                var1.field1969 = 0;
                class140.method922(var1, 59);
            } else {
                var1.method552((byte) 84);
            }
            var1 = (class129) class87.field1318.method996(0);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZILva;I)[Lve;", line = 196)
    public static final class33[] method1602(boolean arg0, int arg1, class36 arg2, int arg3) {
        field3984++;
        if (class56.method414(arg3, arg2, false, arg1)) {
            return arg0 ? class109.method702((byte) 127) : (class33[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 231)
    public static final void method1603(int arg0) {
        field3986++;
        int var1 = -48 % ((arg0 - 83) / 40);
        class266.field4359.method486((byte) 93);
        class126.field1940.method486((byte) 93);
        class285.field4708.method486((byte) 93);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIILec;II)Lec;", line = 243)
    public static final class28 method1604(int arg0, int arg1, int arg2, int arg3, class28 arg4, int arg5, int arg6) {
        field3987++;
        long var7 = (long) arg5;
        class28 var9 = (class28) class103.field1559.method487(false, var7);
        if (var9 == null) {
            class267 var10 = class267.method1773(class117.field1764, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1775(64, 768, -50, -10, -50);
            class103.field1559.method488(var9, (byte) 56, var7);
        }
        if (arg1 != 11372) {
            method1604(-1, 109, 124, 24, (class28) null, -46, -40);
        }
        int var11 = arg4.method201();
        int var12 = arg4.method208();
        int var13 = arg4.method213();
        int var14 = arg4.method205();
        class28 var15 = var9.method218(true, true);
        if (arg2 != 0) {
            var15.method222(arg2);
        }
        class228 var16 = (class228) var15;
        if (class207.method1304(class10.field189, (byte) 108, arg0 + var11, arg6 + var13) != arg3 || class207.method1304(class10.field189, (byte) 102, arg0 + var12, arg6 + var14) != arg3) {
            for (int var17 = 0; var17 < var16.field3644; var17++) {
                var16.field3659[var17] += class207.method1304(class10.field189, (byte) 117, var16.field3672[var17] + arg0, var16.field3667[var17] + arg6) - arg3;
            }
            var16.field3665.field2226 = false;
            var16.field3663.field231 = false;
        }
        return var15;
    }
}
