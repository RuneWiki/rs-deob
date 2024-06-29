import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class174 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Lce;")
    public static class126 field3071 = class206.method1445(-7923, "null");

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Lce;")
    public static class126 field3076 = class206.method1445(-7923, ")4p=");

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Lce;")
    public static class126 field3081 = class206.method1445(-7923, "::clientdrop");

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Z")
    public static boolean field3082 = true;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
    public static int[] field3073 = new int[2];

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Z")
    public static volatile boolean field3078 = true;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field3074 = 0;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field3085 = 0;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lcm;")
    public static class312 field3077;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "[Lie;")
    public static class2[] field3072;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 6)
    public static void method1264(byte arg0) {
        field3076 = null;
        field3072 = null;
        field3081 = null;
        field3073 = null;
        field3077 = null;
        if (arg0 > -60) {
            field3076 = (class126) null;
        }
        field3071 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIII)I", line = 21)
    public static final int method1265(int arg0, int arg1, int arg2, int arg3) {
        field3083++;
        if (class264.field4396 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg3 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg2;
        int var7 = arg0 & 0x7F;
        int var8 = arg3 & 0x7F;
        if (arg2 < 3 && (class301.field4992[1][var5][var4] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        if (arg1 != 8100) {
            method1266(-80, -89, (byte) 31, -78);
        }
        int var9 = (128 - var8) * class264.field4396[var6][var5][var4] + class264.field4396[var6][var5 + 1][var4] * var8 >> 7;
        int var10 = (128 - var8) * class264.field4396[var6][var5][var4 + 1] + class264.field4396[var6][var5 + 1][var4 + 1] * var8 >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBI)Luh;", line = 83)
    public static final class65 method1266(int arg0, int arg1, byte arg2, int arg3) {
        field3084++;
        int var4 = 82 % ((-arg2 - 29) / 43);
        class65 var5 = new class65();
        var5.field1099 = arg0;
        var5.field1097 = arg1;
        class16.field222.method1636(11311, var5, (long) arg3);
        class229.method1559(arg1, 34);
        class112 var6 = class252.method1706(5157, arg3);
        if (var6 != null) {
            class23.method114(var6, (byte) 94);
        }
        if (class64.field1084 != null) {
            class23.method114(class64.field1084, (byte) 94);
            class64.field1084 = null;
        }
        int var7 = class173.field3067;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class89.method621((byte) -3, class84.field1341[var8])) {
                class243.method1671(var8, -56);
            }
        }
        if (class173.field3067 == 1) {
            class51.field783 = false;
            class182.method1303(class301.field5009, -1048576, class228.field3850, class17.field236, class105.field1657);
        } else {
            class182.method1303(class301.field5009, -1048576, class228.field3850, class17.field236, class105.field1657);
            int var9 = class200.field3414.method2154(class166.field2961);
            for (int var10 = 0; var10 < class173.field3067; var10++) {
                int var11 = class200.field3414.method2154(class202.method1426(22247, var10));
                if (var9 < var11) {
                    var9 = var11;
                }
            }
            class17.field236 = class173.field3067 * 15 + (class202.field3453 ? 26 : 22);
            class301.field5009 = var9 + 8;
        }
        if (var6 != null) {
            class304.method2039(false, (byte) 73, var6);
        }
        class122.method800(1, arg1);
        if (class182.field3162 != -1) {
            class266.method1793(1, false, class182.field3162);
        }
        return var5;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V", line = 204)
    public static final void method1267() {
        for (int var0 = 0; var0 < class305.field5121; var0++) {
            class240 var1 = class217.field3653[var0];
            class190.method1358(var1);
            class217.field3653[var0] = null;
        }
        class305.field5121 = 0;
    }
}
