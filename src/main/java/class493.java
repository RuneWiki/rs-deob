import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class493 {

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lft;")
    public static class285 field6523 = new class285(12, 6);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lpe;")
    public static class615 field6524;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 12)
    public static final void method2690(int arg0) {
        field6525++;
        class549 var1 = (class549) class354.field4574.method2090(true);
        int var2 = -46 % ((arg0 + 59) / 60);
        while (var1 != null) {
            if (var1.field7121 > 0) {
                var1.field7121--;
            }
            if (var1.field7121 != 0) {
                if (var1.field7114 > 0) {
                    var1.field7114--;
                }
                if (var1.field7114 == 0 && var1.field7116 >= 1 && var1.field7125 >= 1 && var1.field7116 <= class611.field8258 - 2 && var1.field7125 <= (class656.field9155 - 2) && (var1.field7117 < 0 || class229.method1441((byte) -126, var1.field7117, var1.field7120))) {
                    class8.method36(var1.field7126, var1.field7124, var1.field7117, -1, var1.field7125, var1.field7120, var1.field7116, var1.field7123, (byte) 100);
                    var1.field7114 = -1;
                    if (var1.field7117 == var1.field7115 && var1.field7115 == -1) {
                        var1.method2438((byte) -94);
                    } else if (var1.field7117 == var1.field7115 && var1.field7124 == var1.field7119 && var1.field7122 == var1.field7120) {
                        var1.method2438((byte) -115);
                    }
                }
            } else if (var1.field7115 < 0 || class229.method1441((byte) -126, var1.field7115, var1.field7122)) {
                class8.method36(var1.field7126, var1.field7119, var1.field7115, -1, var1.field7125, var1.field7122, var1.field7116, var1.field7123, (byte) 120);
                var1.method2438((byte) 123);
            }
            var1 = (class549) class354.field4574.method2088(-152);
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 70)
    public static void method2691(int arg0) {
        if (arg0 != -14566) {
            method2693(11, -121, 25, 119, -92, -23, 98, 98, -91, 23);
        }
        field6523 = null;
        field6524 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZI)Z", line = 87)
    public static final boolean method2692(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method2692(-16, true, -29);
        }
        field6522++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIIII)V", line = 100)
    public static final void method2693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class265.field3552 <= arg3 && arg3 <= class641.field8924 && class265.field3552 <= arg1 && arg1 <= class641.field8924 && arg4 >= class265.field3552 && arg4 <= class641.field8924 && class265.field3552 <= arg2 && arg2 <= class641.field8924 && arg6 >= class165.field2061 && arg6 <= class99.field1309 && arg8 >= class165.field2061 && arg8 <= class99.field1309 && class165.field2061 <= arg5 && class99.field1309 >= arg5 && class165.field2061 <= arg7 && arg7 <= class99.field1309) {
            class581.method3189(arg4, arg9, arg2, arg1, arg8, arg7, -221, arg6, arg5, arg3);
        } else {
            class292.method1730(arg3, arg7, arg1, arg9, (byte) -122, arg5, arg6, arg4, arg8, arg2);
        }
        field6521++;
        if (arg0 <= 61) {
            field6523 = null;
        }
    }
}
