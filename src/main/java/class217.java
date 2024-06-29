import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class217 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
    public static int[] field2930 = new int[1];

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[F")
    public static float[] field2932 = new float[16];

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lsq;")
    public static class181 field2933;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIBII)Z", line = 5)
    public static final boolean method1414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (arg6 != 97) {
            return true;
        }
        field2934++;
        if (arg2 + arg4 > arg7 && (arg3 + arg7) > arg2) {
            return arg5 + arg8 > arg1 && arg5 < (arg0 + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V", line = 23)
    public static final void method1415(boolean arg0) {
        field2935++;
        if (arg0) {
            method1416(111);
        }
        for (class196 var1 = (class196) class207.field2744.method3672(-1); var1 != null; var1 = (class196) class207.field2744.method3662(-1)) {
            class459 var2 = var1.field2674;
            if (var2.field6132 < class463.field6224) {
                var1.method1175(-2);
                var2.method2553(true);
            } else if (class463.field6224 >= var2.field6124) {
                var2.method2559(true);
                if (var2.field6096 > 0) {
                    class592 var3 = (class592) class207.field2745.method1160((long) (var2.field6096 - 1), 119);
                    if (var3 != null) {
                        class733 var4 = var3.field8280;
                        if (var4.field5801 >= 0 && var4.field5801 < (class409.field5183 * 512) && var4.field5797 >= 0 && var4.field5797 < (class543.field7597 * 512)) {
                            var2.method2557(var4.field5801, var4.field5797, (byte) -123, class463.field6224, class225.method1448(var2.field5796, var4.field5801, var4.field5797, (byte) 28) - var2.field6089);
                        }
                    }
                }
                if (var2.field6096 < 0) {
                    int var5 = -var2.field6096 - 1;
                    class724 var6;
                    if (class54.field755 == var5) {
                        var6 = class380.field4847;
                    } else {
                        var6 = class5.field49[var5];
                    }
                    if (var6 != null && var6.field5801 >= 0 && (class409.field5183 * 512) > var6.field5801 && var6.field5797 >= 0 && class543.field7597 * 512 > var6.field5797) {
                        var2.method2557(var6.field5801, var6.field5797, (byte) -66, class463.field6224, class225.method1448(var2.field5796, var6.field5801, var6.field5797, (byte) 28) - var2.field6089);
                    }
                }
                var2.method2555((byte) 125, class602.field8367);
                class582.method3315(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 92)
    public static void method1416(int arg0) {
        field2930 = null;
        field2933 = null;
        if (arg0 != -19376) {
            method1417(false, (byte) 22, null);
        }
        field2932 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZBLjava/lang/String;)V", line = 107)
    public static final void method1417(boolean arg0, byte arg1, String arg2) {
        field2931++;
        if (arg2 == null) {
            return;
        }
        if (class20.field370 >= 100) {
            class283.method1695(-82, 4, class454.field6042.method2547(-61, class243.field3143));
            return;
        }
        String var3 = class286.method1701(-1, arg2);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class20.field370; var4++) {
            String var9 = class286.method1701(-1, class469.field6287[var4]);
            if (var9 != null && var9.equals(var3)) {
                class283.method1695(-81, 4, arg2 + class454.field6043.method2547(-106, class243.field3143));
                return;
            }
            if (class636.field8768[var4] != null) {
                String var10 = class286.method1701(-1, class636.field8768[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class283.method1695(-124, 4, arg2 + class454.field6043.method2547(-107, class243.field3143));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class600.field8359; var5++) {
            String var7 = class286.method1701(-1, class207.field2748[var5]);
            if (var7 != null && var7.equals(var3)) {
                class283.method1695(-103, 4, class454.field6048.method2547(-57, class243.field3143) + arg2 + class454.field6049.method2547(-115, class243.field3143));
                return;
            }
            if (class726.field10124[var5] != null) {
                String var8 = class286.method1701(-1, class726.field10124[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class283.method1695(-87, 4, class454.field6048.method2547(-100, class243.field3143) + arg2 + class454.field6049.method2547(-113, class243.field3143));
                    return;
                }
            }
        }
        if (class286.method1701(-1, class380.field4847.field10062).equals(var3)) {
            class283.method1695(-103, 4, class454.field6045.method2547(-66, class243.field3143));
            return;
        }
        if (arg1 < 6) {
            field2932 = null;
        }
        class679.field9489++;
        class589 var6 = class514.method2994(-29488, class760.field10605, class131.field1903);
        var6.field8251.method2578(class747.method4155(-1, arg2) + 1, -1221492240);
        var6.field8251.method2597(arg2, (byte) 61);
        var6.field8251.method2578(arg0 ? 1 : 0, -1221492240);
        class737.method4107(var6, 7);
    }
}
