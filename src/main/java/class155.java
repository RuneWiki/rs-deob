import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class155 {

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Ldba;")
    public static class101 field2300 = new class101(9, 7);

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field2304 = 0;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
    public static boolean field2305 = false;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public int field2294;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public int field2296;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public int field2301;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)I")
    public static final int method1221(int arg0, byte arg1) {
        if (arg1 < 56) {
            return -54;
        } else {
            field2293++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjo;Ltd;)Ldd;")
    public static final class731 method1222(int arg0, class351 arg1, class476 arg2) {
        field2302++;
        class731 var3 = class1.method9((byte) -96);
        var3.field10215 = arg1.field5117;
        var3.field10210 = arg1;
        if (var3.field10215 == -1) {
            var3.field10211 = new class331(260);
        } else if (var3.field10215 == -2) {
            var3.field10211 = new class331(10000);
        } else if (var3.field10215 <= 18) {
            var3.field10211 = new class331(20);
        } else if (var3.field10215 <= 98) {
            var3.field10211 = new class331(100);
        } else {
            var3.field10211 = new class331(260);
        }
        if (arg0 != 260) {
            method1227((byte) 42);
        }
        var3.field10211.method2135(arg2, 0);
        var3.field10211.method2140(var3.field10210.method2214(-24340), -23703);
        var3.field10214 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILrv;B)V")
    private final void method1223(int arg0, class120 arg1, byte arg2) {
        if (arg2 != 91) {
            this.field2294 = -123;
        }
        field2299++;
        if (arg0 == 1) {
            this.field2301 = arg1.method898((byte) -98);
            this.field2294 = arg1.method842(2384);
            this.field2296 = arg1.method842(2384);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1224(int arg0, String arg1) {
        field2295++;
        if (arg1 == null) {
            return;
        }
        if (!(class50.field719 < 200 || class279.field3936) || class50.field719 >= 200) {
            class64.method386(class674.field9562.method3825((byte) -10, class526.field7494), 4, false);
            return;
        }
        String var2 = class221.method1524(arg1, -119);
        if (var2 == null) {
            return;
        }
        for (int var3 = arg0; var3 < class50.field719; var3++) {
            String var8 = class221.method1524(class662.field9293[var3], arg0 ^ 0xFFFFFFC0);
            if (var8 != null && var8.equals(var2)) {
                class64.method386(arg1 + class674.field9589.method3825((byte) -10, class526.field7494), 4, false);
                return;
            }
            if (class738.field10303[var3] != null) {
                String var9 = class221.method1524(class738.field10303[var3], -99);
                if (var9 != null && var9.equals(var2)) {
                    class64.method386(arg1 + class674.field9589.method3825((byte) -10, class526.field7494), 4, false);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < field2304; var4++) {
            String var6 = class221.method1524(class127.field1657[var4], -74);
            if (var6 != null && var6.equals(var2)) {
                class64.method386(class674.field9594.method3825((byte) -10, class526.field7494) + arg1 + class674.field9595.method3825((byte) -10, class526.field7494), 4, false);
                return;
            }
            if (class241.field3456[var4] != null) {
                String var7 = class221.method1524(class241.field3456[var4], -116);
                if (var7 != null && var7.equals(var2)) {
                    class64.method386(class674.field9594.method3825((byte) -10, class526.field7494) + arg1 + class674.field9595.method3825((byte) -10, class526.field7494), 4, false);
                    return;
                }
            }
        }
        if (class221.method1524(class251.field3549.field7955, arg0 ^ 0xFFFFFF9F).equals(var2)) {
            class64.method386(class674.field9592.method3825((byte) -10, class526.field7494), 4, false);
            return;
        }
        class376.field5413++;
        class731 var5 = method1222(260, class239.field3446, class237.field3417);
        var5.field10211.method851((byte) -2, class233.method1612(1, arg1));
        var5.field10211.method880(true, arg1);
        class533.method3088(var5, 0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)[Lke;")
    public static final class622[] method1225(byte arg0) {
        field2303++;
        return arg0 <= 17 ? null : new class622[] { class469.field6697, class402.field5696, class313.field4649, class186.field2796, class365.field5278, class498.field7072, class626.field8837, class217.field3113, class328.field4899, class451.field6495, class542.field7596, class30.field412, class446.field6333, class599.field8443, class540.field7584, class300.field4515, class502.field7184, class13.field252, class146.field1865, class480.field6819, class783.field10774, class38.field631, class779.field10742, class515.field7348, class147.field1889, class74.field999, class224.field3221, class412.field5830, class539.field7570, class235.field3398, class541.field7587, class197.field2883, class792.field10867, class265.field3749, class489.field6920, class665.field9333, class547.field7713, class139.field1794, class482.field6850, class549.field7744, class626.field8836, class220.field3139, class176.field2536, class277.field3865, class185.field2792, class468.field6694, class191.field2852, class558.field7930, class200.field2941, class672.field9418, class572.field8105, class380.field5458, class621.field8747, class626.field8835, class330.field4919, class417.field5887, class403.field5705, class483.field6860, class544.field7640, class225.field3229, class273.field3809, class792.field10864, class746.field10378, class257.field3609, class91.field1181, class725.field10170, class265.field3742, class86.field1115, class744.field10361, class652.field9198, class450.field6459, class655.field9240, class311.field4625, class703.field9903, class197.field2881, class729.field10192, class588.field8319, class270.field3790, class233.field3375, class205.field3011, class185.field2794, class149.field1920, class126.field1648, class760.field10482, class614.field8658, class449.field6427, class129.field1675, class780.field10751, class463.field6614, class585.field8277, class596.field8394, class584.field8260, class181.field2743, class356.field5193, class280.field4027, class3.field43, class571.field8095, class445.field6326, class300.field4510, class771.field10623, class177.field2690, class21.field323, class181.field2753, class266.field3754, class32.field431, class419.field5896, class364.field5261, class610.field8608, class125.field1634, class575.field8139, class69.field914, class292.field4426, class174.field2461, class424.field5978, class689.field9754, class617.field8709, class61.field830, class311.field4629, class445.field6328, class212.field3069, class638.field8977, class790.field10842, class412.field5833, class130.field1712, class418.field5891, class648.field9125, class587.field8311, class746.field10377, class471.field6714, class124.field1627, class54.field750, class684.field9712, class420.field5919 };
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lrv;I)V")
    public final void method1226(class120 arg0, int arg1) {
        field2297++;
        while (true) {
            int var3 = arg0.method842(2384);
            if (var3 == 0) {
                if (arg1 > -12) {
                    this.method1223(93, null, (byte) -16);
                    return;
                } else {
                    return;
                }
            }
            this.method1223(var3, arg0, (byte) 91);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
    public static void method1227(byte arg0) {
        if (arg0 >= 89) {
            field2300 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(ILjava/lang/String;)V")
    public static final void method1228(int arg0, String arg1) {
        field2298++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class221.method1524(arg1, -79);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != 1) {
            method1222(-37, null, null);
        }
        while (field2304 > var3) {
            String var4 = class127.field1657[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class221.method1524(var4, -108);
            if (var5 != null && var5.equals(var2)) {
                field2304--;
                for (int var6 = var3; var6 < field2304; var6++) {
                    class127.field1657[var6] = class127.field1657[var6 + 1];
                    class745.field10367[var6] = class745.field10367[var6 + 1];
                    class241.field3456[var6] = class241.field3456[var6 + 1];
                    class182.field2760[var6] = class182.field2760[var6 + 1];
                    class423.field5972[var6] = class423.field5972[var6 + 1];
                }
                class680.field9655++;
                class543.field7610 = class717.field10086;
                class731 var7 = method1222(arg0 ^ 0x105, class634.field8939, class237.field3417);
                var7.field10211.method851((byte) -2, class233.method1612(1, arg1));
                var7.field10211.method880(true, arg1);
                class533.method3088(var7, arg0 - 1);
                return;
            }
            var3++;
        }
    }
}
