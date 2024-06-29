import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class224 {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "[I")
    public static int[] field3675 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Lph;")
    public static class229 field3677 = class266.method1858("Chargement de l(W-Bcran)2titre )2 ", 0);

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field3679 = 0;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field3676 = 2;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Lph;")
    public static class229 field3682 = class266.method1858("::wm1", 0);

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "F")
    public static float field3680;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Llh;")
    public static class63 field3685;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 14)
    public static void method1559(int arg0) {
        field3677 = null;
        field3675 = null;
        field3685 = null;
        if (arg0 != -15180) {
            method1559(-28);
        }
        field3682 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BI)Ljd;", line = 28)
    public static final class260 method1560(byte arg0, int arg1) {
        field3684++;
        class260 var2 = (class260) class164.field2673.method1027(-122, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class279.field4621.method523(arg0 ^ 0x29, arg1 & 0x7FFF, 1);
        } else {
            var3 = class44.field682.method523(arg0 ^ 0x63, arg1, 1);
        }
        class260 var4 = new class260();
        if (var3 != null) {
            var4.method1815(new class164(var3), (byte) 16);
        }
        if (arg1 >= 32768) {
            var4.method1814((byte) -85);
        }
        class164.field2673.method1026(var4, 120, (long) arg1);
        if (arg0 != -61) {
            method1561(22, (byte) 61);
        }
        return var4;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)V", line = 75)
    public static final void method1561(int arg0, byte arg1) {
        field3681++;
        class281 var2 = class135.method957(0, arg0, 7);
        if (arg1 == 125) {
            var2.method1933(0);
        }
    }
}
