import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class187 {

    @OriginalMember(owner = "client!am", name = "e", descriptor = "[Z")
    public static boolean[] field2940 = new boolean[100];

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field2936 = 0;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Lml;")
    public static class134 field2942;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)I", line = 8)
    public static final int method1180(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class174.field2796) {
            arg1 = 1000000;
            class174.field2796 = false;
        }
        class176 var5 = class198.field3165[arg2][arg3];
        int var6 = var5.field2805;
        field2939++;
        float var7 = ((float) arg0 * 0.1F + 0.7F) * var5.field2802;
        float var8 = var5.field2800;
        float var9 = var5.field2799;
        int var10 = var5.field2807;
        int var11 = var5.field2804;
        if (!class14.field226) {
            var11 = 0;
        }
        if (class101.field1546 != var6 || class240.field3866 != var7 || class101.field1528 != var8 || class231.field3731 != var9 || class56.field896 != var10 || class254.field4093 != var11) {
            class56.field896 = var10;
            class240.field3866 = var7;
            class101.field1546 = var6;
            class244.field3944 = class226.field3608;
            class231.field3731 = var9;
            class101.field1528 = var8;
            class217.field3501 = class220.field3534;
            class204.field3231 = class73.field1148;
            class199.field3182 = 0;
            class254.field4093 = var11;
            class113.field1717 = class182.field2887;
            class181.field2878 = class101.field1531;
            class73.field1150 = class205.field3254;
        }
        if (class199.field3182 < 65536) {
            class199.field3182 += arg1 * 250;
            if (class199.field3182 >= 65536) {
                class199.field3182 = 65536;
            }
            int var12 = 65536 - class199.field3182 >> 8;
            int var13 = class199.field3182 >> 8;
            class205.field3254 = ((class73.field1150 & 0xFF00) * var12 + ((class56.field896 & 0xFF00) * var13) & 0xFF0000) + ((class73.field1150 & 0xFF00FF) * var12 + (class56.field896 & 0xFF00FF) * var13 & 0xFF00FF00) >> 8;
            float var14 = (float) (65536 - class199.field3182) / 65536.0F;
            class226.field3608 = class254.field4093 * var13 + class244.field3944 * var12 >> 8;
            float var15 = (float) class199.field3182 / 65536.0F;
            class101.field1531 = ((class181.field2878 & 0xFF00) * var12 + (class101.field1546 & 0xFF00) * var13 & 0xFF0000) + ((class181.field2878 & 0xFF00FF) * var12 + (class101.field1546 & 0xFF00FF) * var13 & 0xFF00FF00) >> 8;
            class220.field3534 = class231.field3731 * var15 + class217.field3501 * var14;
            class182.field2887 = class240.field3866 * var15 + class113.field1717 * var14;
            class73.field1148 = class204.field3231 * var14 + class101.field1528 * var15;
        }
        if (arg4 != -5925) {
            field2940 = (boolean[]) null;
        }
        class178.method1138(class101.field1531, class182.field2887, class73.field1148, class220.field3534);
        class178.method1136(class205.field3254, class226.field3608);
        class178.method1144((float) class295.field4903, (float) class215.field3440, (float) class150.field2380);
        class178.method1143();
        return class205.field3254;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 87)
    public static void method1181(int arg0) {
        if (arg0 == 65536) {
            field2942 = null;
            field2940 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V", line = 100)
    public static final void method1182(int arg0) {
        field2937++;
        if (arg0 != 2524) {
            field2940 = (boolean[]) null;
        }
        for (class129 var1 = (class129) class87.field1318.method995(arg0 + 1836594412); var1 != null; var1 = (class129) class87.field1318.method996(arg0 - 2524)) {
            if (var1.field1973 > 0) {
                var1.field1973--;
            }
            if (var1.field1973 != 0) {
                if (var1.field1969 > 0) {
                    var1.field1969--;
                }
                if (var1.field1969 == 0 && var1.field1975 >= 1 && var1.field1988 >= 1 && var1.field1975 <= 102 && var1.field1988 <= 102 && (var1.field1983 < 0 || class201.method1278(var1.field1982, 52, var1.field1983))) {
                    class37.method288(0, var1.field1983, var1.field1982, var1.field1975, var1.field1981, var1.field1987, var1.field1988, var1.field1971);
                    var1.field1969 = -1;
                    if (var1.field1989 == var1.field1983 && var1.field1989 == -1) {
                        var1.method552((byte) -125);
                    } else if (var1.field1989 == var1.field1983 && var1.field1987 == var1.field1968 && var1.field1982 == var1.field1967) {
                        var1.method552((byte) 104);
                    }
                }
            } else if (var1.field1989 < 0 || class201.method1278(var1.field1967, 70, var1.field1989)) {
                class37.method288(0, var1.field1989, var1.field1967, var1.field1975, var1.field1981, var1.field1968, var1.field1988, var1.field1971);
                var1.method552((byte) -117);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 171)
    public static final void method1183(byte arg0) {
        field2938++;
        class237.field3811.method1823((byte) 14);
        if (arg0 != 41) {
            field2936 = -22;
        }
    }
}
