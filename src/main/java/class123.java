import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class123 {

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Z")
    public static boolean field3027 = false;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Lae;")
    private static class6 field3034 = class64.method474(119, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field3033 = 0;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Lae;")
    private static class6 field3031 = class64.method474(106, "glow2:");

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lae;")
    public static class6 field3021 = field3034;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field3020 = 0;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lae;")
    public static class6 field3032 = class64.method474(117, "k");

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lae;")
    public static class6 field3037 = field3031;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Lae;")
    private static class6 field3039 = class64.method474(115, "Bad session id)3");

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lae;")
    public static class6 field3028 = class64.method474(117, "Texturen geladen)3");

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Lae;")
    public static class6 field3022 = field3039;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Lae;")
    private static class6 field3038 = class64.method474(110, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Lae;")
    public static class6 field3030 = field3038;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Lsd;")
    public static class114 field3029;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 23)
    public static final void method1010(int arg0) {
        if (arg0 < 64) {
            method1013(42);
        }
        class121.field2849.method129(27392);
        field3035++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V", line = 37)
    public static final void method1011(byte arg0, int arg1) {
        field3025++;
        class136 var2 = (class136) class20.field389.method276((byte) -19, (long) arg1);
        int var3 = 115 % ((arg0 + 22) / 36);
        if (var2 != null) {
            var2.method498(117);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V", line = 68)
    public static final void method1012(int arg0, int arg1) {
        class63.method461(0, 1, false, null, arg1);
        field3023++;
        if (arg0 > -24) {
            method1011((byte) 84, -81);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 83)
    public static void method1013(int arg0) {
        field3030 = null;
        field3029 = null;
        field3028 = null;
        field3038 = null;
        field3032 = null;
        if (arg0 != 0) {
            method1011((byte) -76, -93);
        }
        field3031 = null;
        field3021 = null;
        field3039 = null;
        field3034 = null;
        field3037 = null;
        field3022 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V", line = 110)
    public static final void method1014(int arg0, boolean arg1) {
        field3026++;
        if (class95.field2262 == null) {
            return;
        }
        try {
            class77 var2 = new class77(4);
            var2.method641((byte) -28, arg1 ? 2 : 3);
            var2.method642(-59, 0);
            class95.field2262.method211(-1, var2.field1858, 4, 0);
            int var3 = 30 % ((arg0 + 49) / 53);
        } catch (IOException var5) {
            try {
                class95.field2262.method207(-2158);
            } catch (Exception var4) {
            }
            class95.field2262 = null;
            class130.field3156++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILm;)Lae;", line = 158)
    public static final class6 method1015(int arg0, class77 arg1) {
        if (arg0 != 32767) {
            method1013(-36);
        }
        field3024++;
        return class126.method1030(0, arg1, 32767);
    }
}
