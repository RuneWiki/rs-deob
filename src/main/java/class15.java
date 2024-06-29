import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lob;")
    public static class99 field261 = new class99(64);

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Lje;")
    public static class67 field271 = class85.method592(255, "<col=c0ff00>");

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lje;")
    public static class67 field269 = class85.method592(255, "gr-Un:");

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Lje;")
    private static class67 field272 = class85.method592(255, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!c", name = "k", descriptor = "[B")
    public static byte[] field270 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lje;")
    public static class67 field265 = field272;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lje;")
    public static class67 field273 = null;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lje;")
    private static class67 field274 = class85.method592(255, "Existing User");

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lje;")
    public static class67 field267 = field274;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lpc;")
    public static class107 field266;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method105(boolean arg0) {
        field273 = null;
        field269 = null;
        field267 = null;
        if (arg0) {
            method108(-79, 93, 64, -14, 14);
        }
        field270 = null;
        field265 = null;
        field272 = null;
        field266 = null;
        field261 = null;
        field274 = null;
        field271 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lje;")
    public static final class67 method106(int arg0, int arg1) {
        field260++;
        if (arg1 > -72) {
            field271 = null;
        }
        class67 var2 = class60.method420(arg0, 28498);
        for (int var3 = var2.method445(false) - 3; var3 > 0; var3 -= 3) {
            var2 = class49.method314(new class67[] { var2.method448(0, var3, -119), class52.field1034, var2.method463(var3, -124) }, 0);
        }
        if (var2.method445(false) > 9) {
            return class49.method314(new class67[] { class47.field899, var2.method448(0, var2.method445(false) - 8, -120), class83.field1830, class122.field2726, var2, class52.field1032 }, 0);
        } else if (var2.method445(false) > 6) {
            return class49.method314(new class67[] { class120.field2708, var2.method448(0, var2.method445(false) - 4, -117), class141.field3178, class122.field2726, var2, class52.field1032 }, 0);
        } else {
            return class49.method314(new class67[] { class67.field1297, var2, class126.field2775 }, 0);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)Z")
    public static final boolean method107(int arg0, byte arg1) {
        if (arg1 == 69) {
            field263++;
            return (arg0 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)I")
    public static final int method108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field262++;
        if (arg0 != -7) {
            method109(-30, 56, -90);
        }
        int var5 = 65536 - class96.field2148[arg4 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
    public static final void method109(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg0 << 16) + arg2);
        field264++;
        class120 var5 = (class120) class145.field3339.method1119(28254, var3);
        if (var5 != null) {
            class88.field1944.method827(var5, -2);
            if (arg1 != 9) {
                method106(123, 121);
            }
        }
    }
}
