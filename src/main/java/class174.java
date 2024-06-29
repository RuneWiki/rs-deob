import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class174 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public int field3023 = -1;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field3029 = -1;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Lcf;")
    public static class93 field3034 = class147.method1066("um", -48);

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Lcf;")
    public static class93 field3033 = class147.method1066("runes", -48);

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field3036 = 99;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field3039 = 2;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public int field3032;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public int field3035;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public int field3038;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3024;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)Lpa;")
    public static final class214 method1244(int arg0, int arg1, int arg2, int arg3) {
        field3030++;
        class214 var4 = new class214();
        var4.field3914 = arg0;
        var4.field3912 = arg3;
        class255.field4610.method137((long) arg2, var4, -1);
        class280.method1931(arg3, -74);
        class181 var5 = client.method1114(-20985, arg2);
        if (var5 != null) {
            class254.method1731(var5, (byte) 104);
        }
        if (class139.field2410 != null) {
            class254.method1731(class139.field2410, (byte) -94);
            class139.field2410 = null;
        }
        int var6 = class253.field4549;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class108.method779(class216.field3942[var7], true)) {
                class199.method1427((byte) 74, var7);
            }
        }
        if (arg1 != 22) {
            field3029 = 41;
        }
        if (class253.field4549 == 1) {
            class58.field991 = false;
            class195.method1396(class266.field4739, class137.field2394, class61.field1040, class147.field2584, 0);
        } else {
            class195.method1396(class266.field4739, class137.field2394, class61.field1040, class147.field2584, 0);
            int var8 = class183.field3383.method1820(class11.field154);
            for (int var9 = 0; var9 < class253.field4549; var9++) {
                int var10 = class183.field3383.method1820(class3.method12(var9, 98));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class61.field1040 = var8 + 8;
            class266.field4739 = class253.field4549 * 15 + (class4.field48 ? 26 : 22);
        }
        if (var5 != null) {
            class32.method192(var5, false, arg1 ^ 0xFFFFFFE9);
        }
        class228.method1567(arg3, false);
        if (class69.field1262 != -1) {
            class61.method383(class69.field1262, 73, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILcc;IBI)V")
    public static final void method1245(int arg0, int arg1, int arg2, class210 arg3, int arg4, byte arg5, int arg6) {
        field3021++;
        class193.method1385(arg3.field3784, arg3.field3868, arg4, arg0, arg1, arg6, (byte) -30, arg2);
        if (arg5 != 0) {
            method1247((class93) null, -79, -74);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1246(byte arg0) {
        if (arg0 > 47) {
            field3033 = null;
            field3034 = null;
            field3024 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lcf;II)V")
    public static final void method1247(class93 arg0, int arg1, int arg2) {
        if (arg2 != 99) {
            field3036 = 71;
        }
        class285.field5105.method1568(113, (byte) 75);
        class285.field5105.method1884(arg0.method679((byte) 87), arg2 + 556843261);
        class26.field341++;
        field3027++;
        class285.field5105.method1887(arg2 ^ 0xFFFFFFA3, arg1);
    }
}
