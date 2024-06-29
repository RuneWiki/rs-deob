import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class73 extends class159 {

    @OriginalMember(owner = "client!hia", name = "r", descriptor = "I")
    public static int field989 = 0;

    @OriginalMember(owner = "client!hia", name = "k", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!hia", name = "m", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!hia", name = "n", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!hia", name = "o", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!hia", name = "p", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!hia", name = "q", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!hia", name = "s", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!hia", name = "t", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!hia", name = "v", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!hia", name = "u", descriptor = "Luq;")
    public static class172 field992;

    @OriginalMember(owner = "client!hia", name = "l", descriptor = "Lhda;")
    public static class780 field983;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Z)V", line = 4)
    public static void method592(boolean arg0) {
        field983 = null;
        field992 = null;
        if (arg0) {
            field983 = null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lha;I)V", line = 16)
    public static final void method593(class66 arg0, int arg1) {
        field984++;
        int var2 = 0;
        int var3 = 0;
        if (class24.field246) {
            var2 = class186.method1252(0);
            var3 = class550.method3163(16383);
        }
        int var4 = -10660793;
        class182.method1236((byte) -118, class92.field1298 + var2, -16777216, class625.field8477, class677.field9082, class632.field8551 + var3, arg0, var4);
        class88.field1251.method568(var4, class92.field1298 - (-var2 - 3), var3 + 14 + class632.field8551, class58.field721.method365(class55.field647, (byte) 71), -1, true);
        if (arg1 != -1552) {
            field989 = 125;
        }
        int var5 = class494.field6961.method1652(0) + var2;
        int var6 = var3 + class494.field6961.method1663((byte) 116);
        if (class30.field301) {
            int var7 = 0;
            for (class641 var8 = (class641) class716.field9763.method152((byte) -13); var8 != null; var8 = (class641) class716.field9763.method146((byte) 97)) {
                int var12 = var7 * 16 + class632.field8551 + var3 + 31;
                var7++;
                if (var8.field8639 == 1) {
                    class420.method2528(var5, -256, arg0, -1, var6, 91, class92.field1298 + var2, class677.field9082, class625.field8477, var12, class632.field8551 + var3, (class478) var8.field8636.field259.field8885);
                } else {
                    class206.method1351(var6, var12, class92.field1298 + var2, var5, arg0, -1, class677.field9082, -256, class625.field8477, class632.field8551 + var3, var8, 34963);
                }
            }
            if (class740.field10028 != null) {
                class182.method1236((byte) 87, class271.field3950, -16777216, class626.field8480, class588.field8032, class696.field9241, arg0, var4);
                class88.field1251.method568(var4, class271.field3950 + 3, class696.field9241 - -14, class740.field10028.field8635, -1, true);
                int var9 = 0;
                for (class478 var10 = (class478) class740.field10028.field8636.method152((byte) -13); var10 != null; var10 = (class478) class740.field10028.field8636.method146((byte) 97)) {
                    int var11 = var9 * 16 + class696.field9241 + 31;
                    class420.method2528(var5, -256, arg0, -1, var6, 116, class271.field3950, class588.field8032, class626.field8480, var11, class696.field9241, var10);
                    var9++;
                }
                class79.method634(class271.field3950, class626.field8480, (byte) -81, class588.field8032, class696.field9241);
            }
        } else {
            int var13 = 0;
            for (class478 var14 = (class478) class645.field8695.method679((byte) -86); var14 != null; var14 = (class478) class645.field8695.method681(-88)) {
                int var15 = (class269.field3929 - var13 - 1) * 16 + class632.field8551 + var3 + 31;
                class420.method2528(var5, -256, arg0, -1, var6, arg1 ^ 0xFFFFF9AE, class92.field1298 + var2, class677.field9082, class625.field8477, var15, class632.field8551 + var3, var14);
                var13++;
            }
        }
        class79.method634(class92.field1298 + var2, class625.field8477, (byte) -81, class677.field9082, class632.field8551 + var3);
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)V", line = 105)
    public static final void method594(byte arg0) {
        field986++;
        if (class780.field10712 == 7) {
            class87.method696(false, -91);
        } else {
            int var1 = -20 / ((17 - arg0) / 61);
            class192.field2500 = class710.field9707;
            class710.field9707 = null;
            class170.method1148(13, -11239);
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V", line = 125)
    public static final void method595(int arg0) {
        if (arg0 == 4) {
            field991++;
            class769.field10591 = new class84();
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIB)Z", line = 148)
    public static final boolean method596(int arg0, int arg1, byte arg2) {
        field990++;
        if (arg2 != -2) {
            field992 = null;
        }
        return (arg1 & 0x100100) != 0;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(II)I", line = 159)
    public static final int method597(int arg0, int arg1) {
        return class456.field6537 == null ? 0 : class456.field6537[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(III)I", line = 165)
    public static final int method598(int arg0, int arg1, int arg2) {
        if (arg1 > -117) {
            field992 = null;
        }
        field987++;
        int var3 = class761.method4197(arg0 - 1, arg2 + -1, true) - (-class761.method4197(arg0 + 1, arg2 + -1, true) + (-class761.method4197(arg0 - 1, arg2 - -1, true) - class761.method4197(arg0 + 1, arg2 + 1, true)));
        int var4 = class761.method4197(arg0 - 1, arg2, true) + (class761.method4197(arg0 + 1, arg2, true) + class761.method4197(arg0, arg2 - 1, true) + class761.method4197(arg0, arg2 + 1, true));
        int var5 = class761.method4197(arg0, arg2, true);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)V", line = 182)
    public static final void method599(int arg0) {
        field988++;
        if (arg0 == -1) {
            class715.method3961(512);
            class24.field246 = false;
        }
    }
}
