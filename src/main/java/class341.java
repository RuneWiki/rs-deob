import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class341 {

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "F")
    public static float field4657;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
    public static int[] field4656;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method2166(byte arg0) {
        if (arg0 > 42) {
            field4656 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILbi;)Lbi;")
    public static final class139 method2167(int arg0, class139 arg1) {
        field4655++;
        if (arg0 != 9492) {
            field4657 = -0.5673913F;
        }
        class139 var2 = client.method1641(arg1);
        if (var2 == null) {
            var2 = arg1.field2018;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public static final void method2168(byte arg0) {
        class183.method1339((byte) -101, (long) class414.field5793, class249.field3415);
        field4653++;
        if (class149.field2288 != -1) {
            class344.method2183(class149.field2288, (byte) -57);
        }
        int var1 = 113 / ((arg0 - 49) / 63);
        for (int var2 = 0; var2 < class352.field4817; var2++) {
            if (class135.field1930[var2]) {
                class199.field2844[var2] = true;
            }
            class411.field5754[var2] = class135.field1930[var2];
            class135.field1930[var2] = false;
        }
        class266.field3577 = class414.field5793;
        if (class249.field3415.method172()) {
            class436.field6228 = true;
        }
        class293.field3965 = null;
        if (class149.field2288 != -1) {
            class352.field4817 = 0;
            class184.method1343(18412);
        }
        class249.field3415.method122();
        class28.method333(class24.field424, 50);
        class339.field4628 = 0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static final void method2169(int arg0) {
        field4652++;
        if (arg0 != 0) {
            method2166((byte) -120);
        }
        try {
            if (class229.field3182 == 1) {
                int var1 = class258.field3484.method2518(8787);
                if (var1 > 0 && class258.field3484.method2511(arg0 - 69)) {
                    int var2 = var1 - class266.field3567;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class258.field3484.method2488(arg0 ^ 0x7FAE, var2);
                } else {
                    class258.field3484.method2510(true);
                    class258.field3484.method2521(-16884);
                    class165.field2424 = null;
                    if (class241.field3327 == null) {
                        class229.field3182 = 0;
                    } else {
                        class229.field3182 = 2;
                    }
                    class71.field1078 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class258.field3484.method2510(true);
            class71.field1078 = null;
            class165.field2424 = null;
            class241.field3327 = null;
            class229.field3182 = 0;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static final void method2170(int arg0) {
        field4658++;
        if (arg0 != -3157) {
            return;
        }
        class440.field6320 = 0;
        int var1 = (class95.field1379.field3176 >> 7) + class283.field3794;
        int var2 = (class95.field1379.field3167 >> 7) + class296.field3988;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class440.field6320 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class440.field6320 = 1;
        }
        if (class440.field6320 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class440.field6320 = 0;
        }
    }
}
